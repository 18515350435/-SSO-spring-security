package com.zc.biz.dao.models.dbOne.electric;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Electricinfo implements Serializable {
    @Column(name = "Id")
    private String id;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date time;

    /**
     * 固安县
     */
    private String ga;

    /**
     * 安次区
     */
    private String ac;

    /**
     * 开发区
     */
    private String kf;

    /**
     * 广阳区
     */
    private String gy;

    /**
     * 永清县
     */
    private String yq;

    /**
     * 香河县
     */
    private String xh;

    /**
     * 大成县
     */
    private String dcheng;

    /**
     * 文安县
     */
    private String wa;

    /**
     * 大厂县
     */
    private String dchang;

    /**
     * 霸州市
     */
    private String bz;

    /**
     * 三河
     */
    private String sh;

    private static final long serialVersionUID = 1L;

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

    /**
     * @return time
     */
    public Date getTime() {
        return time;
    }

    /**
     * @param time
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 获取固安县
     *
     * @return ga - 固安县
     */
    public String getGa() {
        return ga;
    }

    /**
     * 设置固安县
     *
     * @param ga 固安县
     */
    public void setGa(String ga) {
        this.ga = ga;
    }

    /**
     * 获取安次区
     *
     * @return ac - 安次区
     */
    public String getAc() {
        return ac;
    }

    /**
     * 设置安次区
     *
     * @param ac 安次区
     */
    public void setAc(String ac) {
        this.ac = ac;
    }

    /**
     * 获取开发区
     *
     * @return kf - 开发区
     */
    public String getKf() {
        return kf;
    }

    /**
     * 设置开发区
     *
     * @param kf 开发区
     */
    public void setKf(String kf) {
        this.kf = kf;
    }

    /**
     * 获取广阳区
     *
     * @return gy - 广阳区
     */
    public String getGy() {
        return gy;
    }

    /**
     * 设置广阳区
     *
     * @param gy 广阳区
     */
    public void setGy(String gy) {
        this.gy = gy;
    }

    /**
     * 获取永清县
     *
     * @return yq - 永清县
     */
    public String getYq() {
        return yq;
    }

    /**
     * 设置永清县
     *
     * @param yq 永清县
     */
    public void setYq(String yq) {
        this.yq = yq;
    }

    /**
     * 获取香河县
     *
     * @return xh - 香河县
     */
    public String getXh() {
        return xh;
    }

    /**
     * 设置香河县
     *
     * @param xh 香河县
     */
    public void setXh(String xh) {
        this.xh = xh;
    }

    /**
     * 获取大成县
     *
     * @return dcheng - 大成县
     */
    public String getDcheng() {
        return dcheng;
    }

    /**
     * 设置大成县
     *
     * @param dcheng 大成县
     */
    public void setDcheng(String dcheng) {
        this.dcheng = dcheng;
    }

    /**
     * 获取文安县
     *
     * @return wa - 文安县
     */
    public String getWa() {
        return wa;
    }

    /**
     * 设置文安县
     *
     * @param wa 文安县
     */
    public void setWa(String wa) {
        this.wa = wa;
    }

    /**
     * 获取大厂县
     *
     * @return dchang - 大厂县
     */
    public String getDchang() {
        return dchang;
    }

    /**
     * 设置大厂县
     *
     * @param dchang 大厂县
     */
    public void setDchang(String dchang) {
        this.dchang = dchang;
    }

    /**
     * 获取霸州市
     *
     * @return bz - 霸州市
     */
    public String getBz() {
        return bz;
    }

    /**
     * 设置霸州市
     *
     * @param bz 霸州市
     */
    public void setBz(String bz) {
        this.bz = bz;
    }

    /**
     * 获取三河
     *
     * @return sh - 三河
     */
    public String getSh() {
        return sh;
    }

    /**
     * 设置三河
     *
     * @param sh 三河
     */
    public void setSh(String sh) {
        this.sh = sh;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", time=").append(time);
        sb.append(", ga=").append(ga);
        sb.append(", ac=").append(ac);
        sb.append(", kf=").append(kf);
        sb.append(", gy=").append(gy);
        sb.append(", yq=").append(yq);
        sb.append(", xh=").append(xh);
        sb.append(", dcheng=").append(dcheng);
        sb.append(", wa=").append(wa);
        sb.append(", dchang=").append(dchang);
        sb.append(", bz=").append(bz);
        sb.append(", sh=").append(sh);
        sb.append("]");
        return sb.toString();
    }
}