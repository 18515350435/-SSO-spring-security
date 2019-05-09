package com.zc.api.model.resp.air;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class AirQualitySixPer implements Serializable {


    @ApiModelProperty(value = "so2")
    private Double so2;

    @ApiModelProperty(value = "co")
    private Double co;

    @ApiModelProperty(value = "no2")
    private Double no2;

    @ApiModelProperty(value = "o3")
    private Double o3;

    @ApiModelProperty(value = "pm10")
    private Double pm10;

    @ApiModelProperty(value = "pm25")
    private Double pm25;

    public Double getSo2() {
        return so2==null?0.0:(int)(so2*100)/100.0;
    }

    public void setSo2(Double so2) {
        this.so2 = so2;
    }

    public Double getCo() {
        return co==null?0.0:(int)(co*10)/10.0;
    }

    public void setCo(Double co) {
        this.co = co;
    }

    public Double getNo2() {
        return no2==null?0.0:(int)(no2*100)/100.0;
    }

    public void setNo2(Double no2) {
        this.no2 = no2;
    }

    public Double getO3() {
        return o3==null?0.0:(int)(o3*100)/100.0;
    }

    public void setO3(Double o3) {
        this.o3 = o3;
    }

    public Double getPm10() {
        return pm10==null?0.0:(int)(pm10*100)/100.0;
    }

    public void setPm10(Double pm10) {
        this.pm10 = pm10;
    }

    public Double getPm25() {
        return pm25==null?0.0:(int)(pm25*100)/100.0;
    }

    public void setPm25(Double pm25) {
        this.pm25 = pm25;
    }
}