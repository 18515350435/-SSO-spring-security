package com.zc.biz.dao.models.dbOne.sys;

import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "sys_operationinfo")
public class SysOperationinfo implements Serializable {
    /**
     * uuid
     */
    private String id;

    /**
     * 设备id
     */
    private Integer deviceid;

    /**
     * 负责人
     */
    private String header;

    /**
     * 最近运维时间
     */
    private Date checktime;

    private Date inserttime;

    /**
     * 区域
     */
    private String area;

    private static final long serialVersionUID = 1L;

    /**
     * 获取uuid
     *
     * @return id - uuid
     */
    public String getId() {
        return id;
    }

    /**
     * 设置uuid
     *
     * @param id uuid
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取设备id
     *
     * @return deviceid - 设备id
     */
    public Integer getDeviceid() {
        return deviceid;
    }

    /**
     * 设置设备id
     *
     * @param deviceid 设备id
     */
    public void setDeviceid(Integer deviceid) {
        this.deviceid = deviceid;
    }

    /**
     * 获取负责人
     *
     * @return header - 负责人
     */
    public String getHeader() {
        return header;
    }

    /**
     * 设置负责人
     *
     * @param header 负责人
     */
    public void setHeader(String header) {
        this.header = header;
    }

    /**
     * 获取最近运维时间
     *
     * @return checktime - 最近运维时间
     */
    public Date getChecktime() {
        return checktime;
    }

    /**
     * 设置最近运维时间
     *
     * @param checktime 最近运维时间
     */
    public void setChecktime(Date checktime) {
        this.checktime = checktime;
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
        sb.append(", deviceid=").append(deviceid);
        sb.append(", header=").append(header);
        sb.append(", checktime=").append(checktime);
        sb.append(", inserttime=").append(inserttime);
        sb.append(", area=").append(area);
        sb.append("]");
        return sb.toString();
    }
}