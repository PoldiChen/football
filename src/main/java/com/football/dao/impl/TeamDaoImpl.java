package com.football.dao.impl;

import java.io.Serializable;
import org.springframework.stereotype.Component;
import com.football.dao.inter.ITeamDao;
import com.football.pojo.Team;
import org.hibernate.Query;

@Component("teamDao")
public class TeamDaoImpl extends BaseDaoImpl implements ITeamDao {

    public Team getTeamById(int id) {
        String hql = "from Team t where t.id=?";
        Query query = sessionFactory.openSession().createQuery(hql);
        query.setInteger(0, id);
        return (Team) query.uniqueResult();
    }

    public int createTeam(Team team) {
        Serializable serializable = sessionFactory.openSession().save(team);
        System.out.println(serializable);
        return 0;
    }

}
