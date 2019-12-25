package com.graduation.library;

import com.graduation.library.utils.NetWorkUtils;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @Description :消息处理模块启动类
 * @Author : luomingjin
 * @Date: 2019-12-20 16:51
 */
@SpringBootApplication
public class LibraryMqApplication {
    public static void main(String[] args) {
//        SpringApplication.run(LibraryMqApplication.class,args);
        new SpringApplicationBuilder(LibraryMqApplication.class)
                .web(WebApplicationType.SERVLET)
                .initializers((ConfigurableApplicationContext context) -> {
                    ConfigurableEnvironment configurableEnvironment = context.getEnvironment();
                    System.setProperty("serverIp", NetWorkUtils.getLocalIP());
                    System.setProperty("systemName",configurableEnvironment.getProperty("spring.application.name"));
                    System.setProperty("serverPort",configurableEnvironment.getProperty("server.port") );
                }).run(args);
    }
}
