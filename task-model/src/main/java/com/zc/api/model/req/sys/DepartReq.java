package com.zc.api.model.req.sys;

import io.swagger.annotations.ApiModelProperty;

/**
 * @Description 部门类
 * @Auther: lx
 * @CreateTime: 2019/5/6
 * @Version: 0.0.1
 * @param: ${param}
 * @return: ${return}
 */
public class DepartReq {
    @ApiModelProperty(value = "部门名称")
    private String departname;
    @ApiModelProperty(value = "所属区域编码，可空")
    private String areacode;
    @ApiModelProperty(value = "上级部门id,无则传0")
    private int parentid;
    @ApiModelProperty(value = "部门状态0-删除，1-正常")
    private int status;

    public String getDepartname() {
        return departname;
    }

    public void setDepartname(String departname) {
        this.departname = departname;
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    public int getParentid() {
        return parentid;
    }

    public void setParentid(int parentid) {
        this.parentid = parentid;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
