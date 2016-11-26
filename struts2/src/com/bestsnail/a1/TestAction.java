package com.bestsnail.a1;

import com.opensymphony.xwork2.ActionSupport;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by stone on 16-11-22.
 */
public class TestAction extends ActionSupport{
    private String msg ;

    public String getMsg() {
        return msg;
    }

    public String execute(){
        msg = "第一个stuts  Demo";
        return "succcess";
    }
}
