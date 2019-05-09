package com.zc.biz.dao.models.dbOne.company;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "company_baseinfo")
public class CompanyBaseinfo implements Serializable {
    private String pscode;

    private String psname;

    @Column(name = "legalPerson")
    private String legalperson;

    @Column(name = "pollutionAddress")
    private String pollutionaddress;

    private String region;

    @Column(name = "industryType")
    private String industrytype;

    @Column(name = "companyType")
    private String companytype;

    @Column(name = "pollutionScale")
    private String pollutionscale;

    @Column(name = "floorSpace")
    private Double floorspace;

    @Column(name = "pollutionType")
    private String pollutiontype;

    @Column(name = "is30Company")
    private String is30company;

    @Column(name = "commissioningDate")
    private Date commissioningdate;

    @Column(name = "concernExtent")
    private String concernextent;

    @Column(name = "areaName")
    private String areaname;

    @Column(name = "drainageBasin")
    private String drainagebasin;

    private String enabled;

    @Column(name = "isOnLine")
    private String isonline;

    @Column(name = "runningStatus")
    private String runningstatus;

    @Column(name = "contactAddress")
    private String contactaddress;

    @Column(name = "contactPerson")
    private String contactperson;

    private String emial;

    @Column(name = "officePhone")
    private String officephone;

    @Column(name = "mobilePhone")
    private String mobilephone;

    private String fax;

    @Column(name = "pollutionUrl")
    private String pollutionurl;

    @Column(name = "pollutionOffice")
    private String pollutionoffice;

    @Column(name = "pollutionPerson")
    private String pollutionperson;

    @Column(name = "pollutionPersonCount")
    private Integer pollutionpersoncount;
    @Column(name = "flag_code")
    private String flagCode;
    

    private String remarks;

    private BigDecimal latitude;

    private BigDecimal longitude;

    private static final long serialVersionUID = 1L;

    /**
     * @return pscode
     */
    public String getPscode() {
        return pscode;
    }

    /**
     * @param pscode
     */
    public void setPscode(String pscode) {
        this.pscode = pscode;
    }

    /**
     * @return psname
     */
    public String getPsname() {
        return psname;
    }

    /**
     * @param psname
     */
    public void setPsname(String psname) {
        this.psname = psname;
    }
    
    public String getFlagCode() {
        return this.flagCode;
    }

    public void setFlagCode(String flagCode) {
        this.flagCode = flagCode;
    }

    /**
     * @return legalPerson
     */
    public String getLegalperson() {
        return legalperson;
    }

    /**
     * @param legalperson
     */
    public void setLegalperson(String legalperson) {
        this.legalperson = legalperson;
    }

    /**
     * @return pollutionAddress
     */
    public String getPollutionaddress() {
        return pollutionaddress;
    }

    /**
     * @param pollutionaddress
     */
    public void setPollutionaddress(String pollutionaddress) {
        this.pollutionaddress = pollutionaddress;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return region;
    }

    /**
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * @return industryType
     */
    public String getIndustrytype() {
        return industrytype;
    }

    /**
     * @param industrytype
     */
    public void setIndustrytype(String industrytype) {
        this.industrytype = industrytype;
    }

    /**
     * @return companyType
     */
    public String getCompanytype() {
        return companytype;
    }

    /**
     * @param companytype
     */
    public void setCompanytype(String companytype) {
        this.companytype = companytype;
    }

    /**
     * @return pollutionScale
     */
    public String getPollutionscale() {
        return pollutionscale;
    }

    /**
     * @param pollutionscale
     */
    public void setPollutionscale(String pollutionscale) {
        this.pollutionscale = pollutionscale;
    }

    /**
     * @return floorSpace
     */
    public Double getFloorspace() {
        return floorspace;
    }

    /**
     * @param floorspace
     */
    public void setFloorspace(Double floorspace) {
        this.floorspace = floorspace;
    }

    /**
     * @return pollutionType
     */
    public String getPollutiontype() {
        return pollutiontype;
    }

    /**
     * @param pollutiontype
     */
    public void setPollutiontype(String pollutiontype) {
        this.pollutiontype = pollutiontype;
    }

    /**
     * @return is30Company
     */
    public String getIs30company() {
        return is30company;
    }

    /**
     * @param is30company
     */
    public void setIs30company(String is30company) {
        this.is30company = is30company;
    }

    /**
     * @return commissioningDate
     */
    public Date getCommissioningdate() {
        return commissioningdate;
    }

    /**
     * @param commissioningdate
     */
    public void setCommissioningdate(Date commissioningdate) {
        this.commissioningdate = commissioningdate;
    }

    /**
     * @return concernExtent
     */
    public String getConcernextent() {
        return concernextent;
    }

    /**
     * @param concernextent
     */
    public void setConcernextent(String concernextent) {
        this.concernextent = concernextent;
    }

    /**
     * @return areaName
     */
    public String getAreaname() {
        return areaname;
    }

