package com.zc.api.model.resp.monitoring;

import java.io.Serializable;
import java.math.BigDecimal;

public class MonitoringInfo implements Serializable {
    private Boolean isLf;
    private String dataLevel;
    private String citygid;
    private String id;
    private String pointname;
    private String time;
    private String type;
    private int aqi;
    private int pm25;
    private int pm10;
    private int so2;
    private int no2;
    private BigDecimal co;
    private int o3;
    private int o3_8h;
    private String complexindex;
    private String primarypollutant;
    private String weather;
    private String temp;
    private String humi;
    private String windspeed;
    private String winddirection;
    private String windangle;
    private String rain;
    private String cityname;
    private BigDecimal longitude;
    private BigDecimal latitude;
    private String quality;
    private Boolean aqiIsAlert;
    private Boolean pm25IsAlert;
    private Boolean pm10IsAlert;
    private Boolean so2IsAlert;
    private Boolean no2IsAlert;
    private Boolean coIsAlert;
    private Boolean o3IsAlert;
    private String gridName;
    private String firstGridName;
    private String secondGridName;
    private String threeGridName;
    private String memberName;
    private String Contact;

    @Override
    public String toString() {
        return "{" +
            " isLf='" + isIsLf() + "'" +
            ", dataLevel='" + getDataLevel() + "'" +
            ", citygid='" + getCitygid() + "'" +
            ", id='" + getId() + "'" +
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
            ", o3_8h='" + getO3_8h() + "'" +
            ", complexindex='" + getComplexindex() + "'" +
            ", primary_pollutant='" + getPrimarypollutant() + "'" +
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
            ", aqiIsAlert='" + isAqiIsAlert() + "'" +
            ", pm25IsAlert='" + isPm25IsAlert() + "'" +
            ", pm10IsAlert='" + isPm10IsAlert() + "'" +
            ", so2IsAlert='" + isSo2IsAlert() + "'" +
            ", no2IsAlert='" + isNo2IsAlert() + "'" +
            ", coIsAlert='" + isCoIsAlert() + "'" +
            ", o3IsAlert='" + isO3IsAlert() + "'" +
            ", gridName='" + getGridName() + "'" +
            ", firstGridName='" + getFirstGridName() + "'" +
            ", secondGridName='" + getSecondGridName() + "'" +
            ", threeGridName='" + getThreeGridName() + "'" +
            ", memberName='" + getMemberName() + "'" +
            ", Contact='" + getContact() + "'" +
            "}";
    }

    public Boolean isIsLf() {
        return this.isLf;
    }

    public void setIsLf(Boolean isLf) {
        this.isLf = isLf;
    }

    public String getDataLevel() {
        return this.dataLevel;
    }

    public void setDataLevel(String dataLevel) {
        this.dataLevel = dataLevel;
    }

    public String getCitygid() {
        return this.citygid;
    }

    public void setCitygid(String citygid) {
        this.citygid = citygid;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getO3_8h() {
        return this.o3_8h;
    }

    public void setO3_8h(int o3_8h) {
        this.o3_8h = o3_8h;
    }

    public String getComplexindex() {
        return this.complexindex;
    }

    public void setComplexindex(String complexindex) {
        this.complexindex = complexindex;
    }

    public String getPrimarypollutant() {
        return this.primarypollutant;
    }

    public void setPrimarypollutant(String primarypollutant) {
        this.primarypollutant = primarypollutant;
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

    public Boolean isAqiIsAlert() {
        return this.aqiIsAlert;
    }

    public void setAqiIsAlert(Boolean aqiIsAlert) {
        this.aqiIsAlert = aqiIsAlert;
    }

    public Boolean isPm25IsAlert() {
        return this.pm25IsAlert;
    }

    public void setPm25IsAlert(Boolean pm25IsAlert) {
        this.pm25IsAlert = pm25IsAlert;
    }

    public Boolean isPm10IsAlert() {
        return this.pm10IsAlert;
    }

    public void setPm10IsAlert(Boolean pm10IsAlert) {
        this.pm10IsAlert = pm10IsAlert;
    }

    public Boolean isSo2IsAlert() {
        return this.so2IsAlert;
    }

    public void setSo2IsAlert(Boolean so2IsAlert) {
        this.so2IsAlert = so2IsAlert;
    }

    public Boolean isNo2IsAlert() {
        return this.no2IsAlert;
    }

    public void setNo2IsAlert(Boolean no2IsAlert) {
        this.no2IsAlert = no2IsAlert;
    }

    public Boolean isCoIsAlert() {
        return this.coIsAlert;
    }

    public void setCoIsAlert(Boolean coIsAlert) {
        this.coIsAlert = coIsAlert;
    }

    public Boolean isO3IsAlert() {
        return this.o3IsAlert;
    }

    public void setO3IsAlert(Boolean o3IsAlert) {
        this.o3IsAlert = o3IsAlert;
    }

    public String getGridName() {
        return this.gridName;
    }

    public void setGridName(String gridName) {
        this.gridName = gridName;
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
        return this.Contact;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }
}