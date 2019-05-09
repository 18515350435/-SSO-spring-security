package com.zc.biz.dao.models.dbOne.user;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "hb_role")
public class HbRole implements Serializable {
    @Id
    private String id;

    /**
     * 角色名称
     */
    @Column(name = "role_name")
    private String roleName;

    /**
     * 角色描述
     */
    private String description;

    /**
     * 是否可编辑删除 0可编辑删除 1不可编辑删除
     */
    @ApiModelProperty(value = "是否可编辑删除 0可编辑删除 1不可编辑删除")
    @Column(name = "can_edit")
    private Byte canEdit;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private String createTime;

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
     * 获取角色名称
     *
     * @return role_name - 角色名称
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 设置角色名称
     *
     * @param roleName 角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * 获取角色描述
     *
     * @return description - 角色描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置角色描述
     *
     * @param description 角色描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取是否可编辑删除 0可编辑删除 1不可编辑删除
     *
     * @return can_edit - 是否可编辑删除 0可编辑删除 1不可编辑删除
     */
    public Byte getCanEdit() {
        return canEdit;
    }

    /**
     * 设置是否可编辑删除 0可编辑删除 1不可编辑删除
     *
     * @param canEdit 是否可编辑删除 0可编辑删除 1不可编辑删除
     */
    public void setCanEdit(Byte canEdit) {
        this.canEdit = canEdit;
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
        sb.append(", roleName=").append(roleName);
        sb.append(", description=").append(description);
        sb.append(", canEdit=").append(canEdit);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}