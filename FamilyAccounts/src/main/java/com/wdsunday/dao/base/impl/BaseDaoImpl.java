package com.wdsunday.dao.base.impl;

import com.wdsunday.dao.base.BaseDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import javax.annotation.Resource;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by liangjun on 2017/2/14.
 */
public class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T> {


    @Resource(name = "sessionFactory")
    public void setSessionFactoryOverride(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }

    private Class<T> entityClass;

    public BaseDaoImpl() {
        ParameterizedType parameterizedType = (ParameterizedType) this.getClass().getGenericSuperclass();
        // parameterizedType.getActualTypeArguments() == [User.class]
        Type[] types = parameterizedType.getActualTypeArguments();
        entityClass = (Class<T>) types[0];
    }

    public void save(T entity) {
        this.getHibernateTemplate().save(entity);

    }
}
