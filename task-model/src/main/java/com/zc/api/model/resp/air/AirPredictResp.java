package com.zc.api.model.resp.air;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

public class AirPredictResp implements Serializable {

    @ApiModelProperty(value = "24小时空气质量起")
    private String airIndexFrom1;
    @ApiModelProperty(value = "24小时空气质量止")
    private String airIndexTo1;
    @ApiModelProperty(value = "24小时主要污染物")
    private String primaryPollutant1;
    @ApiModelProperty(value = "24小时空气质量等级")
    private String level1;
    @ApiModelProperty(value = "24小时温度")
    private String temperature1;
    @ApiModelProperty(value = "24小时天气")
    private String weather1;
    @ApiModelProperty(value = "24小时风向")
    private String windDirect1;
    @ApiModelProperty(value = "24小时风速")
    private String windSpeed1;

    @ApiModelProperty(value = "48小时空气质量起")
    private String airIndexFrom2;
    @ApiModelProperty(value = "48小时空气质量止")
    private String airIndexTo2;
    @ApiModelProperty(value = "48小时主要污染物")
    private String primaryPollutant2;
    @ApiModelProperty(value = "48小时空气质量等级")
    private String level2;
    @ApiModelProperty(value = "48小时温度")
    private String temperature2;
    @ApiModelProperty(value = "48小时天气")
    private String weather2;
    @ApiModelProperty(value = "48小时风向")
    private String windDirect2;
    @ApiModelProperty(value = "48小时风速")
    private String windSpeed2;

    @ApiModelProperty(value = "72小时空气质量起")
    private String airIndexFrom3;
    @ApiModelProperty(value = "72小时空气质量止")
    private String airIndexTo3;
    @ApiModelProperty(value = "72小时主要污染物")
    private String primaryPollutant3;
    @ApiModelProperty(value = "72小时空气质量等级")
    private String level3;
    @ApiModelProperty(value = "72小时温度")
    private String temperature3;
    @ApiModelProperty(value = "72小时天气")
    private String weather3;
    @ApiModelProperty(value = "72小时风向")
    private String windDirect3;
    @ApiModelProperty(value = "72小时风速")
    private String windSpeed3;

    public String getAirIndexFrom1() {
        return airIndexFrom1;
    }

    public void setAirIndexFrom1(String airIndexFrom1) {
        this.airIndexFrom1 = airIndexFrom1;
    }

    public String getAirIndexTo1() {
        return airIndexTo1;
    }

    public void setAirIndexTo1(String airIndexTo1) {
        this.airIndexTo1 = airIndexTo1;
    }

    public String getPrimaryPollutant1() {
        return primaryPollutant1;
    }

    public void setPrimaryPollutant1(String primaryPollutant1) {
        this.primaryPollutant1 = primaryPollutant1;
    }

    public String getLevel1() {
        return level1;
    }

    public void setLevel1(String level1) {
        this.level1 = level1;
    }

    public String getTemperature1() {
        return temperature1;
    }

    public void setTemperature1(String temperature1) {
        this.temperature1 = temperature1;
    }

    public String getWeather1() {
        return weather1;
    }

    public void setWeather1(String weather1) {
        this.weather1 = weather1;
    }

    public String getWindDirect1() {
        return windDirect1;
    }

    public void setWindDirect1(String windDirect1) {
        this.windDirect1 = windDirect1;
    }

    public String getWindSpeed1() {
        return windSpeed1;
    }

    public void setWindSpeed1(String windSpeed1) {
        this.windSpeed1 = windSpeed1;
    }

    public String getAirIndexFrom2() {
        return airIndexFrom2;
    }

    public void setAirIndexFrom2(String airIndexFrom2) {
        this.airIndexFrom2 = airIndexFrom2;
    }

    public String getAirIndexTo2() {
        return airIndexTo2;
    }

    public void setAirIndexTo2(String airIndexTo2) {
        this.airIndexTo2 = airIndexTo2;
    }

    public String getPrimaryPollutant2() {
        return primaryPollutant2;
    }

    public void setPrimaryPollutant2(String primaryPollutant2) {
        this.primaryPollutant2 = primaryPollutant2;
    }

    public String getLevel2() {
        return level2;
    }

    public void setLevel2(String level2) {
        this.level2 = level2;
    }

    public String getTemperature2() {
        return temperature2;
    }

    public void setTemperature2(String temperature2) {
        this.temperature2 = temperature2;
    }

    public String getWeather2() {
        return weather2;
    }

    public void setWeather2(String weather2) {
        this.weather2 = weather2;
    }

    public String getWindDirect2() {
        return windDirect2;
    }

    public void setWindDirect2(String windDirect2) {
        this.windDirect2 = windDirect2;
    }

    public String getWindSpeed2() {
        return windSpeed2;
    }

    public void setWindSpeed2(String windSpeed2) {
        this.windSpeed2 = windSpeed2;
    }

    public String getAirIndexFrom3() {
        return airIndexFrom3;
    }

    public void setAirIndexFrom3(String airIndexFrom3) {
        this.airIndexFrom3 = airIndexFrom3;
    }

    public String getAirIndexTo3() {
        return airIndexTo3;
    }

    public void setAirIndexTo3(String airIndexTo3) {
        this.airIndexTo3 = airIndexTo3;
    }

    public String getPrimaryPollutant3() {
        return primaryPollutant3;
    }

    public void setPrimaryPollutant3(String primaryPollutant3) {
        this.primaryPollutant3 = primaryPollutant3;
    }

    public String getLevel3() {
        return level3;
    }

    public void setLevel3(String level3) {
        this.level3 = level3;
    }

    public String getTemperature3() {
        return temperature3;
    }

    public void setTemperature3(String temperature3) {
        this.temperature3 = temperature3;
    }

    public String getWeather3() {
        return weather3;
    }

    public void setWeather3(String weather3) {
        this.weather3 = weather3;
    }

    public String getWindDirect3() {
        return windDirect3;
    }

    public void setWindDirect3(String windDirect3) {
        this.windDirect3 = windDirect3;
    }

    public String getWindSpeed3() {
        return windSpeed3;
    }

    public void setWindSpeed3(String windSpeed3) {
        this.windSpeed3 = windSpeed3;
    }
}