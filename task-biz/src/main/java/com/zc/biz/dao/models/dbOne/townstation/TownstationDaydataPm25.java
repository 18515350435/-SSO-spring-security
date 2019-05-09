package com.zc.biz.dao.models.dbOne.townstation;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "townstation_daydata_pm25")
public class TownstationDaydataPm25 implements Serializable {
    @Id
    private String id;

    /**
     * 排名
     */
    private String pm25num;

    /**
     * 站点名称
     */
    private String pm25title;

    /**
     * 所属区域id
     */
    private String pm25aid;

    /**
     * 所属区域名称
     */
    private String pm25aname;

    private String pm25;

    private String pm25level;

    private String pm25date;

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
     * 获取排名
     *
     * @return pm25num - 排名
     */
    public String getPm25num() {
        return pm25num;
    }

    /**
     * 设置排名
     *
     * @param pm25num 排名
     */
    public void setPm25num(String pm25num) {
        this.pm25num = pm25num;
    }

    /**
     * 获取站点名称
     *
     * @return pm25title - 站点名称
     */
    public String getPm25title() {
        return pm25title;
    }

    /**
     * 设置站点名称
     *
     * @param pm25title 站点名称
     */
    public void setPm25title(String pm25title) {
        this.pm25title = pm25title;
    }

    /**
     * 获取所属区域id
     *
     * @return pm25aid - 所属区域id
     */
    public String getPm25aid() {
        return pm25aid;
    }

    /**
     * 设置所属区域id
     *
     * @param pm25aid 所属区域id
     */
    public void setPm25aid(String pm25aid) {
        this.pm25aid = pm25aid;
    }

    /**
     * 获取所属区域名称
     *
     * @return pm25aname - 所属区域名称
     */
    public String getPm25aname() {
        return pm25aname;
    }

    /**
     * 设置所属区域名称
     *
     * @param pm25aname 所属区域名称
     */
    public void setPm25aname(String pm25aname) {
        this.pm25aname = pm25aname;
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
     * @return pm25level
     */
    public String getPm25level() {
        return pm25level;
    }

    /**
     * @param pm25level
     */
    public void setPm25level(String pm25level) {
        this.pm25level = pm25level;
    }

    /**
     * @return pm25date
     */
    public String getPm25date() {
        return pm25date;
    }

    /**
     * @param pm25date
     */
    public void setPm25date(String pm25date) {
        this.pm25date = pm25date;
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
        sb.append(", pm25num=").append(pm25num);
        sb.append(", pm25title=").append(pm25title);
        sb.append(", pm25aid=").append(pm25aid);
        sb.append(", pm25aname=").append(pm25aname);
        sb.append(", pm25=").append(pm25);
        sb.append(", pm25level=").append(pm25level);
        sb.append(", pm25date=").append(pm25date);
        sb.append(", maxdate=").append(maxdate);
        sb.append(", insertdate=").append(insertdate);
        sb.append("]");
        return sb.toString();
    }
}