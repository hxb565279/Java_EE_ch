package com.hxb.test;

import com.hxb.dao.CustomerDao;
import com.hxb.mapper.CustomerMapper;
import com.hxb.po.Customer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoTest {
    @Test
    public void findCustomerByIdTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerDao customer2 = (CustomerDao) applicationContext.getBean("customerDao");
        Customer customer = customer2.findCustomerById(1);
        System.out.println(customer);
    }

    @Test
    public void findCustomerByIdMapperTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerMapper bean = applicationContext.getBean(CustomerMapper.class);
        Customer c = bean.findCustomerById(1);
        System.out.println(c);
    }


}
