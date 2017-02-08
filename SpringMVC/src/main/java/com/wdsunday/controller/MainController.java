package com.wdsunday.controller;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;


/**
 * Created by junliang on 2016/12/16.
 */


@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {

        String s = doPost("http://gank.io/api/data/Android/10/1", null);

        return "s";
    }


    public String doPost(String url, Map<String, String> mapParam) {
        DefaultHttpClient client = new DefaultHttpClient();
        HttpGet get = new HttpGet(url);
//        get.setHeader();
        //http://gank.io/api/data/Android/10/1


        try {
            HttpResponse response2 = client.execute(get);

            HttpEntity resEntity = response2.getEntity();
            HttpEntity entity = response2.getEntity();
            if (resEntity != null) {
             return EntityUtils.toString(entity, "UTF-8");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return "";
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
//    @RequestMapping(value = "/param", method = RequestMethod.GET)
//    public String requestParam(Model model, @RequestParam(name = "name", defaultValue = "guest") String name) {
//
//        model.addAttribute("name", name);
//        System.out.println("传送过来的数据----" + name);
//
//        return "info";
//    }

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
                             @PathVariable(value = "b")String B){

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


        String s = doPost("http://gank.io/api/data/Android/10/1", null);

//        return s;

        return "汉子";
    }


//    @RequestMapping(value = "/login")
//    public String userLogin(Model model ,
//                            @RequestParam(name = "username",defaultValue = "null")String userName,
//                            @RequestParam(name = "pd",defaultValue = "null") String pd){
//        System.out.println("userName    "+userName);
//        System.out.println("pd    "+pd);
//        if("null".equals(userName)||"null".equals(pd)){
//            return "redirect:/";
//        }
//
//
//        model.addAttribute("user",userName);
//        model.addAttribute("pw",pd);
//
//        return "userInfo";
//    }


}

