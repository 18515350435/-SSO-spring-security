package com.zc.biz.dao.models.dbOne.air;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "air_qualityjinghaicountyhour")
public class AirQualityjinghaicountyhour implements Serializable {
    /**
     * ����id
     */
    private String id;

    /**
     * ��������
     */
    private String areaname;

    private Float so2;

    private Float no2;

    private Float co;

    private Float pm25;

    private Float pm10;

    private Float o3;

    @Column(name = "so2_24h")
    private Float so224h;

    @Column(name = "no2_24h")
    private Float no224h;

    @Column(name = "co_24h")
    private Float co24h;

    @Column(name = "pm25_24h")
    private Float pm2524h;

    @Column(name = "pm10_24h")
    private Float pm1024h;

    @Column(name = "o3_8h")
    private Float o38h;

    private Float aqi;

    /**
     * 1~6���š����������Ⱦ���ж���Ⱦ���ض���Ⱦ��������Ⱦ
     */
    private Integer level;

    /**
     * ��Ҫ��Ⱦ��
     */
    private String mainpoll;

    /**
     * ���ʱ��
     */
    private Date monitortime;

    /**
     * ���ݲ���ʱ��
     */
    private Date inserttime;

    private static final long serialVersionUID = 1L;

    /**
     * ��ȡ����id
     *
     * @return id - ����id
     */
    public String getId() {
        return id;
    }

    /**
     * ��������id
     *
     * @param id ����id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * ��ȡ��������
     *
     * @return areaname - ��������
     */
    public String getAreaname() {
        return areaname;
    }

    /**
     * ������������
     *
     * @param areaname ��������
     */
    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }

    /**
     * @return so2
     */
    public Float getSo2() {
        return so2;
    }

    /**
     * @param so2
     */
    public void setSo2(Float so2) {
        this.so2 = so2;
    }

    /**
     * @return no2
     */
    public Float getNo2() {
        return no2;
    }

    /**
     * @param no2
     */
    public void setNo2(Float no2) {
        this.no2 = no2;
    }

    /**
     * @return co
     */
    public Float getCo() {
        return co;
    }

    /**
     * @param co
     */
    public void setCo(Float co) {
        this.co = co;
    }

    /**
     * @return pm25
     */
    public Float getPm25() {
        return pm25;
    }

    /**
     * @param pm25
     */
    public void setPm25(Float pm25) {
        this.pm25 = pm25;
    }

    /**
     * @return pm10
     */
    public Float getPm10() {
        return pm10;
    }

    /**
     * @param pm10
     */
    public void setPm10(Float pm10) {
        this.pm10 = pm10;
    }

    /**
     * @return o3
     */
    public Float getO3() {
        return o3;
    }

    /**
     * @param o3
     */
    public void setO3(Float o3) {
        this.o3 = o3;
    }

    /**
     * @return so2_24h
     */
    public Float getSo224h() {
        return so224h;
    }

    /**
     * @param so224h
     */
    public void setSo224h(Float so224h) {
        this.so224h = so224h;
    }

    /**
     * @return no2_24h
     */
    public Float getNo224h() {
        return no224h;
    }

    /**
     * @param no224h
     */
    public void setNo224h(Float no224h) {
        this.no224h = no224h;
    }

    /**
     * @return co_24h
     */
    public Float getCo24h() {
        return co24h;
    }

    /**
     * @param co24h
     */
    public void setCo24h(Float co24h) {
        this.co24h = co24h;
    }

    /**
     * @return pm25_24h
     */
    public Float getPm2524h() {
        return pm2524h;
    }

    /**
     * @param pm2524h
     */
    public void setPm2524h(Float pm2524h) {
        this.pm2524h = pm2524h;
    }

    /**
     * @return pm10_24h
     */
    public Float getPm1024h() {
        return pm1024h;
    }

    /**
     * @param pm1024h
     */
    public void setPm1024h(Float pm1024h) {
        this.pm1024h = pm1024h;
    }

    /**
     * @return o3_8h
     */
    public Float getO38h() {
        return o38h;
    }

    /**
     * @param o38h
     */
    public void setO38h(Float o38h) {
        this.o38h = o38h;
    }

    /**
     * @return aqi
     */
    public Float getAqi() {
        return aqi;
    }

    /**
     * @param aqi
     */
    public void setAqi(Float aqi) {
        this.aqi = aqi;
    }

    /**
     * ��ȡ1~6���š����������Ⱦ���ж���Ⱦ���ض���Ⱦ��������Ⱦ
     *
     * @return level - 1~6���š����������Ⱦ���ж���Ⱦ���ض���Ⱦ��������Ⱦ
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * ����1~6���š����������Ⱦ���ж���Ⱦ���ض���Ⱦ��������Ⱦ
     *
     * @param level 1~6���š����������Ⱦ���ж���Ⱦ���ض���Ⱦ��������Ⱦ
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * ��ȡ��Ҫ��Ⱦ��
     *
     * @return mainpoll - ��Ҫ��Ⱦ��
     */
    public String getMainpoll() {
        return mainpoll;
    }

    /**
     * ������Ҫ��Ⱦ��
     *
     * @param mainpoll ��Ҫ��Ⱦ��
     */
    public void setMainpoll(String mainpoll) {
        this.mainpoll = mainpoll;
    }

    /**
     * ��ȡ���ʱ��
     *
     * @return monitortime - ���ʱ��
     */
    public Date getMonitortime() {
        return monitortime;
    }

    /**
     * ���ü��ʱ��
     *
     * @param monitortime ���ʱ��
     */
    public void setMonitortime(Date monitortime) {
        this.monitortime = monitortime;
    }

    /**
     * ��ȡ���ݲ���ʱ��
     *
     * @return inserttime - ���ݲ���ʱ��
     */
    public Date getInserttime() {
        return inserttime;
    }

    /**
     * �������ݲ���ʱ��
     *
     * @param inserttime ���ݲ���ʱ��
     */
    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", areaname=").append(areaname);
        sb.append(", so2=").append(so2);
        sb.append(", no2=").append(no2);
        sb.append(", co=").append(co);
        sb.append(", pm25=").append(pm25);
        sb.append(", pm10=").append(pm10);
        sb.append(", o3=").append(o3);
        sb.append(", so224h=").append(so224h);
        sb.append(", no224h=").append(no224h);
        sb.append(", co24h=").append(co24h);
        sb.append(", pm2524h=").append(pm2524h);
        sb.append(", pm1024h=").append(pm1024h);
        sb.append(", o38h=").append(o38h);
        sb.append(", aqi=").append(aqi);
        sb.append(", level=").append(level);
        sb.append(", mainpoll=").append(mainpoll);
        sb.append(", monitortime=").append(monitortime);
        sb.append(", inserttime=").append(inserttime);
        sb.append("]");
        return sb.toString();
    }
}