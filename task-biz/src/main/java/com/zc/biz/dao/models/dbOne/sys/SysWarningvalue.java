package com.zc.biz.dao.models.dbOne.sys;

import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "sys_warningvalue")
public class SysWarningvalue implements Serializable {
    private Integer id;

    private String pm25;

    private String pm10;

    private String so2;

    private String o3;

    private String no2;

    private String co;

    private Date inserttime;

    /**
     * 所属区域
     */
    private String area;

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
     * @return pm25
     */
    public String getPm25() {
        return pm25;
    }

    /**
     * @param pm25
     */
    public void setPm25(String pm25) {
        this.pm25 = pm25;
    }

    /**
     * @return pm10
     */
    public String getPm10() {
        return pm10;
    }

    /**
     * @param pm10
     */
    public void setPm10(String pm10) {
        this.pm10 = pm10;
    }

    /**
     * @return so2
     */
    public String getSo2() {
        return so2;
    }

    /**
     * @param so2
     */
    public void setSo2(String so2) {
        this.so2 = so2;
    }

    /**
     * @return o3
     */
    public String getO3() {
        return o3;
    }

    /**
     * @param o3
     */
    public void setO3(String o3) {
        this.o3 = o3;
    }

    /**
     * @return no2
     */
    public String getNo2() {
        return no2;
    }

    /**
     * @param no2
     */
    public void setNo2(String no2) {
        this.no2 = no2;
    }

    /**
     * @return co
     */
    public String getCo() {
        return co;
    }

    /**
     * @param co
     */
    public void setCo(String co) {
        this.co = co;
    }

    /**
     * @return inserttime
     */
    public Date getInserttime() {
        return inserttime;
    }

    /**
     * @param inserttime
     */
    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
    }

    /**
     * 获取所属区域
     *
     * @return area - 所属区域
     */
    public String getArea() {
        return area;
    }

    /**
     * 设置所属区域
     *
     * @param area 所属区域
     */
    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pm25=").append(pm25);
        sb.append(", pm10=").append(pm10);
        sb.append(", so2=").append(so2);
        sb.append(", o3=").append(o3);
        sb.append(", no2=").append(no2);
        sb.append(", co=").append(co);
        sb.append(", inserttime=").append(inserttime);
        sb.append(", area=").append(area);
        sb.append("]");
        return sb.toString();
    }
}