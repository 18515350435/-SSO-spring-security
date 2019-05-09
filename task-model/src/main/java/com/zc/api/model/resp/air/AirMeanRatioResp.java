package com.zc.api.model.resp.air;

import java.util.List;

public class AirMeanRatioResp {
    private String time;
    private String total;
    private List<PerValueKey> list;

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTotal() {
        return this.total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public List<PerValueKey> getList() {
        return this.list;
    }

    public void setList(List<PerValueKey> list) {
        this.list = list;
    }
}