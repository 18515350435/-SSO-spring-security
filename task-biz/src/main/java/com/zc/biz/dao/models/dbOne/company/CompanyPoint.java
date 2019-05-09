package com.zc.biz.dao.models.dbOne.company;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "company_point")
public class CompanyPoint implements Serializable {
    private String pscode;

    private String psname;

    private String regionname;

    private String industrytypename;

    private String psaddress;

    private Integer outputcode;

    private String outputname;

    private Double latitude;

    private Double longitude;

    @Column(name = "CreateTime")
    private Date createtime;

    @Column(name = "legalPerson")
    private String legalperson;

    private String mobile;
    @Column(name = "`delete`")
    private Boolean delete;

    @Column(name = "Id")
    private String id;

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

    /**
     * @return regionname
     */
    public String getRegionname() {
        return regionname;
    }

    /**
     * @param regionname
     */
    public void setRegionname(String regionname) {
        this.regionname = regionname;
    }

    /**
     * @return industrytypename
     */
    public String getIndustrytypename() {
        return industrytypename;
    }

    /**
     * @param industrytypename
     */
    public void setIndustrytypename(String industrytypename) {
        this.industrytypename = industrytypename;
    }

    /**
     * @return psaddress
     */
    public String getPsaddress() {
        return psaddress;
    }

    /**
     * @param psaddress
     */
    public void setPsaddress(String psaddress) {
        this.psaddress = psaddress;
    }

    /**
     * @return outputcode
     */
    public Integer getOutputcode() {
        return outputcode;
    }

    /**
     * @param outputcode
     */
    public void setOutputcode(Integer outputcode) {
        this.outputcode = outputcode;
    }

    /**
     * @return outputname
     */
    public String getOutputname() {
        return outputname;
    }

    /**
     * @param outputname
     */
    public void setOutputname(String outputname) {
        this.outputname = outputname;
    }

    /**
     * @return latitude
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * @param latitude
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * @return longitude
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * @param longitude
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * @return CreateTime
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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
     * @return mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return delete
     */
    public Boolean getDelete() {
        return delete;
    }

    /**
     * @param delete
     */
    public void setDelete(Boolean delete) {
        this.delete = delete;
    }

    /**
     * @return Id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pscode=").append(pscode);
        sb.append(", psname=").append(psname);
        sb.append(", regionname=").append(regionname);
        sb.append(", industrytypename=").append(industrytypename);
        sb.append(", psaddress=").append(psaddress);
        sb.append(", outputcode=").append(outputcode);
        sb.append(", outputname=").append(outputname);
        sb.append(", latitude=").append(latitude);
        sb.append(", longitude=").append(longitude);
        sb.append(", createtime=").append(createtime);
        sb.append(", legalperson=").append(legalperson);
        sb.append(", mobile=").append(mobile);
        sb.append(", delete=").append(delete);
        sb.append(", id=").append(id);
        sb.append("]");
        return sb.toString();
    }
}