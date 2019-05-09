package com.zc.web;

import com.zc.web.filter.MyStringArgumentResolver;
import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

@EnableScheduling
@EnableTransactionManagement
@EnableAutoConfiguration
//@EnableWebMvc
@EnableAsync
@SpringBootApplication
@ServletComponentScan
@ComponentScan(basePackages = { "com.zc" })
public class Application extends WebMvcConfigurerAdapter  {
  private static final Logger logger = LoggerFactory.getLogger(Application.class);

  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {

//    registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");

    registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
  }
  @Override public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
    argumentResolvers.add(new MyStringArgumentResolver());
    super.addArgumentResolvers(argumentResolvers);
  }

  @Bean
  public MethodValidationPostProcessor methodValidationPostProcessor() {  
    return new MethodValidationPostProcessor();
  }
  
  @Bean(name = "encryptorBean")
  public StringEncryptor stringEncryptor() {
    PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
    SimpleStringPBEConfig config = new SimpleStringPBEConfig();
    config.setPassword("bAxfuJBOB^Yni68B");
    config.setAlgorithm("PBEWithMD5AndDES");
    config.setKeyObtentionIterations("1000");
    config.setPoolSize("1");
    config.setProviderName("SunJCE");
    config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
    config.setStringOutputType("base64");
    encryptor.setConfig(config);
    return encryptor;
  }

  public static void main(String[] args) {

    logger.info("\r\n=====================start=====================");
    new SpringApplicationBuilder().sources(Application.class).run(args);
    logger.info("\r\n=====================started=====================");
  }

}
