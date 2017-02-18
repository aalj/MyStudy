package com.wdsunday.controller;

import com.wdsunday.dao.entity.User;
import com.wdsunday.service.UsrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liangjun on 2017/2/13.
 */
@Controller
public class TestDemo {

    @Autowired
    UsrService usrServiceImpl;


    @RequestMapping(value = "/index" ,method = RequestMethod.GET)
    @ResponseBody
    public String index(){
//        userDao.save(new User());
        User user = new User();
        user.setName("abc");
        user.setAge("120");
        usrServiceImpl.saveUser(user);
        System.out.println("ceshi ");
        return  "中文论码";
    }
}
