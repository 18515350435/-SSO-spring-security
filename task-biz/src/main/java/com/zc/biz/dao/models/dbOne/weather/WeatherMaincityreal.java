package com.zc.biz.dao.models.dbOne.weather;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "weather_maincityreal")
public class WeatherMaincityreal implements Serializable {
    @Column(name = "cityName")
    private String cityname;

    @Column(name = "Id")
//    private Integer id;
    private String id;


    @Column(name = "publishTime")
    private Date publishtime;

    private Double temperature;

    private Double humidity;

    private Double rain;

    private String weather;

    @Column(name = "wind_direct")
    private String windDirect;

    @Column(name = "wind_speed")
    private Double windSpeed;

    private String img;

    @Column(name = "countyCode")
    private String countycode;

    @Column(name = "cityCode")
    private String citycode;

    @Column(name = "provinceCode")
    private String provincecode;

    private static final long serialVersionUID = 1L;

    /**
     * @return cityName
     */
    public String getCityname() {
        return cityname;
    }

    /**
     * @param cityname
     */
    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    /**
     * @return Id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return publishTime
     */
    public Date getPublishtime() {
        return publishtime;
    }

    /**
     * @param publishtime
     */
    public void setPublishtime(Date publishtime) {
        this.publishtime = publishtime;
    }

    /**
     * @return temperature
     */
    public Double getTemperature() {
        return temperature;
    }

    /**
     * @param temperature
     */
    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    /**
     * @return humidity
     */
    public Double getHumidity() {
        return humidity;
    }

    /**
     * @param humidity
     */
    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    /**
     * @return rain
     */
    public Double getRain() {
        return rain;
    }

    /**
     * @param rain
     */
    public void setRain(Double rain) {
        this.rain = rain;
    }

    /**
     * @return weather
     */
    public String getWeather() {
        return weather;
    }

    /**
     * @param weather
     */
    public void setWeather(String weather) {
        this.weather = weather;
    }

    /**
     * @return wind_direct
     */
    public String getWindDirect() {
        return windDirect;
    }

    /**
     * @param windDirect
     */
    public void setWindDirect(String windDirect) {
        this.windDirect = windDirect;
    }

    /**
     * @return wind_speed
     */
    public Double getWindSpeed() {
        return windSpeed;
    }

    /**
     * @param windSpeed
     */
    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    /**
     * @return img
     */
    public String getImg() {
        return img;
    }

    /**
     * @param img
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * @return countyCode
     */
    public String getCountycode() {
        return countycode;
    }

    /**
     * @param countycode
     */
    public void setCountycode(String countycode) {
        this.countycode = countycode;
    }

    /**
     * @return cityCode
     */
    public String getCitycode() {
        return citycode;
    }

    /**
     * @param citycode
     */
    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    /**
     * @return provinceCode
     */
    public String getProvincecode() {
        return provincecode;
    }

    /**
     * @param provincecode
     */
    public void setProvincecode(String provincecode) {
        this.provincecode = provincecode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cityname=").append(cityname);
        sb.append(", id=").append(id);
        sb.append(", publishtime=").append(publishtime);
        sb.append(", temperature=").append(temperature);
        sb.append(", humidity=").append(humidity);
        sb.append(", rain=").append(rain);
        sb.append(", weather=").append(weather);
        sb.append(", windDirect=").append(windDirect);
        sb.append(", windSpeed=").append(windSpeed);
        sb.append(", img=").append(img);
        sb.append(", countycode=").append(countycode);
        sb.append(", citycode=").append(citycode);
        sb.append(", provincecode=").append(provincecode);
        sb.append("]");
        return sb.toString();
    }
}