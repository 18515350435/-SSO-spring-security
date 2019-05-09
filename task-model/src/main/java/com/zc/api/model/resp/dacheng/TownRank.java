package com.zc.api.model.resp.dacheng;

/**
 * @Description
 * @Auther: lx
 * @CreateTime: 2019/3/12
 * @Version: 0.0.1
 * @param: ${param}
 * @return: ${return}
 */
public class TownRank {
    private String title;
    private String aname;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public double getPm25() {
        return pm25;
    }

    public void setPm25(double pm25) {
        this.pm25 = pm25;
    }

    public double getSo2() {
        return so2;
    }

    public void setSo2(double so2) {
        this.so2 = so2;
    }

    public double getComindex() {
        return comindex;
    }

    public void setComindex(double comindex) {
        this.comindex = comindex;
    }

    private double pm25;
    private double so2;
    private double comindex;

}
