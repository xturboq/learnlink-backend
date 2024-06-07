package com.zecola.learnlink.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求
 */
@Data
public class UserRegisterRequest implements Serializable {
    private static final long serialVersionUID = 1L;
    private String userAccount;//用户账号
    private String userPassword;//用户密码
    private String checkPassword;//校验密码
    private String planetCode;//星球编号
}
