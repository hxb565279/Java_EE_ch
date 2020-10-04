package com.hxb.factorybean;

import com.hxb.jdk.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProxyFactoryBeanText {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/hxb/factorybean/applicationContext.xml");
        UserDao userDaoProxy = (UserDao) applicationContext.getBean("userDaoProxy");
        userDaoProxy.addUser();
        userDaoProxy.deleteUser();
    }
}
