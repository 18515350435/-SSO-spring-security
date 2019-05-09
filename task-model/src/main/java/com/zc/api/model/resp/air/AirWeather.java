package com.zc.api.model.resp.air;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AirWeather implements Serializable {

    @ApiModelProperty(value = "城市")
    private String area;

    @ApiModelProperty(value = "AQI")
    private Integer aqi;

    @ApiModelProperty(value = "累计AQI")
    private Integer ljaqi;

    @ApiModelProperty(value = "空气质量")
    private String level;

    @ApiModelProperty(value = "首要污染物")
    private String primarypollutant;

    @ApiModelProperty(value = "天气")
    private String weather;

    @ApiModelProperty(value = "温度")
    private Double temperature;

    @ApiModelProperty(value = "风向")
    private String windDirect;

    @ApiModelProperty(value = "风力")
    private Double windSpeed;


    @JsonFormat(pattern = "yyyy-MM-dd HH:mm",timezone="GMT+8")
    @ApiModelProperty(value = "发布时间")
    private Date publishTime;

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

    public Integer getLjaqi() {
        return ljaqi;
    }

    public void setLjaqi(Integer ljaqi) {
        this.ljaqi = ljaqi;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPrimarypollutant() {
        return primarypollutant;
    }

    public void setPrimarypollutant(String primarypollutant) {
        this.primarypollutant = primarypollutant;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public String getWindDirect() {
        return windDirect;
    }

    public void setWindDirect(String windDirect) {
        this.windDirect = windDirect;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }
}