package com.zc.biz.dao.models.dbOne.yqd;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "base_grid_level_one")
public class BaseGridLevelOne implements Serializable {
    @Id
    private String id;

    /**
     * 一级网格名称
     */
    @Column(name = "grid_name")
    private String gridName;

    /**
     * 一级网格编码
     */
    @Column(name = "grid_code")
    private String gridCode;

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
     * 获取一级网格名称
     *
     * @return grid_name - 一级网格名称
     */
    public String getGridName() {
        return gridName;
    }

    /**
     * 设置一级网格名称
     *
     * @param gridName 一级网格名称
     */
    public void setGridName(String gridName) {
        this.gridName = gridName;
    }

    /**
     * 获取一级网格编码
     *
     * @return grid_code - 一级网格编码
     */
    public String getGridCode() {
        return gridCode;
    }

    /**
     * 设置一级网格编码
     *
     * @param gridCode 一级网格编码
     */
    public void setGridCode(String gridCode) {
        this.gridCode = gridCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", gridName=").append(gridName);
        sb.append(", gridCode=").append(gridCode);
        sb.append("]");
        return sb.toString();
    }
}