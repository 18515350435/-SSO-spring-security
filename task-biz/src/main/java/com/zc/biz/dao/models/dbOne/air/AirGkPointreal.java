package com.zc.biz.dao.models.dbOne.air;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "air_gk_pointreal")
public class AirGkPointreal implements Serializable {
    /**
     * 国控点code
     */
    @Column(name = "StationCode")
    private String stationcode;

    /**
     * 发布时间
     */
    @Column(name = "PubDateTime")
    private Date pubdatetime;

    @Column(name = "AQI")
    private Integer aqi;

    @Column(name = "PM2_5")
    private Integer pm25;

    @Column(name = "PM2_5_24h")
    private Integer pm2524h;

    @Column(name = "PM10")
    private Integer pm10;

    @Column(name = "PM10_24h")
    private Integer pm1024h;

    @Column(name = "SO2")
    private Integer so2;

    @Column(name = "SO2_24h")
    private Integer so224h;

    @Column(name = "NO2")
    private Integer no2;

    @Column(name = "NO2_24h")
    private Integer no224h;

    @Column(name = "O3")
    private Integer o3;

    @Column(name = "O3_24h")
    private Integer o324h;

    @Column(name = "O3_8h")
    private Integer o38h;

    @Column(name = "O3_8h_24h")
    private Integer o38h24h;

    @Column(name = "CO")
    private BigDecimal co;

    @Column(name = "CO_24h")
    private BigDecimal co24h;

    /**
     * 首要污染物
     */
    @Column(name = "PrimaryPollution")
    private String primarypollution;

    /**
     * 空气质量
     */
    @Column(name = "Quality")
    private String quality;

    /**
     * 综合指数
     */
    @Column(name = "ComplexIndex")
    private BigDecimal complexindex;

    private static final long serialVersionUID = 1L;

    /**
     * 获取国控点code
     *
     * @return StationCode - 国控点code
     */
    public String getStationcode() {
        return stationcode;
    }

    /**
     * 设置国控点code
     *
     * @param stationcode 国控点code
     */
    public void setStationcode(String stationcode) {
        this.stationcode = stationcode;
    }

    /**
     * 获取发布时间
     *
     * @return PubDateTime - 发布时间
     */
    public Date getPubdatetime() {
        return pubdatetime;
    }

    /**
     * 设置发布时间
     *
     * @param pubdatetime 发布时间
     */
    public void setPubdatetime(Date pubdatetime) {
        this.pubdatetime = pubdatetime;
    }

    /**
     * @return AQI
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
     * @return PM2_5
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
     * @return PM2_5_24h
     */
    public Integer getPm2524h() {
        return pm2524h;
    }

    /**
     * @param pm2524h
     */
    public void setPm2524h(Integer pm2524h) {
        this.pm2524h = pm2524h;
    }

    /**
     * @return PM10
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
     * @return PM10_24h
     */
    public Integer getPm1024h() {
        return pm1024h;
    }

    /**
     * @param pm1024h
     */
    public void setPm1024h(Integer pm1024h) {
        this.pm1024h = pm1024h;
    }

    /**
     * @return SO2
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
     * @return SO2_24h
     */
    public Integer getSo224h() {
        return so224h;
    }

    /**
     * @param so224h
     */
    public void setSo224h(Integer so224h) {
        this.so224h = so224h;
    }

    /**
     * @return NO2
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
     * @return NO2_24h
     */
    public Integer getNo224h() {
        return no224h;
    }

    /**
     * @param no224h
     */
    public void setNo224h(Integer no224h) {
        this.no224h = no224h;
    }

    /**
     * @return O3
     */
    public Integer getO3() {
        return o3;
    }

    /**
     * @param o3
     */
    public void setO3(Integer o3) {
        this.o3 = o3;
    }

    /**
     * @return O3_24h
     */
    public Integer getO324h() {
        return o324h;
    }

    /**
     * @param o324h
     */
    public void setO324h(Integer o324h) {
        this.o324h = o324h;
    }

    /**
     * @return O3_8h
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
     * @return O3_8h_24h
     */
    public Integer getO38h24h() {
        return o38h24h;
    }

    /**
     * @param o38h24h
     */
    public void setO38h24h(Integer o38h24h) {
        this.o38h24h = o38h24h;
    }

    /**
     * @return CO
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
     * @return CO_24h
     */
    public BigDecimal getCo24h() {
        return co24h;
    }

    /**
     * @param co24h
     */
    public void setCo24h(BigDecimal co24h) {
        this.co24h = co24h;
    }

    /**
     * 获取首要污染物
     *
     * @return PrimaryPollution - 首要污染物
     */
    public String getPrimarypollution() {
        return primarypollution;
    }

    /**
     * 设置首要污染物
     *
     * @param primarypollution 首要污染物
     */
    public void setPrimarypollution(String primarypollution) {
        this.primarypollution = primarypollution;
    }

    /**
     * 获取空气质量
     *
     * @return Quality - 空气质量
     */
    public String getQuality() {
        return quality;
    }

    /**
     * 设置空气质量
     *
     * @param quality 空气质量
     */
    public void setQuality(String quality) {
        this.quality = quality;
    }

    /**
     * 获取综合指数
     *
     * @return ComplexIndex - 综合指数
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stationcode=").append(stationcode);
        sb.append(", pubdatetime=").append(pubdatetime);
        sb.append(", aqi=").append(aqi);
        sb.append(", pm25=").append(pm25);
        sb.append(", pm2524h=").append(pm2524h);
        sb.append(", pm10=").append(pm10);
        sb.append(", pm1024h=").append(pm1024h);
        sb.append(", so2=").append(so2);
        sb.append(", so224h=").append(so224h);
        sb.append(", no2=").append(no2);
        sb.append(", no224h=").append(no224h);
        sb.append(", o3=").append(o3);
        sb.append(", o324h=").append(o324h);
        sb.append(", o38h=").append(o38h);
        sb.append(", o38h24h=").append(o38h24h);
        sb.append(", co=").append(co);
        sb.append(", co24h=").append(co24h);
        sb.append(", primarypollution=").append(primarypollution);
        sb.append(", quality=").append(quality);
        sb.append(", complexindex=").append(complexindex);
        sb.append("]");
        return sb.toString();
    }
}