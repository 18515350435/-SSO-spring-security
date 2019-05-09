package com.zc.api.model.resp.shenzhou;

import java.math.BigDecimal;

public class MonthRankData{
    private String gridcode;
    private String time;
    private Double value;

    public String getGridcode() {
        return this.gridcode;
    }

    public void setGridcode(String gridcode) {
        this.gridcode = gridcode;
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