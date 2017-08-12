package com.football.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.football.dao.inter.ITeamDao;
import com.football.pojo.Resp;
import com.football.pojo.Team;

@Controller
@RequestMapping(value = "/team")
public class TeamController {

    @Autowired
    private ITeamDao teamDao;
    
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public ModelAndView teamPage() {
        return new ModelAndView("team");
    }

    @ResponseBody
    @RequestMapping(value = "/api/{teamId}", method = RequestMethod.GET)
    public Resp getTeamById(@PathVariable("teamId") int teamId) {
        Team team = teamDao.getTeamById(teamId);
        System.out.println("name:" + team.getName());
        Resp resp = new Resp();
        resp.setCode(0);
        resp.setData(team);
        resp.setMessage("ok");
        return resp;
    }

    @ResponseBody
    @RequestMapping(value = "/api", method = RequestMethod.POST)
    public Resp createTeam(@RequestBody String teamStr) {
        System.out.println(teamStr);
        Team team = JSON.parseObject(teamStr, Team.class);
        int result = teamDao.createTeam(team);
        System.out.println(result);
        Resp resp = new Resp();
        return resp;
    }

}
