package com.football.dao.inter;

import java.util.List;

import com.football.pojo.Team;

public interface ITeamDao extends IBaseDao {

    public Team getTeamById(int id);

    public int createTeam(Team team);
    
    public List<Team> getAllTeams();

}
