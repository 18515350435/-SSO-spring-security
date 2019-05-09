package com.zc.api.model.resp.EchartModel;

import java.util.List;


public class EChartPieModel{
    /// <summary>
    /// EchartX轴数据
    /// </summary>
    private List<String> legend;
    /// <summary>
    /// Echart图表数据
    /// </summary>
    private Series<ValueNameModel> seriesData;

    public List<String> getLegend() {
        return this.legend;
    }

    public void setLegend(List<String> legend) {
        this.legend = legend;
    }

    public Series<ValueNameModel> getSeriesData() {
        return this.seriesData;
    }

    public void setSeriesData(Series<ValueNameModel> seriesData) {
        this.seriesData = seriesData;
    }
}