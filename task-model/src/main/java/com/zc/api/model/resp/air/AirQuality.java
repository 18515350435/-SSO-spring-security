package com.zc.api.model.resp.air;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AirQuality implements Serializable {

    @ApiModelProperty(value = "城市")
    private String area;

    @ApiModelProperty(value = "AQI")
    private Integer aqi;

    @ApiModelProperty(value = "综合指数")
    private BigDecimal comIndex;

    @ApiModelProperty(value = "so2")
    private Integer so2;

    @ApiModelProperty(value = "co")
    private BigDecimal co;

    @ApiModelProperty(value = "no2")
    private Integer no2;

    @ApiModelProperty(value = "o3")
    private Integer o3;

    @ApiModelProperty(value = "pm10")
    private Integer pm10;

    @ApiModelProperty(value = "pm25")
    private Integer pm25;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    @ApiModelProperty(value = "时间")
    private Date timepoint;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Integer getAqi() {
        return aqi;
    }

    public void setAqi(Integer aqi) {
        this.aqi = aqi;
    }

    public BigDecimal getComIndex() {
        return comIndex;
    }

    public void setComIndex(BigDecimal comIndex) {
        this.comIndex = comIndex;
    }

    public Integer getSo2() {
        return so2;
    }

    public void setSo2(Integer so2) {
        this.so2 = so2;
    }

    public BigDecimal getCo() {
        return co;
    }

    public void setCo(BigDecimal co) {
        this.co = co;
    }

    public Integer getNo2() {
        return no2;
    }

    public void setNo2(Integer no2) {
        this.no2 = no2;
    }

    public Integer getO3() {
        return o3;
    }

    public void setO3(Integer o3) {
        this.o3 = o3;
    }

    public Integer getPm10() {
        return pm10;
    }

    public void setPm10(Integer pm10) {
        this.pm10 = pm10;
    }

    public Integer getPm25() {
        return pm25;
    }

    public void setPm25(Integer pm25) {
        this.pm25 = pm25;
    }

    public Date getTimepoint() {
        return timepoint;
    }

    public void setTimepoint(Date timepoint) {
        this.timepoint = timepoint;
    }
}