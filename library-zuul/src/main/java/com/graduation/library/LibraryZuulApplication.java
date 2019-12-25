package com.graduation.library;

import com.graduation.library.utils.NetWorkUtils;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @Description :网关启动类
 * @Author : luomingjin
 * @Date: 2019-12-20 16:32
 */
@SpringBootApplication
public class LibraryZuulApplication {
    public static void main(String[] args) {
//        SpringApplication.run(LibraryZuulApplication.class,args);
        new SpringApplicationBuilder(LibraryZuulApplication.class)
                .web(WebApplicationType.SERVLET)
                .initializers((ConfigurableApplicationContext context) -> {
                    ConfigurableEnvironment configurableEnvironment = context.getEnvironment();
                    System.setProperty("serverIp", NetWorkUtils.getLocalIP());
                    System.setProperty("systemName",configurableEnvironment.getProperty("spring.application.name"));
                    System.setProperty("serverPort",configurableEnvironment.getProperty("server.port") );
                }).run(args);
    }
}
