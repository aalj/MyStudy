package com.wdsunday.controller;

import com.wdsunday.service.IHelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

/**
 * Created by liangjun on 2017/1/10.
 */
@Controller
public class Test {
    private IHelloService helloService;

    public IHelloService getHelloService() {
        return helloService;
    }
    @Resource
    public void setHelloService(IHelloService helloService) {
        this.helloService = helloService;
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET,
            produces = "application/json; charset=utf-8")
    @ResponseBody
    public String getUrl(HttpServletRequest request, HttpServletResponse response) throws Exception {


        request.setCharacterEncoding("UTF-8");
//        String userName = request.getParameter("userName");
//        int resultCode = helloService.addUser(userName);
//        String rspInfo = "你好!" + userName + ",操作结果码=" + resultCode;
        response.setHeader("Content-type","text/html;charset=UTF-8");
//        response.getOutputStream().write(rspInfo.getBytes("UTF-8"));
        return "";
    }


}
