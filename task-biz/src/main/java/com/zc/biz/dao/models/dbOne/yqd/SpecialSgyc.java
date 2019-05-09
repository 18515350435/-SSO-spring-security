package com.zc.biz.dao.models.dbOne.yqd;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "special_sgyc")
public class SpecialSgyc implements Serializable {
    @Id
    private Integer id;

    /**
     * 原清单各企业基本属性表id
     */
    @Column(name = "pollutant_discharge_id")
    private String pollutantDischargeId;

    /**
     * 工程进度
     */
    private String gcjd;

    /**
     * 占地面积(平方米)
     */
    private String zdmj;

    /**
     * 建筑面积(平方米)
     */
    private String jzmj;

    /**
     * 硬化道路面积(平方米)
     */
    private String yhdlmj;

    /**
     * 裸土面积(平方米)
     */
    private String ltmj;

    /**
     * 防尘措施
     */
    private String fccs;

    /**
     * 现场巡查照片
     */
    private String xcxczp;

    /**
     * 更新时间
     */
    private String gxsj;

    /**
     * 是否有在线监测
     */
    private String sfyzxjc;

    /**
     * 是否有视频监控
     */
    private String sfyjk;

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
     * 获取工程进度
     *
     * @return gcjd - 工程进度
     */
    public String getGcjd() {
        return gcjd;
    }

    /**
     * 设置工程进度
     *
     * @param gcjd 工程进度
     */
    public void setGcjd(String gcjd) {
        this.gcjd = gcjd;
    }

    /**
     * 获取占地面积(平方米)
     *
     * @return zdmj - 占地面积(平方米)
     */
    public String getZdmj() {
        return zdmj;
    }

    /**
     * 设置占地面积(平方米)
     *
     * @param zdmj 占地面积(平方米)
     */
    public void setZdmj(String zdmj) {
        this.zdmj = zdmj;
    }

    /**
     * 获取建筑面积(平方米)
     *
     * @return jzmj - 建筑面积(平方米)
     */
    public String getJzmj() {
        return jzmj;
    }

    /**
     * 设置建筑面积(平方米)
     *
     * @param jzmj 建筑面积(平方米)
     */
    public void setJzmj(String jzmj) {
        this.jzmj = jzmj;
    }

    /**
     * 获取硬化道路面积(平方米)
     *
     * @return yhdlmj - 硬化道路面积(平方米)
     */
    public String getYhdlmj() {
        return yhdlmj;
    }

    /**
     * 设置硬化道路面积(平方米)
     *
     * @param yhdlmj 硬化道路面积(平方米)
     */
    public void setYhdlmj(String yhdlmj) {
        this.yhdlmj = yhdlmj;
    }

    /**
     * 获取裸土面积(平方米)
     *
     * @return ltmj - 裸土面积(平方米)
     */
    public String getLtmj() {
        return ltmj;
    }

    /**
     * 设置裸土面积(平方米)
     *
     * @param ltmj 裸土面积(平方米)
     */
    public void setLtmj(String ltmj) {
        this.ltmj = ltmj;
    }

    /**
     * 获取防尘措施
     *
     * @return fccs - 防尘措施
     */
    public String getFccs() {
        return fccs;
    }

    /**
     * 设置防尘措施
     *
     * @param fccs 防尘措施
     */
    public void setFccs(String fccs) {
        this.fccs = fccs;
    }

    /**
     * 获取现场巡查照片
     *
     * @return xcxczp - 现场巡查照片
     */
    public String getXcxczp() {
        return xcxczp;
    }

    /**
     * 设置现场巡查照片
     *
     * @param xcxczp 现场巡查照片
     */
    public void setXcxczp(String xcxczp) {
        this.xcxczp = xcxczp;
    }

    /**
     * 获取更新时间
     *
     * @return gxsj - 更新时间
     */
    public String getGxsj() {
        return gxsj;
    }

    /**
     * 设置更新时间
     *
     * @param gxsj 更新时间
     */
    public void setGxsj(String gxsj) {
        this.gxsj = gxsj;
    }

    /**
     * 获取是否有在线监测
     *
     * @return sfyzxjc - 是否有在线监测
     */
    public String getSfyzxjc() {
        return sfyzxjc;
    }

    /**
     * 设置是否有在线监测
     *
     * @param sfyzxjc 是否有在线监测
     */
    public void setSfyzxjc(String sfyzxjc) {
        this.sfyzxjc = sfyzxjc;
    }

    /**
     * 获取是否有视频监控
     *
     * @return sfyjk - 是否有视频监控
     */
    public String getSfyjk() {
        return sfyjk;
    }

    /**
     * 设置是否有视频监控
     *
     * @param sfyjk 是否有视频监控
     */
    public void setSfyjk(String sfyjk) {
        this.sfyjk = sfyjk;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pollutantDischargeId=").append(pollutantDischargeId);
        sb.append(", gcjd=").append(gcjd);
        sb.append(", zdmj=").append(zdmj);
        sb.append(", jzmj=").append(jzmj);
        sb.append(", yhdlmj=").append(yhdlmj);
        sb.append(", ltmj=").append(ltmj);
        sb.append(", fccs=").append(fccs);
        sb.append(", xcxczp=").append(xcxczp);
        sb.append(", gxsj=").append(gxsj);
        sb.append(", sfyzxjc=").append(sfyzxjc);
        sb.append(", sfyjk=").append(sfyjk);
        sb.append("]");
        return sb.toString();
    }
}