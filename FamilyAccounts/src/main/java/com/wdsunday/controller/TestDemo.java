package com.wdsunday.controller;

import com.wdsunday.dao.UserDao;
import com.wdsunday.dao.entity.User;
import com.wdsunday.service.UsrService;
import com.wdsunday.service.UsrServiceImpl;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

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
        usrServiceImpl.saveUser(new User());
        System.out.println("ceshi ");
        return  "中文论码";
    }
}
