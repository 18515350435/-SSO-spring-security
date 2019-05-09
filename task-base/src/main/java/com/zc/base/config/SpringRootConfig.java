package com.zc.base.config;

import com.zc.base.util.SpringContextHolder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;


@Configuration
public class SpringRootConfig {
	
	@Bean
    @Lazy(value = false)
    @Scope(value = "singleton")
    public SpringContextHolder SpringContextHolderMethod(){
        // spring容器静态引用(scope="singleton"为单例配置)
        return new SpringContextHolder();
    }

}
