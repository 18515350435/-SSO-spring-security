package com.zc.api.model.common;

import javax.xml.crypto.Data;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Administrator on 2018/5/10.
 */
public class PollutionItemValue implements Comparable<PollutionItemValue>{
    private String code;
    private Date time;
    private int pm25Nd;
    private int pm10Nd ;
    private int so2Nd ;
    private int no2Nd ;
    private double coNd;
    private int o3Nd ;
    private int ipm25 ;
    private int ipm10 ;
    private int iso2 ;
    private int ino2 ;
    private int ico;
    private int io3 ;
    private int aqi ;

    public PollutionItemValue() {

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getPm25Nd() {
        return pm25Nd;
    }

    public void setPm25Nd(int pm25Nd) {
        this.pm25Nd = pm25Nd;
    }

    public int getPm10Nd() {
        return pm10Nd;
    }

    public void setPm10Nd(int pm10Nd) {
        this.pm10Nd = pm10Nd;
    }

    public int getSo2Nd() {
        return so2Nd;
    }

    public void setSo2Nd(int so2Nd) {
        this.so2Nd = so2Nd;
    }

    public int getNo2Nd() {
        return no2Nd;
    }

    public void setNo2Nd(int no2Nd) {
        this.no2Nd = no2Nd;
    }

    public double getCoNd() {
        return coNd;
    }

    public void setCoNd(double coNd) {
        this.coNd = coNd;
    }

    public int getO3Nd() {
        return o3Nd;
    }

    public void setO3Nd(int o3Nd) {
        this.o3Nd = o3Nd;
    }

    public int getIpm25() {
        return ipm25;
    }

    public void setIpm25(int ipm25) {
        this.ipm25 = ipm25;
    }

    public int getIpm10() {
        return ipm10;
    }

    public void setIpm10(int ipm10) {
        this.ipm10 = ipm10;
    }

    public int getIso2() {
        return iso2;
    }

    public void setIso2(int iso2) {
        this.iso2 = iso2;
    }

    public int getIno2() {
        return ino2;
    }

    public void setIno2(int ino2) {
        this.ino2 = ino2;
    }

    public int getIco() {
        return ico;
    }

    public void setIco(int ico) {
        this.ico = ico;
    }

    public int getIo3() {
        return io3;
    }

    public void setIo3(int io3) {
        this.io3 = io3;
    }

    public int getAqi() {
        return aqi;
    }

    public void setAqi(int aqi) {
        this.aqi = aqi;
    }

    public PollutionItemValue(int aqi,int pm25Nd, int pm10Nd, int so2Nd, int no2Nd, double coNd, int o3Nd ) {
        this.pm25Nd = pm25Nd;
        this.pm10Nd = pm10Nd;
        this.so2Nd = so2Nd;
        this.no2Nd = no2Nd;
        this.coNd = coNd;
        this.o3Nd = o3Nd;
        this.aqi = aqi;
        this.time = new Date();
    }

    @Override
    public int compareTo(PollutionItemValue o) {
        return this.getTime().compareTo(o.getTime());
    }
}
