package com.wdsunday.dao;

import com.wdsunday.dao.base.BaseDao;
import com.wdsunday.dao.base.impl.BaseDaoImpl;
import com.wdsunday.model.entity.FamilyUser;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by liangjun on 2017/2/14.
 */
@Transactional
public interface UserDao extends BaseDao<FamilyUser> {


    void saveUser(FamilyUser user);
    FamilyUser findUserByName(String name);

}
