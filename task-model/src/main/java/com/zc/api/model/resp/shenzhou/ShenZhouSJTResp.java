package com.zc.api.model.resp.shenzhou;

import java.util.List;

/**
 * @Description 色阶图外壳
 * @Auther: lx
 * @CreateTime: 2019/2/27
 * @Version: 0.0.1
 * @param: ${param}
 * @return: ${return}
 */
public class ShenZhouSJTResp {
    private List<ShenZhouDataResp> data;

    public List<ShenZhouDataResp> getData() {
        return data;
    }

    public void setData(List<ShenZhouDataResp> data) {
        this.data = data;
    }
}
