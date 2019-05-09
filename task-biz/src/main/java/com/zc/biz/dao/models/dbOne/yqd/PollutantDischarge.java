package com.zc.biz.dao.models.dbOne.yqd;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.List;

@Table(name = "pollutant_discharge")
public class PollutantDischarge implements Serializable {
    @Id
    private String id;

    /**
     * 企业名称
     */
    private String name;

    /**
     * 地址
     */
    private String address;

    /**
     * 经度
     */
    private String longitude;

    /**
     * 纬度
     */
    private String latitude;

    /**
     * 联系人
     */
    private String contactor;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 网格名称
     */
    @Column(name = "net_name")
    private String netName;

    /**
     * 网格编码
     */
    @Column(name = "net_code")
    private String netCode;

    /**
     * 分类id
     */
    @Column(name = "class_id")
    private String classId;

    /**
     * 分类名称
     */
    @Column(name = "class_name")
    private String className;

    /**
     * 内部类别名称
     */
    @Column(name = "inner_class_name")
    private String innerClassName;

    /**
     * so2排放量
     */
    private String so2;

    /**
     * nox排放量
     */
    private String nox;

    /**
     * co排放量
     */
    private String co;

    /**
     * pm10排放量
     */
    private String pm10;

    /**
     * pm2.5排放量
     */
    private String pm25;

    /**
     * voc排放量
     */
    private String voc;

    /**
     * nh3排放量
     */
    private String nh3;

    /**
     * bc排放量
     */
    private String bc;

    /**
     * oc排放量
     */
    private String oc;

    /**
     * 统计年份
     */
    private String nf;

    /**
     * 删除状态：0未删除  1已删除
     */
    private Byte deleted;

    /**
     * 特殊属性
     */
    @Transient
    private List<?> special;

    public List<?> getSpecial() {
        return special;
    }

    public void setSpecial(List<?> special) {
        this.special = special;
    }

    private static final long serialVersionUID = 1L;

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
     * 获取企业名称
     *
     * @return name - 企业名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置企业名称
     *
     * @param name 企业名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取经度
     *
     * @return longitude - 经度
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * 设置经度
     *
     * @param longitude 经度
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取纬度
     *
     * @return latitude - 纬度
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * 设置纬度
     *
     * @param latitude 纬度
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * 获取联系人
     *
     * @return contactor - 联系人
     */
    public String getContactor() {
        return contactor;
    }

    /**
     * 设置联系人
     *
     * @param contactor 联系人
     */
    public void setContactor(String contactor) {
        this.contactor = contactor;
    }

    /**
     * 获取联系电话
     *
     * @return phone - 联系电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置联系电话
     *
     * @param phone 联系电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取网格名称
     *
     * @return net_name - 网格名称
     */
    public String getNetName() {
        return netName;
    }

    /**
     * 设置网格名称
     *
     * @param netName 网格名称
     */
    public void setNetName(String netName) {
        this.netName = netName;
    }

    /**
     * 获取网格编码
     *
     * @return net_code - 网格编码
     */
    public String getNetCode() {
        return netCode;
    }

    /**
     * 设置网格编码
     *
     * @param netCode 网格编码
     */
    public void setNetCode(String netCode) {
        this.netCode = netCode;
    }

    /**
     * 获取分类id
     *
     * @return class_id - 分类id
     */
    public String getClassId() {
        return classId;
    }

    /**
     * 设置分类id
     *
     * @param classId 分类id
     */
    public void setClassId(String classId) {
        this.classId = classId;
    }

    /**
     * 获取分类名称
     *
     * @return class_name - 分类名称
     */
    public String getClassName() {
        return className;
    }

    /**
     * 设置分类名称
     *
     * @param className 分类名称
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * 获取内部类别名称
     *
     * @return inner_class_name - 内部类别名称
     */
    public String getInnerClassName() {
        return innerClassName;
    }

    /**
     * 设置内部类别名称
     *
     * @param innerClassName 内部类别名称
     */
    public void setInnerClassName(String innerClassName) {
        this.innerClassName = innerClassName;
    }

    /**
     * 获取so2排放量
     *
     * @return so2 - so2排放量
     */
    public String getSo2() {
        return so2;
    }

