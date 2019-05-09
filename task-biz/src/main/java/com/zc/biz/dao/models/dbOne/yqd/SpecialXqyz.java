package com.zc.biz.dao.models.dbOne.yqd;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "special_xqyz")
public class SpecialXqyz implements Serializable {
    @Id
    private Integer id;

    /**
     * 原清单各企业基本属性表id
     */
    @Column(name = "pollutant_discharge_id")
    private String pollutantDischargeId;

    /**
     * 奶牛存栏量
     */
    @Column(name = "cun_nui")
    private String cunNui;

    /**
     * 母猪存栏量
     */
    @Column(name = "cun_zhu")
    private String cunZhu;

    /**
     * 马存栏量
     */
    @Column(name = "cun_ma")
    private String cunMa;

    /**
     * 驴存栏量
     */
    @Column(name = "cun_lv")
    private String cunLv;

    /**
     * 骡存栏量
     */
    @Column(name = "cun_luo")
    private String cunLuo;

    /**
     * 骆驼存栏量
     */
    @Column(name = "cun_luotuo")
    private String cunLuotuo;

    /**
     * 蛋鸡存栏量
     */
    @Column(name = "cun_ji")
    private String cunJi;

    /**
     * 蛋鸭存栏量
     */
    @Column(name = "cun_ya")
    private String cunYa;

    /**
     * 蛋鹅存栏量
     */
    @Column(name = "cun_e")
    private String cunE;

    /**
     * 肉鸡出栏量
     */
    @Column(name = "chu_ji")
    private String chuJi;

    /**
     * 肉鸭出栏量
     */
    @Column(name = "chu_ya")
    private String chuYa;

    /**
     * 肉鹅出栏量
     */
    @Column(name = "chu_e")
    private String chuE;

    /**
     * 肉牛出栏量
     */
    @Column(name = "chu_niu")
    private String chuNiu;

    /**
     * 肉猪出栏量
     */
    @Column(name = "chu_zhu")
    private String chuZhu;

    /**
     * 山羊出栏量
     */
    @Column(name = "chu_shanyang")
    private String chuShanyang;

    /**
     * 绵羊出栏量
     */
    @Column(name = "chu_mianyang")
    private String chuMianyang;

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
     * 获取原清单各企业基本属性表id
     *
     * @return pollutant_discharge_id - 原清单各企业基本属性表id
     */
    public String getPollutantDischargeId() {
        return pollutantDischargeId;
    }

    /**
     * 设置原清单各企业基本属性表id
     *
     * @param pollutantDischargeId 原清单各企业基本属性表id
     */
    public void setPollutantDischargeId(String pollutantDischargeId) {
        this.pollutantDischargeId = pollutantDischargeId;
    }

    /**
     * 获取奶牛存栏量
     *
     * @return cun_nui - 奶牛存栏量
     */
    public String getCunNui() {
        return cunNui;
    }

    /**
     * 设置奶牛存栏量
     *
     * @param cunNui 奶牛存栏量
     */
    public void setCunNui(String cunNui) {
        this.cunNui = cunNui;
    }

    /**
     * 获取母猪存栏量
     *
     * @return cun_zhu - 母猪存栏量
     */
    public String getCunZhu() {
        return cunZhu;
    }

    /**
     * 设置母猪存栏量
     *
     * @param cunZhu 母猪存栏量
     */
    public void setCunZhu(String cunZhu) {
        this.cunZhu = cunZhu;
    }

    /**
     * 获取马存栏量
     *
     * @return cun_ma - 马存栏量
     */
    public String getCunMa() {
        return cunMa;
    }

    /**
     * 设置马存栏量
     *
     * @param cunMa 马存栏量
     */
    public void setCunMa(String cunMa) {
        this.cunMa = cunMa;
    }

    /**
     * 获取驴存栏量
     *
     * @return cun_lv - 驴存栏量
     */
    public String getCunLv() {
        return cunLv;
    }

    /**
     * 设置驴存栏量
     *
     * @param cunLv 驴存栏量
     */
    public void setCunLv(String cunLv) {
        this.cunLv = cunLv;
    }

    /**
     * 获取骡存栏量
     *
     * @return cun_luo - 骡存栏量
     */
    public String getCunLuo() {
        return cunLuo;
    }

    /**
     * 设置骡存栏量
     *
     * @param cunLuo 骡存栏量
     */
    public void setCunLuo(String cunLuo) {
        this.cunLuo = cunLuo;
    }

    /**
     * 获取骆驼存栏量
     *
     * @return cun_luotuo - 骆驼存栏量
     */
    public String getCunLuotuo() {
        return cunLuotuo;
    }

    /**
     * 设置骆驼存栏量
     *
     * @param cunLuotuo 骆驼存栏量
     */
    public void setCunLuotuo(String cunLuotuo) {
        this.cunLuotuo = cunLuotuo;
    }

