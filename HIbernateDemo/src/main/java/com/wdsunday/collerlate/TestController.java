package com.wdsunday.collerlate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liangjun on 2017/1/12.
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping(value = "/begin",method = RequestMethod.GET)
    @ResponseBody
    public String beginTest(){


        return "success";
    }

}
