/*****************************************************************************
 * Copyright (C) 2017 TP-LINK TECHNOLOGIES CO.,LTD. All Rights Reserved.
 * ������������������޹�˾�����������κθ��ˡ����岻��ʹ�á����ơ��޸Ļ򷢲������.
 * @FileName: Team.java
 * @Description:
 * @Version: since 1.0.0
 * @History:
 * 2017��8��9�� chenxihong_w7141@tp-link.com.cn create
 *****************************************************************************/
package com.football.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;



/**
 * @since: JDK 1.7
 * @History:
 * 2017��8��9�� chenxihong_w7141@tp-link.com.cn create
 */
@Entity
@Table(name = "team")
public class Team {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 10)
    private String id;

    @Column(length = 100)
    private String name;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    
    
    

}
