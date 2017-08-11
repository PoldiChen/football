/**
 * @project football
 * @package com.football.requester
 * @file RestClient.java
 * @author chenxihong
 */
package com.football.requester;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/** 
 * Class: RestClient
 * date: 2017年8月3日 下午9:37:52
 * @author chenxihong 
 * @version  
 * @since JDK 1.8
 */
@SuppressWarnings("restriction")
@Component("restClient")
public class RestClient {
	
	public static void main(String[] args) {
		test();
	}

	@Resource(name = "restTemplate")
    private RestTemplate template;
	
    public RestTemplate getTemplate() {
		return template;
	}

	public void setTemplate(RestTemplate template) {
		this.template = template;
	}

	private final static String url = "";
    
    public static void test() {
    	RestTemplate template = new RestTemplate();
    	String result = template.getForObject(url, String.class);
    	JSONObject jsonObject = JSON.parseObject(result);
    	JSONArray jsonArray = jsonObject.getJSONArray("result");
    	System.out.println(jsonArray.get(1));
    }
    
//    public String show() {
//        return template.getForObject(url + "show.do", String.class, new String[]{});
//    }
    
    public String getUserById(String id) {
        return template.getForObject(url + "get/{id}.do", String.class, id); 
    }
    
    public String addUser(String user) {
        return template.postForObject(url + "add.do?user={user}", null, String.class, user);
    }
    
    public String editUser(String user) {
        template.put(url + "edit.do?user={user}", null, user);
        return user;
    }
    
    public String removeUser(String id) {
        template.delete(url + "/remove/{id}.do", id);
        return id;
    }
}
