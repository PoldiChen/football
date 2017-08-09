/*****************************************************************************
 * Copyright (C) 2017 TP-LINK TECHNOLOGIES CO.,LTD. All Rights Reserved.
 * 本软件由普联技术有限公司开发，其他任何个人、团体不得使用、复制、修改或发布本软件.
 * @FileName: TestController.java
 * @Description:
 * @Version: since 1.0.0
 * @History:
 * 2017年8月9日 chenxihong_w7141@tp-link.com.cn create
 *****************************************************************************/
package com.football.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.football.dao.impl.TeamDaoImpl;
import com.football.dao.inter.ITeamDao;
//import com.tplink.mic.manufacture.config.dao.impl.ConfigDaoImpl;
import com.football.pojo.Team;

import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

/**
 * @since: JDK 1.7
 * @History:
 * 2017年8月9日 chenxihong_w7141@tp-link.com.cn create
 */
@RestController
@RequestMapping(value = "/test", produces = "application/json;charset=utf-8")
public class TestController {
    
    public static void main(String[] args) {
        String xml = "src/main/webapp/WEB-INF/spring-mvc.xml";
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext(xml);
        TeamDaoImpl teamDaoImpl = (TeamDaoImpl) applicationContext.getBean("teamDao");
        Team team = teamDaoImpl.getTeamById(1);
        System.out.println(team.getName());
//        ConfigDaoImpl configDaoImpl = (ConfigDaoImpl) applicationContext.getBean("configDao");
    }

    @Autowired
    private ITeamDao teamDao;

    /**
     * @Description: 根据appKey获取权限验证数据
     * @param appKey
     * @return
     * @throws Exception
     * @History: 2017-3-8 chenxihong_w7141@tp-link.com.cn create
     */
    @RequestMapping(method = RequestMethod.GET)
    public String test() throws Exception {
        teamDao.getTeamById(1);
        return "test";
    }
    
}
