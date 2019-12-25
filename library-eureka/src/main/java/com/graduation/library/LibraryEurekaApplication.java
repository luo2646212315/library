package com.graduation.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description :注册中心启动类
 * @Author : luomingjin
 * @Date: 2019-12-20 16:37
 */
@EnableEurekaServer
@SpringBootApplication
public class LibraryEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(LibraryEurekaApplication.class,args);
    }
}
