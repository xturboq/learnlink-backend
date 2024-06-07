package com.zecola.learnlink.exception;

import com.zecola.learnlink.common.ErrorCode;

/**
 * 自定义异常类
 *
 * @author zecola
 */

public class BusinessException extends RuntimeException {
    private final int code;//异常码
    private final String description;//描述

    public BusinessException(int code, String message, String description) {
        super(message);
        this.code = code;
        this.description = description;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
        this.description = errorCode.getDescription();
    }

    public BusinessException(ErrorCode errorCode, String description) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
