package com.wdsunday.service;

import com.wdsunday.dao.UserDao;
import com.wdsunday.dao.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by liangjun on 2017/2/14.
 */

public interface UsrService  {

    public void saveUser(User user);
}
