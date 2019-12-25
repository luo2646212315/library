package com.graduation.library;

import com.graduation.library.utils.NetWorkUtils;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @Description : 核心模块启动类
 * @Author : luomingjin
 * @Date: 2019-12-20 16:44
 */
@EnableEurekaClient
@SpringBootApplication
public class LibraryCoreApplication {
    public static void main(String[] args) {
//        SpringApplication.run(LibraryCoreApplication.class,args);
        new SpringApplicationBuilder(LibraryCoreApplication.class)
                .web(WebApplicationType.SERVLET)
                .initializers((ConfigurableApplicationContext context) -> {
                    ConfigurableEnvironment configurableEnvironment = context.getEnvironment();
                    System.setProperty("serverIp", NetWorkUtils.getLocalIP());
                    System.setProperty("systemName",configurableEnvironment.getProperty("spring.application.name"));
                    System.setProperty("serverPort",configurableEnvironment.getProperty("server.port") );
                }).run(args);
    }
}
