package com.zecola.learnlink.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用返回类
 *
 * @author zecola
 */
@Data
public class BaseResponse<T> implements Serializable {
    private int code;//状态码
    private T data;//数据
    private String message;//消息
    private String description;//描述

    public BaseResponse(int code, T data) {
        this.code = code;
        this.data = data;
    }

    public BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public BaseResponse(int code, T data, String message, String description) {
        this.code = code;
        this.data = data;
        this.message = message;
        this.description = description;
    }

    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage(), errorCode.getDescription());
    }
}
