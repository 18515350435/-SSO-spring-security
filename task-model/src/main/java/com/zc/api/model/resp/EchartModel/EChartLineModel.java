package com.zc.api.model.resp.EchartModel;

import java.util.List;


public class EChartLineModel{
    private List<String> xAxisData ;
        /// <summary>
        /// Echart图例
        /// </summary>
    private List<String> Legend ;
        /// <summary>
        /// Echart图表数据
        /// </summary>
    private List<Series<String>> seriesData ;

    public List<String> getXAxisData() {
        return this.xAxisData;
    }

    public void setXAxisData(List<String> xAxisData) {
        this.xAxisData = xAxisData;
    }

    public List<String> getLegend() {
        return this.Legend;
    }

    public void setLegend(List<String> Legend) {
        this.Legend = Legend;
    }

    public List<Series<String>> getSeriesData() {
        return this.seriesData;
    }

    public void setSeriesData(List<Series<String>> seriesData) {
        this.seriesData = seriesData;
    }
}