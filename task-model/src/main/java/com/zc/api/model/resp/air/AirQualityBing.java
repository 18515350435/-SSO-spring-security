package com.zc.api.model.resp.air;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

public class AirQualityBing implements Serializable {

    @ApiModelProperty(value = "扬尘")
    private Double yangchen=3.4;

    @ApiModelProperty(value = "生物质燃料")
    private Double shengwu=1.7;

    @ApiModelProperty(value = "汽车尾气")
    private Double qiche=26.4;

    @ApiModelProperty(value = "燃煤")
    private Double ranmei=26.2;

    @ApiModelProperty(value = "工业工艺")
    private Double gongye=13.6;

    @ApiModelProperty(value = "二次无机源")
    private Double erci=27.3;

    @ApiModelProperty(value = "其他")
    private Double qita=1.4;

    public Double getYangchen() {
        return yangchen;
    }

    public void setYangchen(Double yangchen) {
        this.yangchen = yangchen;
    }

    public Double getShengwu() {
        return shengwu;
    }

    public void setShengwu(Double shengwu) {
        this.shengwu = shengwu;
    }

    public Double getQiche() {
        return qiche;
    }

    public void setQiche(Double qiche) {
        this.qiche = qiche;
    }

    public Double getRanmei() {
        return ranmei;
    }

    public void setRanmei(Double ranmei) {
        this.ranmei = ranmei;
    }

    public Double getGongye() {
        return gongye;
    }

    public void setGongye(Double gongye) {
        this.gongye = gongye;
    }

    public Double getErci() {
        return erci;
    }

    public void setErci(Double erci) {
        this.erci = erci;
    }

    public Double getQita() {
        return qita;
    }

    public void setQita(Double qita) {
        this.qita = qita;
    }
}