package com.football.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.football.dao.inter.ITeamDao;
import com.football.pojo.Team;
//import com.tplink.mic.basement.manufacture.pojo.DeviceIdGenInfo;

import java.util.List;
import javax.annotation.Resource;


import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

//ע��
@Component("teamDao")
public class TeamDaoImpl implements ITeamDao {

    //ע������spring-common.xml�����ƺõ�sessionFactory
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
