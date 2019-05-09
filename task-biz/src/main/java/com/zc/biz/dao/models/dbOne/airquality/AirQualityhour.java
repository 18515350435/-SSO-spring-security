package com.zc.biz.dao.models.dbOne.airquality;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "air_qualityhour")
public class AirQualityhour implements Serializable {
    @Id
    @Column(name = "Id")
    private String id;

    @Column(name = "Area")
    private String area;

    @Column(name = "Aqi")
    private Integer aqi;

    @Column(name = "Quality")
    private String quality;

    @Column(name = "Primarypollutant")
    private String primarypollutant;

    @Column(name = "So2")
    private Integer so2;

    @Column(name = "CO")
    private BigDecimal co;

    @Column(name = "No2")
    private Integer no2;

    @Column(name = "O3")
    private Integer o3;

    @Column(name = "Pm10")
    private Integer pm10;

    @Column(name = "Pm25")
    private Integer pm25;

    @Column(name = "CityCode")
    private String citycode;

    @Column(name = "Measure")
    private String measure;

    @Column(name = "Unheathful")
    private String unheathful;

    @Column(name = "Com_Index")
    private BigDecimal comIndex;

    @Column(name = "CreateTime")
    private Date createtime;

    @Column(name = "TimePoint")
    private Date timepoint;

    @Column(name = "PKID")
    private String pkid;

    private static final long serialVersionUID = 1L;

    /**
     * @return Id
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
     * @return Area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * @return Aqi
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
     * @return Quality
     */
    public String getQuality() {
        return quality;
    }

    /**
     * @param quality
     */
    public void setQuality(String quality) {
        this.quality = quality;
    }

    /**
     * @return Primarypollutant
     */
    public String getPrimarypollutant() {
        return primarypollutant;
    }

    /**
     * @param primarypollutant
     */
    public void setPrimarypollutant(String primarypollutant) {
        this.primarypollutant = primarypollutant;
    }

    /**
     * @return So2
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
     * @return No2
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
     * @return Pm10
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
     * @return Pm25
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
     * @return CityCode
     */
    public String getCitycode() {
        return citycode;
    }

    /**
     * @param citycode
     */
    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    /**
     * @return Measure
     */
    public String getMeasure() {
        return measure;
    }

    /**
     * @param measure
     */
    public void setMeasure(String measure) {
        this.measure = measure;
    }

    /**
     * @return Unheathful
     */
    public String getUnheathful() {
        return unheathful;
    }

    /**
     * @param unheathful
     */
    public void setUnheathful(String unheathful) {
        this.unheathful = unheathful;
    }

    /**
     * @return Com_Index
     */
    public BigDecimal getComIndex() {
        return comIndex;
    }

    /**
     * @param comIndex
     */
    public void setComIndex(BigDecimal comIndex) {
        this.comIndex = comIndex;
    }

    /**
     * @return CreateTime
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * @return TimePoint
     */
    public Date getTimePoint() {
        return timepoint;
    }

    /**
     * @param timepoint
     */
    public void setTimePoint(Date timepoint) {
        this.timepoint = timepoint;
    }
    /**
     * @return PKID
     */
    public String getPkid() {
        return pkid;
    }

    /**
     * @param pkid
     */
    public void setPkid(String pkid) {
        this.pkid = pkid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", area=").append(area);
        sb.append(", aqi=").append(aqi);
        sb.append(", quality=").append(quality);
        sb.append(", primarypollutant=").append(primarypollutant);
        sb.append(", so2=").append(so2);
        sb.append(", co=").append(co);
        sb.append(", no2=").append(no2);
        sb.append(", o3=").append(o3);
        sb.append(", pm10=").append(pm10);
        sb.append(", pm25=").append(pm25);
        sb.append(", citycode=").append(citycode);
        sb.append(", measure=").append(measure);
        sb.append(", unheathful=").append(unheathful);
        sb.append(", comIndex=").append(comIndex);
        sb.append(", createtime=").append(createtime);
        sb.append(", pkid=").append(pkid);
        sb.append("]");
        return sb.toString();
    }
}