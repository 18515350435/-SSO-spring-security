package com.zc.api.model.resp.monitoring;

import java.io.Serializable;
import java.math.BigDecimal;

public class MonitoringPointHistory24 implements Serializable{
    public String citygid ;
    public String pointname ;
    public String time ;
    public String type ;
    public int aqi ;
    public int pm25 ;
    public int pm10 ;
    public int so2 ;
    public int no2 ;
    public BigDecimal co ;
    public int o3 ;
    public String complexindex ;
    public String primary_pollutant ;
    public String weather ;
    public String temp ;
    public String humi ;
    public String windspeed ;
    public String winddirection ;
    public String windangle ;
    public String rain ;
    public String cityname ;
    public BigDecimal longitude ;
    public BigDecimal latitude ;
    public String quality ;

    @Override
    public String toString() {
        return "{" +
            " citygid='" + getCitygid() + "'" +
            ", pointname='" + getPointname() + "'" +
            ", time='" + getTime() + "'" +
            ", type='" + getType() + "'" +
            ", aqi='" + getAqi() + "'" +
            ", pm25='" + getPm25() + "'" +
            ", pm10='" + getPm10() + "'" +
            ", so2='" + getSo2() + "'" +
            ", no2='" + getNo2() + "'" +
            ", co='" + getCo() + "'" +
            ", o3='" + getO3() + "'" +
            ", complexindex='" + getComplexindex() + "'" +
            ", primary_pollutant='" + getPrimary_pollutant() + "'" +
            ", weather='" + getWeather() + "'" +
            ", temp='" + getTemp() + "'" +
            ", humi='" + getHumi() + "'" +
            ", windspeed='" + getWindspeed() + "'" +
            ", winddirection='" + getWinddirection() + "'" +
            ", windangle='" + getWindangle() + "'" +
            ", rain='" + getRain() + "'" +
            ", cityname='" + getCityname() + "'" +
            ", longitude='" + getLongitude() + "'" +
            ", latitude='" + getLatitude() + "'" +
            ", quality='" + getQuality() + "'" +
            "}";
    }

    public String getCitygid() {
        return this.citygid;
    }

    public void setCitygid(String citygid) {
        this.citygid = citygid;
    }

    public String getPointname() {
        return this.pointname;
    }

    public void setPointname(String pointname) {
        this.pointname = pointname;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAqi() {
        return this.aqi;
    }

    public void setAqi(int aqi) {
        this.aqi = aqi;
    }

    public int getPm25() {
        return this.pm25;
    }

    public void setPm25(int pm25) {
        this.pm25 = pm25;
    }

    public int getPm10() {
        return this.pm10;
    }

    public void setPm10(int pm10) {
        this.pm10 = pm10;
    }

    public int getSo2() {
        return this.so2;
    }

    public void setSo2(int so2) {
        this.so2 = so2;
    }

    public int getNo2() {
        return this.no2;
    }

    public void setNo2(int no2) {
        this.no2 = no2;
    }

    public BigDecimal getCo() {
        return this.co;
    }

    public void setCo(BigDecimal co) {
        this.co = co;
    }

    public int getO3() {
        return this.o3;
    }

    public void setO3(int o3) {
        this.o3 = o3;
    }

    public String getComplexindex() {
        return this.complexindex;
    }

    public void setComplexindex(String complexindex) {
        this.complexindex = complexindex;
    }

    public String getPrimary_pollutant() {
        return this.primary_pollutant;
    }

    public void setPrimary_pollutant(String primary_pollutant) {
        this.primary_pollutant = primary_pollutant;
    }

    public String getWeather() {
        return this.weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getTemp() {
        return this.temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getHumi() {
        return this.humi;
    }

    public void setHumi(String humi) {
        this.humi = humi;
    }

    public String getWindspeed() {
        return this.windspeed;
    }

    public void setWindspeed(String windspeed) {
        this.windspeed = windspeed;
    }

    public String getWinddirection() {
        return this.winddirection;
    }

    public void setWinddirection(String winddirection) {
        this.winddirection = winddirection;
    }

    public String getWindangle() {
        return this.windangle;
    }

    public void setWindangle(String windangle) {
        this.windangle = windangle;
    }

    public String getRain() {
        return this.rain;
    }

    public void setRain(String rain) {
        this.rain = rain;
    }

    public String getCityname() {
        return this.cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public BigDecimal getLongitude() {
        return this.longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return this.latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public String getQuality() {
        return this.quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
}