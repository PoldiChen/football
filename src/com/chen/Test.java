/**********************************************************
 * Project: jersey-test 
 * Package: com.chen 
 * File:    Test.java 
 * Date:    2017年1月14日下午3:51:54 
 * Copyright (c) 2017, chenxihong All Rights Reserved. 
 *********************************************************/
package com.chen;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/** 
 * Class: Test
 * date: 2017年1月14日 下午3:51:54
 * @author chenxihong 
 * @version  
 * @since JDK 1.8
 */
@Path("test")
public class Test {

    /**
      * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
      *
      * @return String that will be returned as a text/plain response.
      */
     @GET
     @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
     }
 }
