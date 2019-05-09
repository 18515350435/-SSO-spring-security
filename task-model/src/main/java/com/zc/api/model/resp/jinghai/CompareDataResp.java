package com.zc.api.model.resp.jinghai;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;

@ApiModel(value = "静海区县同期变化率数据实体")
public class CompareDataResp {

    @ApiModelProperty("区县名称")
    private String cityname;
    private Double aqi;
    private Double pm25;
    private Double pm10;
    private Double so2;
    private Double no2;
    private Double co;
    private Double o3;
    @ApiModelProperty("综合指数")
    private Double comindex;
    @ApiModelProperty("综合指数同期变化率")
    private String comindex_rate;
    private String pm25_rate;
    private String pm10_rate;
    private String so2_rate;
    private String no2_rate;
    private String co_rate;
    private String o3_rate;

    public String getComindex_rate() {
        return comindex_rate;
    }

    public void setComindex_rate(String comindex_rate) {
        this.comindex_rate = comindex_rate;
    }

    public String getPm25_rate() {
        return pm25_rate;
    }

    public void setPm25_rate(String pm25_rate) {
        this.pm25_rate = pm25_rate;
    }

    public String getPm10_rate() {
        return pm10_rate;
    }

    public void setPm10_rate(String pm10_rate) {
        this.pm10_rate = pm10_rate;
    }

    public String getSo2_rate() {
        return so2_rate;
    }

    public void setSo2_rate(String so2_rate) {
        this.so2_rate = so2_rate;
    }

    public String getNo2_rate() {
        return no2_rate;
    }

    public void setNo2_rate(String no2_rate) {
        this.no2_rate = no2_rate;
    }

    public String getCo_rate() {
        return co_rate;
    }

    public void setCo_rate(String co_rate) {
        this.co_rate = co_rate;
    }

    public String getO3_rate() {
        return o3_rate;
    }

    public void setO3_rate(String o3_rate) {
        this.o3_rate = o3_rate;
    }

    public String getCityname() {
        return this.cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public Double getAqi() {
        return this.aqi;
    }

    public void setAqi(Double aqi) {
        this.aqi = aqi;
    }

    public Double getPm25() {
        return this.pm25;
    }

    public void setPm25(Double pm25) {
        this.pm25 = pm25;
    }

    public Double getPm10() {
        return this.pm10;
    }

    public void setPm10(Double pm10) {
        this.pm10 = pm10;
    }

    public Double getSo2() {
        return this.so2;
    }

    public void setSo2(Double so2) {
        this.so2 = so2;
    }

    public Double getNo2() {
        return this.no2;
    }

    public void setNo2(Double no2) {
        this.no2 = no2;
    }

    public Double getCo() {
        return this.co;
    }

    public void setCo(Double co) {
        this.co = co;
    }

    public Double getO3() {
        return this.o3;
    }

    public void setO3(Double o3) {
        this.o3 = o3;
    }

    public Double getComindex() {
        return this.comindex;
    }

    public void setComindex(Double comindex) {
        this.comindex = comindex;
    }
}
