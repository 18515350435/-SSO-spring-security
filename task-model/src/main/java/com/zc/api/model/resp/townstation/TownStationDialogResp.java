package com.zc.api.model.resp.townstation;

import java.util.List;

/**
 * Created by shaksper on 2018/11/12.
 */
public class TownStationDialogResp {
    private String deviceid;
    private String name;

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPm25() {
        return pm25;
    }

    public void setPm25(String pm25) {
        this.pm25 = pm25;
    }

    public String getSo2() {
        return so2;
    }

    public void setSo2(String so2) {
        this.so2 = so2;
    }

    public List<TownStation24Hour> getList() {
        return list;
    }

    public void setList(List<TownStation24Hour> list) {
        this.list = list;
    }

    private String time;
    private String pm25;
    private String so2;
    private List<TownStation24Hour> list;
}
