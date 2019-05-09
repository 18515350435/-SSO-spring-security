package com.zc.biz.dao.models.dbOne.townstation;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "townstation_realtimedata")
public class TownstationRealtimedata implements Serializable {
    /**
     * 主键id
     */
    @Id
    private String id;

    /**
     * 排名
     */
    private String num;

    private String num1;

    /**
     * 站点名称
     */
    private String title;

    /**
     * 经度
     */
    private String lng;

    /**
     * 纬度
     */
    private String lat;

    /**
     * 所属区县编号
     */
    private String aid;

    /**
     * 所属区县名称
     */
    private String aname;

    /**
     * pm2.5值
     */
    private String pm25;

    /**
     * pm2.5等级
     */
    private String pm25level;

    /**
     * so2值
     */
    private String so2;

    /**
     * so2等级
     */
    private String so2level;

    /**
     * 日期
     */
    private String date;

    /**
     * 最大日期
     */
    private String maxdate;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取排名
     *
     * @return num - 排名
     */
    public String getNum() {
        return num;
    }

    /**
     * 设置排名
     *
     * @param num 排名
     */
    public void setNum(String num) {
        this.num = num;
    }

    /**
     * @return num1
     */
    public String getNum1() {
        return num1;
    }

    /**
     * @param num1
     */
    public void setNum1(String num1) {
        this.num1 = num1;
    }

    /**
     * 获取站点名称
     *
     * @return title - 站点名称
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置站点名称
     *
     * @param title 站点名称
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取经度
     *
     * @return lng - 经度
     */
    public String getLng() {
        return lng;
    }

    /**
     * 设置经度
     *
     * @param lng 经度
     */
    public void setLng(String lng) {
        this.lng = lng;
    }

    /**
     * 获取纬度
     *
     * @return lat - 纬度
     */
    public String getLat() {
        return lat;
    }

    /**
     * 设置纬度
     *
     * @param lat 纬度
     */
    public void setLat(String lat) {
        this.lat = lat;
    }

    /**
     * 获取所属区县编号
     *
     * @return aid - 所属区县编号
     */
    public String getAid() {
        return aid;
    }

    /**
     * 设置所属区县编号
     *
     * @param aid 所属区县编号
     */
    public void setAid(String aid) {
        this.aid = aid;
    }

    /**
     * 获取所属区县名称
     *
     * @return aname - 所属区县名称
     */
    public String getAname() {
        return aname;
    }

    /**
     * 设置所属区县名称
     *
     * @param aname 所属区县名称
     */
    public void setAname(String aname) {
        this.aname = aname;
    }

    /**
     * 获取pm2.5值
     *
     * @return pm25 - pm2.5值
     */
    public String getPm25() {
        return pm25;
    }

    /**
     * 设置pm2.5值
     *
     * @param pm25 pm2.5值
     */
    public void setPm25(String pm25) {
        this.pm25 = pm25;
    }

    /**
     * 获取pm2.5等级
     *
     * @return pm25level - pm2.5等级
     */
    public String getPm25level() {
        return pm25level;
    }

    /**
     * 设置pm2.5等级
     *
     * @param pm25level pm2.5等级
     */
    public void setPm25level(String pm25level) {
        this.pm25level = pm25level;
    }

    /**
     * 获取so2值
     *
     * @return so2 - so2值
     */
    public String getSo2() {
        return so2;
    }

    /**
     * 设置so2值
     *
     * @param so2 so2值
     */
    public void setSo2(String so2) {
        this.so2 = so2;
    }

    /**
     * 获取so2等级
     *
     * @return so2level - so2等级
     */
    public String getSo2level() {
        return so2level;
    }

    /**
     * 设置so2等级
     *
     * @param so2level so2等级
     */
    public void setSo2level(String so2level) {
        this.so2level = so2level;
    }

    /**
     * 获取日期
     *
     * @return date - 日期
     */
    public String  getDate() {
        return date;
    }

    /**
     * 设置日期
     *
     * @param date 日期
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * 获取最大日期
     *
     * @return maxdate - 最大日期
     */
    public String getMaxdate() {
        return maxdate;
    }

    /**
     * 设置最大日期
     *
     * @param maxdate 最大日期
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
        sb.append(", num=").append(num);
        sb.append(", num1=").append(num1);
        sb.append(", title=").append(title);
        sb.append(", lng=").append(lng);
        sb.append(", lat=").append(lat);
        sb.append(", aid=").append(aid);
        sb.append(", aname=").append(aname);
        sb.append(", pm25=").append(pm25);
        sb.append(", pm25level=").append(pm25level);
        sb.append(", so2=").append(so2);
        sb.append(", so2level=").append(so2level);
        sb.append(", date=").append(date);
        sb.append(", maxdate=").append(maxdate);
        sb.append(", insertdate=").append(insertdate);
        sb.append("]");
        return sb.toString();
    }
}