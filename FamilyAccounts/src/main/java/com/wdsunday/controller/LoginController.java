package com.wdsunday.controller;

import com.wdsunday.model.entity.FamilyUser;
import com.wdsunday.service.UsrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by stone on 17-2-17.
 */
@Controller
public class LoginController {
    @Autowired
    UsrService usrService;
    @RequestMapping(value="/",method = RequestMethod.GET)
    public String welcomemy(){
        return "index";
    }




    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
//    public String login(@RequestBody FamilyUser userName ){
    public String login(String JSON ){
        //如果是简单的数据，非json数据  直接使用对象就能够接受
        //如果使用的Json数据需要使用@RequestBody进行对象注解
//        System.out.println(userName.toString());
//        FamilyUser familyUser = usrService.signIn(userName);
//        System.out.println(familyUser.toString());


        return JSON;
    }

    @RequestMapping(value = "/demo",method = RequestMethod.GET)
    @ResponseBody
    public String demo(){
        FamilyUser familyUser1 = new FamilyUser();
        familyUser1.setUserName("admin2");
        familyUser1.setUserPwd("admin");
//        familyUser1.setID(100L);
        familyUser1.setUserTime(System.currentTimeMillis());
        usrService.saveUser(familyUser1);



        return "成功";
    }








}
