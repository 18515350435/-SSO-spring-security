package com.zc.api.model.common;

/**
 * Created by Administrator on 2018/5/10.
 */
public class PollutionItemStatus {
    private String aqiStatus;
    private String pm25Status;
    private String pm10IStatus;
    private String so2Status;
    private String coStatus;
    private String no2Status;
    private String o3Status;

    public String getAqiStatus() {
        return aqiStatus;
    }

    public void setAqiStatus(String aqiStatus) {
        this.aqiStatus = aqiStatus;
    }

    public String getPm25Status() {
        return pm25Status;
    }

    public void setPm25Status(String pm25Status) {
        this.pm25Status = pm25Status;
    }

    public String getPm10IStatus() {
        return pm10IStatus;
    }

    public void setPm10IStatus(String pm10IStatus) {
        this.pm10IStatus = pm10IStatus;
    }

    public String getSo2Status() {
        return so2Status;
    }

    public void setSo2Status(String so2Status) {
        this.so2Status = so2Status;
    }

    public String getCoStatus() {
        return coStatus;
    }

    public void setCoStatus(String coStatus) {
        this.coStatus = coStatus;
    }

    public String getNo2Status() {
        return no2Status;
    }

    public void setNo2Status(String no2Status) {
        this.no2Status = no2Status;
    }

    public String getO3Status() {
        return o3Status;
    }

    public void setO3Status(String o3Status) {
        this.o3Status = o3Status;
    }

    public PollutionItemStatus(String aqiStatus, String pm25Status, String pm10IStatus, String so2Status, String coStatus, String no2Status, String o3Status) {
        this.aqiStatus = aqiStatus;
        this.pm25Status = pm25Status;
        this.pm10IStatus = pm10IStatus;
        this.so2Status = so2Status;
        this.coStatus = coStatus;
        this.no2Status = no2Status;
        this.o3Status = o3Status;
    }
}
