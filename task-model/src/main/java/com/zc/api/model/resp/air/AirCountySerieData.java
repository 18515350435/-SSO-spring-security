package com.zc.api.model.resp.air;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AirCountySerieData{
    private String gridcode;
    private String value;
    @JsonFormat(pattern = "yyyy-MM-dd HH:00:00")
    private Date time;

    public String getGridcode() {
        return this.gridcode;
    }

    public void setGridcode(String gridcode) {
        this.gridcode = gridcode;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Date getTime() {
        return this.time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}