package com.zc.biz.dao.models.dbOne.user;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_staffattendance")
public class SysStaffattendance implements Serializable {
    @Id
    @Column(name = "Id")
    private String id;

    @Column(name = "userId")
    private Long userid;

    @Column(name = "statusCode")
    private Boolean statuscode;

    @Column(name = "recordTime")
    private Date recordtime;

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
     * @return userId
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * @return statusCode
     */
    public Boolean getStatuscode() {
        return statuscode;
    }

    /**
     * @param statuscode
     */
    public void setStatuscode(Boolean statuscode) {
        this.statuscode = statuscode;
    }

    /**
     * @return recordTime
     */
    public Date getRecordtime() {
        return recordtime;
    }

    /**
     * @param recordtime
     */
    public void setRecordtime(Date recordtime) {
        this.recordtime = recordtime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userid=").append(userid);
        sb.append(", statuscode=").append(statuscode);
        sb.append(", recordtime=").append(recordtime);
        sb.append("]");
        return sb.toString();
    }
}