package com.zc.biz.dao.models.dbOne.yqd;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "special_gypt")
public class SpecialGypt implements Serializable {
    @Id
    private Integer id;

    /**
     * 原清单各企业基本属性表id
     */
    @Column(name = "pollutant_discharge_id")
    private String pollutantDischargeId;

    /**
     * 喷涂工序
     */
    private String ptgx;

    /**
     * 溶剂类型
     */
    private String rjlx;

    /**
     * 溶剂性质
     */
    private String rjxz;

    /**
     * 涂料(油漆)年用量
     */
    private String tlnyl;

    /**
     * 稀释剂年用量
     */
    private String xsjnyl;

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
     * 获取喷涂工序
     *
     * @return ptgx - 喷涂工序
     */
    public String getPtgx() {
        return ptgx;
    }

    /**
     * 设置喷涂工序
     *
     * @param ptgx 喷涂工序
     */
    public void setPtgx(String ptgx) {
        this.ptgx = ptgx;
    }

    /**
     * 获取溶剂类型
     *
     * @return rjlx - 溶剂类型
     */
    public String getRjlx() {
        return rjlx;
    }

    /**
     * 设置溶剂类型
     *
     * @param rjlx 溶剂类型
     */
    public void setRjlx(String rjlx) {
        this.rjlx = rjlx;
    }

    /**
     * 获取溶剂性质
     *
     * @return rjxz - 溶剂性质
     */
    public String getRjxz() {
        return rjxz;
    }

    /**
     * 设置溶剂性质
     *
     * @param rjxz 溶剂性质
     */
    public void setRjxz(String rjxz) {
        this.rjxz = rjxz;
    }

    /**
     * 获取涂料(油漆)年用量
     *
     * @return tlnyl - 涂料(油漆)年用量
     */
    public String getTlnyl() {
        return tlnyl;
    }

    /**
     * 设置涂料(油漆)年用量
     *
     * @param tlnyl 涂料(油漆)年用量
     */
    public void setTlnyl(String tlnyl) {
        this.tlnyl = tlnyl;
    }

    /**
     * 获取稀释剂年用量
     *
     * @return xsjnyl - 稀释剂年用量
     */
    public String getXsjnyl() {
        return xsjnyl;
    }

    /**
     * 设置稀释剂年用量
     *
     * @param xsjnyl 稀释剂年用量
     */
    public void setXsjnyl(String xsjnyl) {
        this.xsjnyl = xsjnyl;
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
        sb.append(", ptgx=").append(ptgx);
        sb.append(", rjlx=").append(rjlx);
        sb.append(", rjxz=").append(rjxz);
        sb.append(", tlnyl=").append(tlnyl);
        sb.append(", xsjnyl=").append(xsjnyl);
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