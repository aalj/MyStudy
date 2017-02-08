package com.wdsunday.service;

import javax.annotation.Resource;

import com.wdsunday.dao.UserInfoDao;
import com.wdsunday.dao.bean.UserEntity;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Service("helloService")
@Repository
public class HelloService implements IHelloService {
    private static final Log log = LogFactory.getLog(HelloService.class);
    private UserInfoDao userDao;

    public UserInfoDao getUserDao() {
        return userDao;
    }

    @Resource
    public void setUserDao(UserInfoDao userDao) {
        this.userDao = userDao;
    }

    public int addUser(String userName) throws Exception {
        log.info("----------------addUser---------------");
        UserEntity userInfo = new UserEntity();
        userInfo.setName(userName);
        userDao.getSession().save(userInfo);
        return 1;
    }


}