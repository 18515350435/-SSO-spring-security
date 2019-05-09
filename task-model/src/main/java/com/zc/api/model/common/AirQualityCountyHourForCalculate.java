package com.zc.api.model.common;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by admin on 2018/6/5.
 */
public class AirQualityCountyHourForCalculate {
    public String Id ;
    public String Code ;
    public Date MonitoringTime ;
    public Date CreateTime ;
    public int AQI ;
    public int PM25nd_1h ;
    public int PM10nd_1h ;
    public int SO2nd_1h ;
    public int NO2nd_1h ;
    public BigDecimal COnd_1h ;
    public int O3nd_1h ;
    public String AQIStatus ;
    public String PM25Status ;
    public String PM10Status ;
    public String SO2Status ;
    public String NO2Status ;
    public String COStatus ;
    public String O3Status ;
    public String PrimaryPollution ;
    public BigDecimal ComplexIndex ;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public Date getMonitoringTime() {
        return MonitoringTime;
    }

    public void setMonitoringTime(Date monitoringTime) {
        MonitoringTime = monitoringTime;
    }

    public Date getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Date createTime) {
        CreateTime = createTime;
    }

    public int getAQI() {
        return AQI;
    }

    public void setAQI(int AQI) {
        this.AQI = AQI;
    }

    public int getPM25nd_1h() {
        return PM25nd_1h;
    }

    public void setPM25nd_1h(int PM25nd_1h) {
        this.PM25nd_1h = PM25nd_1h;
    }

    public int getPM10nd_1h() {
        return PM10nd_1h;
    }

    public void setPM10nd_1h(int PM10nd_1h) {
        this.PM10nd_1h = PM10nd_1h;
    }

    public int getSO2nd_1h() {
        return SO2nd_1h;
    }

    public void setSO2nd_1h(int SO2nd_1h) {
        this.SO2nd_1h = SO2nd_1h;
    }

    public int getNO2nd_1h() {
        return NO2nd_1h;
    }

    public void setNO2nd_1h(int NO2nd_1h) {
        this.NO2nd_1h = NO2nd_1h;
    }

    public BigDecimal getCOnd_1h() {
        return COnd_1h;
    }

    public void setCOnd_1h(BigDecimal COnd_1h) {
        this.COnd_1h = COnd_1h;
    }

    public int getO3nd_1h() {
        return O3nd_1h;
    }

    public void setO3nd_1h(int o3nd_1h) {
        O3nd_1h = o3nd_1h;
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

    public String getPrimaryPollution() {
        return PrimaryPollution;
    }

    public void setPrimaryPollution(String primaryPollution) {
        PrimaryPollution = primaryPollution;
    }

    public BigDecimal getComplexIndex() {
        return ComplexIndex;
    }

    public void setComplexIndex(BigDecimal complexIndex) {
        ComplexIndex = complexIndex;
    }
}
