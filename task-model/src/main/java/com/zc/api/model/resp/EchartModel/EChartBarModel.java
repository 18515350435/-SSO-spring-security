package com.zc.api.model.resp.EchartModel;

import java.util.List;

public class EChartBarModel{
    /// <summary>
    /// EchartX轴数据
    /// </summary>
    private List<String> xAxisData;
    /// <summary>
    /// Echart图表数据
    /// </summary>
    private List<Series<String>> seriesData;

    public List<String> getXAxisData() {
        return this.xAxisData;
    }

    public void setXAxisData(List<String> xAxisData) {
        this.xAxisData = xAxisData;
    }

    public List<Series<String>> getSeriesData() {
        return this.seriesData;
    }

    public void setSeriesData(List<Series<String>> seriesData) {
        this.seriesData = seriesData;
    }
}