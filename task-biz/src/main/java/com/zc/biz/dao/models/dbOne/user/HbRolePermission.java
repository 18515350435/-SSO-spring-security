package com.zc.biz.dao.models.dbOne.user;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "hb_role_permission")
public class HbRolePermission implements Serializable {
    @Id
    private String id;

    /**
     * 角色id
     */
    @Column(name = "role_id")
    private String roleId;

    /**
     * 菜单权限id
     */
    @Column(name = "permission_id")
    private String permissionId;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取角色id
     *
     * @return role_id - 角色id
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * 设置角色id
     *
     * @param roleId 角色id
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取菜单权限id
     *
     * @return permission_id - 菜单权限id
     */
    public String getPermissionId() {
        return permissionId;
    }

    /**
     * 设置菜单权限id
     *
     * @param permissionId 菜单权限id
     */
    public void setPermissionId(String permissionId) {
        this.permissionId = permissionId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roleId=").append(roleId);
        sb.append(", permissionId=").append(permissionId);
        sb.append("]");
        return sb.toString();
    }
}