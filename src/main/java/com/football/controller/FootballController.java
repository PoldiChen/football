/**
 * @project football
 * @package com.football.controller
 * @file FootballController.java
 * @author chenxihong
 */
package com.football.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.football.dao.inter.ITeamDaoInter;
import com.football.pojo.Team;

/** 
 * Class: FootballController
 * date: 2017年8月8日 下午8:33:15
 * @author chenxihong 
 * @version  
 * @since JDK 1.8
 */
@Component("footballController")
public class FootballController {
	
	@Autowired
	private ITeamDaoInter teamDao;
	
	public void test() {
		Team team = new Team();
		team.setName("testtest");
		teamDao.save(team);
	}

}
