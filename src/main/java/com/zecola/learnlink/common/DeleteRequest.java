package com.zecola.learnlink.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用删除请求
 */
@Data
public class DeleteRequest implements Serializable {

    private static final long serialVersionUID = -660592641227364029L;

    private long id;
}
