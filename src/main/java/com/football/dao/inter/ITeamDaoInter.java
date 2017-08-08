/**
 * @project football
 * @package com.football.dao.inter
 * @file TeamDaoInter.java
 * @author chenxihong
 */
package com.football.dao.inter;

import com.football.pojo.Team;

/** 
 * Class: TeamDaoInter
 * date: 2017年8月5日 下午11:06:16
 * @author chenxihong 
 * @version  
 * @since JDK 1.8
 */
public interface ITeamDaoInter {
	
	public int save(Team team);

}
