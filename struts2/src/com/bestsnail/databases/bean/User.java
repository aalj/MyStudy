package com.bestsnail.databases.bean;

/**
 * Created by stone on 16-12-10.
 */
public class User {


    private String _username = null;
    private String _id = null;
    private String _userPwd = null;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_username() {
        return _username;
    }

    public void set_username(String _username) {
        this._username = _username;
    }

    public String get_userPwd() {
        return _userPwd;
    }

    public void set_userPwd(String _userPwd) {
        this._userPwd = _userPwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "_username='" + _username + '\'' +
                ", _id='" + _id + '\'' +
                ", _userPwd='" + _userPwd + '\'' +
                '}';
    }
}
