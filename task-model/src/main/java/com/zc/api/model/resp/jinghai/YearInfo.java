package com.zc.api.model.resp.jinghai;

/**
 * @Description
 * @Auther: Administrator
 * @CreateTime: 2019/3/15
 * @Version: 0.0.1
 * @param: ${param}
 * @return: ${return}
 */
public class YearInfo{
    // 年份
    private String year;
    // 污染天数统计

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public LevelCount getCount() {
        return count;
    }

    public void setCount(LevelCount count) {
        this.count = count;
    }

    private LevelCount count ;
}
