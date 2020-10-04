package com.hxb.aspectj.xml;

import com.hxb.jdk.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXmlAspectj {
    public static void main(String[] args) {
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/hxb/aspectj/xml/applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao2");
        userDao.addUser();
    }






}
