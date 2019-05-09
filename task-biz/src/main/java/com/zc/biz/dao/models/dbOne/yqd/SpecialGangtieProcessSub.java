package com.zc.biz.dao.models.dbOne.yqd;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "special_gangtie_process_sub")
public class SpecialGangtieProcessSub implements Serializable {
    @Id
    private Integer id;

    /**
     * 钢铁行业企业特殊属性表id
     */
    @Column(name = "special_gangtie_id")
    private String specialGangtieId;

    /**
     * 工序类型 烧结/球团/炼铁/炼钢/轧钢/石灰石,此类型下的信息都是属于工序的
     */
    @Column(name = "process_type")
    private String processType;

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
     * 原料
     */
    private String yuanliao;

    /**
     * 原料使用量(万吨)
     */
    @Column(name = "yuanliao_consumption")
    private String yuanliaoConsumption;

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
     * so2排放量
     */
    private String so2;

    /**
     * nox排放量
     */
    private String nox;

    /**
     * co排放量
     */
    private String co;

    /**
     * pm10排放量
     */
    private String pm10;

    /**
     * pm2.5排放量
     */
    private String pm25;

    /**
     * voc排放量
     */
    private String voc;

    /**
     * nh3排放量
     */
    private String nh3;

    /**
     * bc排放量
     */
    private String bc;

    /**
     * oc排放量
     */
    private String oc;

    /**
     * 脱硫工艺
     */
    private String tlgy;

    /**
     * 二氧化硫治理措施-脱硫岛效率
     */
    private String tlxl;

    /**
     * 脱销工艺
     */
    private String txgy;

    /**
     * 氮氧化物治理措施-脱硝效率
     */
    private String txxl;

    /**
     * 除尘工艺
     */
    private String ccgy;

    /**
     * 烟粉尘治理措施-除尘效率
     */
    private String ccxl;

    /**
     * voc回收工艺
     */
    private String vocgy;

    /**
     * voc回收技术
     */
    private String vochs;

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
     * 获取钢铁行业企业特殊属性表id
     *
     * @return special_gangtie_id - 钢铁行业企业特殊属性表id
     */
    public String getSpecialGangtieId() {
        return specialGangtieId;
    }

    /**
     * 设置钢铁行业企业特殊属性表id
     *
     * @param specialGangtieId 钢铁行业企业特殊属性表id
     */
    public void setSpecialGangtieId(String specialGangtieId) {
        this.specialGangtieId = specialGangtieId;
    }

    /**
     * 获取工序类型 烧结/球团/炼铁/炼钢/轧钢/石灰石,此类型下的信息都是属于工序的
     *
     * @return process_type - 工序类型 烧结/球团/炼铁/炼钢/轧钢/石灰石,此类型下的信息都是属于工序的
     */
    public String getProcessType() {
        return processType;
    }

