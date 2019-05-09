package com.zc.biz.dao.models.dbOne.point;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "point_info")
public class PointInfo implements Serializable {
    @Id
    private String id;

    /**
     * 监控点名称
     */
    private String name;

    /**
     * 监控点经度
     */
    private Double longitude;

    /**
     * 监控点纬度
     */
    private BigDecimal latitude;

    /**
     * 所属区县
     */
    @Column(name = "district_county")
    private String districtCounty;

    /**
     * 站点类型  1：国控点   2：省控点 3：乡镇
     */
    private String pointtype;

    /**
     * 所属区域id
     */
    private String areaid;

    private String city;

    private String citycode;

    @Transient
    private String region;
    private static final long serialVersionUID = 1L;


    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    /**
     * @return id
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

    /**
     * 获取监控点名称
     *
     * @return name - 监控点名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置监控点名称
     *
     * @param name 监控点名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取监控点经度
     *
     * @return longitude - 监控点经度
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * 设置监控点经度
     *
     * @param longitude 监控点经度
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取监控点纬度
     *
     * @return latitude - 监控点纬度
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * 设置监控点纬度
     *
     * @param latitude 监控点纬度
     */
    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    /**
     * 获取所属区县
     *
     * @return district_county - 所属区县
     */
    public String getDistrictCounty() {
        return districtCounty;
    }

    /**
     * 设置所属区县
     *
     * @param districtCounty 所属区县
     */
    public void setDistrictCounty(String districtCounty) {
        this.districtCounty = districtCounty;
    }

    /**
     * 获取站点类型  1：国控点   2：省控点 3：乡镇
     *
     * @return pointtype - 站点类型  1：国控点   2：省控点 3：乡镇
     */
    public String getPointtype() {
        return pointtype;
    }

    /**
     * 设置站点类型  1：国控点   2：省控点 3：乡镇
     *
     * @param pointtype 站点类型  1：国控点   2：省控点 3：乡镇
     */
    public void setPointtype(String pointtype) {
        this.pointtype = pointtype;
    }

    /**
     * 获取所属区域id
     *
     * @return areaid - 所属区域id
     */
    public String getAreaid() {
        return areaid;
    }

    /**
     * 设置所属区域id
     *
     * @param areaid 所属区域id
     */
    public void setAreaid(String areaid) {
        this.areaid = areaid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "PointInfo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", districtCounty='" + districtCounty + '\'' +
                ", pointtype='" + pointtype + '\'' +
                ", areaid='" + areaid + '\'' +
                ", city='" + city + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}