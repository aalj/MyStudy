package com.wdsunday.dao.base;

/**
 * Created by liangjun on 2017/2/14.
 * 提供基本的增删改查的接口
 */
public interface BaseDao<T> {


    void save(T entity);

}
