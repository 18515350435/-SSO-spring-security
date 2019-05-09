package com.zc.api.model.resp.company;

import java.math.BigDecimal;

public class CompanyPointListResp {

    /// <summary>
    /// 企业编号
    /// </summary>
    private String pscode ;
    /// <summary>
    /// 企业名称
    /// </summary>
    private String psname ;
    /// <summary>
    /// 企业地址
    /// </summary>
    private String pollutionAddress ;
    /// <summary>
    /// 责任人
    /// </summary>
    private String contactPerson ;
    /// <summary>
    /// 联系电话
    /// </summary>
    private String mobilePhone ;
    private BigDecimal latitude ;
    private BigDecimal longitude ;

    public String getPscode() {
        return this.pscode;
    }

    public void setPscode(String pscode) {
        this.pscode = pscode;
    }

    public String getPsname() {
        return this.psname;
    }

    public void setPsname(String psname) {
        this.psname = psname;
    }

    public String getPollutionAddress() {
        return this.pollutionAddress;
    }

    public void setPollutionAddress(String pollutionAddress) {
        this.pollutionAddress = pollutionAddress;
    }

    public String getContactPerson() {
        return this.contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public BigDecimal getLatitude() {
        return this.latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return this.longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }
}