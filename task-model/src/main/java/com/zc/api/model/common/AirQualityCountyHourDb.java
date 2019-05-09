package com.zc.api.model.common;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by admin on 2018/6/5.
 */
public class AirQualityCountyHourDb {
    public String GridCode ;
    public Date time ;
    public Date CreateTime ;
    public int aqi ;
    public int pm2_5 ;
    public int pm10 ;
    public int so2 ;
    public int no2 ;
    public int o3 ;
    public BigDecimal co ;
    public String AQIStatus ;
    public String PM25Status ;
    public String PM10Status ;
    public String SO2Status ;
    public String NO2Status ;
    public String COStatus ;
    public String O3Status ;
    public String mainpoll ;
    public BigDecimal ComplexIndex ;

    public String getGridCode() {
        return GridCode;
    }

    public void setGridCode(String gridCode) {
        GridCode = gridCode;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Date createTime) {
        CreateTime = createTime;
    }

    public int getAqi() {
        return aqi;
    }

    public void setAqi(int aqi) {
        this.aqi = aqi;
    }

    public int getPm2_5() {
        return pm2_5;
    }

    public void setPm2_5(int pm2_5) {
        this.pm2_5 = pm2_5;
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

    public int getO3() {
        return o3;
    }

    public void setO3(int o3) {
        this.o3 = o3;
    }

    public BigDecimal getCo() {
        return co;
    }

    public void setCo(BigDecimal co) {
        this.co = co;
    }

    public String getAQIStatus() {
        return AQIStatus;
    }

    public void setAQIStatus(String AQIStatus) {
        this.AQIStatus = AQIStatus;
    }

    public String getPM25Status() {
        return PM25Status;
    }

    public void setPM25Status(String PM25Status) {
        this.PM25Status = PM25Status;
    }

    public String getPM10Status() {
        return PM10Status;
    }

    public void setPM10Status(String PM10Status) {
        this.PM10Status = PM10Status;
    }

    public String getSO2Status() {
        return SO2Status;
    }

    public void setSO2Status(String SO2Status) {
        this.SO2Status = SO2Status;
    }

    public String getNO2Status() {
        return NO2Status;
    }

    public void setNO2Status(String NO2Status) {
        this.NO2Status = NO2Status;
    }

    public String getCOStatus() {
        return COStatus;
    }

    public void setCOStatus(String COStatus) {
        this.COStatus = COStatus;
    }

    public String getO3Status() {
        return O3Status;
    }

    public void setO3Status(String o3Status) {
        O3Status = o3Status;
    }

    public String getMainpoll() {
        return mainpoll;
    }

    public void setMainpoll(String mainpoll) {
        this.mainpoll = mainpoll;
    }

    public BigDecimal getComplexIndex() {
        return ComplexIndex;
    }

    public void setComplexIndex(BigDecimal complexIndex) {
        ComplexIndex = complexIndex;
    }
}
