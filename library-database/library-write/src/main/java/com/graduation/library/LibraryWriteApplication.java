package com.graduation.library;

import com.graduation.library.utils.NetWorkUtils;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Description :数据更新接口启动类
 * @Author : luomingjin
 * @Date: 2019-12-20 16:59
 */
@EnableTransactionManagement
@SpringBootApplication
public class LibraryWriteApplication {
    public static void main(String[] args) {
//        SpringApplication.run(LibraryWriteApplication.class,args);
        new SpringApplicationBuilder(LibraryWriteApplication.class)
                .web(WebApplicationType.SERVLET)
                .initializers((ConfigurableApplicationContext context) -> {
                    ConfigurableEnvironment configurableEnvironment = context.getEnvironment();
                    System.setProperty("serverIp", NetWorkUtils.getLocalIP());
                    System.setProperty("systemName",configurableEnvironment.getProperty("spring.application.name"));
                    System.setProperty("serverPort",configurableEnvironment.getProperty("server.port") );
                }).run(args);
    }
}
