package com.zc.api.model.resp.sys;

/**
 * @Description 菜单按钮类
 * @Auther: wu
 * @CreateTime: 2019/4/30
 * @Version: 0.0.1
 * @param: ${param}
 * @return: ${return}
 */
public class MenuBtnName {

    private String menuname;
    private String btnname;
    private String btnnamediy;

    public String getMenuname() {
        return this.menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public String getBtnname() {
        return this.btnname;
    }

    public void setBtnname(String btnname) {
        this.btnname = btnname;
    }

    public String getBtnnamediy() {
        return this.btnnamediy;
    }

    public void setBtnnamediy(String btnnamediy) {
        this.btnnamediy = btnnamediy;
    }
}