package com.zc.biz.dao.models.dbOne.air;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "base_complexindexlimit")
public class BaseComplexindexlimit implements Serializable {
    @Column(name = "Id")
    private String id;

    @Column(name = "SO2")
    private Integer so2;

    @Column(name = "NO2")
    private Integer no2;

    @Column(name = "CO")
    private Integer co;

    @Column(name = "O3")
    private Integer o3;

    @Column(name = "PM10")
    private Integer pm10;

    @Column(name = "PM25")
    private Integer pm25;

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
     * @return SO2
     */
    public Integer getSo2() {
        return so2;
    }

    /**
     * @param so2
     */
    public void setSo2(Integer so2) {
        this.so2 = so2;
    }

    /**
     * @return NO2
     */
    public Integer getNo2() {
        return no2;
    }

    /**
     * @param no2
     */
    public void setNo2(Integer no2) {
        this.no2 = no2;
    }

    /**
     * @return CO
     */
    public Integer getCo() {
        return co;
    }

    /**
     * @param co
     */
    public void setCo(Integer co) {
        this.co = co;
    }

    /**
     * @return O3
     */
    public Integer getO3() {
        return o3;
    }

    /**
     * @param o3
     */
    public void setO3(Integer o3) {
        this.o3 = o3;
    }

    /**
     * @return PM10
     */
    public Integer getPm10() {
        return pm10;
    }

    /**
     * @param pm10
     */
    public void setPm10(Integer pm10) {
        this.pm10 = pm10;
    }

    /**
     * @return PM2.5
     */
    public Integer getPm25() {
        return pm25;
    }

    /**
     * @param pm2.5
     */
    public void setPm25(Integer pm25) {
        this.pm25 = pm25;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", so2=").append(so2);
        sb.append(", no2=").append(no2);
        sb.append(", co=").append(co);
        sb.append(", o3=").append(o3);
        sb.append(", pm10=").append(pm10);
        sb.append(", pm25=").append(pm25);
        sb.append("]");
        return sb.toString();
    }
}