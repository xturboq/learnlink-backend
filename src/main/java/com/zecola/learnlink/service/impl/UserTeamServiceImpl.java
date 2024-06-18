package com.zecola.learnlink.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zecola.learnlink.model.domain.UserTeam;
import com.zecola.learnlink.service.UserTeamService;
import com.zecola.learnlink.mapper.UserTeamMapper;
import org.springframework.stereotype.Service;

/**
* @author XTurbo
* @description 针对表【user_team(用户队伍关系)】的数据库操作Service实现
* @createDate 2024-06-18 19:25:32
*/
@Service
public class UserTeamServiceImpl extends ServiceImpl<UserTeamMapper, UserTeam>
    implements UserTeamService{

}




