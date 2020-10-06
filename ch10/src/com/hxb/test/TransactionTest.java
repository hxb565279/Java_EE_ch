package com.hxb.test;

import com.hxb.po.Customer;
import com.hxb.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionTest {
    public static void main(String[] args) {
        ApplicationContext act =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService customerService =
                act.getBean(CustomerService.class);
        Customer customer = new Customer();
        customer.setUsername("zhangsan");
        customer.setJobs("manager");
        customer.setPhone("13233334444");
        customerService.addCustomer(customer);
    }
}
