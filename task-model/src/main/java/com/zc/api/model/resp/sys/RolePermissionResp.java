package com.zc.api.model.resp.sys;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class RolePermissionResp {
    @ApiModelProperty(value = "菜单ID")
    private String menuId;
    @ApiModelProperty(value = "菜单名称")
    private String menuname;
    @ApiModelProperty(value = "按钮id")
    private String menubtnId;
    @ApiModelProperty(value = "按钮名称")
    private String buttonname;
    @ApiModelProperty(value = "当前角色是否拥有此权限 0未拥有 1已拥有")
    private String isHave;
    @ApiModelProperty(value = "否拥已是最后一级的菜单了 0不是 1是")
    private String isLastMenu="0";
    @ApiModelProperty(value = "子集菜单或按钮")
    private List<RolePermissionResp> respList;

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getIsLastMenu() {
        return isLastMenu;
    }

    public void setIsLastMenu(String isLastMenu) {
        this.isLastMenu = isLastMenu;
    }

    public List<RolePermissionResp> getRespList() {
        return respList;
    }

    public void setRespList(List<RolePermissionResp> respList) {
        this.respList = respList;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public String getMenubtnId() {
        return menubtnId;
    }

    public void setMenubtnId(String menubtnId) {
        this.menubtnId = menubtnId;
    }

    public String getButtonname() {
        return buttonname;
    }

    public void setButtonname(String buttonname) {
        this.buttonname = buttonname;
    }

    public String getIsHave() {
        return isHave;
    }

    public void setIsHave(String isHave) {
        this.isHave = isHave;
    }
}
