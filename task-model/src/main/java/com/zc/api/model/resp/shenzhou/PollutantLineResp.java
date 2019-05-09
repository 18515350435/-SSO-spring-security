package com.zc.api.model.resp.shenzhou;

import java.util.List;

import com.zc.api.model.resp.LineSerie;

public class PollutantLineResp{
    private List<String> xaxis;
    private List<String> legend;
    private List<LineSerie> series;

    public List<String> getXaxis() {
        return this.xaxis;
    }

    public void setXaxis(List<String> xaxis) {
        this.xaxis = xaxis;
    }

    public List<String> getLegend() {
        return this.legend;
    }

    public void setLegend(List<String> legend) {
        this.legend = legend;
    }

    public List<LineSerie> getSeries() {
        return this.series;
    }

    public void setSeries(List<LineSerie> series) {
        this.series = series;
    }
}