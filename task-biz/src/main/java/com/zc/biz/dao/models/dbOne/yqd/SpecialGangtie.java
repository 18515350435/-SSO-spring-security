package com.zc.biz.dao.models.dbOne.yqd;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.List;

@Table(name = "special_gangtie")
public class SpecialGangtie implements Serializable {
    @Id
    private Integer id;

    /**
     * 原清单各企业基本属性表id
     */
    @Column(name = "pollutant_discharge_id")
    private String pollutantDischargeId;

    /**
     * 锅炉数(台)
     */
    @Column(name = "boilers_number")
    private String boilersNumber;

    /**
     * 锅炉总蒸吨数(吨/小时)
     */
    @Column(name = "total_ton")
    private String totalTon;
    @Transient
    private List<SpecialGangtieProcessSub> processSub;

    private static final long serialVersionUID = 1L;

    public List<SpecialGangtieProcessSub> getProcessSub() {
        return processSub;
    }

    public void setProcessSub(List<SpecialGangtieProcessSub> processSub) {
        this.processSub = processSub;
    }

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
     * 获取锅炉数(台)
     *
     * @return boilers_number - 锅炉数(台)
     */
    public String getBoilersNumber() {
        return boilersNumber;
    }

    /**
     * 设置锅炉数(台)
     *
     * @param boilersNumber 锅炉数(台)
     */
    public void setBoilersNumber(String boilersNumber) {
        this.boilersNumber = boilersNumber;
    }

    /**
     * 获取锅炉总蒸吨数(吨/小时)
     *
     * @return total_ton - 锅炉总蒸吨数(吨/小时)
     */
    public String getTotalTon() {
        return totalTon;
    }

    /**
     * 设置锅炉总蒸吨数(吨/小时)
     *
     * @param totalTon 锅炉总蒸吨数(吨/小时)
     */
    public void setTotalTon(String totalTon) {
        this.totalTon = totalTon;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pollutantDischargeId=").append(pollutantDischargeId);
        sb.append(", boilersNumber=").append(boilersNumber);
        sb.append(", totalTon=").append(totalTon);
        sb.append("]");
        return sb.toString();
    }
}