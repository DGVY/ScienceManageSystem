package com.mryao.gxkygl.common.config;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@ComponentScan(basePackages = {"com.mryao"})
public class SwaggerConfig {

    @Bean
    public Docket adminApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("管理Api")
                .forCodeGeneration(true)
                .pathMapping("/")
                .select()
                .paths(paths())
                .build()
                .apiInfo(apiInfo())
                .useDefaultResponseMessages(false);
    }

    private Predicate<String> paths(){
        return Predicates.and(PathSelectors.regex(".*"), Predicates.not(PathSelectors.regex("/error")));
    }

    @Bean
    public Docket customDocket() {
        return new Docket(DocumentationType.SWAGGER_2);
    }


    private ApiInfo apiInfo(){
        Contact contact = new Contact("mryao", "https://gitee.com/xiaoyaotonxue/events", "867160589@qq.com");
        return new ApiInfoBuilder()
                .title("高校科研管理平台")
                .description("高校科研管理平台")
                .license("mryao version 1.0")
                .contact(contact)
                .version("2.0")
                .build();
    }
}
