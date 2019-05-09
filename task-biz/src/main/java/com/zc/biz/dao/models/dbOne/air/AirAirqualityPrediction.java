package com.zc.biz.dao.models.dbOne.air;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "air_airquality_prediction")
public class AirAirqualityPrediction implements Serializable {
    @Id
    private String id;

    /**
     * 区域名称
     */
    @Column(name = "Name")
    private String name;

    /**
     * 区域编码
     */
    @Column(name = "CityCode")
    private String citycode;

    /**
     * 24小时空气质量起
     */
    @Column(name = "AirIndex_From")
    private String airindexFrom;

    /**
     * 24小时空气质量止
     */
    @Column(name = "AirIndex_To")
    private String airindexTo;

    /**
     * 24小时主要污染物
     */
    @Column(name = "PrimaryPollutant")
    private String primarypollutant;

    /**
     * 预测详细信息
     */
    @Column(name = "DetailInfo")
    private String detailinfo;

    /**
     * Longitude
     */
    @Column(name = "Longitude")
    private String longitude;

    /**
     * Latitude
     */
    @Column(name = "Latitude")
    private String latitude;

    /**
     * 48小时空气质量起
     */
    @Column(name = "Air48Index_From")
    private String air48indexFrom;

    /**
     * 48小时空气质量止
     */
    @Column(name = "Air48Index_To")
    private String air48indexTo;

    /**
     * 48小时主要污染物
     */
    @Column(name = "Primary48Pollutant")
    private String primary48pollutant;

    /**
     * 72小时空气质量起
     */
    @Column(name = "Air72Index_From")
    private String air72indexFrom;

    /**
     * 72小时空气质量止
     */
    @Column(name = "Air72Index_To")
    private String air72indexTo;

    /**
     * 72小时主要污染物
     */
    @Column(name = "Primary72Pollutant")
    private String primary72pollutant;

    /**
     * 插入时间
     */
    @Column(name = "inster_time")
    private String insterTime;

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
     * 获取区域名称
     *
     * @return Name - 区域名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置区域名称
     *
     * @param name 区域名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取区域编码
     *
     * @return CityCode - 区域编码
     */
    public String getCitycode() {
        return citycode;
    }

    /**
     * 设置区域编码
     *
     * @param citycode 区域编码
     */
    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    /**
     * 获取24小时空气质量起
     *
     * @return AirIndex_From - 24小时空气质量起
     */
    public String getAirindexFrom() {
        return airindexFrom;
    }

    /**
     * 设置24小时空气质量起
     *
     * @param airindexFrom 24小时空气质量起
     */
    public void setAirindexFrom(String airindexFrom) {
        this.airindexFrom = airindexFrom;
    }

    /**
     * 获取24小时空气质量止
     *
     * @return AirIndex_To - 24小时空气质量止
     */
    public String getAirindexTo() {
        return airindexTo;
    }

    /**
     * 设置24小时空气质量止
     *
     * @param airindexTo 24小时空气质量止
     */
    public void setAirindexTo(String airindexTo) {
        this.airindexTo = airindexTo;
    }

    /**
     * 获取24小时主要污染物
     *
     * @return PrimaryPollutant - 24小时主要污染物
     */
    public String getPrimarypollutant() {
        return primarypollutant;
    }

    /**
     * 设置24小时主要污染物
     *
     * @param primarypollutant 24小时主要污染物
     */
    public void setPrimarypollutant(String primarypollutant) {
        this.primarypollutant = primarypollutant;
    }

    /**
     * 获取预测详细信息
     *
     * @return DetailInfo - 预测详细信息
     */
    public String getDetailinfo() {
        return detailinfo;
    }

    /**
     * 设置预测详细信息
     *
     * @param detailinfo 预测详细信息
     */
    public void setDetailinfo(String detailinfo) {
        this.detailinfo = detailinfo;
    }

