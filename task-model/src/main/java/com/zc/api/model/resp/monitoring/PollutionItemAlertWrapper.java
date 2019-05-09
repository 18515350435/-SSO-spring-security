package com.zc.api.model.resp.monitoring;

import java.io.Serializable;
import java.math.BigDecimal;

public class PollutionItemAlertWrapper implements Serializable {
    public String Id;
    /// <summary>
    /// AQI是否预警，默认false不预警
    /// </summary>
    public Boolean AqiIsAlert;

    /// <summary>
    /// PM2.5是否预警，默认false不预警
    /// </summary>
    public Boolean Pm25IsAlert;

    /// <summary>
    /// PM10是否预警，默认false不预警
    /// </summary>
    public Boolean Pm10IsAlert;

    /// <summary>
    /// SO2是否预警，默认false不预警
    /// </summary>
    public Boolean So2IsAlert;

    /// <summary>
    /// NO2是否预警，默认false不预警
    /// </summary>
    public Boolean No2IsAlert;

    /// <summary>
    /// Co是否预警，默认false不预警
    /// </summary>
    public Boolean CoIsAlert;

    /// <summary>
    /// O3是否预警，默认false不预警
    /// </summary>
    public Boolean O3IsAlert;
    /// <summary>
    /// 空气质量指数
    /// </summary>
    public Integer Aqi;
    /// <summary>
    /// PM2.5浓度
    /// </summary>
    public Integer Pm25;
    /// <summary>
    /// PM10浓度
    /// </summary>
    public Integer Pm10;
    /// <summary>
    /// So2浓度
    /// </summary>
    public Integer So2;
    /// <summary>
    /// No2浓度
    /// </summary>
    public Integer No2;
    /// <summary>
    /// CO浓度
    /// </summary>
    public BigDecimal Co;
    /// <summary>
    /// O3浓度
    /// </summary>
    public Integer O3;

    @Override
    public String toString() {
        return "{" + " Id='" + getId() + "'" + ", AqiIsAlert='" + isAqiIsAlert() + "'" + ", Pm25IsAlert='"
                + isPm25IsAlert() + "'" + ", Pm10IsAlert='" + isPm10IsAlert() + "'" + ", So2IsAlert='" + isSo2IsAlert()
                + "'" + ", No2IsAlert='" + isNo2IsAlert() + "'" + ", CoIsAlert='" + isCoIsAlert() + "'"
                + ", O3IsAlert='" + isO3IsAlert() + "'" + ", Aqi='" + getAqi() + "'" + ", Pm25='" + getPm25() + "'"
                + ", Pm10='" + getPm10() + "'" + ", So2='" + getSo2() + "'" + ", No2='" + getNo2() + "'" + ", Co='"
                + getCo() + "'" + ", O3='" + getO3() + "'" + "}";
    }

    public String getId() {
        return this.Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public Boolean isAqiIsAlert() {
        return this.AqiIsAlert;
    }

    public void setAqiIsAlert(Boolean AqiIsAlert) {
        this.AqiIsAlert = AqiIsAlert;
    }

    public Boolean isPm25IsAlert() {
        return this.Pm25IsAlert;
    }

    public void setPm25IsAlert(Boolean Pm25IsAlert) {
        this.Pm25IsAlert = Pm25IsAlert;
    }

    public Boolean isPm10IsAlert() {
        return this.Pm10IsAlert;
    }

    public void setPm10IsAlert(Boolean Pm10IsAlert) {
        this.Pm10IsAlert = Pm10IsAlert;
    }

    public Boolean isSo2IsAlert() {
        return this.So2IsAlert;
    }

    public void setSo2IsAlert(Boolean So2IsAlert) {
        this.So2IsAlert = So2IsAlert;
    }

    public Boolean isNo2IsAlert() {
        return this.No2IsAlert;
    }

    public void setNo2IsAlert(Boolean No2IsAlert) {
        this.No2IsAlert = No2IsAlert;
    }

    public Boolean isCoIsAlert() {
        return this.CoIsAlert;
    }

    public void setCoIsAlert(Boolean CoIsAlert) {
        this.CoIsAlert = CoIsAlert;
    }

    public Boolean isO3IsAlert() {
        return this.O3IsAlert;
    }

    public void setO3IsAlert(Boolean O3IsAlert) {
        this.O3IsAlert = O3IsAlert;
    }

    public Integer getAqi() {
        return this.Aqi;
    }

    public void setAqi(Integer Aqi) {
        this.Aqi = Aqi;
    }

    public Integer getPm25() {
        return this.Pm25;
    }

    public void setPm25(Integer Pm25) {
        this.Pm25 = Pm25;
    }

    public Integer getPm10() {
        return this.Pm10;
    }

    public void setPm10(Integer Pm10) {
        this.Pm10 = Pm10;
    }

    public Integer getSo2() {
        return this.So2;
    }

    public void setSo2(Integer So2) {
        this.So2 = So2;
    }

    public Integer getNo2() {
        return this.No2;
    }

    public void setNo2(Integer No2) {
        this.No2 = No2;
    }

    public BigDecimal getCo() {
        return this.Co;
    }

    public void setCo(BigDecimal Co) {
        this.Co = Co;
    }

    public Integer getO3() {
        return this.O3;
    }

    public void setO3(Integer O3) {
        this.O3 = O3;
    }
}