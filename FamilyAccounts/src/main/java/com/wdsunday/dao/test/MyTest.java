package com.wdsunday.dao.test;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liangjun on 2017/2/17.
 */
public class MyTest {
    @Test
    public void demo1(){
        ApplicationContext ac1 = new ClassPathXmlApplicationContext("application.xml");
       SessionFactory sessionFactory = (SessionFactory) ac1.getBean("sessionFactory");
        System.out.println(sessionFactory);
    }
}
