package com.zc.api.model.resp.dacheng;

/**
 * @Description 天气预报model
 * @Auther: Administrator
 * @CreateTime: 2019/2/27
 * @Version: 0.0.1
 * @param: ${param}
 * @return: ${return}
 */
public class AirForcecastResp {
    private String temp;//温度

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getHump() {
        return hump;
    }

    public void setHump(String hump) {
        this.hump = hump;
    }

    public String getWindlevel() {
        return windlevel;
    }

    public void setWindlevel(String windlevel) {
        this.windlevel = windlevel;
    }

    public String getWinddirect() {
        return winddirect;
    }

    public void setWinddirect(String winddirect) {
        this.winddirect = winddirect;
    }

    public String getWindspeed() {
        return windspeed;
    }

    public void setWindspeed(String windspeed) {
        this.windspeed = windspeed;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    private String hump;//湿度
    private String windlevel;//风力
    private  String winddirect;//风向
    private String windspeed;//风速
    private String weather;//天气
}
