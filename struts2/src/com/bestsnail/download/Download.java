package com.bestsnail.download;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

/**
 * Created by stone on 16-12-1.
 */
public class Download extends ActionSupport {


/**
 * TODO: 16-12-3  能够实现下载
 * 1、提供显示文件列表的方法
 * 2、提供文件下的方法
 */



    String path = "/home/stone/workspace/DayNotes";
    public String list() {


        //1、获取要下载的文件路径下所有的文件列表

        File files = new File(path);
        String[] list = files.list();


        //把得到的文件列表保存到request中
        ActionContext context = ActionContext.getContext();
        Map<String,Object> request = (Map<String, Object>) context.get("request");
        request.put("filename",list);
        for (String s : list) {
            System.out.println(s);
        }
        return "list";
    }

    private String minghzi;

    public void setMinghzi(String minghzi) {
        System.out.println("转码之前的内容");
        System.out.println("1==="+minghzi);
        // 处理传入的参数中问题(get提交)
//        try {
//            minghzi = new String(minghzi.getBytes("ISO8859-1"),"UTF-8");
//        } catch (UnsupportedEncodingException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println("转码之后的内容");
        System.out.println("2==="+minghzi);
        // 把处理好的文件名，赋值
        this.minghzi = minghzi;
    }

    public String downResule(){

        return "downloadResult";
    }

    public InputStream getAttrInputStr(){
        InputStream inputStream = null;
        try{
            File f = new File(path+"/"+minghzi);
            inputStream = new FileInputStream(f);
        }catch (Exception e){
            new RuntimeException(e);
        }
        return inputStream;
    }

    // 4. 下载显示的文件名（浏览器显示的文件名）
    public String getDownFileName() {
        // 需要进行中文编码
        try {
            minghzi = URLEncoder.encode(minghzi, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        return minghzi;
    }


}
