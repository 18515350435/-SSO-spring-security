package com.zc.biz.dao.models.dbOne.yqd;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "special_gas_station")
public class SpecialGasStation implements Serializable {
    @Id
    private Integer id;

    /**
     * 原清单各企业基本属性表id
     */
    @Column(name = "pollutant_discharge_id")
    private String pollutantDischargeId;

    /**
     * 汽油销售量（万吨）
     */
    @Column(name = "gasoline_sales")
    private String gasolineSales;

    /**
     * 柴油销售量（万吨）
     */
    @Column(name = "diesel_sales")
    private String dieselSales;

    /**
     * 油气回收方式
     */
    @Column(name = "recovery_method")
    private String recoveryMethod;

    /**
     * 是否有在线监测,有，无，未知
     */
    @Column(name = "online_monitoring")
    private String onlineMonitoring;

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
     * 获取汽油销售量（万吨）
     *
     * @return gasoline_sales - 汽油销售量（万吨）
     */
    public String getGasolineSales() {
        return gasolineSales;
    }

    /**
     * 设置汽油销售量（万吨）
     *
     * @param gasolineSales 汽油销售量（万吨）
     */
    public void setGasolineSales(String gasolineSales) {
        this.gasolineSales = gasolineSales;
    }

    /**
     * 获取柴油销售量（万吨）
     *
     * @return diesel_sales - 柴油销售量（万吨）
     */
    public String getDieselSales() {
        return dieselSales;
    }

    /**
     * 设置柴油销售量（万吨）
     *
     * @param dieselSales 柴油销售量（万吨）
     */
    public void setDieselSales(String dieselSales) {
        this.dieselSales = dieselSales;
    }

    /**
     * 获取油气回收方式
     *
     * @return recovery_method - 油气回收方式
     */
    public String getRecoveryMethod() {
        return recoveryMethod;
    }

    /**
     * 设置油气回收方式
     *
     * @param recoveryMethod 油气回收方式
     */
    public void setRecoveryMethod(String recoveryMethod) {
        this.recoveryMethod = recoveryMethod;
    }

    /**
     * 获取是否有在线监测,有，无，未知
     *
     * @return online_monitoring - 是否有在线监测,有，无，未知
     */
    public String getOnlineMonitoring() {
        return onlineMonitoring;
    }

    /**
     * 设置是否有在线监测,有，无，未知
     *
     * @param onlineMonitoring 是否有在线监测,有，无，未知
     */
    public void setOnlineMonitoring(String onlineMonitoring) {
        this.onlineMonitoring = onlineMonitoring;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pollutantDischargeId=").append(pollutantDischargeId);
        sb.append(", gasolineSales=").append(gasolineSales);
        sb.append(", dieselSales=").append(dieselSales);
        sb.append(", recoveryMethod=").append(recoveryMethod);
        sb.append(", onlineMonitoring=").append(onlineMonitoring);
        sb.append("]");
        return sb.toString();
    }
}