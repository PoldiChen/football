package com.football.dao.impl;

import javax.annotation.Resource;
import org.hibernate.SessionFactory;
import com.football.dao.inter.IBaseDao;

@SuppressWarnings("restriction")
public class BaseDaoImpl implements IBaseDao {

    @Resource(name = "sessionFactory")
    protected SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

}
