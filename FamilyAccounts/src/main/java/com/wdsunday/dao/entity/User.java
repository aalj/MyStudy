package com.wdsunday.dao.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by liangjun on 2017/2/14.
 */
@Table(name = "user")
public class User {
    @Id()
    @Column(name = "ID" ,length = 32)
    private Long id;
    @Column(name = "NAME",length = 20)
    private String name;
    @Column(name = "age",length = 5)
    private String age;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}