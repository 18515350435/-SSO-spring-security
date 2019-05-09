package com.zc.biz.dao.models.dbOne.county;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

@Table(name = "air_qualitycountyday")
public class AirQualitycountyday implements Serializable {
    @Column(name = "Id")
    private String id;

    private String gridcode;

    private Timestamp time;

    @Column(name = "CreateTime")
    private Timestamp createtime;

    private Integer aqi;

    @Column(name = "pm2_5")
    private Integer pm25;

    private Integer pm10;

    private Integer so2;

    private Integer no2;

    private Double co;

    @Column(name = "o3_8h")
    private Integer o38h;

    @Column(name = "AQIStatus")
    private String aqistatus;

    @Column(name = "PM25Status")
    private String pm25status;

    @Column(name = "PM10Status")
    private String pm10status;

    @Column(name = "SO2Status")
    private String so2status;

    @Column(name = "NO2Status")
    private String no2status;

    @Column(name = "COStatus")
    private String costatus;

    @Column(name = "O3Status")
    private String o3status;

    @Column(name = "complexIndex")
    private Double complexindex;

    @Column(name = "primaryPollutant")
    private String primarypollutant;

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
     * @return gridcode
     */
    public String getGridcode() {
        return gridcode;
    }

    /**
     * @param gridcode
     */
    public void setGridcode(String gridcode) {
        this.gridcode = gridcode;
    }

    /**
     * @return time
     */
    public Date getTime() {
        return time;
    }

    /**
     * @param time
     */
    public void setTime(Timestamp time) {
        this.time = time;
    }

    /**
     * @return CreateTime
     */
    public Timestamp getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(Timestamp createtime) {
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
    public Double getCo() {
        return co;
    }

    /**
     * @param co
     */
    public void setCo(Double co) {
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
     * @return AQIStatus
     */
    public String getAqistatus() {
        return aqistatus;
    }

    /**
     * @param aqistatus
     */
    public void setAqistatus(String aqistatus) {
        this.aqistatus = aqistatus;
    }

    /**
     * @return PM25Status
     */
    public String getPm25status() {
        return pm25status;
    }

    /**
     * @param pm25status
     */
    public void setPm25status(String pm25status) {
        this.pm25status = pm25status;
    }

    /**
     * @return PM10Status
     */
    public String getPm10status() {
        return pm10status;
    }

    /**
     * @param pm10status
     */
    public void setPm10status(String pm10status) {
        this.pm10status = pm10status;
    }

    /**
     * @return SO2Status
     */
    public String getSo2status() {
        return so2status;
    }

    /**
     * @param so2status
     */
    public void setSo2status(String so2status) {
        this.so2status = so2status;
    }

    /**
     * @return NO2Status
     */
    public String getNo2status() {
        return no2status;
    }

    /**
     * @param no2status
     */
    public void setNo2status(String no2status) {
        this.no2status = no2status;
    }

    /**
     * @return COStatus
     */
    public String getCostatus() {
        return costatus;
    }

    /**
     * @param costatus
     */
    public void setCostatus(String costatus) {
        this.costatus = costatus;
    }

    /**
     * @return O3Status
     */
    public String getO3status() {
        return o3status;
    }

    /**
     * @param o3status
     */
    public void setO3status(String o3status) {
        this.o3status = o3status;
    }

    /**
     * @return complexIndex
     */
    public Double getComplexindex() {
        return complexindex;
    }

    /**
     * @param complexindex
     */
    public void setComplexindex(Double complexindex) {
        this.complexindex = complexindex;
    }

    /**
     * @return primaryPollutant
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

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
    @Column(name = "quality")
    private String quality;
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", gridcode=").append(gridcode);
        sb.append(", time=").append(time);
        sb.append(", createtime=").append(createtime);
        sb.append(", aqi=").append(aqi);
        sb.append(", pm25=").append(pm25);
        sb.append(", pm10=").append(pm10);
        sb.append(", so2=").append(so2);
        sb.append(", no2=").append(no2);
        sb.append(", co=").append(co);
        sb.append(", o38h=").append(o38h);
        sb.append(", quality=").append(quality);
        sb.append(", aqistatus=").append(aqistatus);
        sb.append(", pm25status=").append(pm25status);
        sb.append(", pm10status=").append(pm10status);
        sb.append(", so2status=").append(so2status);
        sb.append(", no2status=").append(no2status);
        sb.append(", costatus=").append(costatus);
        sb.append(", o3status=").append(o3status);
        sb.append(", complexindex=").append(complexindex);
        sb.append(", primarypollutant=").append(primarypollutant);
        sb.append("]");
        return sb.toString();
    }
}