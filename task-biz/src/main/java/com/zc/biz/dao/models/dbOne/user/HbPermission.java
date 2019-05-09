package com.zc.biz.dao.models.dbOne.user;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "hb_permission")
public class HbPermission implements Serializable {
    @Id
    private String id;

    /**
     * 菜单权限URL
     */
    @Column(name = "permission_url")
    private String permissionUrl;

    /**
     * 菜单权限名称
     */
    @Column(name = "permission_name")
    private String permissionName;

    /**
     * 1 一级菜单 2二级子菜单
     */
    private Byte level;
    /**
     * 分组结构标识 构成：上级id后拼接本级id
     */
    private String orderflag;
    /**
     * 分组结构标识 构成：上级id后拼接本级id
     */
    @Column(name = "parent_id")
    private String parentId;

    /**
     * 菜单描述
     */
    private String description;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private String createTime;

    @ApiModelProperty(value = "是否拥有此权限 0未拥有 1已拥有")
    @Transient
    private String havaThis;
    private static final long serialVersionUID = 1L;

    public String getHavaThis() {
        return havaThis;
    }

    public void setHavaThis(String havaThis) {
        this.havaThis = havaThis;
    }

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

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取菜单权限URL
     *
     * @return permission_url - 菜单权限URL
     */
    public String getPermissionUrl() {
        return permissionUrl;
    }

    /**
     * 设置菜单权限URL
     *
     * @param permissionUrl 菜单权限URL
     */
    public void setPermissionUrl(String permissionUrl) {
        this.permissionUrl = permissionUrl;
    }

    public String getOrderflag() {
        return orderflag;
    }

    public void setOrderflag(String orderflag) {
        this.orderflag = orderflag;
    }

    /**
     * 获取菜单权限名称
     *
     * @return permission_name - 菜单权限名称
     */
    public String getPermissionName() {
        return permissionName;
    }

    /**
     * 设置菜单权限名称
     *
     * @param permissionName 菜单权限名称
     */
    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    /**
     * 获取1 一级菜单 2二级子菜单
     *
     * @return level - 1 一级菜单 2二级子菜单
     */
    public Byte getLevel() {
        return level;
    }

    /**
     * 设置1 一级菜单 2二级子菜单
     *
     * @param level 1 一级菜单 2二级子菜单
     */
    public void setLevel(Byte level) {
        this.level = level;
    }

    /**
     * 获取菜单描述
     *
     * @return description - 菜单描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置菜单描述
     *
     * @param description 菜单描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", permissionUrl=").append(permissionUrl);
        sb.append(", permissionName=").append(permissionName);
        sb.append(", level=").append(level);
        sb.append(", description=").append(description);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}