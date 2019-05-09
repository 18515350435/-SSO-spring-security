package com.zc.api.model.resp.air;


import java.io.Serializable;

public class AirQualityKzz implements Serializable {

    private Double so2Ljz;

    private Double coLjz;

    private Double no2Ljz;

    private Double o3Ljz;

    private Double pm10Ljz;

    private Double pm25Ljz;

    private Double so2Kzz;

    private Double coKzz;

    private Double no2Kzz;

    private Double o3Kzz;

    private Double pm10Kzz;

    private Double pm25Kzz;

    public Double getSo2Ljz() {
        return so2Ljz!=null?(double) Math.round(so2Ljz * 100) / 100:null;
    }

    public void setSo2Ljz(Double so2Ljz) {
        this.so2Ljz = so2Ljz;
    }

    public Double getCoLjz() {
        return coLjz!=null?(double) Math.round(coLjz * 100) / 100:null;
    }

    public void setCoLjz(Double coLjz) {
        this.coLjz = coLjz;
    }

    public Double getNo2Ljz() {
        return no2Ljz!=null?(double) Math.round(no2Ljz * 100) / 100:null;
    }

    public void setNo2Ljz(Double no2Ljz) {
        this.no2Ljz = no2Ljz;
    }

    public Double getO3Ljz() {
        return o3Ljz!=null?(double) Math.round(o3Ljz * 100) / 100:null;
    }

    public void setO3Ljz(Double o3Ljz) {
        this.o3Ljz = o3Ljz;
    }

    public Double getPm10Ljz() {
        return pm10Ljz!=null?(double) Math.round(pm10Ljz * 100) / 100:null;
    }

    public void setPm10Ljz(Double pm10Ljz) {
        this.pm10Ljz = pm10Ljz;
    }

    public Double getPm25Ljz() {
        return pm25Ljz!=null?(double) Math.round(pm25Ljz * 100) / 100:null;
    }

    public void setPm25Ljz(Double pm25Ljz) {
        this.pm25Ljz = pm25Ljz;
    }

    public Double getSo2Kzz() {
        return so2Kzz!=null?(double) Math.round(so2Kzz * 100) / 100:null;
    }

    public void setSo2Kzz(Double so2Kzz) {
        this.so2Kzz = so2Kzz;
    }

    public Double getCoKzz() {
        return coKzz!=null?(double) Math.round(coKzz * 100) / 100:null;
    }

    public void setCoKzz(Double coKzz) {
        this.coKzz = coKzz;
    }

    public Double getNo2Kzz() {
        return no2Kzz!=null?(double) Math.round(no2Kzz * 100) / 100:null;
    }

    public void setNo2Kzz(Double no2Kzz) {
        this.no2Kzz = no2Kzz;
    }

    public Double getO3Kzz() {
        return o3Kzz!=null?(double) Math.round(o3Kzz * 100) / 100:null;
    }

    public void setO3Kzz(Double o3Kzz) {
        this.o3Kzz = o3Kzz;
    }

    public Double getPm10Kzz() {
        return pm10Kzz!=null?(double) Math.round(pm10Kzz * 100) / 100:null;
    }

    public void setPm10Kzz(Double pm10Kzz) {
        this.pm10Kzz = pm10Kzz;
    }

    public Double getPm25Kzz() {
        return pm25Kzz!=null?(double) Math.round(pm25Kzz * 100) / 100:null;
    }

    public void setPm25Kzz(Double pm25Kzz) {
        this.pm25Kzz = pm25Kzz;
    }
}