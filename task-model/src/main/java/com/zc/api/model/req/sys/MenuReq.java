package com.zc.api.model.req.sys;

import io.swagger.annotations.ApiModelProperty;

/**
 * @Description 添加菜单
 * @Auther: lx
 * @CreateTime: 2019/4/30
 * @Version: 0.0.1
 * @param: ${param}
 * @return: ${return}
 */
public class MenuReq {
    @ApiModelProperty(value = "菜单名称")
    private String menuname;

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public String getMenuurl() {
        return menuurl;
    }

    public void setMenuurl(String menuurl) {
        this.menuurl = menuurl;
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

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    @ApiModelProperty(value = "菜单url")
    private String menuurl;
    @ApiModelProperty(value = "父级id，根目录id=0")
    private int parentid;
    @ApiModelProperty(value = "菜单状态0-删除，1-启用，2-禁用")
    private int status;
    @ApiModelProperty(value = "排序")
    private int sort;

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @ApiModelProperty(value = "备注")
    private String remarks;
}
