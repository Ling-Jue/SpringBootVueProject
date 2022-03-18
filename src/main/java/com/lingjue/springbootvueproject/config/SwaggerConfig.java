package com.lingjue.springbootvueproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableOpenApi
public class SwaggerConfig {

    /**
     * 创建API应用
     * apiInfo() 增加API相关信息
     * 通过select()函数返回一个ApiSelectorBuilder实例,用来控制哪些接口暴露给Swagger来展现，
     * 本例采用指定扫描的包路径来定义指定要建立API的目录。
     * @return
     */
    @Bean
    public Docket restApi() {
        return new Docket(DocumentationType.OAS_30)
                .groupName("标准接口")
                //调用apiInfo方法,创建一个ApiInfo实例,里面是展示在文档页面信息内容
                .apiInfo(apiInfo("Spring Boot中使用Swagger3构建RESTful APIs", "1.0"))
                .useDefaultResponseMessages(true)
                .forCodeGeneration(false)
                .select()
                //控制暴露出去的路径下的实例
                //如果某个接口不想暴露,可以使用以下注解
                //@ApiIgnore 这样,该接口就不会暴露在 swagger2 的页面下
                .apis(RequestHandlerSelectors.basePackage("com.lingjue.springbootvueproject.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 创建该API的基本信息（这些基本信息会展现在文档页面中）
     * 访问地址：http://ip:port/swagger-ui.html
     * @return
     */
    private ApiInfo apiInfo(String title, String version) {
        return new ApiInfoBuilder()
                //页面标题
                .title(title)
                //描述
                .description("更多请关注: https://blog.csdn.net/qq_41375754?type=blog")
                //条款地址
                .termsOfServiceUrl("https://blog.csdn.net/qq_41375754?type=blog")
                .contact(new Contact("LingJue", "https://blog.csdn.net/qq_41375754?type=blog", "1248290205@qq.com"))
                .version(version)
                .build();
    }
}
