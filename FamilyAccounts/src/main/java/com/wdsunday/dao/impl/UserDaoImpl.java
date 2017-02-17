package com.wdsunday.dao.impl;

import com.wdsunday.dao.UserDao;
import com.wdsunday.dao.base.impl.BaseDaoImpl;
import com.wdsunday.dao.entity.User;
import org.hibernate.SessionFactory;
import org.omg.PortableInterceptor.USER_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.resource.DefaultServletHttpRequestHandler;

/**
 * Created by liangjun on 2017/2/14.
 */
@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{


    public void saveUser(User user) {
        System.out.println(this.getHibernateTemplate());
        this.save(user);
    }

}
