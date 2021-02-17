package com.udacity.vehicles.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .useDefaultResponseMessages(false);
    }

    @Bean
    public ApiInfo apiInfo(){
        return new ApiInfo(
                "Vehicle-Api",
                "This API returns cars data",
                "2.0",
                "http://www.udacity.com",
                new Contact("Azizbek Khushvakov","www.udacity.com","hello@azizbek.com"),
                "License of API", "http://www.udacity.com/license", Collections.emptyList()
        );
    }

}
