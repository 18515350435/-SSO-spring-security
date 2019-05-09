package com.zc.api.model.resp.air;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

public class AirQualityLevelRank implements Serializable {

    @ApiModelProperty(value = "城市")
    private String cityName;

    @ApiModelProperty(value = "优良天数")
    private Integer num=0;

    @ApiModelProperty(value = "去年同期优良天数")
    private Integer num2=0;

    @ApiModelProperty(value = "同比变化率")
    private String per="- -";

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    public String getPer() {
        return per;
    }

    public void setPer(String per) {
        this.per = per;
    }
}