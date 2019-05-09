package com.zc.api.model.resp.county;

import java.math.BigDecimal;

/**
 * @Description
 * @Auther: liuxu
 * @CreateTime: 2019/1/9
 * @Version: 0.0.1
 * @param: ${param}
 * @return: ${return}
 */
public class CountyHour {
    private String datatime;
    private BigDecimal aqi;

    public String getDatatime() {
        return datatime;
    }

    public void setDatatime(String datatime) {
        this.datatime = datatime;
    }

    public BigDecimal getAqi() {
        return aqi;
    }

    public void setAqi(BigDecimal aqi) {
        this.aqi = aqi;
    }

    public BigDecimal getSo2() {
        return so2;
    }

    public void setSo2(BigDecimal so2) {
        this.so2 = so2;
    }

    public BigDecimal getNo2() {
        return no2;
    }

    public void setNo2(BigDecimal no2) {
        this.no2 = no2;
    }

    public BigDecimal getCo() {
        return co;
    }

    public void setCo(BigDecimal co) {
        this.co = co;
    }

    public BigDecimal getO31h() {
        return o31h;
    }

    public void setO31h(BigDecimal o31h) {
        this.o31h = o31h;
    }

    public BigDecimal getO38h() {
        return o38h;
    }

    public void setO38h(BigDecimal o38h) {
        this.o38h = o38h;
    }

    public BigDecimal getPm10() {
        return pm10;
    }

    public void setPm10(BigDecimal pm10) {
        this.pm10 = pm10;
    }

    public BigDecimal getPm25() {
        return pm25;
    }

    public void setPm25(BigDecimal pm25) {
        this.pm25 = pm25;
    }

    public String getComplexIndex() {
        return complexIndex;
    }

    public void setComplexIndex(String complexIndex) {
        this.complexIndex = complexIndex;
    }

    public String getGridname() {
        return gridname;
    }

    public void setGridname(String gridname) {
        this.gridname = gridname;
    }

    public String getGridcode() {
        return gridcode;
    }

    public void setGridcode(String gridcode) {
        this.gridcode = gridcode;
    }

    private BigDecimal so2;
    private BigDecimal no2;
    private BigDecimal co;
    private BigDecimal o31h;
    private BigDecimal o38h;
    private BigDecimal pm10;
    private BigDecimal pm25;
    //综合指数
    private String complexIndex;
    //区县名称
    private String gridname;
    //区县网格编号
    private String gridcode;
}
