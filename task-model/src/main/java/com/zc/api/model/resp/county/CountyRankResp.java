package com.zc.api.model.resp.county;

/**
 * @Description 区县排名
 * @Auther: lx
 * @CreateTime: 2019/3/4
 * @Version: 0.0.1
 * @param: ${param}
 * @return: ${return}
 */
public class CountyRankResp {
    private int index;
    private String name;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getComplexindex() {
        return complexindex;
    }

    public void setComplexindex(double complexindex) {
        this.complexindex = complexindex;
    }

    public int getAqi() {
        return aqi;
    }

    public void setAqi(int aqi) {
        this.aqi = aqi;
    }

    public int getPm25() {
        return pm25;
    }

    public void setPm25(int pm25) {
        this.pm25 = pm25;
    }

    public int getPm10() {
        return pm10;
    }

    public void setPm10(int pm10) {
        this.pm10 = pm10;
    }

    public int getSo2() {
        return so2;
    }

    public void setSo2(int so2) {
        this.so2 = so2;
    }

    public int getNo2() {
        return no2;
    }

    public void setNo2(int no2) {
        this.no2 = no2;
    }

    public double getCo() {
        return co;
    }

    public void setCo(double co) {
        this.co = co;
    }

    public int getO3() {
        return o3;
    }

    public void setO3(int o3) {
        this.o3 = o3;
    }

    public String getMainpoll() {
        return mainpoll;
    }

    public void setMainpoll(String mainpoll) {
        this.mainpoll = mainpoll;
    }

    private double complexindex;

    private int aqi;
    private int pm25;
    private int pm10;
    private int so2;
    private int no2;
    private double co;
    private int o3;
    private String mainpoll;
}
