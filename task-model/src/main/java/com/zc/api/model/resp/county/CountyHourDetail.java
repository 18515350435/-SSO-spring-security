package com.zc.api.model.resp.county;
import java.math.BigDecimal;
import java.util.List;

import com.zc.api.model.resp.air.PerValueKey;

/***
 * 
 */
public class CountyHourDetail {
    private BigDecimal aqi;
    private BigDecimal comindex;
    private BigDecimal pm25;
    private BigDecimal pm10;
    private BigDecimal so2;
    private BigDecimal no2;
    private BigDecimal co;
    private BigDecimal o3;
    private String id;
    private String area;
    private String city;
    private String time;
    //温度
    private Double temperature;
    //湿度
    private Double humidity;
    //风向
    private String winddirect;
    //风级
    private String windlevel;
    //天气
    private String weather;
    //风速
    private Double windspeed;

    private List<PerValueKey> list;

    public BigDecimal getAqi() {
        return this.aqi;
    }

    public void setAqi(BigDecimal aqi) {
        this.aqi = aqi;
    }

    public BigDecimal getComindex() {
        return this.comindex;
    }

    public void setComindex(BigDecimal comindex) {
        this.comindex = comindex;
    }

    public BigDecimal getPm25() {
        return this.pm25;
    }

    public void setPm25(BigDecimal pm25) {
        this.pm25 = pm25;
    }

    public BigDecimal getPm10() {
        return this.pm10;
    }

    public void setPm10(BigDecimal pm10) {
        this.pm10 = pm10;
    }

    public BigDecimal getSo2() {
        return this.so2;
    }

    public void setSo2(BigDecimal so2) {
        this.so2 = so2;
    }

    public BigDecimal getNo2() {
        return this.no2;
    }

    public void setNo2(BigDecimal no2) {
        this.no2 = no2;
    }

    public BigDecimal getCo() {
        return this.co;
    }

    public void setCo(BigDecimal co) {
        this.co = co;
    }

    public BigDecimal getO3() {
        return this.o3;
    }

    public void setO3(BigDecimal o3) {
        this.o3 = o3;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getTemperature() {
        return this.temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getHumidity() {
        return this.humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public String getWinddirect() {
        return this.winddirect;
    }

    public void setWinddirect(String winddirect) {
        this.winddirect = winddirect;
    }

    public String getWindlevel() {
        return this.windlevel;
    }

    public void setWindlevel(String windlevel) {
        this.windlevel = windlevel;
    }

    public String getWeather() {
        return this.weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public Double getWindspeed() {
        return this.windspeed;
    }

    public void setWindspeed(Double windspeed) {
        this.windspeed = windspeed;
    }

    public List<PerValueKey> getList() {
        return this.list;
    }

    public void setList(List<PerValueKey> list) {
        this.list = list;
    }
}