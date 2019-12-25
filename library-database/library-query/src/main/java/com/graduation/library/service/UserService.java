package com.graduation.library.service;

import com.graduation.library.domain.entity.TestUser;

/**
 * @Description :
 * @Author : luomingjin
 * @Date: 2019-12-25 15:06
 */
public interface UserService {
    TestUser finduser(Integer id);
}
