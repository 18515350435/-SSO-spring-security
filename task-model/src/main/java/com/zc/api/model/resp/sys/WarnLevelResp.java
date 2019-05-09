package com.zc.api.model.resp.sys;

/**
 * @Description 预警级别
 * @Auther: lx
 * @CreateTime: 2019/3/20
 * @Version: 0.0.1
 * @param: ${param}
 * @return: ${return}
 */
public class WarnLevelResp {
    private String waringname;
    private String warningcode;

    public String getWaringname() {
        return waringname;
    }

    public void setWaringname(String waringname) {
        this.waringname = waringname;
    }

    public String getWarningcode() {
        return warningcode;
    }

    public void setWarningcode(String warningcode) {
        this.warningcode = warningcode;
    }
}
