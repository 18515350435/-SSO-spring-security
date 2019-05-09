package com.zc.api.model.resp.air;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AirQualityRank implements Serializable {

    @ApiModelProperty(value = "城市")
    private String area;

    @ApiModelProperty(value = "省份")
    private String province;

    @ApiModelProperty(value = "AQI")
    private Integer aqi;

    @ApiModelProperty(value = "首要污染物")
    private String primarypollutant;
    @ApiModelProperty(value = "综合指数")
    private BigDecimal comIndex;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
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

    public String getPrimarypollutant() {
        return primarypollutant;
    }

    public void setPrimarypollutant(String primarypollutant) {
        this.primarypollutant = primarypollutant;
    }
}