package com.zc.api.model.resp.townstation;

/**
 * Created by shaksper on 2018/11/12.
 */
public class TownStationListResp implements Comparable<TownStationListResp>{
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

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
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

    public double getCom_index() {
        return com_index;
    }

    public void setCom_index(double com_index) {
        this.com_index = com_index;
    }

    public String getGridname() {
        return gridname;
    }

    public void setGridname(String gridname) {
        this.gridname = gridname;
    }

    private String deviceid;
    private String name;
    private String latitude;
    private String longitude;
    private String pm25;
    private String so2;
    private double com_index;
    private String gridname;

    @Override
    public int compareTo(TownStationListResp o) {
        if(this.getCom_index()>o.getCom_index()) {
            return -1;
        } else {
            return 1;
        }
    }
}
