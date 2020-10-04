package com.hxb.Text;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceText2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/hxb/instance/static_factory/beans2.xml");
        System.out.println(applicationContext.getBean("bean2"));
    }
}