    /**
     * 获取蛋鸡存栏量
     *
     * @return cun_ji - 蛋鸡存栏量
     */
    public String getCunJi() {
        return cunJi;
    }

    /**
     * 设置蛋鸡存栏量
     *
     * @param cunJi 蛋鸡存栏量
     */
    public void setCunJi(String cunJi) {
        this.cunJi = cunJi;
    }

    /**
     * 获取蛋鸭存栏量
     *
     * @return cun_ya - 蛋鸭存栏量
     */
    public String getCunYa() {
        return cunYa;
    }

    /**
     * 设置蛋鸭存栏量
     *
     * @param cunYa 蛋鸭存栏量
     */
    public void setCunYa(String cunYa) {
        this.cunYa = cunYa;
    }

    /**
     * 获取蛋鹅存栏量
     *
     * @return cun_e - 蛋鹅存栏量
     */
    public String getCunE() {
        return cunE;
    }

    /**
     * 设置蛋鹅存栏量
     *
     * @param cunE 蛋鹅存栏量
     */
    public void setCunE(String cunE) {
        this.cunE = cunE;
    }

    /**
     * 获取肉鸡出栏量
     *
     * @return chu_ji - 肉鸡出栏量
     */
    public String getChuJi() {
        return chuJi;
    }

    /**
     * 设置肉鸡出栏量
     *
     * @param chuJi 肉鸡出栏量
     */
    public void setChuJi(String chuJi) {
        this.chuJi = chuJi;
    }

    /**
     * 获取肉鸭出栏量
     *
     * @return chu_ya - 肉鸭出栏量
     */
    public String getChuYa() {
        return chuYa;
    }

    /**
     * 设置肉鸭出栏量
     *
     * @param chuYa 肉鸭出栏量
     */
    public void setChuYa(String chuYa) {
        this.chuYa = chuYa;
    }

    /**
     * 获取肉鹅出栏量
     *
     * @return chu_e - 肉鹅出栏量
     */
    public String getChuE() {
        return chuE;
    }

    /**
     * 设置肉鹅出栏量
     *
     * @param chuE 肉鹅出栏量
     */
    public void setChuE(String chuE) {
        this.chuE = chuE;
    }

    /**
     * 获取肉牛出栏量
     *
     * @return chu_niu - 肉牛出栏量
     */
    public String getChuNiu() {
        return chuNiu;
    }

    /**
     * 设置肉牛出栏量
     *
     * @param chuNiu 肉牛出栏量
     */
    public void setChuNiu(String chuNiu) {
        this.chuNiu = chuNiu;
    }

    /**
     * 获取肉猪出栏量
     *
     * @return chu_zhu - 肉猪出栏量
     */
    public String getChuZhu() {
        return chuZhu;
    }

    /**
     * 设置肉猪出栏量
     *
     * @param chuZhu 肉猪出栏量
     */
    public void setChuZhu(String chuZhu) {
        this.chuZhu = chuZhu;
    }

    /**
     * 获取山羊出栏量
     *
     * @return chu_shanyang - 山羊出栏量
     */
    public String getChuShanyang() {
        return chuShanyang;
    }

    /**
     * 设置山羊出栏量
     *
     * @param chuShanyang 山羊出栏量
     */
    public void setChuShanyang(String chuShanyang) {
        this.chuShanyang = chuShanyang;
    }

    /**
     * 获取绵羊出栏量
     *
     * @return chu_mianyang - 绵羊出栏量
     */
    public String getChuMianyang() {
        return chuMianyang;
    }

    /**
     * 设置绵羊出栏量
     *
     * @param chuMianyang 绵羊出栏量
     */
    public void setChuMianyang(String chuMianyang) {
        this.chuMianyang = chuMianyang;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pollutantDischargeId=").append(pollutantDischargeId);
        sb.append(", cunNui=").append(cunNui);
        sb.append(", cunZhu=").append(cunZhu);
        sb.append(", cunMa=").append(cunMa);
        sb.append(", cunLv=").append(cunLv);
        sb.append(", cunLuo=").append(cunLuo);
        sb.append(", cunLuotuo=").append(cunLuotuo);
        sb.append(", cunJi=").append(cunJi);
        sb.append(", cunYa=").append(cunYa);
        sb.append(", cunE=").append(cunE);
        sb.append(", chuJi=").append(chuJi);
        sb.append(", chuYa=").append(chuYa);
        sb.append(", chuE=").append(chuE);
        sb.append(", chuNiu=").append(chuNiu);
        sb.append(", chuZhu=").append(chuZhu);
        sb.append(", chuShanyang=").append(chuShanyang);
        sb.append(", chuMianyang=").append(chuMianyang);
        sb.append("]");
        return sb.toString();
    }
}