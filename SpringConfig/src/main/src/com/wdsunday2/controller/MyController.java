package com.wdsunday2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by liangjun on 2016/12/28.
 */

@Controller
@RequestMapping("/")
public class MyController {

    @RequestMapping(method = RequestMethod.GET)
    public String helloWorldController(){
        return "";
    }





}
