package com.zc.api.model.resp.shenzhou;

import java.math.BigDecimal;

/**
 * @Description
 * @Auther: Administrator
 * @CreateTime: 2019/2/22
 * @Version: 0.0.1
 * @param: ${param}
 * @return: ${return}
 */
public class ShenZhouData {
    private String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public BigDecimal getPm25() {
        return pm25;
    }

    public void setPm25(BigDecimal pm25) {
        this.pm25 = pm25;
    }

    public BigDecimal getPm10() {
        return pm10;
    }

    public void setPm10(BigDecimal pm10) {
        this.pm10 = pm10;
    }

    public BigDecimal getSo2() {
        return so2;
    }

    public void setSo2(BigDecimal so2) {
        this.so2 = so2;
    }

    public BigDecimal getCo() {
        return co;
    }

    public void setCo(BigDecimal co) {
        this.co = co;
    }

    public BigDecimal getNo2() {
        return no2;
    }

    public void setNo2(BigDecimal no2) {
        this.no2 = no2;
    }

    public BigDecimal getO31() {
        return o31;
    }

    public void setO31(BigDecimal o31) {
        this.o31 = o31;
    }

    public BigDecimal getO38() {
        return o38;
    }

    public void setO38(BigDecimal o38) {
        this.o38 = o38;
    }

    private BigDecimal pm25;
    private BigDecimal pm10;
    private BigDecimal so2;
    private BigDecimal co;
    private BigDecimal no2;
    private BigDecimal o31;
    private BigDecimal o38;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}
