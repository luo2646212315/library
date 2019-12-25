package com.graduation.library.controller;

import com.graduation.library.domain.entity.TestUser;
import com.graduation.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description :
 * @Author : luomingjin
 * @Date: 2019-12-25 15:03
 */
@RestController
public class TestAA {
    @Autowired
    UserService userService;
    @GetMapping("/getuser/{id}")
    public TestUser find(@PathVariable Integer id){
        return userService.finduser(id);
    }
}
