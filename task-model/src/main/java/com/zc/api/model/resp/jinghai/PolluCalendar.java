package com.zc.api.model.resp.jinghai;

import java.util.List;

/**
 * @Description 污染日历
 * @Auther: lx
 * @CreateTime: 2019/3/14
 * @Version: 0.0.1
 * @param: ${param}
 * @return: ${return}
 */
public class PolluCalendar {
    // 年份信息
    private YearInfo yearinfo ;

    public YearInfo getYearinfo() {
        return yearinfo;
    }

    public void setYearinfo(YearInfo yearinfo) {
        this.yearinfo = yearinfo;
    }

    public List<MonthInfo> getMonths() {
        return months;
    }

    public void setMonths(List<MonthInfo> months) {
        this.months = months;
    }

    //
    private List<MonthInfo> months ;
}



