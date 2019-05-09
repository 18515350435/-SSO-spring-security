package com.zc.service.user.impl;

import com.zc.api.model.resp.sys.RolePermissionResp;
import com.zc.api.model.util.entity.EntityUtil;
import com.zc.biz.dao.mappers.dbOne.sys.SysMenuMapper;
import com.zc.biz.dao.mappers.dbOne.sys.SysRoleMapper;
import com.zc.biz.dao.mappers.dbOne.sys.SysRolePermissionMapper;
import com.zc.biz.dao.models.dbOne.sys.SysRolePermission;
import com.zc.biz.dao.models.dbOne.user.HbRolePermission;
import com.zc.service.user.UserRolePersissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description  用户角色权限操作
 * @Author       Peihan.Zhang
 * @CreateTime  2019/3/20
 * @Version     0.0.1
 * @Email       zhangpeihan@jchzbj.com
 */
@Service
public class UserRolePermissionServiceImpl implements UserRolePersissionService {
    @Autowired
    public SysRoleMapper sysRoleMapper;
    @Autowired
    public SysMenuMapper sysMenuMapper;
    @Autowired
    public SysRolePermissionMapper sysRolePermissionMapper;

    @Transactional
    @Override
    public void removeRole(String id) {
        sysRoleMapper.deleteByPrimaryKey(id);
        Condition condition = new Condition(HbRolePermission.class);
        condition.or().andEqualTo("roleId",id);
        sysRolePermissionMapper.deleteByExample(condition);//一并删除角色下所分配的权限
    }
    @Override
    public RolePermissionResp getRoleAllPermissions(String roleId){
        RolePermissionResp rp = new RolePermissionResp();
        rp.setMenuId("0");
        rp.setMenuname("根目录");
        getRoleMenuTree(roleId,rp);
        return rp;
    }
    @Transactional
    @Override
    public void addPermissionsForRole(String roleId,String[] permissionIds){
        if(permissionIds!=null&&permissionIds.length>0){
            Condition condition = new Condition(HbRolePermission.class);
            condition.or().andEqualTo("roleId",roleId);
            //先删除角色下所分配的权限
            sysRolePermissionMapper.deleteByExample(condition);
            //再添加新的
            for ( String permissionId:permissionIds) {
                SysRolePermission sysRolePermission = new SysRolePermission();
                sysRolePermission.setId(EntityUtil.getAutoId()+"");
                sysRolePermission.setRoleId(roleId);
                sysRolePermission.setPermissionId(permissionId);
                sysRolePermissionMapper.insert(sysRolePermission);
            }
        }
    }
    //递归获取树形菜单按钮权限
    void getRoleMenuTree(String roleId,RolePermissionResp rp){
        List<RolePermissionResp> listChildRoles = sysMenuMapper.getChildMenus(rp.getMenuId());
        if(listChildRoles==null||listChildRoles.size()==0){
            //如果没有下级菜单就去查他拥有的按钮
            List<RolePermissionResp> list = sysRolePermissionMapper.getRoleAllPermissions(roleId,rp.getMenuId());
            rp.setIsLastMenu("1");
            rp.setRespList(list);
            return;
        }
        //如果有下级菜单就继续往下递归迭代
        rp.setRespList(listChildRoles);
        for (RolePermissionResp r : listChildRoles ){
            getRoleMenuTree(roleId,r);
        }
    }
}
