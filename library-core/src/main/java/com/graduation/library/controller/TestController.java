package com.graduation.library.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description :
 * @Author : luomingjin
 * @Date: 2019-12-24 15:53
 */
@Log4j2
@RestController
public class TestController {
    @GetMapping("/ss")
    public String ss(){
        log.info("调通了");
        return "asdadad";
    }
}
