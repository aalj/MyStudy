package com.wdsunday.dao.impl;

import com.wdsunday.dao.UserDao;
import com.wdsunday.dao.base.impl.BaseDaoImpl;
import com.wdsunday.model.entity.FamilyUser;
import org.hibernate.Criteria;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by liangjun on 2017/2/14.
 */
@Repository
public class UserDaoImpl extends BaseDaoImpl<FamilyUser> implements UserDao{


    public void saveUser(FamilyUser user) {
        System.out.println(this.getHibernateTemplate());
        this.save(user);
    }


    public FamilyUser findUserByName(String name) {
        Session currentSession = super.getSessionFactory().getCurrentSession();
        Criteria criteria = currentSession.createCriteria(FamilyUser.class)
                .add(Restrictions.eq("userName", name));
        List<FamilyUser> list = criteria.list();
        if(list.size()>0){
            return list.get(0);
        }else{
            return null;
        }
    }

}
