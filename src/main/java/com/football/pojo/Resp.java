/*****************************************************************************
 * Copyright (C) 2017 TP-LINK TECHNOLOGIES CO.,LTD. All Rights Reserved.
 * 本软件由普联技术有限公司开发，其他任何个人、团体不得使用、复制、修改或发布本软件.
 * @FileName: Resp.java
 * @Description:
 * @Version: since 1.0.0
 * @History:
 * 2017年8月9日 chenxihong_w7141@tp-link.com.cn create
 *****************************************************************************/
package com.football.pojo;

/**
 * @since: JDK 1.7
 * @History:
 * 2017年8月9日 chenxihong_w7141@tp-link.com.cn create
 */
public class Resp {
    
    private int code;
    private Object data;
    private String message;
    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }
    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
    }
    /**
     * @return the data
     */
    public Object getData() {
        return data;
    }
    /**
     * @param data the data to set
     */
    public void setData(Object data) {
        this.data = data;
    }
    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }
    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    

}
