package com.zc.api.model.resp.jinghai;

import java.util.List;

/**
 * @Description
 * @Auther: Administrator
 * @CreateTime: 2019/3/15
 * @Version: 0.0.1
 * @param: ${param}
 * @return: ${return}
 */
public class MonthInfo {
    // 月份
    private String month ;
    // 污染天数统计

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public LevelCount getCount() {
        return count;
    }

    public void setCount(LevelCount count) {
        this.count = count;
    }

    public List<DayInfo> getDays() {
        return days;
    }

    public void setDays(List<DayInfo> days) {
        this.days = days;
    }

    private LevelCount count ;
    // 日数据集合
    private List<DayInfo> days ;
}