    /**
     * 设置so2排放量
     *
     * @param so2 so2排放量
     */
    public void setSo2(String so2) {
        this.so2 = so2;
    }

    /**
     * 获取nox排放量
     *
     * @return nox - nox排放量
     */
    public String getNox() {
        return nox;
    }

    /**
     * 设置nox排放量
     *
     * @param nox nox排放量
     */
    public void setNox(String nox) {
        this.nox = nox;
    }

    /**
     * 获取co排放量
     *
     * @return co - co排放量
     */
    public String getCo() {
        return co;
    }

    /**
     * 设置co排放量
     *
     * @param co co排放量
     */
    public void setCo(String co) {
        this.co = co;
    }

    /**
     * 获取pm10排放量
     *
     * @return pm10 - pm10排放量
     */
    public String getPm10() {
        return pm10;
    }

    /**
     * 设置pm10排放量
     *
     * @param pm10 pm10排放量
     */
    public void setPm10(String pm10) {
        this.pm10 = pm10;
    }

    /**
     * 获取pm2.5排放量
     *
     * @return pm25 - pm2.5排放量
     */
    public String getPm25() {
        return pm25;
    }

    /**
     * 设置pm2.5排放量
     *
     * @param pm25 pm2.5排放量
     */
    public void setPm25(String pm25) {
        this.pm25 = pm25;
    }

    /**
     * 获取voc排放量
     *
     * @return voc - voc排放量
     */
    public String getVoc() {
        return voc;
    }

    /**
     * 设置voc排放量
     *
     * @param voc voc排放量
     */
    public void setVoc(String voc) {
        this.voc = voc;
    }

    /**
     * 获取nh3排放量
     *
     * @return nh3 - nh3排放量
     */
    public String getNh3() {
        return nh3;
    }

    /**
     * 设置nh3排放量
     *
     * @param nh3 nh3排放量
     */
    public void setNh3(String nh3) {
        this.nh3 = nh3;
    }

    /**
     * 获取bc排放量
     *
     * @return bc - bc排放量
     */
    public String getBc() {
        return bc;
    }

    /**
     * 设置bc排放量
     *
     * @param bc bc排放量
     */
    public void setBc(String bc) {
        this.bc = bc;
    }

    /**
     * 获取oc排放量
     *
     * @return oc - oc排放量
     */
    public String getOc() {
        return oc;
    }

    /**
     * 设置oc排放量
     *
     * @param oc oc排放量
     */
    public void setOc(String oc) {
        this.oc = oc;
    }

    /**
     * 获取统计年份
     *
     * @return nf - 统计年份
     */
    public String getNf() {
        return nf;
    }

    /**
     * 设置统计年份
     *
     * @param nf 统计年份
     */
    public void setNf(String nf) {
        this.nf = nf;
    }

    /**
     * 获取删除状态：0未删除  1已删除
     *
     * @return deleted - 删除状态：0未删除  1已删除
     */
    public Byte getDeleted() {
        return deleted;
    }

    /**
     * 设置删除状态：0未删除  1已删除
     *
     * @param deleted 删除状态：0未删除  1已删除
     */
    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", address=").append(address);
        sb.append(", longitude=").append(longitude);
        sb.append(", latitude=").append(latitude);
        sb.append(", contactor=").append(contactor);
        sb.append(", phone=").append(phone);
        sb.append(", netName=").append(netName);
        sb.append(", netCode=").append(netCode);
        sb.append(", classId=").append(classId);
        sb.append(", className=").append(className);
        sb.append(", innerClassName=").append(innerClassName);
        sb.append(", so2=").append(so2);
        sb.append(", nox=").append(nox);
        sb.append(", co=").append(co);
        sb.append(", pm10=").append(pm10);
        sb.append(", pm25=").append(pm25);
        sb.append(", voc=").append(voc);
        sb.append(", nh3=").append(nh3);
        sb.append(", bc=").append(bc);
        sb.append(", oc=").append(oc);
        sb.append(", nf=").append(nf);
        sb.append(", deleted=").append(deleted);
        sb.append("]");
        return sb.toString();
    }
}