package com.graduation.library.service.impl;

import com.graduation.library.domain.entity.TestUser;
import com.graduation.library.mapper.TestUserMapper;
import com.graduation.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description :
 * @Author : luomingjin
 * @Date: 2019-12-25 15:06
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    TestUserMapper testUserMapper;

    @Override
    public TestUser finduser(Integer id) {
        return testUserMapper.selectByPrimaryKey(id);
    }
}
