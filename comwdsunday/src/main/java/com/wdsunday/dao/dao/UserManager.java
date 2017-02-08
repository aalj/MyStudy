package com.wdsunday.dao.dao;

import com.wdsunday.dao.bean.UserEntity;

import java.util.List;

/**
 * Created by liangjun on 2017/1/18.
 */
public interface UserManager {

    UserEntity getUser(long _id);
    List<UserEntity> getAllUser();
    void  addUser(UserEntity userEntity);

}
