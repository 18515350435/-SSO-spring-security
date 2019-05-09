package com.zc.service.user;

import com.zc.api.model.resp.sys.RolePermissionResp;

import java.util.List;

/**
 * @Description  用户角色权限操作
 * @Author       Peihan.Zhang
 * @CreateTime  2019/3/20
 * @Version     0.0.1
 * @Email       zhangpeihan@jchzbj.com
 */
public interface UserRolePersissionService {
    void removeRole(String id);
    RolePermissionResp getRoleAllPermissions(String roleId);
    void addPermissionsForRole(String roleId,String[] permissionIds);
}
