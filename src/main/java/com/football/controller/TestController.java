package com.football.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.football.dao.impl.TeamDaoImpl;
import com.football.dao.inter.ITeamDao;
import com.football.pojo.Team;

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
