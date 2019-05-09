package com.zc.biz.dao.models.dbOne.air;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "air_weatherforecast_cityinfo")
public class AirWeatherforecastCityinfo implements Serializable {
    /**
     * ����id
     */
    @Id
    private Integer id;

    /**
     * ��������
     */
    private String cityname;

    /**
     * ƴ��
     */
    private String citypinyin;

    private static final long serialVersionUID = 1L;

    /**
     * ��ȡ����id
     *
     * @return id - ����id
     */
    public Integer getId() {
        return id;
    }

    /**
     * ��������id
     *
     * @param id ����id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * ��ȡ��������
     *
     * @return cityname - ��������
     */
    public String getCityname() {
        return cityname;
    }

    /**
     * ���ó�������
     *
     * @param cityname ��������
     */
    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    /**
     * ��ȡƴ��
     *
     * @return citypinyin - ƴ��
     */
    public String getCitypinyin() {
        return citypinyin;
    }

    /**
     * ����ƴ��
     *
     * @param citypinyin ƴ��
     */
    public void setCitypinyin(String citypinyin) {
        this.citypinyin = citypinyin;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * @param province 所属省份
     */
private String province;
/**
 * 经度
 * */
private String lat;
    /**
     * 纬度
     * */
private String lon;

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", cityname=").append(cityname);
        sb.append(", citypinyin=").append(citypinyin);
        sb.append(", province=").append(province);
        sb.append(", lat=").append(lat);
        sb.append(", lon=").append(lon);
        sb.append("]");
        return sb.toString();
    }
}