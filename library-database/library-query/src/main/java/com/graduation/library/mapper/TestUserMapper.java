package com.graduation.library.mapper;

import com.graduation.library.domain.entity.TestUser;
import org.apache.ibatis.annotations.Mapper;

/**
* @Description : 
* @Author : luomingjin
* @Date: 2019-12-25 15:00  
*/
@Mapper
public interface TestUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TestUser record);

    int insertSelective(TestUser record);

    TestUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TestUser record);

    int updateByPrimaryKey(TestUser record);
}