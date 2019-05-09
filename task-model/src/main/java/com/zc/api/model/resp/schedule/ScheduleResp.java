package com.zc.api.model.resp.schedule;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;


public class ScheduleResp{

    private String id;
    private String title;
    private String content;
    private String username;
    private String sendname;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date sendtime;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSendname() {
        return this.sendname;
    }

    public void setSendname(String sendname) {
        this.sendname = sendname;
    }

    public Date getSendtime() {
        return this.sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }
}