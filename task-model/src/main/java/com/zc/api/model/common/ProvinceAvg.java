package com.zc.api.model.common;

/**
 * @Description
 * @Auther: lx
 * @CreateTime: 2019/2/28
 * @Version: 0.0.1
 * @param: ${param}
 * @return: ${return}
 */
public class ProvinceAvg {
    private String citycode;
    private String time;
    private String name;
    private Double pm25;

    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPm25() {
        return pm25;
    }

    public void setPm25(Double pm25) {
        this.pm25 = pm25;
    }

    public Double getPm10() {
        return pm10;
    }

    public void setPm10(Double pm10) {
        this.pm10 = pm10;
    }

    public Double getSo2() {
        return so2;
    }

    public void setSo2(Double so2) {
        this.so2 = so2;
    }

    public Double getNo2() {
        return no2;
    }

    public void setNo2(Double no2) {
        this.no2 = no2;
    }

    public Double getCo() {
        return co;
    }

    public void setCo(Double co) {
        this.co = co;
    }

    public Double getO31() {
        return o31;
    }

    public void setO31(Double o31) {
        this.o31 = o31;
    }

    public Double getO38() {
        return o38;
    }

    public void setO38(Double o38) {
        this.o38 = o38;
    }

    public Double getAqi() {
        return aqi;
    }

    public void setAqi(Double aqi) {
        this.aqi = aqi;
    }

    public Double getComplexindex() {
        return complexindex;
    }

    public void setComplexindex(Double complexindex) {
        this.complexindex = complexindex;
    }

    private Double pm10;
    private Double so2;
    private Double no2;
    private Double co;
    //臭氧1小时
    private Double o31;
    //臭氧8小时
    private Double o38;
    private Double aqi;
    //综合指数
    private Double complexindex;

}
