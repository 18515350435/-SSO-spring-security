package com.zc.biz.dao.models.dbOne.sys;

import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "sys_tvocindexinfo")
public class SysTvocindexinfo implements Serializable {
    private Integer id;

    /**
     * 优
     */
    private String y;

    /**
     * 良
     */
    private String l;

    /**
     * 轻度
     */
    private String qd;

    /**
     * 中度
     */
    private String zd;

    /**
     * 重度
     */
    private String zhd;

    /**
     * 严重
     */
    private String yz;

    private Date inserttime;

    /**
     * 区域
     */
    private String area;

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
     * 获取优
     *
     * @return y - 优
     */
    public String getY() {
        return y;
    }

    /**
     * 设置优
     *
     * @param y 优
     */
    public void setY(String y) {
        this.y = y;
    }

    /**
     * 获取良
     *
     * @return l - 良
     */
    public String getL() {
        return l;
    }

    /**
     * 设置良
     *
     * @param l 良
     */
    public void setL(String l) {
        this.l = l;
    }

    /**
     * 获取轻度
     *
     * @return qd - 轻度
     */
    public String getQd() {
        return qd;
    }

    /**
     * 设置轻度
     *
     * @param qd 轻度
     */
    public void setQd(String qd) {
        this.qd = qd;
    }

    /**
     * 获取中度
     *
     * @return zd - 中度
     */
    public String getZd() {
        return zd;
    }

    /**
     * 设置中度
     *
     * @param zd 中度
     */
    public void setZd(String zd) {
        this.zd = zd;
    }

    /**
     * 获取重度
     *
     * @return zhd - 重度
     */
    public String getZhd() {
        return zhd;
    }

    /**
     * 设置重度
     *
     * @param zhd 重度
     */
    public void setZhd(String zhd) {
        this.zhd = zhd;
    }

    /**
     * 获取严重
     *
     * @return yz - 严重
     */
    public String getYz() {
        return yz;
    }

    /**
     * 设置严重
     *
     * @param yz 严重
     */
    public void setYz(String yz) {
        this.yz = yz;
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

    /**
     * 获取区域
     *
     * @return area - 区域
     */
    public String getArea() {
        return area;
    }

    /**
     * 设置区域
     *
     * @param area 区域
     */
    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", y=").append(y);
        sb.append(", l=").append(l);
        sb.append(", qd=").append(qd);
        sb.append(", zd=").append(zd);
        sb.append(", zhd=").append(zhd);
        sb.append(", yz=").append(yz);
        sb.append(", inserttime=").append(inserttime);
        sb.append(", area=").append(area);
        sb.append("]");
        return sb.toString();
    }
}