package com.zc.biz.dao.models.dbOne.townstation;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "townstation_daydata_so2")
public class TownstationDaydataSo2 implements Serializable {
    @Id
    private String id;

    /**
     * so2排名
     */
    private String so2num;

    /**
     * 站点名称
     */
    private String so2title;

    /**
     * 所属区域id
     */
    private String so2aid;

    /**
     * 所属区域名称
     */
    private String so2aname;

    private String so2;

    private String so2level;

    private String so2date;

    private String maxdate;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
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
     * 获取so2排名
     *
     * @return so2num - so2排名
     */
    public String getSo2num() {
        return so2num;
    }

    /**
     * 设置so2排名
     *
     * @param so2num so2排名
     */
    public void setSo2num(String so2num) {
        this.so2num = so2num;
    }

    /**
     * 获取站点名称
     *
     * @return so2title - 站点名称
     */
    public String getSo2title() {
        return so2title;
    }

    /**
     * 设置站点名称
     *
     * @param so2title 站点名称
     */
    public void setSo2title(String so2title) {
        this.so2title = so2title;
    }

    /**
     * 获取所属区域id
     *
     * @return so2aid - 所属区域id
     */
    public String getSo2aid() {
        return so2aid;
    }

    /**
     * 设置所属区域id
     *
     * @param so2aid 所属区域id
     */
    public void setSo2aid(String so2aid) {
        this.so2aid = so2aid;
    }

    /**
     * 获取所属区域名称
     *
     * @return so2aname - 所属区域名称
     */
    public String getSo2aname() {
        return so2aname;
    }

    /**
     * 设置所属区域名称
     *
     * @param so2aname 所属区域名称
     */
    public void setSo2aname(String so2aname) {
        this.so2aname = so2aname;
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
     * @return so2level
     */
    public String getSo2level() {
        return so2level;
    }

    /**
     * @param so2level
     */
    public void setSo2level(String so2level) {
        this.so2level = so2level;
    }

    /**
     * @return so2date
     */
    public String getSo2date() {
        return so2date;
    }

    /**
     * @param so2date
     */
    public void setSo2date(String so2date) {
        this.so2date = so2date;
    }

    /**
     * @return maxdate
     */
    public String getMaxdate() {
        return maxdate;
    }

    /**
     * @param maxdate
     */
    public void setMaxdate(String maxdate) {
        this.maxdate = maxdate;
    }
    private String insertdate;
    public String getInsertdate() {
        return insertdate;
    }

    public void setInsertdate(String insertdate) {
        this.insertdate = insertdate;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", so2num=").append(so2num);
        sb.append(", so2title=").append(so2title);
        sb.append(", so2aid=").append(so2aid);
        sb.append(", so2aname=").append(so2aname);
        sb.append(", so2=").append(so2);
        sb.append(", so2level=").append(so2level);
        sb.append(", so2date=").append(so2date);
        sb.append(", maxdate=").append(maxdate);
        sb.append(", insertdate=").append(insertdate);
        sb.append("]");
        return sb.toString();
    }
}