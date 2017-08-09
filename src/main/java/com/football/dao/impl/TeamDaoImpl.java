package com.football.dao.impl;

import javax.annotation.Resource;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import com.football.dao.inter.ITeamDao;
import com.football.pojo.Team;
import org.hibernate.Query;

//注入
@Component("teamDao")
public class TeamDaoImpl implements ITeamDao {

    //注入已在spring-common.xml中配制好的sessionFactory
    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    @Override
    public Team getTeamById(int id) {
        System.out.println("getTeamById");
        System.out.println(sessionFactory);
        String hql = "from Team t where t.id=?";
        Query query = sessionFactory.openSession().createQuery(hql);
        query.setInteger(0, id);
        return (Team) query.uniqueResult();
    }


}
