package com.zc.api.model.resp.jinghai;

/**
 * @Description
 * @Auther: Administrator
 * @CreateTime: 2019/3/15
 * @Version: 0.0.1
 * @param: ${param}
 * @return: ${return}
 */
public class LevelCount{
    //优天数
    private int y_count  ;
    // 良天数
    private int l_count ;

    public int getY_count() {
        return y_count;
    }

    public void setY_count(int y_count) {
        this.y_count = y_count;
    }

    public int getL_count() {
        return l_count;
    }

    public void setL_count(int l_count) {
        this.l_count = l_count;
    }

    public int getQd_count() {
        return qd_count;
    }

    public void setQd_count(int qd_count) {
        this.qd_count = qd_count;
    }

    public int getZd_count() {
        return zd_count;
    }

    public void setZd_count(int zd_count) {
        this.zd_count = zd_count;
    }

    public int getZhd_count() {
        return zhd_count;
    }

    public void setZhd_count(int zhd_count) {
        this.zhd_count = zhd_count;
    }

    public int getYz_count() {
        return yz_count;
    }

    public void setYz_count(int yz_count) {
        this.yz_count = yz_count;
    }

    // 轻度天数
    private int qd_count  ;
    // 中度天数
    private int zd_count  ;
    // 重度天数
    private int zhd_count  ;
    // 严重天数
    private int yz_count  ;

}