    /**
     * 设置工序类型 烧结/球团/炼铁/炼钢/轧钢/石灰石,此类型下的信息都是属于工序的
     *
     * @param processType 工序类型 烧结/球团/炼铁/炼钢/轧钢/石灰石,此类型下的信息都是属于工序的
     */
    public void setProcessType(String processType) {
        this.processType = processType;
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
     * 获取原料
     *
     * @return yuanliao - 原料
     */
    public String getYuanliao() {
        return yuanliao;
    }

    /**
     * 设置原料
     *
     * @param yuanliao 原料
     */
    public void setYuanliao(String yuanliao) {
        this.yuanliao = yuanliao;
    }

    /**
     * 获取原料使用量(万吨)
     *
     * @return yuanliao_consumption - 原料使用量(万吨)
     */
    public String getYuanliaoConsumption() {
        return yuanliaoConsumption;
    }

    /**
     * 设置原料使用量(万吨)
     *
     * @param yuanliaoConsumption 原料使用量(万吨)
     */
    public void setYuanliaoConsumption(String yuanliaoConsumption) {
        this.yuanliaoConsumption = yuanliaoConsumption;
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
     * 获取so2排放量
     *
     * @return so2 - so2排放量
     */
    public String getSo2() {
        return so2;
    }

    /**
     * 设置so2排放量
     *
     * @param so2 so2排放量
     */
    public void setSo2(String so2) {
        this.so2 = so2;
    }

    /**
     * 获取nox排放量
     *
     * @return nox - nox排放量
     */
    public String getNox() {
        return nox;
    }

    /**
     * 设置nox排放量
     *
     * @param nox nox排放量
     */
    public void setNox(String nox) {
        this.nox = nox;
    }

    /**
     * 获取co排放量
     *
     * @return co - co排放量
     */
    public String getCo() {
        return co;
    }

    /**
     * 设置co排放量
     *
     * @param co co排放量
     */
    public void setCo(String co) {
        this.co = co;
    }

    /**
     * 获取pm10排放量
     *
     * @return pm10 - pm10排放量
     */
    public String getPm10() {
        return pm10;
    }

    /**
     * 设置pm10排放量
     *
     * @param pm10 pm10排放量
     */
    public void setPm10(String pm10) {
        this.pm10 = pm10;
    }

    /**
     * 获取pm2.5排放量
     *
     * @return pm25 - pm2.5排放量
     */
    public String getPm25() {
        return pm25;
    }

    /**
     * 设置pm2.5排放量
     *
     * @param pm25 pm2.5排放量
     */
    public void setPm25(String pm25) {
        this.pm25 = pm25;
    }

    /**
     * 获取voc排放量
     *
     * @return voc - voc排放量
     */
    public String getVoc() {
        return voc;
    }

    /**
     * 设置voc排放量
     *
     * @param voc voc排放量
     */
    public void setVoc(String voc) {
        this.voc = voc;
    }

    /**
     * 获取nh3排放量
     *
     * @return nh3 - nh3排放量
     */
    public String getNh3() {
        return nh3;
    }

    /**
     * 设置nh3排放量
     *
     * @param nh3 nh3排放量
     */
    public void setNh3(String nh3) {
        this.nh3 = nh3;
    }

    /**
     * 获取bc排放量
     *
     * @return bc - bc排放量
     */
    public String getBc() {
        return bc;
    }

    /**
     * 设置bc排放量
     *
     * @param bc bc排放量
     */
    public void setBc(String bc) {
        this.bc = bc;
    }

    /**
     * 获取oc排放量
     *
     * @return oc - oc排放量
     */
    public String getOc() {
        return oc;
    }

    /**
     * 设置oc排放量
     *
     * @param oc oc排放量
     */
    public void setOc(String oc) {
        this.oc = oc;
    }

    /**
     * 获取脱硫工艺
     *
     * @return tlgy - 脱硫工艺
     */
    public String getTlgy() {
        return tlgy;
    }

    /**
     * 设置脱硫工艺
     *
     * @param tlgy 脱硫工艺
     */
    public void setTlgy(String tlgy) {
        this.tlgy = tlgy;
    }

    /**
     * 获取二氧化硫治理措施-脱硫岛效率
     *
     * @return tlxl - 二氧化硫治理措施-脱硫岛效率
     */
    public String getTlxl() {
        return tlxl;
    }

    /**
     * 设置二氧化硫治理措施-脱硫岛效率
     *
     * @param tlxl 二氧化硫治理措施-脱硫岛效率
     */
    public void setTlxl(String tlxl) {
        this.tlxl = tlxl;
    }

    /**
     * 获取脱销工艺
     *
     * @return txgy - 脱销工艺
     */
    public String getTxgy() {
        return txgy;
    }

    /**
     * 设置脱销工艺
     *
     * @param txgy 脱销工艺
     */
    public void setTxgy(String txgy) {
        this.txgy = txgy;
    }

    /**
     * 获取氮氧化物治理措施-脱硝效率
     *
     * @return txxl - 氮氧化物治理措施-脱硝效率
     */
    public String getTxxl() {
        return txxl;
    }

    /**
     * 设置氮氧化物治理措施-脱硝效率
     *
     * @param txxl 氮氧化物治理措施-脱硝效率
     */
    public void setTxxl(String txxl) {
        this.txxl = txxl;
    }

    /**
     * 获取除尘工艺
     *
     * @return ccgy - 除尘工艺
     */
    public String getCcgy() {
        return ccgy;
    }

    /**
     * 设置除尘工艺
     *
     * @param ccgy 除尘工艺
     */
    public void setCcgy(String ccgy) {
        this.ccgy = ccgy;
    }

    /**
     * 获取烟粉尘治理措施-除尘效率
     *
     * @return ccxl - 烟粉尘治理措施-除尘效率
     */
    public String getCcxl() {
        return ccxl;
    }

    /**
     * 设置烟粉尘治理措施-除尘效率
     *
     * @param ccxl 烟粉尘治理措施-除尘效率
     */
    public void setCcxl(String ccxl) {
        this.ccxl = ccxl;
    }

    /**
     * 获取voc回收工艺
     *
     * @return vocgy - voc回收工艺
     */
    public String getVocgy() {
        return vocgy;
    }

    /**
     * 设置voc回收工艺
     *
     * @param vocgy voc回收工艺
     */
    public void setVocgy(String vocgy) {
        this.vocgy = vocgy;
    }

    /**
     * 获取voc回收技术
     *
     * @return vochs - voc回收技术
     */
    public String getVochs() {
        return vochs;
    }

    /**
     * 设置voc回收技术
     *
     * @param vochs voc回收技术
     */
    public void setVochs(String vochs) {
        this.vochs = vochs;
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
        sb.append(", specialGangtieId=").append(specialGangtieId);
        sb.append(", processType=").append(processType);
        sb.append(", deviceType=").append(deviceType);
        sb.append(", capacity=").append(capacity);
        sb.append(", fuelType=").append(fuelType);
        sb.append(", fuelConsumption=").append(fuelConsumption);
        sb.append(", yuanliao=").append(yuanliao);
        sb.append(", yuanliaoConsumption=").append(yuanliaoConsumption);
        sb.append(", productType=").append(productType);
        sb.append(", productProduction=").append(productProduction);
        sb.append(", so2=").append(so2);
        sb.append(", nox=").append(nox);
        sb.append(", co=").append(co);
        sb.append(", pm10=").append(pm10);
        sb.append(", pm25=").append(pm25);
        sb.append(", voc=").append(voc);
        sb.append(", nh3=").append(nh3);
        sb.append(", bc=").append(bc);
        sb.append(", oc=").append(oc);
        sb.append(", tlgy=").append(tlgy);
        sb.append(", tlxl=").append(tlxl);
        sb.append(", txgy=").append(txgy);
        sb.append(", txxl=").append(txxl);
        sb.append(", ccgy=").append(ccgy);
        sb.append(", ccxl=").append(ccxl);
        sb.append(", vocgy=").append(vocgy);
        sb.append(", vochs=").append(vochs);
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