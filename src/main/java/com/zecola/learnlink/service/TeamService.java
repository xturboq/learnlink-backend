package com.zecola.learnlink.service;

import com.zecola.learnlink.model.domain.Team;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zecola.learnlink.model.domain.User;

/**
* @author XTurbo
* @description 针对表【team(队伍)】的数据库操作Service
* @createDate 2024-06-18 19:22:28
*/
public interface TeamService extends IService<Team> {
    /**
     * 创建队伍
     * @param team
     * @param loginUser
     * @return
     */
    long addTeam(Team team, User loginUser);

}
