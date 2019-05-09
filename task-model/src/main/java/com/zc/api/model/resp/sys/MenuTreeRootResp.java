package com.zc.api.model.resp.sys;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @Description
 * @Auther: Administrator
 * @CreateTime: 2019/4/30
 * @Version: 0.0.1
 * @param: ${param}
 * @return: ${return}
 */
public class MenuTreeRootResp {
    @ApiModelProperty("根目录id")
    private int id;
    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public List<MenuTree> getChild() {
        return child;
    }

    public void setChild(List<MenuTree> child) {
        this.child = child;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @ApiModelProperty(value = "根目录名称")

    private String root;
    @ApiModelProperty(value = "子菜单")
    private List<MenuTree> child;
}
