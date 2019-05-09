package com.zc.api.model.resp.sys;

import java.util.Date;

/**
 * @Description 预警信息管理
 * @Auther: lx
 * @CreateTime: 2019/3/20
 * @Version: 0.0.1
 * @param: ${param}
 * @return: ${return}
 */
public class WarningInfoResp {
    public String getWarninginfo() {
        return warninginfo;
    }

    public void setWarninginfo(String warninginfo) {
        this.warninginfo = warninginfo;
    }

    public String getWarninglevel() {
        return warninglevel;
    }

    public void setWarninglevel(String warninglevel) {
        this.warninglevel = warninglevel;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * 预警信息

     * */
    private String warninginfo;
    /**
     * 预警级别
     * */
    private String warninglevel;
    private Date starttime;
    private Date endtime;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
