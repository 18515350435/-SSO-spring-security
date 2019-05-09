package com.zc.api.model.resp.air;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

public class CityList implements Serializable {

    @ApiModelProperty(value = "城市")
    private String area;
    @ApiModelProperty(value = "城市")
    private String citycode;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }
}