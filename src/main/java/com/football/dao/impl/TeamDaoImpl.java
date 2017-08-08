/**
 * @project football
 * @package com.football.dao.impl
 * @file TeamDaoImpl.java
 * @author chenxihong
 */
package com.football.dao.impl;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.football.dao.inter.ITeamDaoInter;
import com.football.pojo.Team;

/** 
 * Class: TeamDaoImpl
 * date: 2017年8月5日 下午11:06:26
 * @author chenxihong 
 * @version  
 * @since JDK 1.8
 */
@Repository
public class TeamDaoImpl implements ITeamDaoInter {
	
	@Autowired
	private SessionFactory sessionFactory;

	/* (non-Javadoc)
	 * @see com.football.dao.inter.TeamDaoInter#save(com.football.pojo.Team)
	 */
	@Transactional(value = "transactionManager")
	public int save(Team team) {
		// TODO Auto-generated method stub
		System.out.println(sessionFactory);
		Serializable serializable = sessionFactory.getCurrentSession().save(team);
		System.out.println(serializable);
		return 0;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	

}
