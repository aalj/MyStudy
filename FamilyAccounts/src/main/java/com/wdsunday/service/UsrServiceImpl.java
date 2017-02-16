package com.wdsunday.service;

import com.wdsunday.dao.UserDao;
import com.wdsunday.dao.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by liangjun on 2017/2/14.
 */
@Service
@Transactional
public class UsrServiceImpl implements UsrService {
    @Autowired
    UserDao userDaoimpl;

    public void saveUser(User user){
        userDaoimpl.saveUser(user);
    }
}
