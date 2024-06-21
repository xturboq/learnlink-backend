package com.zecola.learnlink.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zecola.learnlink.model.domain.Team;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zecola.learnlink.model.domain.User;
import com.zecola.learnlink.model.dto.TeamQuery;
import com.zecola.learnlink.model.request.TeamJoinRequest;
import com.zecola.learnlink.model.request.TeamQuitRequest;
import com.zecola.learnlink.model.request.TeamUpdateRequest;
import com.zecola.learnlink.model.vo.TeamUserVO;

import java.util.List;

/**
 * @author XTurbo
 * @description 针对表【team(队伍)】的数据库操作Service
 * @createDate 2024-06-18 19:22:28
 */
public interface TeamService extends IService<Team> {
    /**
     * 创建队伍
     */
    long addTeam(Team team, User loginUser);

    /**
     * 删除队伍
     */
    boolean deleteTeam(long id, User loginUser);

    /**
     * 修改队伍
     */
    boolean updateTeam(TeamUpdateRequest teamUpdateRequest, User loginUser);

    /**
     * 搜索队伍
     */
    List<TeamUserVO> listTeams(TeamQuery teamQuery, boolean isAdmin);

    /**
     * 加入队伍
     */
    boolean joinTeam(TeamJoinRequest teamJoinRequest, User loginUser);

    /**
     * 退出队伍
     */
    boolean quitTeam(TeamQuitRequest teamQuitRequest, User loginUser);


}
