package com.wdsunday.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * Created by junliang on 2016/12/16.
 */


@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    //SpringMVC中使用重定向
    @RequestMapping(value = "/redirect", method = RequestMethod.GET)
    public String redirectTest() {
        return "redirect:/";
    }

    /**
     * @RequestParam
     */
    //SpringMVC获取请求参数
    @RequestMapping(value = "/param", method = RequestMethod.GET)
    public String requestParam(Model model, @RequestParam(name = "name", defaultValue = "guest") String name) {

        model.addAttribute("name", name);
        System.out.println("传送过来的数据----" + name);

        return "info";
    }

    /**
     * HttpServletRequest
     * HttpServletResponse
     *
     * @RequestParam
     */
    //在SpringMVC中使用request 和responest
    @RequestMapping(value = "/request" ,method = RequestMethod.GET)
    public void getRequest(Model model ,HttpServletRequest request, HttpServletResponse response,
                           @RequestParam(value = "name",defaultValue = "未知")String name2){
        String name = request.getParameter("name");
        System.out.println("name----"+name);
        System.out.println("name2----"+name2);
        try {
            PrintWriter writer = response.getWriter();
            writer.print(name);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *@PathVariable 的使用
     */
    //通过SpringMVC获取访问地址上的内容，然后能够做某些处理
    @RequestMapping("/getURL/{a}/{b}")
    public String getUrlData(Model model,
                             @PathVariable(value = "a")String A,
                             @PathVariable(value = "b")String B
    ){

        System.out.println("A = " + A);
        System.out.println("B = " + B);
        model.addAttribute("A",A);
        model.addAttribute("B",B);

        return "info";
    }

    /**
     * @RequestBody
     */
    @RequestMapping(value = "/send",method = RequestMethod.GET)
    @ResponseBody
    public String sendString(){
        return "safsdfasdf";
    }


}

