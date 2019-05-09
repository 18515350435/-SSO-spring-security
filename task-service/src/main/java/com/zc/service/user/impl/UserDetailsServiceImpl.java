package com.zc.service.user.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.zc.biz.dao.mappers.dbOne.sys.SysMenuBtnMapper;
import com.zc.biz.dao.mappers.dbOne.sys.SysRolePermissionMapper;
import com.zc.biz.dao.mappers.dbOne.sys.SysUserRoleMapper;
import com.zc.biz.dao.mappers.dbOne.sys.SysUsersMapper;
import com.zc.biz.dao.models.dbOne.sys.SysUsers;
import com.zc.common.util.StringUtil;
import com.zc.service.user.SysAuthorization;
import com.zc.api.model.common.UserSecurityEntity;
import com.zc.api.model.resp.sys.MenuBtnName;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

@Service
public class UserDetailsServiceImpl implements UserDetailsService,SysAuthorization {
    @Autowired
    SysUsersMapper sysUsersMapper;
    @Autowired
    SysUserRoleMapper sysUserRoleMapper;
    @Autowired
    SysRolePermissionMapper sysRolePermissionMapper;
    @Autowired
    SysMenuBtnMapper sysMenuBtnMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Condition condition = new Condition(SysUsers.class);
        Example.Criteria c = condition.or();
        c.andEqualTo("loginname",username);
        c.andEqualTo("status",1);
        SysUsers applicationUser = sysUsersMapper.selectOneByExample(condition);
        if (applicationUser == null) {
            throw new UsernameNotFoundException(username);
        }
        UserSecurityEntity user=new UserSecurityEntity();
        user.setPassword(applicationUser.getPassword());
        user.setUsername(applicationUser.getLoginname());
        user.setUserid(applicationUser.getId());
        return user;
    }
    
    @Override
    public UserSecurityEntity authorizationUserById(String id,String url) throws UsernameNotFoundException {
        Condition condition = new Condition(SysUsers.class);
        Example.Criteria c = condition.or();
        c.andEqualTo("id",id);
        c.andEqualTo("status",1);
        SysUsers applicationUser = sysUsersMapper.selectOneByExample(condition);
        if (applicationUser == null) {
            return null;
        }
        List<String> roleIds=sysUserRoleMapper.selectRoleIds(id);
        List<String> permissionIds=sysRolePermissionMapper.selectPermissionIds("'"+StringUtils.join(roleIds.toArray(), "','")+"'");
        List<MenuBtnName> menuBtnNames= sysMenuBtnMapper.selectMenuBtnNames("'"+StringUtils.join(permissionIds.toArray(), "','")+"'");
        List<String> urls=menuBtnNames.stream().map(t->{
            if(StringUtil.isNullOrWhiteSpace(t.getBtnnamediy())){
                return (t.getMenuname()+"/"+t.getBtnname()).toUpperCase();
            }
            return (t.getMenuname()+"/"+t.getBtnnamediy()).toUpperCase();
        }).collect(Collectors.toList());

        if(!urls.contains(url.toUpperCase())){
            return null;
        }
        UserSecurityEntity user=new UserSecurityEntity();
        user.setPassword(applicationUser.getPassword());
        user.setUsername(applicationUser.getLoginname());
        user.setUserid(applicationUser.getId());
        return user;
    }
}



