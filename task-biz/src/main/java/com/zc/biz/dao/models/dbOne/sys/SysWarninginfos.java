package com.zc.biz.dao.models.dbOne.sys;

import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Table(name = "sys_warninginfos")
public class SysWarninginfos implements Serializable {
    /**
     * 主键id，自增
     */
    private Integer id;

    /**
     * 预警内容
     */
    private String warninginfo;

    /**
     * 预警级别
     */
    private Integer warninglevel;

    /**
     * 开始时间
     */
    private Timestamp starttime;

    /**
     * 结束时间
     */
    private Timestamp endtime;

    /**
     * 区域名称
     */
    private String areaname;

    private Timestamp inserttime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键id，自增
     *
     * @return id - 主键id，自增
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键id，自增
     *
     * @param id 主键id，自增
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取预警内容
     *
     * @return warninginfo - 预警内容
     */
    public String getWarninginfo() {
        return warninginfo;
    }

    /**
     * 设置预警内容
     *
     * @param warninginfo 预警内容
     */
    public void setWarninginfo(String warninginfo) {
        this.warninginfo = warninginfo;
    }

    /**
     * 获取预警级别
     *
     * @return warninglevel - 预警级别
     */
    public Integer getWarninglevel() {
        return warninglevel;
    }

    /**
     * 设置预警级别
     *
     * @param warninglevel 预警级别
     */
    public void setWarninglevel(Integer warninglevel) {
        this.warninglevel = warninglevel;
    }

    /**
     * 获取开始时间
     *
     * @return starttime - 开始时间
     */
    public Timestamp getStarttime() {
        return starttime;
    }

    /**
     * 设置开始时间
     *
     * @param starttime 开始时间
     */
    public void setStarttime(Timestamp starttime) {
        this.starttime = starttime;
    }

    /**
     * 获取结束时间
     *
     * @return endtime - 结束时间
     */
    public Timestamp getEndtime() {
        return endtime;
    }

    /**
     * 设置结束时间
     *
     * @param endtime 结束时间
     */
    public void setEndtime(Timestamp endtime) {
        this.endtime = endtime;
    }

    /**
     * 获取区域名称
     *
     * @return areaname - 区域名称
     */
    public String getAreaname() {
        return areaname;
    }

    /**
     * 设置区域名称
     *
     * @param areaname 区域名称
     */
    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }

    /**
     * @return inserttime
     */
    public Timestamp getInserttime() {
        return inserttime;
    }

    /**
     * @param inserttime
     */
    public void setInserttime(Timestamp inserttime) {
        this.inserttime = inserttime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", warninginfo=").append(warninginfo);
        sb.append(", warninglevel=").append(warninglevel);
        sb.append(", starttime=").append(starttime);
        sb.append(", endtime=").append(endtime);
        sb.append(", areaname=").append(areaname);
        sb.append(", inserttime=").append(inserttime);
        sb.append("]");
        return sb.toString();
    }
}