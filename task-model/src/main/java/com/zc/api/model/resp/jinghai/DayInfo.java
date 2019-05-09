package com.zc.api.model.resp.jinghai;

/**
 * @Description
 * @Auther: Administrator
 * @CreateTime: 2019/3/15
 * @Version: 0.0.1
 * @param: ${param}
 * @return: ${return}
 */
public class DayInfo{
    // 日信息 yyyy-mm-dd
    private String day;
    private String aqi;
    private String aqic;
    private String o3 ;
    private String o3c ;

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getAqi() {
        return aqi;
    }

    public void setAqi(String aqi) {
        this.aqi = aqi;
    }

    public String getO3() {
        return o3;
    }

    public void setO3(String o3) {
        this.o3 = o3;
    }

    public String getNo2() {
        return no2;
    }

    public void setNo2(String no2) {
        this.no2 = no2;
    }

    public String getSo2() {
        return so2;
    }

    public void setSo2(String so2) {
        this.so2 = so2;
    }

    public String getPm25() {
        return pm25;
    }

    public void setPm25(String pm25) {
        this.pm25 = pm25;
    }

    public String getPm10() {
        return pm10;
    }

    public void setPm10(String pm10) {
        this.pm10 = pm10;
    }

    public String getCo() {
        return co;
    }

    public void setCo(String co) {
        this.co = co;
    }

    private String no2 ;
    private String no2c;
    private String so2 ;
    private String so2c ;
    private String pm25 ;

    public String getAqic() {
        return aqic;
    }

    public void setAqic(String aqic) {
        this.aqic = aqic;
    }

    public String getO3c() {
        return o3c;
    }

    public void setO3c(String o3c) {
        this.o3c = o3c;
    }

    public String getNo2c() {
        return no2c;
    }

    public void setNo2c(String no2c) {
        this.no2c = no2c;
    }

    public String getSo2c() {
        return so2c;
    }

    public void setSo2c(String so2c) {
        this.so2c = so2c;
    }

    public String getPm25c() {
        return pm25c;
    }

    public void setPm25c(String pm25c) {
        this.pm25c = pm25c;
    }

    public String getPm10c() {
        return pm10c;
    }

    public void setPm10c(String pm10c) {
        this.pm10c = pm10c;
    }

    public String getCoc() {
        return coc;
    }

    public void setCoc(String coc) {
        this.coc = coc;
    }

    private String pm25c ;
    private String pm10;
    private String pm10c;
    private String co ;
    private String coc ;
}
