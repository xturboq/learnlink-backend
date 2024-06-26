package com.zecola.learnlink.model.domain;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户表
 * @TableName user
 */
@TableName(value ="user")
@Data
public class User implements Serializable {
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
    /**
     *
     */
    @TableId(type = IdType.AUTO)
    private long id;
    /**
     * 用户昵称
     */
    private String username;
    /**
     * 账号
     */
    private String userAccount;
    /**
     * 用户头像
     */
    private String avatarUrl;
    /**
     * 性别
     */
    private Integer gender;
    /**
     * 密码
     */
    private String userPassword;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 标签列表 json
     */
    private String tags;
    /**
     * 状态 0-正常
     */
    private Integer userStatus;
    /**
     * 电话
     */
    private String phone;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 是否删除
     */

    @TableLogic
    private Integer isDelete;
    /**
     * 角色 0 -用户 1 - 管理员
     */
    private int userRole;
    /**
     * 星球编号
     */
    private String planetCode;
}