    /**
     * 获取Longitude
     *
     * @return Longitude - Longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * 设置Longitude
     *
     * @param longitude Longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取Latitude
     *
     * @return Latitude - Latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * 设置Latitude
     *
     * @param latitude Latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * 获取48小时空气质量起
     *
     * @return Air48Index_From - 48小时空气质量起
     */
    public String getAir48indexFrom() {
        return air48indexFrom;
    }

    /**
     * 设置48小时空气质量起
     *
     * @param air48indexFrom 48小时空气质量起
     */
    public void setAir48indexFrom(String air48indexFrom) {
        this.air48indexFrom = air48indexFrom;
    }

    /**
     * 获取48小时空气质量止
     *
     * @return Air48Index_To - 48小时空气质量止
     */
    public String getAir48indexTo() {
        return air48indexTo;
    }

    /**
     * 设置48小时空气质量止
     *
     * @param air48indexTo 48小时空气质量止
     */
    public void setAir48indexTo(String air48indexTo) {
        this.air48indexTo = air48indexTo;
    }

    /**
     * 获取48小时主要污染物
     *
     * @return Primary48Pollutant - 48小时主要污染物
     */
    public String getPrimary48pollutant() {
        return primary48pollutant;
    }

    /**
     * 设置48小时主要污染物
     *
     * @param primary48pollutant 48小时主要污染物
     */
    public void setPrimary48pollutant(String primary48pollutant) {
        this.primary48pollutant = primary48pollutant;
    }

    /**
     * 获取72小时空气质量起
     *
     * @return Air72Index_From - 72小时空气质量起
     */
    public String getAir72indexFrom() {
        return air72indexFrom;
    }

    /**
     * 设置72小时空气质量起
     *
     * @param air72indexFrom 72小时空气质量起
     */
    public void setAir72indexFrom(String air72indexFrom) {
        this.air72indexFrom = air72indexFrom;
    }

    /**
     * 获取72小时空气质量止
     *
     * @return Air72Index_To - 72小时空气质量止
     */
    public String getAir72indexTo() {
        return air72indexTo;
    }

    /**
     * 设置72小时空气质量止
     *
     * @param air72indexTo 72小时空气质量止
     */
    public void setAir72indexTo(String air72indexTo) {
        this.air72indexTo = air72indexTo;
    }

    /**
     * 获取72小时主要污染物
     *
     * @return Primary72Pollutant - 72小时主要污染物
     */
    public String getPrimary72pollutant() {
        return primary72pollutant;
    }

    /**
     * 设置72小时主要污染物
     *
     * @param primary72pollutant 72小时主要污染物
     */
    public void setPrimary72pollutant(String primary72pollutant) {
        this.primary72pollutant = primary72pollutant;
    }

    /**
     * 获取插入时间
     *
     * @return inster_time - 插入时间
     */
    public String getInsterTime() {
        return insterTime;
    }

    /**
     * 设置插入时间
     *
     * @param insterTime 插入时间
     */
    public void setInsterTime(String insterTime) {
        this.insterTime = insterTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", citycode=").append(citycode);
        sb.append(", airindexFrom=").append(airindexFrom);
        sb.append(", airindexTo=").append(airindexTo);
        sb.append(", primarypollutant=").append(primarypollutant);
        sb.append(", detailinfo=").append(detailinfo);
        sb.append(", longitude=").append(longitude);
        sb.append(", latitude=").append(latitude);
        sb.append(", air48indexFrom=").append(air48indexFrom);
        sb.append(", air48indexTo=").append(air48indexTo);
        sb.append(", primary48pollutant=").append(primary48pollutant);
        sb.append(", air72indexFrom=").append(air72indexFrom);
        sb.append(", air72indexTo=").append(air72indexTo);
        sb.append(", primary72pollutant=").append(primary72pollutant);
        sb.append(", insterTime=").append(insterTime);
        sb.append("]");
        return sb.toString();
    }
}