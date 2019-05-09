package com.zc.biz.dao.models.dbOne.sys;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_tvocwarninginfo")
public class SysTvocwarninginfo implements Serializable {
    private Integer id;

    /**
     * 所属区域
     */
    private String area;

    /**
     * 安次区
     */
    private String anci;

    /**
     * 开发区
     */
    private String kaifa;

    private Date inserttime;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取所属区域
     *
     * @return area - 所属区域
     */
    public String getArea() {
        return area;
    }

    /**
     * 设置所属区域
     *
     * @param area 所属区域
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * 获取安次区
     *
     * @return anci - 安次区
     */
    public String getAnci() {
        return anci;
    }

    /**
     * 设置安次区
     *
     * @param anci 安次区
     */
    public void setAnci(String anci) {
        this.anci = anci;
    }

    /**
     * 获取开发区
     *
     * @return kaifa - 开发区
     */
    public String getKaifa() {
        return kaifa;
    }

    /**
     * 设置开发区
     *
     * @param kaifa 开发区
     */
    public void setKaifa(String kaifa) {
        this.kaifa = kaifa;
    }

    /**
     * @return inserttime
     */
    public Date getInserttime() {
        return inserttime;
    }

    /**
     * @param inserttime
     */
    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", area=").append(area);
        sb.append(", anci=").append(anci);
        sb.append(", kaifa=").append(kaifa);
        sb.append(", inserttime=").append(inserttime);
        sb.append("]");
        return sb.toString();
    }
}