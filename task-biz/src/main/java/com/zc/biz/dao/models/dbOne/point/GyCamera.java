package com.zc.biz.dao.models.dbOne.point;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "gy_camera")
public class GyCamera implements Serializable {
    private String id;

    /**0=
     * 所属公司id
     */
    @Column(name = "company_id")
    private String companyId;

    /**
     * 流码
     */
    @Column(name = "flow_code")
    private String flowCode;

    /**
     * 摄像头名称
     */
    private String name;

    /**
     * 设备编号
     */
    @Column(name = "device_code")
    private String deviceCode;

    /**
     * 摄像头编号
     */
    @Column(name = "camera_code")
    private String cameraCode;

    /**
     * 通道号
     */
    @Column(name = "channel_code")
    private String channelCode;

    /**
     * 设备类型 1:voc  2:散乱污 3:餐饮油烟 4:秸秆焚烧 5:工地 6:河道 7:高空5公里
     */
    @Column(name = "device_type")
    private String deviceType;

    /**
     * 摄像头状态
     */
    private String status;

    /**
     * 摄像头类型
     */
    @Column(name = "camera_type")
    private String cameraType;

    /**
     * 纬度
     */
    private BigDecimal longitude;

    /**
     * 经度
     */
    private BigDecimal latitude;

    /**
     * 联系电话
     */
    @Column(name = "phone_num")
    private String phoneNum;

    /**
     * 联系人
     */
    private String contact;

    /**
     * 所属区域
     */
    private String area;

    /**
     * 区域编号
     */
    @Column(name = "area_code")
    private String areaCode;

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
     * 获取所属公司id
     *
     * @return company_id - 所属公司id
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * 设置所属公司id
     *
     * @param companyId 所属公司id
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    /**
     * 获取流码
     *
     * @return flow_code - 流码
     */
    public String getFlowCode() {
        return flowCode;
    }

    /**
     * 设置流码
     *
     * @param flowCode 流码
     */
    public void setFlowCode(String flowCode) {
        this.flowCode = flowCode;
    }

    /**
     * 获取摄像头名称
     *
     * @return name - 摄像头名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置摄像头名称
     *
     * @param name 摄像头名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取设备编号
     *
     * @return device_code - 设备编号
     */
    public String getDeviceCode() {
        return deviceCode;
    }

    /**
     * 设置设备编号
     *
     * @param deviceCode 设备编号
     */
    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
    }

    /**
     * 获取摄像头编号
     *
     * @return camera_code - 摄像头编号
     */
    public String getCameraCode() {
        return cameraCode;
    }

    /**
     * 设置摄像头编号
     *
     * @param cameraCode 摄像头编号
     */
    public void setCameraCode(String cameraCode) {
        this.cameraCode = cameraCode;
    }

    /**
     * 获取通道号
     *
     * @return channel_code - 通道号
     */
    public String getChannelCode() {
        return channelCode;
    }

    /**
     * 设置通道号
     *
     * @param channelCode 通道号
     */
    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    /**
     * 获取设备类型 1:voc  2:散乱污 3:餐饮油烟 4:秸秆焚烧 5:工地 6:河道
     *
     * @return device_type - 设备类型 1:voc  2:散乱污 3:餐饮油烟 4:秸秆焚烧 5:工地 6:河道
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * 设置设备类型 1:voc  2:散乱污 3:餐饮油烟 4:秸秆焚烧 5:工地 6:河道
     *
     * @param deviceType 设备类型 1:voc  2:散乱污 3:餐饮油烟 4:秸秆焚烧 5:工地 6:河道
     */
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * 获取摄像头状态
     *
     * @return status - 摄像头状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置摄像头状态
     *
     * @param status 摄像头状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取摄像头类型
     *
     * @return camera_type - 摄像头类型
     */
    public String getCameraType() {
        return cameraType;
    }

    /**
     * 设置摄像头类型
     *
     * @param cameraType 摄像头类型
     */
    public void setCameraType(String cameraType) {
        this.cameraType = cameraType;
    }

    /**
     * 获取纬度
     *
     * @return longitude - 纬度
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * 设置纬度
     *
     * @param longitude 纬度
     */
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取经度
     *
     * @return latitude - 经度
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * 设置经度
     *
     * @param latitude 经度
     */
    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    /**
     * 获取联系电话
     *
     * @return phone_num - 联系电话
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * 设置联系电话
     *
     * @param phoneNum 联系电话
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    /**
     * 获取联系人
     *
     * @return contact - 联系人
     */
    public String getContact() {
        return contact;
    }

    /**
     * 设置联系人
     *
     * @param contact 联系人
     */
    public void setContact(String contact) {
        this.contact = contact;
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
     * 获取区域编号
     *
     * @return area_code - 区域编号
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * 设置区域编号
     *
     * @param areaCode 区域编号
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
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
        sb.append(", companyId=").append(companyId);
        sb.append(", flowCode=").append(flowCode);
        sb.append(", name=").append(name);
        sb.append(", deviceCode=").append(deviceCode);
        sb.append(", cameraCode=").append(cameraCode);
        sb.append(", channelCode=").append(channelCode);
        sb.append(", deviceType=").append(deviceType);
        sb.append(", status=").append(status);
        sb.append(", cameraType=").append(cameraType);
        sb.append(", longitude=").append(longitude);
        sb.append(", latitude=").append(latitude);
        sb.append(", phoneNum=").append(phoneNum);
        sb.append(", contact=").append(contact);
        sb.append(", area=").append(area);
        sb.append(", areaCode=").append(areaCode);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}