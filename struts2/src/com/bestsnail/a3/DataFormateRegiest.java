package com.bestsnail.a3;

import com.bestsnail.a3.bean.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

/**
 * Created by stone on 16-12-5.
 */
public class DataFormateRegiest extends ActionSupport {
    private User user;
    /*
    对于普通属性，封装请求数据必须给set方法，get放可以不用给出
    对于对象需要提供get、set方法，避免在某些版本中导致出现问题
     */

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String regiest(){
        System.out.println(user.getUserName());
        System.out.println(user.getUserPwd());
        System.out.println(user.getUserEmail());
        System.out.println(user.getUserBirth());

        ActionContext context = ActionContext.getContext();
        Map<String,Object> request = (Map<String, Object>) context.get("request");
        request.put("userName",user);

        return  "regiest";
    }


}
