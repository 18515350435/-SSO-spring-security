package com.zc.biz.dao.models.dbOne.point;

import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "base_countyinfos")
public class BaseCountyinfos implements Serializable {
    private Integer id;

    /**
     * 区县名称
     */
    private String areaname;

    /**
     * 区县编码
     */
    private String areacode;

    /**
     * 市区名称
     */
    private String cityname;

    /**
     * 市区编码
     */
    private String citycode;

    /**
     * 省份或直辖市名称
     */
    private String provincename;

    /**
     * 省份或直辖市编码
     */
    private String provincecode;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取区县名称
     *
     * @return areaname - 区县名称
     */
    public String getAreaname() {
        return areaname;
    }

    /**
     * 设置区县名称
     *
     * @param areaname 区县名称
     */
    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }

    /**
     * 获取区县编码
     *
     * @return areacode - 区县编码
     */
    public String getAreacode() {
        return areacode;
    }

    /**
     * 设置区县编码
     *
     * @param areacode 区县编码
     */
    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    /**
     * 获取市区名称
     *
     * @return cityname - 市区名称
     */
    public String getCityname() {
        return cityname;
    }

    /**
     * 设置市区名称
     *
     * @param cityname 市区名称
     */
    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    /**
     * 获取市区编码
     *
     * @return citycode - 市区编码
     */
    public String getCitycode() {
        return citycode;
    }

    /**
     * 设置市区编码
     *
     * @param citycode 市区编码
     */
    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    /**
     * 获取省份或直辖市名称
     *
     * @return provincename - 省份或直辖市名称
     */
    public String getProvincename() {
        return provincename;
    }

    /**
     * 设置省份或直辖市名称
     *
     * @param provincename 省份或直辖市名称
     */
    public void setProvincename(String provincename) {
        this.provincename = provincename;
    }

    /**
     * 获取省份或直辖市编码
     *
     * @return provincecode - 省份或直辖市编码
     */
    public String getProvincecode() {
        return provincecode;
    }

    /**
     * 设置省份或直辖市编码
     *
     * @param provincecode 省份或直辖市编码
     */
    public void setProvincecode(String provincecode) {
        this.provincecode = provincecode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", areaname=").append(areaname);
        sb.append(", areacode=").append(areacode);
        sb.append(", cityname=").append(cityname);
        sb.append(", citycode=").append(citycode);
        sb.append(", provincename=").append(provincename);
        sb.append(", provincecode=").append(provincecode);
        sb.append("]");
        return sb.toString();
    }
}