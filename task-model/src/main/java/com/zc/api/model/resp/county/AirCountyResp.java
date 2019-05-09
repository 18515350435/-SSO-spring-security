package com.zc.api.model.resp.county;

import java.util.List;

public class AirCountyResp{

    private List<AllCountyHourData> city;

    private List<AllCountyHourData> county;

    private List<AllCountyHourData> provincestation;

    public List<AllCountyHourData> getCounty() {
        return this.county;
    }

    public void setCounty(List<AllCountyHourData> county) {
        this.county = county;
    }

    public List<AllCountyHourData> getCity() {
        return this.city;
    }

    public void setCity(List<AllCountyHourData> city) {
        this.city = city;
    }

    public List<AllCountyHourData> getProvincestation() {
        return this.provincestation;
    }

    public void setProvincestation(List<AllCountyHourData> provincestation) {
        this.provincestation = provincestation;
    }

}