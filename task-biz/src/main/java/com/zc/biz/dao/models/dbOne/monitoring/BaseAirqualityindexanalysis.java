package com.zc.biz.dao.models.dbOne.monitoring;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "base_airqualityindexanalysis")
public class BaseAirqualityindexanalysis implements Serializable {
    @Column(name = "Id")
    private Integer id;

    @Column(name = "MinValue")
    private Double minvalue;

    @Column(name = "MaxValue")
    private Double maxvalue;

    @Column(name = "Quality")
    private String quality;

    @Column(name = "StatusCode")
    private String statuscode;

    @Column(name = "IndexTypeCode")
    private String indextypecode;

    @Column(name = "Sys_Delete")
    private Byte sysDelete;

    private static final long serialVersionUID = 1L;

    /**
     * @return Id
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
     * @return MinValue
     */
    public Double getMinvalue() {
        return minvalue;
    }

    /**
     * @param minvalue
     */
    public void setMinvalue(Double minvalue) {
        this.minvalue = minvalue;
    }

    /**
     * @return MaxValue
     */
    public Double getMaxvalue() {
        return maxvalue;
    }

    /**
     * @param maxvalue
     */
    public void setMaxvalue(Double maxvalue) {
        this.maxvalue = maxvalue;
    }

    /**
     * @return Quality
     */
    public String getQuality() {
        return quality;
    }

    /**
     * @param quality
     */
    public void setQuality(String quality) {
        this.quality = quality;
    }

    /**
     * @return StatusCode
     */
    public String getStatuscode() {
        return statuscode;
    }

    /**
     * @param statuscode
     */
    public void setStatuscode(String statuscode) {
        this.statuscode = statuscode;
    }

    /**
     * @return IndexTypeCode
     */
    public String getIndextypecode() {
        return indextypecode;
    }

    /**
     * @param indextypecode
     */
    public void setIndextypecode(String indextypecode) {
        this.indextypecode = indextypecode;
    }

    /**
     * @return Sys_Delete
     */
    public Byte getSysDelete() {
        return sysDelete;
    }

    /**
     * @param sysDelete
     */
    public void setSysDelete(Byte sysDelete) {
        this.sysDelete = sysDelete;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", minvalue=").append(minvalue);
        sb.append(", maxvalue=").append(maxvalue);
        sb.append(", quality=").append(quality);
        sb.append(", statuscode=").append(statuscode);
        sb.append(", indextypecode=").append(indextypecode);
        sb.append(", sysDelete=").append(sysDelete);
        sb.append("]");
        return sb.toString();
    }
}