    /**
     * @param areaname
     */
    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }

    /**
     * @return drainageBasin
     */
    public String getDrainagebasin() {
        return drainagebasin;
    }

    /**
     * @param drainagebasin
     */
    public void setDrainagebasin(String drainagebasin) {
        this.drainagebasin = drainagebasin;
    }

    /**
     * @return enabled
     */
    public String getEnabled() {
        return enabled;
    }

    /**
     * @param enabled
     */
    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    /**
     * @return isOnLine
     */
    public String getIsonline() {
        return isonline;
    }

    /**
     * @param isonline
     */
    public void setIsonline(String isonline) {
        this.isonline = isonline;
    }

    /**
     * @return runningStatus
     */
    public String getRunningstatus() {
        return runningstatus;
    }

    /**
     * @param runningstatus
     */
    public void setRunningstatus(String runningstatus) {
        this.runningstatus = runningstatus;
    }

    /**
     * @return contactAddress
     */
    public String getContactaddress() {
        return contactaddress;
    }

    /**
     * @param contactaddress
     */
    public void setContactaddress(String contactaddress) {
        this.contactaddress = contactaddress;
    }

    /**
     * @return contactPerson
     */
    public String getContactperson() {
        return contactperson;
    }

    /**
     * @param contactperson
     */
    public void setContactperson(String contactperson) {
        this.contactperson = contactperson;
    }

    /**
     * @return emial
     */
    public String getEmial() {
        return emial;
    }

    /**
     * @param emial
     */
    public void setEmial(String emial) {
        this.emial = emial;
    }

    /**
     * @return officePhone
     */
    public String getOfficephone() {
        return officephone;
    }

    /**
     * @param officephone
     */
    public void setOfficephone(String officephone) {
        this.officephone = officephone;
    }

    /**
     * @return mobilePhone
     */
    public String getMobilephone() {
        return mobilephone;
    }

    /**
     * @param mobilephone
     */
    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
    }

    /**
     * @return fax
     */
    public String getFax() {
        return fax;
    }

    /**
     * @param fax
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * @return pollutionUrl
     */
    public String getPollutionurl() {
        return pollutionurl;
    }

    /**
     * @param pollutionurl
     */
    public void setPollutionurl(String pollutionurl) {
        this.pollutionurl = pollutionurl;
    }

    /**
     * @return pollutionOffice
     */
    public String getPollutionoffice() {
        return pollutionoffice;
    }

    /**
     * @param pollutionoffice
     */
    public void setPollutionoffice(String pollutionoffice) {
        this.pollutionoffice = pollutionoffice;
    }

    /**
     * @return pollutionPerson
     */
    public String getPollutionperson() {
        return pollutionperson;
    }

    /**
     * @param pollutionperson
     */
    public void setPollutionperson(String pollutionperson) {
        this.pollutionperson = pollutionperson;
    }

    /**
     * @return pollutionPersonCount
     */
    public Integer getPollutionpersoncount() {
        return pollutionpersoncount;
    }

    /**
     * @param pollutionpersoncount
     */
    public void setPollutionpersoncount(Integer pollutionpersoncount) {
        this.pollutionpersoncount = pollutionpersoncount;
    }

    /**
     * @return remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * @param remarks
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * @return latitude
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * @param latitude
     */
    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    /**
     * @return longitude
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * @param longitude
     */
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pscode=").append(pscode);
        sb.append(", psname=").append(psname);
        sb.append(", legalperson=").append(legalperson);
        sb.append(", pollutionaddress=").append(pollutionaddress);
        sb.append(", region=").append(region);
        sb.append(", industrytype=").append(industrytype);
        sb.append(", companytype=").append(companytype);
        sb.append(", pollutionscale=").append(pollutionscale);
        sb.append(", floorspace=").append(floorspace);
        sb.append(", pollutiontype=").append(pollutiontype);
        sb.append(", is30company=").append(is30company);
        sb.append(", commissioningdate=").append(commissioningdate);
        sb.append(", concernextent=").append(concernextent);
        sb.append(", areaname=").append(areaname);
        sb.append(", drainagebasin=").append(drainagebasin);
        sb.append(", enabled=").append(enabled);
        sb.append(", isonline=").append(isonline);
        sb.append(", runningstatus=").append(runningstatus);
        sb.append(", contactaddress=").append(contactaddress);
        sb.append(", contactperson=").append(contactperson);
        sb.append(", emial=").append(emial);
        sb.append(", officephone=").append(officephone);
        sb.append(", mobilephone=").append(mobilephone);
        sb.append(", fax=").append(fax);
        sb.append(", pollutionurl=").append(pollutionurl);
        sb.append(", pollutionoffice=").append(pollutionoffice);
        sb.append(", pollutionperson=").append(pollutionperson);
        sb.append(", pollutionpersoncount=").append(pollutionpersoncount);
        sb.append(", remarks=").append(remarks);
        sb.append(", latitude=").append(latitude);
        sb.append(", longitude=").append(longitude);
        sb.append("]");
        return sb.toString();
    }
}