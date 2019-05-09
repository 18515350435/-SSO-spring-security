package com.zc.api.model.resp.sys;

import io.swagger.annotations.ApiModelProperty;

/**
 * @Description 菜单按钮类
 * @Auther: lx
 * @CreateTime: 2019/4/30
 * @Version: 0.0.1
 * @param: ${param}
 * @return: ${return}
 */
public class MenuBtnResp {
    public int getBtnid() {
        return btnid;
    }

    public void setBtnid(int btnid) {
        this.btnid = btnid;
    }

    public String getBtnname() {
        return btnname;
    }

    public void setBtnname(String btnname) {
        this.btnname = btnname;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    @ApiModelProperty("按钮id")

    private int btnid;
    @ApiModelProperty("按钮名称")
    private String btnname;
    @ApiModelProperty("按钮选择状态")
    private boolean selected;
}
