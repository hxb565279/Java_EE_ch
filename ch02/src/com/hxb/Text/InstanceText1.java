package com.hxb.Text;

import com.hxb.instance.Bean1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceText1 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/hxb/instance/beans1.xml");
        Bean1 bean1 =(Bean1) applicationContext.getBean("bean1");
        System.out.println(bean1);
    }
}
