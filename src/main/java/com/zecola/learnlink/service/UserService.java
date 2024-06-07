package com.zecola.learnlink.service;

import com.zecola.learnlink.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author zecola
 * @description 针对表【user(用户表)】的数据库操作Service
 * @createDate 2024-03-26 16:16:22
 */
public interface UserService extends IService<User> {

    /**
     * 用户注释
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @param planetCode    星球编号
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword, String planetCode);

    /**
     * 用户登录
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param request 请求
     * @return
     */
    User userLogin(String userAccount, String userPassword,HttpServletRequest request);

    /**
     * 用户脱敏
     * @param originUser 原始用户
     * @return
     */
    User getSafetyUser(User originUser);

    /**
     * 用户注销
     *
     * @param request 请求
     * @return
     */
    int userLogout(HttpServletRequest request);

    /**
     * 根据标签名列表搜索用户
     *
     * @param tagNameList 标签名列表，用于指定搜索的标签条件。
     * @return 符合条件的用户数量。返回的是一个整数，表示满足搜索条件的用户数量。
     */
    List<User> searchUserByTags(List<String> tagNameList);
}