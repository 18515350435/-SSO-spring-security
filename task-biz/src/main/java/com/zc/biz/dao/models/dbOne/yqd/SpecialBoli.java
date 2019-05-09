package com.zc.biz.dao.models.dbOne.yqd;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "special_boli")
public class SpecialBoli implements Serializable {
    @Id
    private Integer id;

    /**
     * 原清单各企业基本属性表id
     */
    @Column(name = "pollutant_discharge_id")
    private String pollutantDischargeId;

    /**
     * 锅炉数(台)
     */
    @Column(name = "boilers_number")
    private String boilersNumber;

    /**
     * 锅炉总蒸吨数(吨/小时)
     */
    @Column(name = "total_ton")
    private String totalTon;

    /**
     * 设备类型
     */
    @Column(name = "device_type")
    private String deviceType;

    /**
     * 产能(万吨)
     */
    private String capacity;

    /**
     * 燃料类型
     */
    @Column(name = "fuel_type")
    private String fuelType;

    /**
     * 燃料消耗量(万吨)
     */
    @Column(name = "fuel_consumption")
    private String fuelConsumption;

    /**
     * 芒硝使用量（吨/年）
     */
    @Column(name = "mirabilite_quantity")
    private String mirabiliteQuantity;

    /**
     * 产品类型
     */
    @Column(name = "product_type")
    private String productType;

    /**
     * 产品产量
     */
    @Column(name = "product_production")
    private String productProduction;

    /**
     * 排放口高度(米)
     */
    @Column(name = "outlet_height")
    private String outletHeight;

    /**
     * 排放口直径(米)
     */
    @Column(name = "outlet_diameter")
    private String outletDiameter;

    /**
     * 是否国控重点污染源,是/否
     */
    @Column(name = "is_pollution_sources_guo")
    private String isPollutionSourcesGuo;

    /**
     * 是否安装在线监测,是/否
     */
    @Column(name = "is_do_online_monitor")
    private String isDoOnlineMonitor;

    /**
     * 是否省控重点污染源,是/否
     */
    @Column(name = "is_pollution_sources_sheng")
    private String isPollutionSourcesSheng;

    /**
     * 是否市控重点污染源,是/否
     */
    @Column(name = "is_pollution_sources_shi")
    private String isPollutionSourcesShi;

    /**
     * 是否在线监测,是/否
     */
    @Column(name = "is_online_monitor")
    private String isOnlineMonitor;

    /**
     * 是否视频监测,是/否
     */
    @Column(name = "is_video_monitor")
    private String isVideoMonitor;

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
     * 获取原清单各企业基本属性表id
     *
     * @return pollutant_discharge_id - 原清单各企业基本属性表id
     */
    public String getPollutantDischargeId() {
        return pollutantDischargeId;
    }

    /**
     * 设置原清单各企业基本属性表id
     *
     * @param pollutantDischargeId 原清单各企业基本属性表id
     */
    public void setPollutantDischargeId(String pollutantDischargeId) {
        this.pollutantDischargeId = pollutantDischargeId;
    }

    /**
     * 获取锅炉数(台)
     *
     * @return boilers_number - 锅炉数(台)
     */
    public String getBoilersNumber() {
        return boilersNumber;
    }

    /**
     * 设置锅炉数(台)
     *
     * @param boilersNumber 锅炉数(台)
     */
    public void setBoilersNumber(String boilersNumber) {
        this.boilersNumber = boilersNumber;
    }

    /**
     * 获取锅炉总蒸吨数(吨/小时)
     *
     * @return total_ton - 锅炉总蒸吨数(吨/小时)
     */
    public String getTotalTon() {
        return totalTon;
    }

    /**
     * 设置锅炉总蒸吨数(吨/小时)
     *
     * @param totalTon 锅炉总蒸吨数(吨/小时)
     */
    public void setTotalTon(String totalTon) {
        this.totalTon = totalTon;
    }

    /**
     * 获取设备类型
     *
     * @return device_type - 设备类型
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * 设置设备类型
     *
     * @param deviceType 设备类型
     */
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * 获取产能(万吨)
     *
     * @return capacity - 产能(万吨)
     */
    public String getCapacity() {
        return capacity;
    }

    /**
     * 设置产能(万吨)
     *
     * @param capacity 产能(万吨)
     */
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    /**
     * 获取燃料类型
     *
     * @return fuel_type - 燃料类型
     */
    public String getFuelType() {
        return fuelType;
    }

    /**
     * 设置燃料类型
     *
     * @param fuelType 燃料类型
     */
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    /**
     * 获取燃料消耗量(万吨)
     *
     * @return fuel_consumption - 燃料消耗量(万吨)
     */
    public String getFuelConsumption() {
        return fuelConsumption;
    }

