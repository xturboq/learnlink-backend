package com.zecola.learnlink.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求体
 */
@Data
public class UserLoginRequest implements Serializable {
    private static final long serialVersionUID = 1L;
    private String userAccount;//账号
    private String userPassword;//密码
}
