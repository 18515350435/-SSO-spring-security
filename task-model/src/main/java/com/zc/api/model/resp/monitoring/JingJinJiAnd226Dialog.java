package com.zc.api.model.resp.monitoring;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.zc.api.model.resp.ValueTime;

public class JingJinJiAnd226Dialog implements Serializable {
    /// <summary>
    /// 国省控ID
    /// </summary>
    public String citygid;
    /// <summary>
    /// 国省控点名称
    /// </summary>
    public String pointname;
    /// <summary>
    /// 监测时间
    /// </summary>
    public String time;
    /// <summary>
    /// 检测点类型：国控点、省控点
    /// </summary>
    public String type;
    /// <summary>
    /// AQI
    /// </summary>
    public int aqi;
    /// <summary>
    /// PM2.5浓度值
    /// </summary>
    public int pm25;
    /// <summary>
    /// PM10浓度值
    /// </summary>
    public int pm10;
    /// <summary>
    /// SO2浓度值
    /// </summary>
    public int so2;
    /// <summary>
    /// NO2浓度值
    /// </summary>
    public int no2;
    /// <summary>
    /// CO浓度值
    /// </summary>
    public BigDecimal co;
    /// <summary>
    /// O3浓度值
    /// </summary>
    public int o3;
    /// <summary>
    /// 空气质量
    /// </summary>
    public String quality;
    /// <summary>
    /// 综合指数
    /// </summary>
    public String complexindex;
    /// <summary>
    /// 首要污染物
    /// </summary>
    public String primary_pollutant;

    /// <summary>
    /// AQI颜色
    /// </summary>
    public String aqiColor;
    /// <summary>
    /// PM2.5颜色
    /// </summary>
    public String pm25Color;
    /// <summary>
    /// PM10颜色
    /// </summary>
    public String pm10Color;
    /// <summary>
    /// SO2颜色
    /// </summary>
    public String so2Color;
    /// <summary>
    /// NO2颜色
    /// </summary>
    public String no2Color;
    /// <summary>
    /// CO颜色
    /// </summary>
    public String coColor;
    /// <summary>
    /// O3颜色
    /// </summary>
    public String o3Color;

    /// <summary>
    /// 天气
    /// </summary>
    public String weather;
    /// <summary>
    /// 温度
    /// </summary>
    public String temp;
    /// <summary>
    /// 湿度
    /// </summary>
    public String humi;
    /// <summary>
    /// 风速
    /// </summary>
    public String windspeed;
    /// <summary>
    /// 风向
    /// </summary>
    public String winddirection;
    /// <summary>
    /// 风向（角度值）
    /// </summary>
    public String windangle;
    /// <summary>
    /// 降雨量
    /// </summary>
    public String rain;

    /// <summary>
    /// 一级网格名称
    /// </summary>
    public String firstGridName;
    /// <summary>
    /// 二级网格名称
    /// </summary>
    public String secondGridName;
    /// <summary>
    /// 三级网格名称
    /// </summary>
    public String threeGridName;
    /// <summary>
    /// 联系人
    /// </summary>
    public String memberName;
    /// <summary>
    /// 联系方式
    /// </summary>
    public String contact;

    /// <summary>
    /// 历史数据
    /// </summary>
    public List<ValueTime> hourdatas;

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
            ", quality='" + getQuality() + "'" +
            ", complexindex='" + getComplexindex() + "'" +
            ", primary_pollutant='" + getPrimary_pollutant() + "'" +
            ", aqiColor='" + getAqiColor() + "'" +
            ", pm25Color='" + getPm25Color() + "'" +
            ", pm10Color='" + getPm10Color() + "'" +
            ", so2Color='" + getSo2Color() + "'" +
            ", no2Color='" + getNo2Color() + "'" +
            ", coColor='" + getCoColor() + "'" +
            ", o3Color='" + getO3Color() + "'" +
            ", weather='" + getWeather() + "'" +
            ", temp='" + getTemp() + "'" +
            ", humi='" + getHumi() + "'" +
            ", windspeed='" + getWindspeed() + "'" +
            ", winddirection='" + getWinddirection() + "'" +
            ", windangle='" + getWindangle() + "'" +
            ", rain='" + getRain() + "'" +
            ", firstGridName='" + getFirstGridName() + "'" +
            ", secondGridName='" + getSecondGridName() + "'" +
            ", threeGridName='" + getThreeGridName() + "'" +
            ", memberName='" + getMemberName() + "'" +
            ", contact='" + getContact() + "'" +
            ", hourdatas='" + getHourdatas() + "'" +
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

    public String getQuality() {
        return this.quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
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

    public String getAqiColor() {
        return this.aqiColor;
    }

    public void setAqiColor(String aqiColor) {
        this.aqiColor = aqiColor;
    }

    public String getPm25Color() {
        return this.pm25Color;
    }

    public void setPm25Color(String pm25Color) {
        this.pm25Color = pm25Color;
    }

    public String getPm10Color() {
        return this.pm10Color;
    }

    public void setPm10Color(String pm10Color) {
        this.pm10Color = pm10Color;
    }

    public String getSo2Color() {
        return this.so2Color;
    }

    public void setSo2Color(String so2Color) {
        this.so2Color = so2Color;
    }

    public String getNo2Color() {
        return this.no2Color;
    }

    public void setNo2Color(String no2Color) {
        this.no2Color = no2Color;
    }

    public String getCoColor() {
        return this.coColor;
    }

    public void setCoColor(String coColor) {
        this.coColor = coColor;
    }

    public String getO3Color() {
        return this.o3Color;
    }

    public void setO3Color(String o3Color) {
        this.o3Color = o3Color;
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

    public String getFirstGridName() {
        return this.firstGridName;
    }

    public void setFirstGridName(String firstGridName) {
        this.firstGridName = firstGridName;
    }

    public String getSecondGridName() {
        return this.secondGridName;
    }

    public void setSecondGridName(String secondGridName) {
        this.secondGridName = secondGridName;
    }

    public String getThreeGridName() {
        return this.threeGridName;
    }

    public void setThreeGridName(String threeGridName) {
        this.threeGridName = threeGridName;
    }

    public String getMemberName() {
        return this.memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getContact() {
        return this.contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public List<ValueTime> getHourdatas() {
        return this.hourdatas;
    }

    public void setHourdatas(List<ValueTime> hourdatas) {
        this.hourdatas = hourdatas;
    }
}