package com.wdsunday;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by liangjun on 2017/1/21.
 */
public class UserEntiry {
    private Integer uid;
    private String name;
    private Set<OrderEntiry> orders = new HashSet<OrderEntiry>();

    public UserEntiry() {
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<OrderEntiry> getOrders() {
        return orders;
    }

    public void setOrders(Set<OrderEntiry> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "UserEntiry{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", orders=" + orders +
                '}';
    }
}

