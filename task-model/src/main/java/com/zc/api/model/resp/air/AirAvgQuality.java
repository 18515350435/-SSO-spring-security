package com.zc.api.model.resp.air;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

public class AirAvgQuality implements Serializable {

    @ApiModelProperty(value = "so2")
    private BigDecimal so2;

    @ApiModelProperty(value = "co")
    private BigDecimal co;

    @ApiModelProperty(value = "no2")
    private BigDecimal no2;

    @ApiModelProperty(value = "o3")
    private BigDecimal o3;

    @ApiModelProperty(value = "pm10")
    private BigDecimal pm10;

    @ApiModelProperty(value = "pm25")
    private BigDecimal pm25;

    public BigDecimal getSo2() {
        return so2;
    }

    public void setSo2(BigDecimal so2) {
        this.so2 = so2;
    }

    public BigDecimal getCo() {
        return co;
    }

    public void setCo(BigDecimal co) {
        this.co = co;
    }

    public BigDecimal getNo2() {
        return no2;
    }

    public void setNo2(BigDecimal no2) {
        this.no2 = no2;
    }

    public BigDecimal getO3() {
        return o3;
    }

    public void setO3(BigDecimal o3) {
        this.o3 = o3;
    }

    public BigDecimal getPm10() {
        return pm10;
    }

    public void setPm10(BigDecimal pm10) {
        this.pm10 = pm10;
    }

    public BigDecimal getPm25() {
        return pm25;
    }

    public void setPm25(BigDecimal pm25) {
        this.pm25 = pm25;
    }
}