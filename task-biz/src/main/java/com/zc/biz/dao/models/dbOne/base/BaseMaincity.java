package com.zc.biz.dao.models.dbOne.base;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "base_maincity")
public class BaseMaincity implements Serializable {
    @Column(name = "CityCode")
    private String citycode;

    @Column(name = "CityName")
    private String cityname;

    @Column(name = "SimpleCityName")
    private String simplecityname;

    @Column(name = "ParentCode")
    private String parentcode;

    @Column(name = "Province")
    private String province;

    @Column(name = "Level")
    private String level;

    @Column(name = "QPhoneNum")
    private String qphonenum;

    @Column(name = "PostCode")
    private String postcode;

    @Column(name = "Spell")
    private String spell;

    @Column(name = "GLon")
    private Double glon;

    @Column(name = "Glat")
    private Double glat;

    @Column(name = "IsJjjAnd226City")
    private byte[] isjjjand226city;

    @Column(name = "Is226City")
    private byte[] is226city;

    @Column(name = "IsJjjCity")
    private byte[] isjjjcity;

    @Column(name = "Is74City")
    private byte[] is74city;

    @Column(name = "Is169City")
    private Boolean is169city;

    @Column(name = "Is338City")
    private Boolean is338city;

    @Column(name = "Blon")
    private Double blon;

    @Column(name = "Blat")
    private Double blat;

    @Column(name = "Id")
    private String id;

    private static final long serialVersionUID = 1L;

    /**
     * @return CityCode
     */
    public String getCitycode() {
        return citycode;
    }

    /**
     * @param citycode
     */
    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    /**
     * @return CityName
     */
    public String getCityname() {
        return cityname;
    }

    /**
     * @param cityname
     */
    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    /**
     * @return SimpleCityName
     */
    public String getSimplecityname() {
        return simplecityname;
    }

    /**
     * @param simplecityname
     */
    public void setSimplecityname(String simplecityname) {
        this.simplecityname = simplecityname;
    }

    /**
     * @return ParentCode
     */
    public String getParentcode() {
        return parentcode;
    }

    /**
     * @param parentcode
     */
    public void setParentcode(String parentcode) {
        this.parentcode = parentcode;
    }

    /**
     * @return Province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * @return Level
     */
    public String getLevel() {
        return level;
    }

    /**
     * @param level
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * @return QPhoneNum
     */
    public String getQphonenum() {
        return qphonenum;
    }

    /**
     * @param qphonenum
     */
    public void setQphonenum(String qphonenum) {
        this.qphonenum = qphonenum;
    }

    /**
     * @return PostCode
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * @param postcode
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     * @return Spell
     */
    public String getSpell() {
        return spell;
    }

    /**
     * @param spell
     */
    public void setSpell(String spell) {
        this.spell = spell;
    }

    /**
     * @return GLon
     */
    public Double getGlon() {
        return glon;
    }

    /**
     * @param glon
     */
    public void setGlon(Double glon) {
        this.glon = glon;
    }

    /**
     * @return Glat
     */
    public Double getGlat() {
        return glat;
    }

    /**
     * @param glat
     */
    public void setGlat(Double glat) {
        this.glat = glat;
    }

    /**
     * @return IsJjjAnd226City
     */
    public byte[] getIsjjjand226city() {
        return isjjjand226city;
    }

    /**
     * @param isjjjand226city
     */
    public void setIsjjjand226city(byte[] isjjjand226city) {
        this.isjjjand226city = isjjjand226city;
    }

    /**
     * @return Is226City
     */
    public byte[] getIs226city() {
        return is226city;
    }

    /**
     * @param is226city
     */
    public void setIs226city(byte[] is226city) {
        this.is226city = is226city;
    }

    /**
     * @return IsJjjCity
     */
    public byte[] getIsjjjcity() {
        return isjjjcity;
    }

    /**
     * @param isjjjcity
     */
    public void setIsjjjcity(byte[] isjjjcity) {
        this.isjjjcity = isjjjcity;
    }

    /**
     * @return Is74City
     */
    public byte[] getIs74city() {
        return is74city;
    }

    /**
     * @param is74city
     */
    public void setIs74city(byte[] is74city) {
        this.is74city = is74city;
    }

    /**
     * @return Is169City
     */
    public Boolean getIs169city() {
        return is169city;
    }

    /**
     * @param is169city
     */
    public void setIs169city(Boolean is169city) {
        this.is169city = is169city;
    }

    /**
     * @return Is338City
     */
    public Boolean getIs338city() {
        return is338city;
    }

    /**
     * @param is338city
     */
    public void setIs338city(Boolean is338city) {
        this.is338city = is338city;
    }

    /**
     * @return Blon
     */
    public Double getBlon() {
        return blon;
    }

    /**
     * @param blon
     */
    public void setBlon(Double blon) {
        this.blon = blon;
    }

    /**
     * @return Blat
     */
    public Double getBlat() {
        return blat;
    }

    /**
     * @param blat
     */
    public void setBlat(Double blat) {
        this.blat = blat;
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
        sb.append(", citycode=").append(citycode);
        sb.append(", cityname=").append(cityname);
        sb.append(", simplecityname=").append(simplecityname);
        sb.append(", parentcode=").append(parentcode);
        sb.append(", province=").append(province);
        sb.append(", level=").append(level);
        sb.append(", qphonenum=").append(qphonenum);
        sb.append(", postcode=").append(postcode);
        sb.append(", spell=").append(spell);
        sb.append(", glon=").append(glon);
        sb.append(", glat=").append(glat);
        sb.append(", isjjjand226city=").append(isjjjand226city);
        sb.append(", is226city=").append(is226city);
        sb.append(", isjjjcity=").append(isjjjcity);
        sb.append(", is74city=").append(is74city);
        sb.append(", is169city=").append(is169city);
        sb.append(", is338city=").append(is338city);
        sb.append(", blon=").append(blon);
        sb.append(", blat=").append(blat);
        sb.append(", id=").append(id);
        sb.append("]");
        return sb.toString();
    }
}