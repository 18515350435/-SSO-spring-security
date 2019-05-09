package com.zc.api.model.resp.dacheng;

import com.zc.api.model.resp.air.PerValueKey;

import java.util.List;

/**
 * @Description
 * @Auther: Administrator
 * @CreateTime: 2019/2/27
 * @Version: 0.0.1
 * @param: ${param}
 * @return: ${return}
 */
public class DaChengPointDetailResp {
    private String name;
    private String time;
    private String aqi;

    public String getComindex() {
        return comindex;
    }

    public void setComindex(String comindex) {
        this.comindex = comindex;
    }

    private String comindex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAqi() {
        return aqi;
    }

    public void setAqi(String aqi) {
        this.aqi = aqi;
    }



    public String getPm25() {
        return pm25;
    }

    public void setPm25(String pm25) {
        this.pm25 = pm25;
    }

    public String getPm10() {
        return pm10;
    }

    public void setPm10(String pm10) {
        this.pm10 = pm10;
    }

    public String getSo2() {
        return so2;
    }

    public void setSo2(String so2) {
        this.so2 = so2;
    }

    public String getNo2() {
        return no2;
    }

    public void setNo2(String no2) {
        this.no2 = no2;
    }

    public String getCo() {
        return co;
    }

    public void setCo(String co) {
        this.co = co;
    }

    public String getO3() {
        return o3;
    }

    public void setO3(String o3) {
        this.o3 = o3;
    }

    public AirForcecastResp getForce() {
        return force;
    }

    public void setForce(AirForcecastResp force) {
        this.force = force;
    }

    public List<PerValueKey> getHoursValue() {
        return hoursValue;
    }

    public void setHoursValue(List<PerValueKey> hoursValue) {
        this.hoursValue = hoursValue;
    }

    private String pm25;
    private String pm10;
    private String so2;
    private String no2;
    private String co;
    private String o3;
    private  AirForcecastResp force;//天气预报数据
    private List<PerValueKey> hoursValue;//24小时数据
}
