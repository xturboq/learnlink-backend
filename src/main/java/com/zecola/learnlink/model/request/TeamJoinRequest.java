package com.zecola.learnlink.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户加入队伍请求体
 *
 */
@Data
public class TeamJoinRequest implements Serializable {

    private static final long serialVersionUID = 6852707108330828291L;

    /**
     * id
     */
    private Long teamId;

    /**
     * 密码
     */
    private String password;
}
