/**
 * @project football
 * @package com.chen
 * @file TestController.java
 * @author chenxihong
 */
package com.football.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.football.controller.FootballController;
import com.football.requester.RestClient;

import org.springframework.orm.hibernate3.LocalSessionFactoryBean;

import javax.persistence.EntityManagerFactory;

/** 
 * Class: TestController
 * date: 2017年8月3日 下午9:32:45
 * @author chenxihong 
 * @version  
 * @since JDK 1.8
 */
@Controller
public class TestController {
	
	public static void main(String[] args) {
		System.out.println("test");
		ApplicationContext ac = new FileSystemXmlApplicationContext("classpath:springContext.xml");
		System.out.println(ac);
		FootballController footballController = (FootballController) ac.getBean("footballController");
		System.out.println(footballController);
		footballController.test();
	}
	
	@Autowired
	private RestClient restClient;
	
	@RequestMapping(value = "/test", produces = "application/json;charset=utf-8")
	@ResponseBody
	public String test() {
		return "hello world";
//		return restClient.test();
	}

}
