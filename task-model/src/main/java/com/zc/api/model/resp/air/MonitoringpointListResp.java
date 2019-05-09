package com.zc.api.model.resp.air;


public class MonitoringpointListResp{
    private String id;
    private String name;
    private String time;
    private String aqi;
    private String pm25;
    private String pm10;
    private String so2;
    private String no2;
    private String co;
    private String o3;
    private String primary_pollutant;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAqi() {
        return this.aqi;
    }

    public void setAqi(String aqi) {
        this.aqi = aqi;
    }

    public String getPm25() {
        return this.pm25;
    }

    public void setPm25(String pm25) {
        this.pm25 = pm25;
    }

    public String getPm10() {
        return this.pm10;
    }

    public void setPm10(String pm10) {
        this.pm10 = pm10;
    }

    public String getSo2() {
        return this.so2;
    }

    public void setSo2(String so2) {
        this.so2 = so2;
    }

    public String getNo2() {
        return this.no2;
    }

    public void setNo2(String no2) {
        this.no2 = no2;
    }

    public String getCo() {
        return this.co;
    }

    public void setCo(String co) {
        this.co = co;
    }

    public String getO3() {
        return this.o3;
    }

    public void setO3(String o3) {
        this.o3 = o3;
    }

    public String getPrimary_pollutant() {
        return this.primary_pollutant;
    }

    public void setPrimary_pollutant(String primary_pollutant) {
        this.primary_pollutant = primary_pollutant;
    }
}