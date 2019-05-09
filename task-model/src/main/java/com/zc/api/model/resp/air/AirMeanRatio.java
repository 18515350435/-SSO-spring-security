package com.zc.api.model.resp.air;

import java.math.BigDecimal;

/**
 * 均值比数据库对象
 */
public class AirMeanRatio {
    private String name;
    private String time;
    private Double value;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getValue() {
        return this.value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
    
}