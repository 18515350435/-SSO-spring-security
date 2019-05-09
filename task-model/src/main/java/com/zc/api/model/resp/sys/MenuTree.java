package com.zc.api.model.resp.sys;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @Description 菜单树
 * @Auther: lx
 * @CreateTime: 2019/4/30
 * @Version: 0.0.1
 * @param: ${param}
 * @return: ${return}
 */
public class MenuTree {
    @ApiModelProperty(value = "菜单id")
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public int getParentid() {
        return parentid;
    }

    public void setParentid(int parentid) {
        this.parentid = parentid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @ApiModelProperty(value = "菜单名称")

    private String menuname;
    @ApiModelProperty(value = "菜单url")
    private String menuurl;

    public List<MenuTree> getChild() {
        return child;
    }

    public void setChild(List<MenuTree> child) {
        this.child = child;
    }

    @ApiModelProperty(value = "菜单url(权限标识)")

    private int sort;
    @ApiModelProperty(value = "父菜单id,（前端处理添加按钮还是菜单时根据此字段判断，当id=0时可以创建下级菜单，当id!=0是只能创建按钮）")
    private int parentid;
    @ApiModelProperty(value = "菜单状态中文")
    private String status;
    @ApiModelProperty(value = "子菜单")
    private List<MenuTree> child;
}
