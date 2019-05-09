package com.zc.api.model.resp.air;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class InTimeData implements Serializable {

    @ApiModelProperty(value = "时间")
    private String time;
    @ApiModelProperty(value = "aqi")
    private String aqi;
    @ApiModelProperty(value = "主要污染物")
    private String mainpoll;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAqi() {
        return aqi;
    }

    public void setAqi(String aqi) {
        this.aqi = aqi;
    }

    public String getMainpoll() {
        return mainpoll;
    }

    public void setMainpoll(String mainpoll) {
        this.mainpoll = mainpoll;
    }
}