package com.hxb.Text;

import com.hxb.instance.assemble.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class usertEXT1 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/hxb/instance/assemble/beans5.xml");
        User user1 = (User) applicationContext.getBean("user1");
        User user2 = (User) applicationContext.getBean("user2");
        System.out.println(user1);
        System.out.println(user2);
    }
}
