package com.wdsunday.service;

import com.wdsunday.dao.UserDao;

import javax.annotation.Resource;

/**
 * Created by liangjun on 2017/2/14.
 */
public class UsrService {
    @Resource
    UserDao userDao;
}
