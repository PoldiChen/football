package com.football.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.football.dao.inter.ITeamDao;
import com.football.pojo.Resp;
import com.football.pojo.Team;

@RestController
@RequestMapping(value = "/team", produces = "application/json;charset=utf-8")
public class TeamController {

    @Autowired
    private ITeamDao teamDao;

    @ResponseBody
    @RequestMapping(value = "/{teamId}", method = RequestMethod.GET)
    public Resp getTeamById(@PathVariable("teamId") int teamId) throws Exception {
        Team team = teamDao.getTeamById(teamId);
        System.out.println("name:" + team.getName());
        Resp resp = new Resp();
        resp.setCode(0);
        resp.setData(team);
        resp.setMessage("ok");
        return resp;
    }
    
}
