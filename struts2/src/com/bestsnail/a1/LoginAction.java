package com.bestsnail.a1;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.awt.*;
import java.util.Map;

/**
 * Created by stone on 16-11-26.
 */
public class LoginAction extends ActionSupport {

    public String  login(){
        System.out.println("当前的位置是否执行到");
        //获取请求参数

        ActionContext ac = ActionContext.getContext();
        //得到request的map
        Map<String, Object> request = ac.getContextMap();
        //得到sesion map
        Map<String, Object> session = ac.getSession();
        Map<String, Object> application = ac.getApplication();
        return "login";
    }

}
