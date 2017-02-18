package com.wdsunday.service;

import com.wdsunday.model.entity.FamilyUser;

/**
 * Created by liangjun on 2017/2/14.
 */

public interface UsrService  {

    public void saveUser(FamilyUser user);

    public FamilyUser signIn(FamilyUser familyUser);
}
