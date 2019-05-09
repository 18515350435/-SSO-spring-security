package com.zc.biz.dao.models.dbOne.yqd;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "class_yqd")
public class ClassYqd implements Serializable {
    @Id
    private String id;

    /**
     * 父类id，0代表没有父类
     */
    @Column(name = "parent_id")
    private String parentId;

    /**
     * 分类名称
     */
    @Column(name = "class_name")
    private String className;

    /**
     * 删除状态：0未删除  1已删除
     */
    private Byte deleted;

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
     * 获取父类id，0代表没有父类
     *
     * @return parent_id - 父类id，0代表没有父类
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 设置父类id，0代表没有父类
     *
     * @param parentId 父类id，0代表没有父类
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取分类名称
     *
     * @return class_name - 分类名称
     */
    public String getClassName() {
        return className;
    }

    /**
     * 设置分类名称
     *
     * @param className 分类名称
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * 获取删除状态：0未删除  1已删除
     *
     * @return deleted - 删除状态：0未删除  1已删除
     */
    public Byte getDeleted() {
        return deleted;
    }

    /**
     * 设置删除状态：0未删除  1已删除
     *
     * @param deleted 删除状态：0未删除  1已删除
     */
    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", parentId=").append(parentId);
        sb.append(", className=").append(className);
        sb.append(", deleted=").append(deleted);
        sb.append("]");
        return sb.toString();
    }
}