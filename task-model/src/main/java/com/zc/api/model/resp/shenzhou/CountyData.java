package com.zc.api.model.resp.shenzhou;


public class CountyData{
    private String cityname;
    private Double fraction;

    public Double getFraction() {
        return this.fraction;
    }

    public void setFraction(Double fraction) {
        this.fraction = fraction;
    }
    private Double aqi;
    private Double pm25;
    private Double pm10;
    private Double so2;
    private Double no2;
    private Double co;
    private Double o3;
    private Double comindex;

    public String getCityname() {
        return this.cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public Double getAqi() {
        return this.aqi;
    }

    public void setAqi(Double aqi) {
        this.aqi = aqi;
    }

    public Double getPm25() {
        return this.pm25;
    }

    public void setPm25(Double pm25) {
        this.pm25 = pm25;
    }

    public Double getPm10() {
        return this.pm10;
    }

    public void setPm10(Double pm10) {
        this.pm10 = pm10;
    }

    public Double getSo2() {
        return this.so2;
    }

    public void setSo2(Double so2) {
        this.so2 = so2;
    }

    public Double getNo2() {
        return this.no2;
    }

    public void setNo2(Double no2) {
        this.no2 = no2;
    }

    public Double getCo() {
        return this.co;
    }

    public void setCo(Double co) {
        this.co = co;
    }

    public Double getO3() {
        return this.o3;
    }

    public void setO3(Double o3) {
        this.o3 = o3;
    }

    public Double getComindex() {
        return this.comindex;
    }

    public void setComindex(Double comindex) {
        this.comindex = comindex;
    }
}