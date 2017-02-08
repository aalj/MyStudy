package com.wdsunday.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liangjun on 2017/2/8.
 */
@Controller
public class ControllerTest {
    @RequestMapping(value = "index",method = RequestMethod.POST)
    @ResponseBody
    public String index(){
        return "hello";
    }


}
