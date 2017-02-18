package com.wdsunday.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by stone on 17-2-17.
 */
@Controller
public class LoginController {
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public String login(@ModelAttribute("username") String userName, @ModelAttribute("pd")String pwd){

        System.out.println(userName);
        System.out.println(pwd);

        return "提交成功";
    }





}
