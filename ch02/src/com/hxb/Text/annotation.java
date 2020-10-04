package com.hxb.Text;

import com.hxb.instance.annotation.dao.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class annotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/hxb/instance/annotation/dao/beans6.xml");
        UserController userController = (UserController) applicationContext.getBean("userController");
        userController.save();
    }
}
