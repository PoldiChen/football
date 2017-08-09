/*****************************************************************************
 * Copyright (C) 2017 TP-LINK TECHNOLOGIES CO.,LTD. All Rights Reserved.
 * ������������������޹�˾�����������κθ��ˡ����岻��ʹ�á����ơ��޸Ļ򷢲������.
 * @FileName: TeamController.java
 * @Description:
 * @Version: since 1.0.0
 * @History:
 * 2017��8��9�� chenxihong_w7141@tp-link.com.cn create
 *****************************************************************************/
package com.football.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.football.dao.impl.TeamDaoImpl;
import com.football.dao.inter.ITeamDao;
import com.football.pojo.Resp;
import com.football.pojo.Team;

/**
 * @since: JDK 1.7
 * @History:
 * 2017��8��9�� chenxihong_w7141@tp-link.com.cn create
 */
@RestController
@RequestMapping(value = "/team", produces = "application/json;charset=utf-8")
public class TeamController {

    @Autowired
    private ITeamDao teamDao;

    /**
     * @Description: ����appKey��ȡȨ����֤����
     * @param appKey
     * @return
     * @throws Exception
     * @History: 2017-3-8 chenxihong_w7141@tp-link.com.cn create
     */
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
