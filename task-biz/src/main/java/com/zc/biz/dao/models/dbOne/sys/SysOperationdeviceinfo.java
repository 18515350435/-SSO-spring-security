package com.zc.biz.dao.models.dbOne.sys;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "sys_operationdeviceinfo")
public class SysOperationdeviceinfo implements Serializable {
    private Integer id;

    /**
     * 区域
     */
    private String area;

    /**
     * 设备名称
     */
    private String devicename;

    /**
     * 设备参数
     */
    private String deviceparam;

    /**
     * 设备型号
     */
    private String devicemodel;

    /**
     * 巡查周期
     */
    private String checkcycle;

    /**
     * 用途描述
     */
    private String usage;

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

    /**
     * 获取设备名称
     *
     * @return devicename - 设备名称
     */
    public String getDevicename() {
        return devicename;
    }

    /**
     * 设置设备名称
     *
     * @param devicename 设备名称
     */
    public void setDevicename(String devicename) {
        this.devicename = devicename;
    }

    /**
     * 获取设备参数
     *
     * @return deviceparam - 设备参数
     */
    public String getDeviceparam() {
        return deviceparam;
    }

    /**
     * 设置设备参数
     *
     * @param deviceparam 设备参数
     */
    public void setDeviceparam(String deviceparam) {
        this.deviceparam = deviceparam;
    }

    /**
     * 获取设备型号
     *
     * @return devicemodel - 设备型号
     */
    public String getDevicemodel() {
        return devicemodel;
    }

    /**
     * 设置设备型号
     *
     * @param devicemodel 设备型号
     */
    public void setDevicemodel(String devicemodel) {
        this.devicemodel = devicemodel;
    }

    /**
     * 获取巡查周期
     *
     * @return checkcycle - 巡查周期
     */
    public String getCheckcycle() {
        return checkcycle;
    }

    /**
     * 设置巡查周期
     *
     * @param checkcycle 巡查周期
     */
    public void setCheckcycle(String checkcycle) {
        this.checkcycle = checkcycle;
    }

    /**
     * 获取用途描述
     *
     * @return usage - 用途描述
     */
    public String getUsage() {
        return usage;
    }

    /**
     * 设置用途描述
     *
     * @param usage 用途描述
     */
    public void setUsage(String usage) {
        this.usage = usage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", area=").append(area);
        sb.append(", devicename=").append(devicename);
        sb.append(", deviceparam=").append(deviceparam);
        sb.append(", devicemodel=").append(devicemodel);
        sb.append(", checkcycle=").append(checkcycle);
        sb.append(", usage=").append(usage);
        sb.append("]");
        return sb.toString();
    }
}