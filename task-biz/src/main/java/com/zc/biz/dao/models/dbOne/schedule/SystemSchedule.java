package com.zc.biz.dao.models.dbOne.schedule;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "system_schedule")
public class SystemSchedule implements Serializable {
    @Column(name = "Id")
    private String id;

    @Column(name = "UserId")
    private Long userid;

    @Column(name = "SendId")
    private Long sendid;

    @Column(name = "Title")
    private String title;

    @Column(name = "SendTime")
    private Date sendtime;

    @Column(name = "Content")
    private String content;

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
     * @return UserId
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
     * @return SendId
     */
    public Long getSendid() {
        return sendid;
    }

    /**
     * @param sendid
     */
    public void setSendid(Long sendid) {
        this.sendid = sendid;
    }

    /**
     * @return Title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return SendTime
     */
    public Date getSendtime() {
        return sendtime;
    }

    /**
     * @param sendtime
     */
    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    /**
     * @return Content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userid=").append(userid);
        sb.append(", sendid=").append(sendid);
        sb.append(", title=").append(title);
        sb.append(", sendtime=").append(sendtime);
        sb.append(", content=").append(content);
        sb.append("]");
        return sb.toString();
    }
}