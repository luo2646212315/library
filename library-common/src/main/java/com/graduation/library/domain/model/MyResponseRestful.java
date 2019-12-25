package com.graduation.library.domain.model;

import com.graduation.library.domain.BaseDomain;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description : 自定义restful对象
 * @Author : luomingjin
 * @Date: 2019-12-23 18:05
 */
public class MyResponseRestful extends BaseDomain {
    private Integer code = 500;//状态码
    private String message = "";//基础信息
    private String errorMessage = "";//错误信息
    private boolean status = false;//状态
    private List data = new ArrayList<>();//内容数据

    public MyResponseRestful(){
    }
    public MyResponseRestful(Integer code, String message, String errorMessage, boolean status, Object ...obj) {
        this.code = code;
        this.errorMessage = errorMessage;
        this.status = status;
        this.message = message;
        for (Object o : obj) {
            data.add(o);
        }
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }
}
