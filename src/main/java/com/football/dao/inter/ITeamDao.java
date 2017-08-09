package com.football.dao.inter;

import com.football.pojo.Team;

/**
 * DeviceID数据的dao层接�?
 * 
 * @since: JDK 1.7
 * @History: 2017-2-25 chenxihong_w7141@tp-link.com.cn create
 */
public interface ITeamDao extends IBaseDao {

    public Team getTeamById(int id);

}
