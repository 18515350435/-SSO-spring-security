package com.zc.api.model.resp.dacheng;

/**
 * @Description 同期变化率
 * @Auther: lx
 * @CreateTime: 2019/3/5
 * @Version: 0.0.1
 * @param: ${param}
 * @return: ${return}
 */
public class SamePeriodChangeRateResp {
    private int index;
    private String name;
    //综指
    private String complex;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComplex() {
        return complex;
    }

    public void setComplex(String complex) {
        this.complex = complex;
    }

    public String getComplex_rate() {
        return complex_rate;
    }

    public void setComplex_rate(String complex_rate) {
        this.complex_rate = complex_rate;
    }

    public String getPm25() {
        return pm25;
    }

    public void setPm25(String pm25) {
        this.pm25 = pm25;
    }

    public String getPm25_rate() {
        return pm25_rate;
    }

    public void setPm25_rate(String pm25_rate) {
        this.pm25_rate = pm25_rate;
    }

    public String getPm10() {
        return pm10;
    }

    public void setPm10(String pm10) {
        this.pm10 = pm10;
    }

    public String getPm10_rate() {
        return pm10_rate;
    }

    public void setPm10_rate(String pm10_rate) {
        this.pm10_rate = pm10_rate;
    }

    public String getSo2() {
        return so2;
    }

    public void setSo2(String so2) {
        this.so2 = so2;
    }

    public String getSo2_rate() {
        return so2_rate;
    }

    public void setSo2_rate(String so2_rate) {
        this.so2_rate = so2_rate;
    }

    public String getNo2() {
        return no2;
    }

    public void setNo2(String no2) {
        this.no2 = no2;
    }

    public String getNo2_rate() {
        return no2_rate;
    }

    public void setNo2_rate(String no2_rate) {
        this.no2_rate = no2_rate;
    }

    public String getCo() {
        return co;
    }

    public void setCo(String co) {
        this.co = co;
    }

    public String getCo_rate() {
        return co_rate;
    }

    public void setCo_rate(String co_rate) {
        this.co_rate = co_rate;
    }

    public String getO3() {
        return o3;
    }

    public void setO3(String o3) {
        this.o3 = o3;
    }

    public String getO3_rate() {
        return o3_rate;
    }

    public void setO3_rate(String o3_rate) {
        this.o3_rate = o3_rate;
    }

    //综指变化率
    private String complex_rate;
    private String pm25;
    private String pm25_rate;
    private String pm10;
    private String pm10_rate;
    private String so2;
    private String so2_rate;
    private String no2;
    private String no2_rate;
    private String co;
    private String co_rate;
    private String o3;
    private String o3_rate;

}