    /**
     * 设置燃料消耗量(万吨)
     *
     * @param fuelConsumption 燃料消耗量(万吨)
     */
    public void setFuelConsumption(String fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    /**
     * 获取芒硝使用量（吨/年）
     *
     * @return mirabilite_quantity - 芒硝使用量（吨/年）
     */
    public String getMirabiliteQuantity() {
        return mirabiliteQuantity;
    }

    /**
     * 设置芒硝使用量（吨/年）
     *
     * @param mirabiliteQuantity 芒硝使用量（吨/年）
     */
    public void setMirabiliteQuantity(String mirabiliteQuantity) {
        this.mirabiliteQuantity = mirabiliteQuantity;
    }

    /**
     * 获取产品类型
     *
     * @return product_type - 产品类型
     */
    public String getProductType() {
        return productType;
    }

    /**
     * 设置产品类型
     *
     * @param productType 产品类型
     */
    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * 获取产品产量
     *
     * @return product_production - 产品产量
     */
    public String getProductProduction() {
        return productProduction;
    }

    /**
     * 设置产品产量
     *
     * @param productProduction 产品产量
     */
    public void setProductProduction(String productProduction) {
        this.productProduction = productProduction;
    }

    /**
     * 获取排放口高度(米)
     *
     * @return outlet_height - 排放口高度(米)
     */
    public String getOutletHeight() {
        return outletHeight;
    }

    /**
     * 设置排放口高度(米)
     *
     * @param outletHeight 排放口高度(米)
     */
    public void setOutletHeight(String outletHeight) {
        this.outletHeight = outletHeight;
    }

    /**
     * 获取排放口直径(米)
     *
     * @return outlet_diameter - 排放口直径(米)
     */
    public String getOutletDiameter() {
        return outletDiameter;
    }

    /**
     * 设置排放口直径(米)
     *
     * @param outletDiameter 排放口直径(米)
     */
    public void setOutletDiameter(String outletDiameter) {
        this.outletDiameter = outletDiameter;
    }

    /**
     * 获取是否国控重点污染源,是/否
     *
     * @return is_pollution_sources_guo - 是否国控重点污染源,是/否
     */
    public String getIsPollutionSourcesGuo() {
        return isPollutionSourcesGuo;
    }

    /**
     * 设置是否国控重点污染源,是/否
     *
     * @param isPollutionSourcesGuo 是否国控重点污染源,是/否
     */
    public void setIsPollutionSourcesGuo(String isPollutionSourcesGuo) {
        this.isPollutionSourcesGuo = isPollutionSourcesGuo;
    }

    /**
     * 获取是否安装在线监测,是/否
     *
     * @return is_do_online_monitor - 是否安装在线监测,是/否
     */
    public String getIsDoOnlineMonitor() {
        return isDoOnlineMonitor;
    }

    /**
     * 设置是否安装在线监测,是/否
     *
     * @param isDoOnlineMonitor 是否安装在线监测,是/否
     */
    public void setIsDoOnlineMonitor(String isDoOnlineMonitor) {
        this.isDoOnlineMonitor = isDoOnlineMonitor;
    }

    /**
     * 获取是否省控重点污染源,是/否
     *
     * @return is_pollution_sources_sheng - 是否省控重点污染源,是/否
     */
    public String getIsPollutionSourcesSheng() {
        return isPollutionSourcesSheng;
    }

    /**
     * 设置是否省控重点污染源,是/否
     *
     * @param isPollutionSourcesSheng 是否省控重点污染源,是/否
     */
    public void setIsPollutionSourcesSheng(String isPollutionSourcesSheng) {
        this.isPollutionSourcesSheng = isPollutionSourcesSheng;
    }

    /**
     * 获取是否市控重点污染源,是/否
     *
     * @return is_pollution_sources_shi - 是否市控重点污染源,是/否
     */
    public String getIsPollutionSourcesShi() {
        return isPollutionSourcesShi;
    }

    /**
     * 设置是否市控重点污染源,是/否
     *
     * @param isPollutionSourcesShi 是否市控重点污染源,是/否
     */
    public void setIsPollutionSourcesShi(String isPollutionSourcesShi) {
        this.isPollutionSourcesShi = isPollutionSourcesShi;
    }

    /**
     * 获取是否在线监测,是/否
     *
     * @return is_online_monitor - 是否在线监测,是/否
     */
    public String getIsOnlineMonitor() {
        return isOnlineMonitor;
    }

    /**
     * 设置是否在线监测,是/否
     *
     * @param isOnlineMonitor 是否在线监测,是/否
     */
    public void setIsOnlineMonitor(String isOnlineMonitor) {
        this.isOnlineMonitor = isOnlineMonitor;
    }

    /**
     * 获取是否视频监测,是/否
     *
     * @return is_video_monitor - 是否视频监测,是/否
     */
    public String getIsVideoMonitor() {
        return isVideoMonitor;
    }

    /**
     * 设置是否视频监测,是/否
     *
     * @param isVideoMonitor 是否视频监测,是/否
     */
    public void setIsVideoMonitor(String isVideoMonitor) {
        this.isVideoMonitor = isVideoMonitor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pollutantDischargeId=").append(pollutantDischargeId);
        sb.append(", boilersNumber=").append(boilersNumber);
        sb.append(", totalTon=").append(totalTon);
        sb.append(", deviceType=").append(deviceType);
        sb.append(", capacity=").append(capacity);
        sb.append(", fuelType=").append(fuelType);
        sb.append(", fuelConsumption=").append(fuelConsumption);
        sb.append(", mirabiliteQuantity=").append(mirabiliteQuantity);
        sb.append(", productType=").append(productType);
        sb.append(", productProduction=").append(productProduction);
        sb.append(", outletHeight=").append(outletHeight);
        sb.append(", outletDiameter=").append(outletDiameter);
        sb.append(", isPollutionSourcesGuo=").append(isPollutionSourcesGuo);
        sb.append(", isDoOnlineMonitor=").append(isDoOnlineMonitor);
        sb.append(", isPollutionSourcesSheng=").append(isPollutionSourcesSheng);
        sb.append(", isPollutionSourcesShi=").append(isPollutionSourcesShi);
        sb.append(", isOnlineMonitor=").append(isOnlineMonitor);
        sb.append(", isVideoMonitor=").append(isVideoMonitor);
        sb.append("]");
        return sb.toString();
    }
}