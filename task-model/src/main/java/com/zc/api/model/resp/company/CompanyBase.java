package com.zc.api.model.resp.company;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import com.alibaba.fastjson.JSONArray;
import com.fasterxml.jackson.annotation.JsonFormat;

import org.springframework.format.annotation.DateTimeFormat;

import javassist.expr.Instanceof;



public class CompanyBase{
    /// <summary>
    /// 企业编码
    /// </summary>
    private String pscode ;
    /// <summary>
    /// 企业名称
    /// </summary>
    private String psname ;
    /// <summary>
    /// 法定代表人
    /// </summary>
    private String legalperson ;
    /// <summary>
    /// 污染源地址
    /// </summary>
    private String pollutionAddress ;
    /// <summary>
    /// 行政区划
    /// </summary>
    private String region ;
    /// <summary>
    /// 行业类别
    /// </summary>
    private String industryType ;
    /// <summary>
    /// 单位类型
    /// </summary>
    private String companyType ;
    /// <summary>
    /// 污染源规模
    /// </summary>
    private String pollutionScale ;
    /// <summary>
    /// 占地面积（m2）
    /// </summary>
    private Double floorSpace ;
    /// <summary>
    /// 污染源类别
    /// </summary>
    private String pollutionType ;
    /// <summary>
    /// 是否30万千瓦电力企业
    /// </summary>
    private String is30Company ;
    /// <summary>
    /// 投产日期
    /// </summary>
    @JsonFormat(pattern="yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date commissioningDate ;
    /// <summary>
    /// 关注程度
    /// </summary>
    private String concernExtent ;
    /// <summary>
    /// 地区名称
    /// </summary>
    private String areaName ;
    /// <summary>
    /// 流域
    /// </summary>
    private String drainageBasin ;
    /// <summary>
    /// 启用状态
    /// </summary>
    private String enabled ;
    /// <summary>
    /// 在线状态
    /// </summary>
    private String isOnline ;
    /// <summary>
    /// 运行状态
    /// </summary>
    private String runningStatus ;
    /// <summary>
    /// 通讯地址
    /// </summary>
    private String contactAddress ;
    /// <summary>
    /// 联系人
    /// </summary>
    private String contactPerson ;
    /// <summary>
    /// 电子邮箱
    /// </summary>
    private String emial ;
    /// <summary>
    /// 办公电话
    /// </summary>
    private String officePhone ;
    /// <summary>
    /// 移动电话
    /// </summary>
    private String mobilePhone ;
    /// <summary>
    /// 污染源网址
    /// </summary>
    private String pollutionUrl ;
    /// <summary>
    /// 污染源环保部门
    /// </summary>
    private String pollutionOffice ;
    /// <summary>
    /// 环保负责人
    /// </summary>
    private String pollutionPerson ;
    /// <summary>
    /// 专职环保人员数
    /// </summary>
    private int pollutionPersonCount ;
    /// <summary>
    /// 备注
    /// </summary>
    private String remarks ;
    /// <summary>
    /// 中心维度
    /// </summary>
    private BigDecimal latitude ;
    /// <summary>
    /// 中心精度
    /// </summary>
    private BigDecimal longitude ;
    private String flagCode;
    /// <summary>
    /// 排放口列表
    /// </summary>
    private List<Outlet> outlet ;

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

    public String getLegalperson() {
        return this.legalperson;
    }

    public void setLegalperson(String legalperson) {
        this.legalperson = legalperson;
    }

    public String getPollutionAddress() {
        return this.pollutionAddress;
    }

    public void setPollutionAddress(String pollutionAddress) {
        this.pollutionAddress = pollutionAddress;
    }

    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getIndustryType() {
        return this.industryType;
    }

    public void setIndustryType(String industryType) {
        this.industryType = industryType;
    }

    public String getCompanyType() {
        return this.companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getPollutionScale() {
        return this.pollutionScale;
    }

    public void setPollutionScale(String pollutionScale) {
        this.pollutionScale = pollutionScale;
    }

    public Double getFloorSpace() {
        return this.floorSpace;
    }

    public void setFloorSpace(Double floorSpace) {
        this.floorSpace = floorSpace;
    }

    public String getPollutionType() {
        return this.pollutionType;
    }

    public void setPollutionType(String pollutionType) {
        this.pollutionType = pollutionType;
    }

    public String getIs30Company() {
        return this.is30Company;
    }

    public void setIs30Company(String is30Company) {
        this.is30Company = is30Company;
    }

    public Date getCommissioningDate() {
        return this.commissioningDate;
    }

    public void setCommissioningDate(Date commissioningDate) {
        this.commissioningDate = commissioningDate;
    }

    public String getConcernExtent() {
        return this.concernExtent;
    }

    public void setConcernExtent(String concernExtent) {
        this.concernExtent = concernExtent;
    }

    public String getAreaName() {
        return this.areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getDrainageBasin() {
        return this.drainageBasin;
    }

    public void setDrainageBasin(String drainageBasin) {
        this.drainageBasin = drainageBasin;
    }

    public String getEnabled() {
        return this.enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public String getIsOnline() {
        return this.isOnline;
    }

    public void setIsOnline(String isOnline) {
        this.isOnline = isOnline;
    }

    public String getRunningStatus() {
        return this.runningStatus;
    }

    public void setRunningStatus(String runningStatus) {
        this.runningStatus = runningStatus;
    }

    public String getContactAddress() {
        return this.contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getContactPerson() {
        return this.contactPerson;
    }
    public String getFlagCode() {
        return this.flagCode;
    }

    public void setFlagCode(String flagCode) {
        this.flagCode = flagCode;
    }
    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getEmial() {
        return this.emial;
    }

    public void setEmial(String emial) {
        this.emial = emial;
    }

    public String getOfficePhone() {
        return this.officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getPollutionUrl() {
        return this.pollutionUrl;
    }

    public void setPollutionUrl(String pollutionUrl) {
        this.pollutionUrl = pollutionUrl;
    }

    public String getPollutionOffice() {
        return this.pollutionOffice;
    }

    public void setPollutionOffice(String pollutionOffice) {
        this.pollutionOffice = pollutionOffice;
    }

    public String getPollutionPerson() {
        return this.pollutionPerson;
    }

    public void setPollutionPerson(String pollutionPerson) {
        this.pollutionPerson = pollutionPerson;
    }

    public int getPollutionPersonCount() {
        return this.pollutionPersonCount;
    }

    public void setPollutionPersonCount(int pollutionPersonCount) {
        this.pollutionPersonCount = pollutionPersonCount;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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

    public List<Outlet> getOutlet() {
        return this.outlet;
    }

    public void setOutlet(String outlet) {
        this.outlet = JSONArray.parseArray((String)outlet, Outlet.class);
    }
    
    public void setOutletList(List<Outlet> outlet) {
        this.outlet = outlet;
    }
}