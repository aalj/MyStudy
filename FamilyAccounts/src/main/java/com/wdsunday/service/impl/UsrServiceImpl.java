package com.wdsunday.service.impl;

import com.wdsunday.dao.UserDao;
import com.wdsunday.model.entity.FamilyUser;
import com.wdsunday.service.UsrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liangjun on 2017/2/14.
 */
@Service
public class UsrServiceImpl implements UsrService {
    @Autowired
    UserDao userDao;

    public void saveUser(FamilyUser user){
        userDao.saveUser(user);
    }

    public FamilyUser signIn(FamilyUser familyUser) {
       return userDao.findUserByName(familyUser.getUserName());
    }


}
