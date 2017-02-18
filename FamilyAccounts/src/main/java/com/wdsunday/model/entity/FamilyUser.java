package com.wdsunday.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


/**
 * Created by stone on 17-2-17.
 */
@Entity
@Table(name = "FAMILY_USER")
public class FamilyUser implements Serializable {

    public static final String TABLE_NAME = "family_user";
    /**
     * 主键ID
     */
    public static final String COL_NAME_ID = "ID";

    public static final String COL_NAME_LOGIN_NAME = "user_name";
    public static final String COL_NAME_LOGIN_PWD = "user_pwd";
    public static final String COL_NAME_LOGIN_TIME = "user_login_time";
    public static final String COL_NAME_NICK_NAME = "user_nick_name";

    @Id
    @Column(name = COL_NAME_ID)
    private Long ID;
    @Column(name = COL_NAME_LOGIN_NAME,unique = true,nullable = false,length = 32)
    private String userName;
    @Column(name = COL_NAME_LOGIN_PWD,nullable = false,length = 32)
    private  String userPwd;
    @Column(name = COL_NAME_LOGIN_TIME,nullable = false)
    private Long userTime;
    @Column(name = COL_NAME_NICK_NAME, length = 32)
    String nickName;

    public FamilyUser() {
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public Long getUserTime() {
        return userTime;
    }

    public void setUserTime(Long userTime) {
        this.userTime = userTime;
    }
}
