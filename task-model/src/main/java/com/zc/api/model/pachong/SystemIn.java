package com.zc.api.model.pachong;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class SystemIn {
  
    @XmlElement
    private String Region;
  
    @XmlElement  
    private String PublicOrg;
    @XmlElement
    private String Updatetime;
    @XmlElement
    private String CityTitle;
    @XmlElement
    private String PointerTitle;
    @XmlElement
    private String MapsTitle;

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getPublicOrg() {
        return PublicOrg;
    }

    public void setPublicOrg(String publicOrg) {
        PublicOrg = publicOrg;
    }

    public String getUpdatetime() {
        return Updatetime;
    }

    public void setUpdatetime(String updatetime) {
        Updatetime = updatetime;
    }

    public String getCityTitle() {
        return CityTitle;
    }

    public void setCityTitle(String cityTitle) {
        CityTitle = cityTitle;
    }

    public String getPointerTitle() {
        return PointerTitle;
    }

    public void setPointerTitle(String pointerTitle) {
        PointerTitle = pointerTitle;
    }

    public String getMapsTitle() {
        return MapsTitle;
    }

    public void setMapsTitle(String mapsTitle) {
        MapsTitle = mapsTitle;
    }
}