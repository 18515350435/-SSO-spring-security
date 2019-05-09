package com.zc.api.model.resp.county;
import java.math.BigDecimal;


/***
 * 
 */
public class AllCountyHourData {
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
    private BigDecimal longitude ;
    private BigDecimal latitude ;
    private String time;
    private String type;
    private String temperature;
    private String windDirect;
    private String windSpeed;

    public String getWindDirect() {
        return this.windDirect;
    }

    public void setWindDirect(String windDirect) {
        this.windDirect = windDirect;
    }

    public String getWindSpeed() {
        return this.windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getTemperature() {
        return this.temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

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
}