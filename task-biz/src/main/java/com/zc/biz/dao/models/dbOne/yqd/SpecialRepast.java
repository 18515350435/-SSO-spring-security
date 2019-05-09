package com.zc.biz.dao.models.dbOne.yqd;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "special_repast")
public class SpecialRepast implements Serializable {
    @Id
    private Integer id;

    /**
     * 原清单各企业基本属性表id
     */
    @Column(name = "pollutant_discharge_id")
    private String pollutantDischargeId;

    /**
     * 油烟净化设施
     */
    @Column(name = "purification_facility")
    private String purificationFacility;

    /**
     * 油烟去除效率（%）
     */
    @Column(name = "removal_efficiency")
    private String removalEfficiency;

    /**
     * 燃料类型
     */
    @Column(name = "fuel_type")
    private String fuelType;

    /**
     * 燃料年消耗量
     */
    @Column(name = "annual_usage")
    private String annualUsage;

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
     * 获取油烟净化设施
     *
     * @return purification_facility - 油烟净化设施
     */
    public String getPurificationFacility() {
        return purificationFacility;
    }

    /**
     * 设置油烟净化设施
     *
     * @param purificationFacility 油烟净化设施
     */
    public void setPurificationFacility(String purificationFacility) {
        this.purificationFacility = purificationFacility;
    }

    /**
     * 获取油烟去除效率（%）
     *
     * @return removal_efficiency - 油烟去除效率（%）
     */
    public String getRemovalEfficiency() {
        return removalEfficiency;
    }

    /**
     * 设置油烟去除效率（%）
     *
     * @param removalEfficiency 油烟去除效率（%）
     */
    public void setRemovalEfficiency(String removalEfficiency) {
        this.removalEfficiency = removalEfficiency;
    }

    /**
     * 获取燃料类型
     *
     * @return fuel_type - 燃料类型
     */
    public String getFuelType() {
        return fuelType;
    }

    /**
     * 设置燃料类型
     *
     * @param fuelType 燃料类型
     */
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    /**
     * 获取燃料年消耗量
     *
     * @return annual_usage - 燃料年消耗量
     */
    public String getAnnualUsage() {
        return annualUsage;
    }

    /**
     * 设置燃料年消耗量
     *
     * @param annualUsage 燃料年消耗量
     */
    public void setAnnualUsage(String annualUsage) {
        this.annualUsage = annualUsage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pollutantDischargeId=").append(pollutantDischargeId);
        sb.append(", purificationFacility=").append(purificationFacility);
        sb.append(", removalEfficiency=").append(removalEfficiency);
        sb.append(", fuelType=").append(fuelType);
        sb.append(", annualUsage=").append(annualUsage);
        sb.append("]");
        return sb.toString();
    }
}