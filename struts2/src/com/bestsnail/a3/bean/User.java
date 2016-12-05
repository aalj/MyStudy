package com.bestsnail.a3.bean;

import java.util.Date;

/**
 * Created by stone on 16-12-5.
 */
public class User {
    private String userName;
    private String userPwd;
    private String userEmail;
    private Date userBirth;

    public Date getUserBirth() {
        return userBirth;
    }

    public void setUserBirth(Date userBirth) {
        this.userBirth = userBirth;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public String getUserEmail() {
        return userEmail;
    }

}
