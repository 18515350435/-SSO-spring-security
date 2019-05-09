package com.zc.web.controller.user;



import com.zc.api.model.resp.sys.RolePermissionResp;
import com.zc.api.model.util.entity.EntityUtil;
import com.zc.base.entity.ReturnEntity;
import com.zc.biz.dao.mappers.dbOne.sys.SysRoleMapper;
import com.zc.biz.dao.mappers.dbOne.sys.SysRolePermissionMapper;
import com.zc.biz.dao.mappers.dbOne.sys.SysUserRoleMapper;
import com.zc.biz.dao.models.dbOne.sys.SysRole;
import com.zc.biz.dao.models.dbOne.sys.SysRolePermission;
import com.zc.biz.dao.models.dbOne.sys.SysUserRole;
import com.zc.common.util.DateUtils;
import com.zc.service.user.UserRolePersissionService;
import com.zc.web.util.SecurityUserContext;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
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
@Api(tags = "角色权限操作")
//@RestController
@RequestMapping("/rolePermission")
@Component
public class RolePermissionController {
    @Autowired
    public SysRoleMapper sysRoleMapper;
    @Autowired
    public SysRolePermissionMapper sysRolePermissionMapper;
    @Autowired
    public SysUserRoleMapper sysUserRoleMapper;
    @Resource
    private UserRolePersissionService userRolePersissionService;
    @RequestMapping(value = "/alipayforward", method = RequestMethod.GET)
    public String alipayforward(HttpServletResponse response) throws IOException {
        Map modelMap=new HashMap<>();
        modelMap.put("userName", "呵呵");
        modelMap.put("password", "123456");
        modelMap.put("age", "25");
//        response.sendRedirect("forward:test.html");
        return "forward:test.html";
    }
    @ApiOperation(value = "查询所有角色", notes = "")
    @RequestMapping(value = "/getAllRoles", method = RequestMethod.GET)
    public ReturnEntity<List<SysRole>> getAllRoles(@RequestParam(value = "name",required = false,defaultValue = "")String roleName) throws IOException {
        try {
            Condition condition = new Condition(SysRole.class);
            condition.or().andLike("roleName","%"+roleName+"%");
            List<SysRole> list = sysRoleMapper.selectByExample(condition);
            return ReturnEntity.successForData(list);
        } catch (Exception e) {
            e.printStackTrace();
            return ReturnEntity.errorForDesc("查询所有角色失败");
        }
    }
    @ApiOperation(value = "添加角色", notes = "")
    @RequestMapping(value = "/addRole", method = RequestMethod.GET)
    public ReturnEntity addRole(SysRole hbRole) throws IOException {
        try {
            hbRole.setId(EntityUtil.getAutoId()+"");
            hbRole.setCreateTime(DateUtils.getDateToStringYYYY_MM_DD_HH_MM());
            sysRoleMapper.insertSelective(hbRole);
            return ReturnEntity.success();
        } catch (Exception e) {
            e.printStackTrace();
            return ReturnEntity.errorForDesc("添加角色失败");
        }
    }
    @ApiOperation(value = "删除角色", notes = "")
    @RequestMapping(value = "/removeRole", method = RequestMethod.GET)
    public ReturnEntity removeRole(String id) throws IOException {
        try {
            int flag=0;
            String[] ids = id.split(",");
            for (String id_:ids) {
                Condition cond = new Condition(SysUserRole.class);
                cond.or().andEqualTo("roleId",id_);
                List<SysUserRole> list = sysUserRoleMapper.selectByExample(cond);
                if(list!=null&&list.size()>0){
                    flag=1;
                }
                userRolePersissionService.removeRole(id_);
            }
            if(flag==1){
                return ReturnEntity.errorForDesc("部分角色下存在用户，相应角色无法删除");
            }
            return ReturnEntity.success();
        } catch (Exception e) {
            e.printStackTrace();
            return ReturnEntity.errorForDesc("删除角色失败");
        }
    }
    @ApiOperation(value = "编辑角色", notes = "")
    @RequestMapping(value = "/editRole", method = RequestMethod.GET)
    public ReturnEntity editRole(SysRole hbRole) throws IOException {
        try {
            hbRole.setCanEdit(null);
            sysRoleMapper.updateByPrimaryKeySelective(hbRole);
            return ReturnEntity.success();
        } catch (Exception e) {
            e.printStackTrace();
            return ReturnEntity.errorForDesc("编辑角色失败");
        }
    }
    @ApiOperation(value = "冻结角色", notes = "")
    @RequestMapping(value = "/freezeRole", method = RequestMethod.GET)
    public ReturnEntity freezeRole(String id) throws IOException {
        try {
            SysRole hbRole = new SysRole();
            hbRole.setId(id);
            hbRole.setIsFreeze((byte) 1);
            sysRoleMapper.updateByPrimaryKeySelective(hbRole);
            return ReturnEntity.success();
        } catch (Exception e) {
            e.printStackTrace();
            return ReturnEntity.errorForDesc("冻结角色失败");
        }
    }
    @ApiOperation(value = "解冻角色", notes = "")
    @RequestMapping(value = "/unfreezeRole", method = RequestMethod.GET)
    public ReturnEntity unfreezeRole(String id) throws IOException {
        try {
            SysRole hbRole = new SysRole();
            hbRole.setId(id);
            hbRole.setIsFreeze((byte) 0);
            sysRoleMapper.updateByPrimaryKeySelective(hbRole);
            return ReturnEntity.success();
        } catch (Exception e) {
            e.printStackTrace();
            return ReturnEntity.errorForDesc("解冻角色失败");
        }
    }

    @ApiOperation(value = "查询角色所有按钮权限(树深度不固定,所以集合深度不固定)", notes = "")
    @RequestMapping(value = "/getRoleAllPermissions", method = RequestMethod.GET)
    public ReturnEntity<RolePermissionResp> getRoleAllPermissions(String roleId) throws IOException {
        try {
            RolePermissionResp rolePermissionResp = userRolePersissionService.getRoleAllPermissions(roleId);
            return ReturnEntity.successForData(rolePermissionResp);
        } catch (Exception e) {
            e.printStackTrace();
            return ReturnEntity.errorForDesc("查询所有按钮权限失败");
        }
    }

    @ApiOperation(value = "为角色添加权限", notes = "")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="query",name="roleId",dataType="String",value="角色id"),
            @ApiImplicitParam(paramType="query",name = "permissionIds",dataType="String",value = "权限id集合")
    })
    @RequestMapping(value = "/addPermissionsForRole", method = RequestMethod.GET)
    public ReturnEntity addPermissionsForRole(String roleId,String[] permissionIds) throws IOException {
        try {
            userRolePersissionService.addPermissionsForRole( roleId,permissionIds);
            return ReturnEntity.success();
        } catch (Exception e) {
            e.printStackTrace();
            return ReturnEntity.errorForDesc("为角色添加权限失败");
        }
    }
}
