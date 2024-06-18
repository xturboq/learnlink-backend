package com.zecola.learnlink.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zecola.learnlink.model.domain.Team;
import com.zecola.learnlink.service.TeamService;
import com.zecola.learnlink.mapper.TeamMapper;
import org.springframework.stereotype.Service;

/**
* @author XTurbo
* @description 针对表【team(队伍)】的数据库操作Service实现
* @createDate 2024-06-18 19:22:28
*/
@Service
public class TeamServiceImpl extends ServiceImpl<TeamMapper, Team>
    implements TeamService{

}




