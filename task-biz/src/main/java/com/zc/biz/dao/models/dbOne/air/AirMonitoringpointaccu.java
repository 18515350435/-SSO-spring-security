package com.zc.biz.dao.models.dbOne.air;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "air_monitoringpointaccu")
public class AirMonitoringpointaccu implements Serializable {
    /**
     * 主键
     */
    @Column(name = "Id")
    private String id;

    /**
     * 检测点id
     */
    @Column(name = "pointId")
    private String pointid;

    /**
     * 监测时间
     */
    private Date time;

    /**
     * 入库数据
     */
    @Column(name = "CreateTime")
    private Date createtime;

    private Integer aqi;

    @Column(name = "pm2_5")
    private Integer pm25;

    private Integer pm10;

    private Integer so2;

    private Integer no2;

    private BigDecimal co;

    @Column(name = "o3_8h")
    private Integer o38h;

    /**
     * aqi颜色
     */
    @Column(name = "AQIStatus")
    private String aqistatus;

    /**
     * pm2.5颜色
     */
    @Column(name = "PM25Status")
    private String pm25status;

    /**
     * pm10颜色
     */
    @Column(name = "PM10Status")
    private String pm10status;

    /**
     * so2颜色
     */
    @Column(name = "SO2Status")
    private String so2status;

    /**
     * no2颜色
     */
    @Column(name = "NO2Status")
    private String no2status;

    /**
     * co颜色
     */
    @Column(name = "COStatus")
    private String costatus;

    /**
     * o3颜色
     */
    @Column(name = "O3Status")
    private String o3status;

    /**
     * 综合指数
     */
    private BigDecimal complexindex;

    /**
     * 首要污染物
     */
    @Column(name = "primary_pollutant")
    private String primaryPollutant;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return Id - 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取检测点id
     *
     * @return pointId - 检测点id
     */
    public String getPointid() {
        return pointid;
    }

    /**
     * 设置检测点id
     *
     * @param pointid 检测点id
     */
    public void setPointid(String pointid) {
        this.pointid = pointid;
    }

    /**
     * 获取监测时间
     *
     * @return time - 监测时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置监测时间
     *
     * @param time 监测时间
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 获取入库数据
     *
     * @return CreateTime - 入库数据
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置入库数据
     *
     * @param createtime 入库数据
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * @return aqi
     */
    public Integer getAqi() {
        return aqi;
    }

    /**
     * @param aqi
     */
    public void setAqi(Integer aqi) {
        this.aqi = aqi;
    }

    /**
     * @return pm2_5
     */
    public Integer getPm25() {
        return pm25;
    }

    /**
     * @param pm25
     */
    public void setPm25(Integer pm25) {
        this.pm25 = pm25;
    }

    /**
     * @return pm10
     */
    public Integer getPm10() {
        return pm10;
    }

    /**
     * @param pm10
     */
    public void setPm10(Integer pm10) {
        this.pm10 = pm10;
    }

    /**
     * @return so2
     */
    public Integer getSo2() {
        return so2;
    }

    /**
     * @param so2
     */
    public void setSo2(Integer so2) {
        this.so2 = so2;
    }

    /**
     * @return no2
     */
    public Integer getNo2() {
        return no2;
    }

    /**
     * @param no2
     */
    public void setNo2(Integer no2) {
        this.no2 = no2;
    }

    /**
     * @return co
     */
    public BigDecimal getCo() {
        return co;
    }

    /**
     * @param co
     */
    public void setCo(BigDecimal co) {
        this.co = co;
    }

    /**
     * @return o3_8h
     */
    public Integer getO38h() {
        return o38h;
    }

    /**
     * @param o38h
     */
    public void setO38h(Integer o38h) {
        this.o38h = o38h;
    }

    /**
     * 获取aqi颜色
     *
     * @return AQIStatus - aqi颜色
     */
    public String getAqistatus() {
        return aqistatus;
    }

    /**
     * 设置aqi颜色
     *
     * @param aqistatus aqi颜色
     */
    public void setAqistatus(String aqistatus) {
        this.aqistatus = aqistatus;
    }

    /**
     * 获取pm2.5颜色
     *
     * @return PM25Status - pm2.5颜色
     */
    public String getPm25status() {
        return pm25status;
    }

    /**
     * 设置pm2.5颜色
     *
     * @param pm25status pm2.5颜色
     */
    public void setPm25status(String pm25status) {
        this.pm25status = pm25status;
    }

    /**
     * 获取pm10颜色
     *
     * @return PM10Status - pm10颜色
     */
    public String getPm10status() {
        return pm10status;
    }

    /**
     * 设置pm10颜色
     *
     * @param pm10status pm10颜色
     */
    public void setPm10status(String pm10status) {
        this.pm10status = pm10status;
    }

    /**
     * 获取so2颜色
     *
     * @return SO2Status - so2颜色
     */
    public String getSo2status() {
        return so2status;
    }

    /**
     * 设置so2颜色
     *
     * @param so2status so2颜色
     */
    public void setSo2status(String so2status) {
        this.so2status = so2status;
    }

    /**
     * 获取no2颜色
     *
     * @return NO2Status - no2颜色
     */
    public String getNo2status() {
        return no2status;
    }

    /**
     * 设置no2颜色
     *
     * @param no2status no2颜色
     */
    public void setNo2status(String no2status) {
        this.no2status = no2status;
    }

    /**
     * 获取co颜色
     *
     * @return COStatus - co颜色
     */
    public String getCostatus() {
        return costatus;
    }

    /**
     * 设置co颜色
     *
     * @param costatus co颜色
     */
    public void setCostatus(String costatus) {
        this.costatus = costatus;
    }

    /**
     * 获取o3颜色
     *
     * @return O3Status - o3颜色
     */
    public String getO3status() {
        return o3status;
    }

    /**
     * 设置o3颜色
     *
     * @param o3status o3颜色
     */
    public void setO3status(String o3status) {
        this.o3status = o3status;
    }

    /**
     * 获取综合指数
     *
     * @return complexindex - 综合指数
     */
    public BigDecimal getComplexindex() {
        return complexindex;
    }

    /**
     * 设置综合指数
     *
     * @param complexindex 综合指数
     */
    public void setComplexindex(BigDecimal complexindex) {
        this.complexindex = complexindex;
    }

    /**
     * 获取首要污染物
     *
     * @return primary_pollutant - 首要污染物
     */
    public String getPrimaryPollutant() {
        return primaryPollutant;
    }

    /**
     * 设置首要污染物
     *
     * @param primaryPollutant 首要污染物
     */
    public void setPrimaryPollutant(String primaryPollutant) {
        this.primaryPollutant = primaryPollutant;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pointid=").append(pointid);
        sb.append(", time=").append(time);
        sb.append(", createtime=").append(createtime);
        sb.append(", aqi=").append(aqi);
        sb.append(", pm25=").append(pm25);
        sb.append(", pm10=").append(pm10);
        sb.append(", so2=").append(so2);
        sb.append(", no2=").append(no2);
        sb.append(", co=").append(co);
        sb.append(", o38h=").append(o38h);
        sb.append(", aqistatus=").append(aqistatus);
        sb.append(", pm25status=").append(pm25status);
        sb.append(", pm10status=").append(pm10status);
        sb.append(", so2status=").append(so2status);
        sb.append(", no2status=").append(no2status);
        sb.append(", costatus=").append(costatus);
        sb.append(", o3status=").append(o3status);
        sb.append(", complexindex=").append(complexindex);
        sb.append(", primaryPollutant=").append(primaryPollutant);
        sb.append("]");
        return sb.toString();
    }
}