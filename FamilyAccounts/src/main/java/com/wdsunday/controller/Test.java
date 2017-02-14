package com.wdsunday.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liangjun on 2017/2/13.
 */
@Controller
public class Test {
    @RequestMapping(value = "/index" ,method = RequestMethod.GET)
    @ResponseBody
    public String index(){
        System.out.println("ceshi ");
        return  "中文论码";
    }
}
