package com.zc.api.model.common;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by admin on 2018/6/5.
 */
public class AirQualityCountyDayForCalculate {
    public String Id ;
    public String Code ;
    public Date MonitoringTime ;
    public int AQI ;
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

    public int getAQI() {
        return AQI;
    }

    public void setAQI(int AQI) {
        this.AQI = AQI;
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
