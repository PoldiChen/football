package com.football.dao.inter;

import com.football.pojo.Team;

public interface ITeamDao extends IBaseDao {

    public Team getTeamById(int id);

}
