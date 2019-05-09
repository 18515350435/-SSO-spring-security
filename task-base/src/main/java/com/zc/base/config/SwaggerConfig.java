package com.zc.base.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

  /**
   * 可以定义多个组，比如本类中定义把base和task区分开了 （访问页面就可以看到效果了）
   * 根据basePackage显示不同路径的controller
   */

  private ApiInfo apiInfo() {
    return new ApiInfoBuilder().title("香河智慧城市") // 大标题
        .description("香河智慧城市数据接口") // 详细描述
        .termsOfServiceUrl("") // NO terms of user
        .version("0.0.1") // 版本号
        .build();
  }
//
//  private ApiInfo apiInfo02() {
//    return new ApiInfoBuilder().title("Base项目") // 大标题
//        .description("Base项目web基础功能") // 详细描述
//        .termsOfServiceUrl("") // NO terms of user
//        .version("1.0.0") // 版本
//        .build();
//  }

  /**
   * 可以定义多个组，比如本类中定义把base和task区分开了 （访问页面就可以看到效果了）
   * 
   */
  @Bean
  public Docket createRestApi() {
    ParameterBuilder ticketPar = new ParameterBuilder();
    List<Parameter> pars = new ArrayList<Parameter>();  
    ticketPar.name("Authorization").description("user Authorization")
    .modelRef(new ModelRef("string")).parameterType("header") 
    .required(false).build(); //header中的ticket参数非必填，传空也可以
    pars.add(ticketPar.build());    //根据每个方法名也知道当前方法在设置什么参数

    return new Docket(DocumentationType.SWAGGER_2) //
        .apiInfo(apiInfo()) //
        .useDefaultResponseMessages(false) //
        .groupName("web").select() //
        .apis(RequestHandlerSelectors.basePackage("com.zc.web.controller")) //
        .paths(PathSelectors.any()).build()
        .globalOperationParameters(pars);
  }
//
//  @Bean
//  public Docket createRestApi02() {
//
//    return new Docket(DocumentationType.SWAGGER_2) //
//        .apiInfo(apiInfo02()) //
//        .useDefaultResponseMessages(false) //
//        .groupName("base").select() //
//        .apis(RequestHandlerSelectors.basePackage("com.zc.base.controller")) //
//        .paths(PathSelectors.any()).build();
//  }
}