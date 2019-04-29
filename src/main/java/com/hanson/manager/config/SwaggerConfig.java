package com.hanson.manager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration // 标记配置类
@EnableSwagger2 // 开启在线接口文档
public class SwaggerConfig {

    private boolean swaggerShow = true;

    @Bean
    public Docket restApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).enable(swaggerShow).select()
                .apis(RequestHandlerSelectors.basePackage("com.hanson.manager.controller")).build();
    }

    //构建 api文档的详细信息函数,注意这里的注解引用的是哪个
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("标题：管家")
                .description("描述：管理房屋API").contact(new Contact("hanson", "huhanlin.com", "huhanlin@huhanlin.com"))
                .version("版本号:1.0").build();
    }
}