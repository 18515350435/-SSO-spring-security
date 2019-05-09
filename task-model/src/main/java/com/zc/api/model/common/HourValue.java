package com.zc.api.model.common;

/**
 * @Description
 * @Auther: Administrator
 * @CreateTime: 2019/1/4
 * @Version: 0.0.1
 * @param: ${param}
 * @return: ${return}
 */
public class HourValue  implements Comparable<HourValue> {
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    //时间信息，比如2表示2点
    private int hour;
    //浓度值
    private String value;

//新增一个比较方法，获取hour值为某个数是否存在
    public boolean compare(int i){
        if (this.getHour()==i){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int compareTo(HourValue o) {
        try {
            return this.getHour() - o.getHour();
        }catch (Exception e){
            return -1;
        }
    }
}
