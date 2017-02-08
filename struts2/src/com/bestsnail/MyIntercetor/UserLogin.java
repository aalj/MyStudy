package com.bestsnail.MyIntercetor;

import com.bestsnail.databases.bean.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by stone on 16-12-10.
 */
public class UserLogin extends ActionSupport {
    User user = new User();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String login(){

        System.out.println(user.toString());



        return "login";
    }

}
