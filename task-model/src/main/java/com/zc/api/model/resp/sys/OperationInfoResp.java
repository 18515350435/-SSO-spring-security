package com.zc.api.model.resp.sys;

/**
 * @Description 运维信息列表返回类
 * @Auther: lx
 * @CreateTime: 2019/3/21
 * @Version: 0.0.1
 * @param: ${param}
 * @return: ${return}
 */
public class OperationInfoResp {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String devicename;
    private String checktime;

    public String getDevicename() {
        return devicename;
    }

    public void setDevicename(String devicename) {
        this.devicename = devicename;
    }

    public String getChecktime() {
        return checktime;
    }

    public void setChecktime(String checktime) {
        this.checktime = checktime;
    }

    public String getInserttime() {
        return inserttime;
    }

    public void setInserttime(String inserttime) {
        this.inserttime = inserttime;
    }

    private String inserttime;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    private String area;
}
