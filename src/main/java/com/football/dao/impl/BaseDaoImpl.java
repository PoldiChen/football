package com.football.dao.impl;

import javax.annotation.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import com.football.dao.inter.IBaseDao;

public class BaseDaoImpl implements IBaseDao {
    
    @Resource(name = "jdbcTemplate")
    protected JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


}
