package com.zc.biz.dao.models.dbOne.point;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Table(name = "provincestation_realtimedata_all")
public class ProvincestationRealtimedataAll implements Serializable {
    @Id
    private String id;

    /**
     * 省控点id
     */
    @Column(name = "point_id")
    private String pointId;

    /**
     * 空气质量等级
     */
    private String level;

    /**
     * 首要污染物
     */
    @Column(name = "max_poll")
    private String maxPoll;

    /**
     * 发布时间
     */
    @Column(name = "data_time")
    private String dataTime;

    /**
     * aqi
     */
    private BigDecimal aqi;

    /**
     * so2
     */
    private BigDecimal so2;

    /**
     * no2
     */
    private BigDecimal no2;

    /**
     * co
     */
    private BigDecimal co;

    /**
     * o3_1h
     */
    @Column(name = "o3_1h")
    private BigDecimal o31h;

    /**
     * o3_8h
     */
    @Column(name = "o3_8h")
    private BigDecimal o38h;

    /**
     * pm2.5
     */
    private BigDecimal pm25;

    /**
     * pm10
     */
    private BigDecimal pm10;

    /**
     * 插入时间
     */
    @Column(name = "inster_time")
    private String insterTime;
    /**
     * 综合指数
     */
    @Column(name = "complexIndex")
    private BigDecimal complexIndex;

    private static final long serialVersionUID = 1L;

    public BigDecimal getComplexIndex() {
        return complexIndex;
    }
    public void setComplexIndex(BigDecimal complexIndex) {
        this.complexIndex = complexIndex;
    }

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
     * 获取省控点id
     *
     * @return point_id - 省控点id
     */
    public String getPointId() {
        return pointId;
    }

    /**
     * 设置省控点id
     *
     * @param pointId 省控点id
     */
    public void setPointId(String pointId) {
        this.pointId = pointId;
    }

    /**
     * 获取空气质量等级
     *
     * @return level - 空气质量等级
     */
    public String getLevel() {
        return level;
    }

    /**
     * 设置空气质量等级
     *
     * @param level 空气质量等级
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * 获取首要污染物
     *
     * @return max_poll - 首要污染物
     */
    public String getMaxPoll() {
        return maxPoll;
    }

    /**
     * 设置首要污染物
     *
     * @param maxPoll 首要污染物
     */
    public void setMaxPoll(String maxPoll) {
        this.maxPoll = maxPoll;
    }

    /**
     * 获取发布时间
     *
     * @return data_time - 发布时间
     */
    public String getDataTime() {
        return dataTime;
    }

    /**
     * 设置发布时间
     *
     * @param dataTime 发布时间
     */
    public void setDataTime(String dataTime) {
        this.dataTime = dataTime;
    }

    /**
     * 获取aqi
     *
     * @return aqi - aqi
     */
    public BigDecimal getAqi() {
        return aqi;
    }

    /**
     * 设置aqi
     *
     * @param aqi aqi
     */
    public void setAqi(BigDecimal aqi) {
        this.aqi = aqi;
    }

    /**
     * 获取so2
     *
     * @return so2 - so2
     */
    public BigDecimal getSo2() {
        return so2;
    }

    /**
     * 设置so2
     *
     * @param so2 so2
     */
    public void setSo2(BigDecimal so2) {
        this.so2 = so2;
    }

    /**
     * 获取no2
     *
     * @return no2 - no2
     */
    public BigDecimal getNo2() {
        return no2;
    }

    /**
     * 设置no2
     *
     * @param no2 no2
     */
    public void setNo2(BigDecimal no2) {
        this.no2 = no2;
    }

    /**
     * 获取co
     *
     * @return co - co
     */
    public BigDecimal getCo() {
        return co;
    }

    /**
     * 设置co
     *
     * @param co co
     */
    public void setCo(BigDecimal co) {
        this.co = co;
    }

    /**
     * 获取o3_1h
     *
     * @return o3_1h - o3_1h
     */
    public BigDecimal getO31h() {
        return o31h;
    }

    /**
     * 设置o3_1h
     *
     * @param o31h o3_1h
     */
    public void setO31h(BigDecimal o31h) {
        this.o31h = o31h;
    }

    /**
     * 获取o3_8h
     *
     * @return o3_8h - o3_8h
     */
    public BigDecimal getO38h() {
        return o38h;
    }

    /**
     * 设置o3_8h
     *
     * @param o38h o3_8h
     */
    public void setO38h(BigDecimal o38h) {
        this.o38h = o38h;
    }

    /**
     * 获取pm2.5
     *
     * @return pm25 - pm2.5
     */
    public BigDecimal getPm25() {
        return pm25;
    }

    /**
     * 设置pm2.5
     *
     * @param pm25 pm2.5
     */
    public void setPm25(BigDecimal pm25) {
        this.pm25 = pm25;
    }

    /**
     * 获取pm10
     *
     * @return pm10 - pm10
     */
    public BigDecimal getPm10() {
        return pm10;
    }

    /**
     * 设置pm10
     *
     * @param pm10 pm10
     */
    public void setPm10(BigDecimal pm10) {
        this.pm10 = pm10;
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
        sb.append(", pointId=").append(pointId);
        sb.append(", level=").append(level);
        sb.append(", maxPoll=").append(maxPoll);
        sb.append(", dataTime=").append(dataTime);
        sb.append(", aqi=").append(aqi);
        sb.append(", so2=").append(so2);
        sb.append(", no2=").append(no2);
        sb.append(", co=").append(co);
        sb.append(", o31h=").append(o31h);
        sb.append(", o38h=").append(o38h);
        sb.append(", pm25=").append(pm25);
        sb.append(", pm10=").append(pm10);
        sb.append(", insterTime=").append(insterTime);
        sb.append("]");
        return sb.toString();
    }
}