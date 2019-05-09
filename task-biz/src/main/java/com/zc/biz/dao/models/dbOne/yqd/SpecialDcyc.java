package com.zc.biz.dao.models.dbOne.yqd;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "special_dcyc")
public class SpecialDcyc implements Serializable {
    @Id
    private Integer id;

    /**
     * 原清单各企业基本属性表id
     */
    @Column(name = "pollutant_discharge_id")
    private String pollutantDischargeId;

    /**
     * 堆场类型
     */
    private String dclx;

    /**
     * 备注:其他堆场类型
     */
    private String qtdclx;

    /**
     * 堆场材料
     */
    private String dccl;

    /**
     * 其他堆场材料
     */
    private String qtdccl;

    /**
     * 占地面积(平方米)
     */
    private String tlgy;

    /**
     * 最高高度(米)
     */
    private String tlxl;

    /**
     * 日常储存量(吨)
     */
    private String txgy;

    /**
     * 年物料运载车次(车)
     */
    private String txxl;

    /**
     * 单车运载量(吨/车)
     */
    private String ccgy;

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
     * 获取堆场类型
     *
     * @return dclx - 堆场类型
     */
    public String getDclx() {
        return dclx;
    }

    /**
     * 设置堆场类型
     *
     * @param dclx 堆场类型
     */
    public void setDclx(String dclx) {
        this.dclx = dclx;
    }

    /**
     * 获取备注:其他堆场类型
     *
     * @return qtdclx - 备注:其他堆场类型
     */
    public String getQtdclx() {
        return qtdclx;
    }

    /**
     * 设置备注:其他堆场类型
     *
     * @param qtdclx 备注:其他堆场类型
     */
    public void setQtdclx(String qtdclx) {
        this.qtdclx = qtdclx;
    }

    /**
     * 获取堆场材料
     *
     * @return dccl - 堆场材料
     */
    public String getDccl() {
        return dccl;
    }

    /**
     * 设置堆场材料
     *
     * @param dccl 堆场材料
     */
    public void setDccl(String dccl) {
        this.dccl = dccl;
    }

    /**
     * 获取其他堆场材料
     *
     * @return qtdccl - 其他堆场材料
     */
    public String getQtdccl() {
        return qtdccl;
    }

    /**
     * 设置其他堆场材料
     *
     * @param qtdccl 其他堆场材料
     */
    public void setQtdccl(String qtdccl) {
        this.qtdccl = qtdccl;
    }

    /**
     * 获取占地面积(平方米)
     *
     * @return tlgy - 占地面积(平方米)
     */
    public String getTlgy() {
        return tlgy;
    }

    /**
     * 设置占地面积(平方米)
     *
     * @param tlgy 占地面积(平方米)
     */
    public void setTlgy(String tlgy) {
        this.tlgy = tlgy;
    }

    /**
     * 获取最高高度(米)
     *
     * @return tlxl - 最高高度(米)
     */
    public String getTlxl() {
        return tlxl;
    }

    /**
     * 设置最高高度(米)
     *
     * @param tlxl 最高高度(米)
     */
    public void setTlxl(String tlxl) {
        this.tlxl = tlxl;
    }

    /**
     * 获取日常储存量(吨)
     *
     * @return txgy - 日常储存量(吨)
     */
    public String getTxgy() {
        return txgy;
    }

    /**
     * 设置日常储存量(吨)
     *
     * @param txgy 日常储存量(吨)
     */
    public void setTxgy(String txgy) {
        this.txgy = txgy;
    }

    /**
     * 获取年物料运载车次(车)
     *
     * @return txxl - 年物料运载车次(车)
     */
    public String getTxxl() {
        return txxl;
    }

    /**
     * 设置年物料运载车次(车)
     *
     * @param txxl 年物料运载车次(车)
     */
    public void setTxxl(String txxl) {
        this.txxl = txxl;
    }

    /**
     * 获取单车运载量(吨/车)
     *
     * @return ccgy - 单车运载量(吨/车)
     */
    public String getCcgy() {
        return ccgy;
    }

    /**
     * 设置单车运载量(吨/车)
     *
     * @param ccgy 单车运载量(吨/车)
     */
    public void setCcgy(String ccgy) {
        this.ccgy = ccgy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pollutantDischargeId=").append(pollutantDischargeId);
        sb.append(", dclx=").append(dclx);
        sb.append(", qtdclx=").append(qtdclx);
        sb.append(", dccl=").append(dccl);
        sb.append(", qtdccl=").append(qtdccl);
        sb.append(", tlgy=").append(tlgy);
        sb.append(", tlxl=").append(tlxl);
        sb.append(", txgy=").append(txgy);
        sb.append(", txxl=").append(txxl);
        sb.append(", ccgy=").append(ccgy);
        sb.append("]");
        return sb.toString();
    }
}