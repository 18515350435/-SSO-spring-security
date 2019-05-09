package com.zc.web.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
 
/**
 * Created by viking on 2018/09/01
 * 系统常量配置类
 */
@Component
@ConfigurationProperties(prefix = "server")
public class SystemConfig {
 
    private static String contextpath;

    public String getContextpath() {
        return this.contextpath;
    }

    public void setContextpath(String contextpath) {
        this.contextpath = contextpath;
    }

    
}