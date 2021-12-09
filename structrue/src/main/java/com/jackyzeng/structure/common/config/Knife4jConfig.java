/*
 * Copyright (C) 2018 Zhejiang xiaominfo Technology CO.,LTD.
 * All rights reserved.
 * Official Web Site: http://www.xiaominfo.com.
 * Developer Web Site: http://open.xiaominfo.com.
 */

package com.jackyzeng.structure.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@Configuration
@EnableSwagger2WebMvc
public class Knife4jConfig {

    @Bean(value = "defaultApi2")
    public Docket defaultApi2() {
        Docket docket=new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .title("Integration Platform APIs")
                        .description("Integration Platform APIs")
                        .termsOfServiceUrl("http://www.xxx.com/")
                        .version("1.0")
                        .build())
                //分组名称
                .groupName("集成平台")
                .select()
                //这里指定Controller扫描包路径
                .apis(RequestHandlerSelectors.basePackage("com.cmiot.oneip"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }
}
