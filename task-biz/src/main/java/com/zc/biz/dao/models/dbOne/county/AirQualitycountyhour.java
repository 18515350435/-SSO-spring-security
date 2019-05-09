package com.zc.biz.dao.models.dbOne.county;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

@Table(name = "air_qualitycountyhour")
public class AirQualitycountyhour implements Serializable {
    @Column(name = "Id")
    private String id;

    @Column(name = "GridCode")
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

    private Integer o3;

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

    private String mainpoll;

    @Column(name = "ComplexIndex")
    private Double complexindex;

    private String quality;

    /**
     * ��������
     */
    @Column(name = "hourRankInCity")
    private Integer hourrankincity;

    private Integer houraqi;

    @Column(name = "hourrank_74")
    private Integer hourrank74;

    private Double dayindex;

    @Column(name = "dayrank_74")
    private Integer dayrank74;

    private Double monthindex;

    @Column(name = "monthrank_74")
    private Integer monthrank74;

    private Double yearindex;

    @Column(name = "yearrank_74")
    private Integer yearrank74;

    @Column(name = "lastyear_dayindex")
    private Double lastyearDayindex;

    @Column(name = "lastyear_dayrank")
    private Integer lastyearDayrank;

    @Column(name = "lastyear_monthindex")
    private Double lastyearMonthindex;

    @Column(name = "lastyear_monthrank")
    private Integer lastyearMonthrank;

    @Column(name = "lastyear_yearindex")
    private Double lastyearYearindex;

    @Column(name = "lastyear_yearrank")
    private Integer lastyearYearrank;

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
     * @return GridCode
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
     * @return o3
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
     * @return mainpoll
     */
    public String getMainpoll() {
        return mainpoll;
    }

    /**
     * @param mainpoll
     */
    public void setMainpoll(String mainpoll) {
        this.mainpoll = mainpoll;
    }

    /**
     * @return ComplexIndex
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
     * @return quality
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
     * ��ȡ��������
     *
     * @return hourRankInCity - ��������
     */
    public Integer getHourrankincity() {
        return hourrankincity;
    }

    /**
     * ���ñ�������
     *
     * @param hourrankincity ��������
     */
    public void setHourrankincity(Integer hourrankincity) {
        this.hourrankincity = hourrankincity;
    }

    /**
     * @return houraqi
     */
    public Integer getHouraqi() {
        return houraqi;
    }

    /**
     * @param houraqi
     */
    public void setHouraqi(Integer houraqi) {
        this.houraqi = houraqi;
    }

    /**
     * @return hourrank_74
     */
    public Integer getHourrank74() {
        return hourrank74;
    }

    /**
     * @param hourrank74
     */
    public void setHourrank74(Integer hourrank74) {
        this.hourrank74 = hourrank74;
    }

    /**
     * @return dayindex
     */
    public Double getDayindex() {
        return dayindex;
    }

    /**
     * @param dayindex
     */
    public void setDayindex(Double dayindex) {
        this.dayindex = dayindex;
    }

    /**
     * @return dayrank_74
     */
    public Integer getDayrank74() {
        return dayrank74;
    }

    /**
     * @param dayrank74
     */
    public void setDayrank74(Integer dayrank74) {
        this.dayrank74 = dayrank74;
    }

    /**
     * @return monthindex
     */
    public Double getMonthindex() {
        return monthindex;
    }

    /**
     * @param monthindex
     */
    public void setMonthindex(Double monthindex) {
        this.monthindex = monthindex;
    }

    /**
     * @return monthrank_74
     */
    public Integer getMonthrank74() {
        return monthrank74;
    }

    /**
     * @param monthrank74
     */
    public void setMonthrank74(Integer monthrank74) {
        this.monthrank74 = monthrank74;
    }

    /**
     * @return yearindex
     */
    public Double getYearindex() {
        return yearindex;
    }

    /**
     * @param yearindex
     */
    public void setYearindex(Double yearindex) {
        this.yearindex = yearindex;
    }

    /**
     * @return yearrank_74
     */
    public Integer getYearrank74() {
        return yearrank74;
    }

    /**
     * @param yearrank74
     */
    public void setYearrank74(Integer yearrank74) {
        this.yearrank74 = yearrank74;
    }

    /**
     * @return lastyear_dayindex
     */
    public Double getLastyearDayindex() {
        return lastyearDayindex;
    }

    /**
     * @param lastyearDayindex
     */
    public void setLastyearDayindex(Double lastyearDayindex) {
        this.lastyearDayindex = lastyearDayindex;
    }

    /**
     * @return lastyear_dayrank
     */
    public Integer getLastyearDayrank() {
        return lastyearDayrank;
    }

    /**
     * @param lastyearDayrank
     */
    public void setLastyearDayrank(Integer lastyearDayrank) {
        this.lastyearDayrank = lastyearDayrank;
    }

    /**
     * @return lastyear_monthindex
     */
    public Double getLastyearMonthindex() {
        return lastyearMonthindex;
    }

    /**
     * @param lastyearMonthindex
     */
    public void setLastyearMonthindex(Double lastyearMonthindex) {
        this.lastyearMonthindex = lastyearMonthindex;
    }

    /**
     * @return lastyear_monthrank
     */
    public Integer getLastyearMonthrank() {
        return lastyearMonthrank;
    }

    /**
     * @param lastyearMonthrank
     */
    public void setLastyearMonthrank(Integer lastyearMonthrank) {
        this.lastyearMonthrank = lastyearMonthrank;
    }

    /**
     * @return lastyear_yearindex
     */
    public Double getLastyearYearindex() {
        return lastyearYearindex;
    }

    /**
     * @param lastyearYearindex
     */
    public void setLastyearYearindex(Double lastyearYearindex) {
        this.lastyearYearindex = lastyearYearindex;
    }

    /**
     * @return lastyear_yearrank
     */
    public Integer getLastyearYearrank() {
        return lastyearYearrank;
    }

    /**
     * @param lastyearYearrank
     */
    public void setLastyearYearrank(Integer lastyearYearrank) {
        this.lastyearYearrank = lastyearYearrank;
    }

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
        sb.append(", o3=").append(o3);
        sb.append(", aqistatus=").append(aqistatus);
        sb.append(", pm25status=").append(pm25status);
        sb.append(", pm10status=").append(pm10status);
        sb.append(", so2status=").append(so2status);
        sb.append(", no2status=").append(no2status);
        sb.append(", costatus=").append(costatus);
        sb.append(", o3status=").append(o3status);
        sb.append(", mainpoll=").append(mainpoll);
        sb.append(", complexindex=").append(complexindex);
        sb.append(", quality=").append(quality);
        sb.append(", hourrankincity=").append(hourrankincity);
        sb.append(", houraqi=").append(houraqi);
        sb.append(", hourrank74=").append(hourrank74);
        sb.append(", dayindex=").append(dayindex);
        sb.append(", dayrank74=").append(dayrank74);
        sb.append(", monthindex=").append(monthindex);
        sb.append(", monthrank74=").append(monthrank74);
        sb.append(", yearindex=").append(yearindex);
        sb.append(", yearrank74=").append(yearrank74);
        sb.append(", lastyearDayindex=").append(lastyearDayindex);
        sb.append(", lastyearDayrank=").append(lastyearDayrank);
        sb.append(", lastyearMonthindex=").append(lastyearMonthindex);
        sb.append(", lastyearMonthrank=").append(lastyearMonthrank);
        sb.append(", lastyearYearindex=").append(lastyearYearindex);
        sb.append(", lastyearYearrank=").append(lastyearYearrank);
        sb.append("]");
        return sb.toString();
    }
}