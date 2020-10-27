package com.hxb.text;

import com.hxb.po.Customer;
import com.hxb.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MybatisTest {


    @Test
    public void findCustomerByNameOrJobsTest() {
        SqlSession session = MybatisUtils.getSession();
        Customer customer = new Customer();
//	    customer.setUsername("jack");
//	    customer.setJobs("teacher");
        List<Customer> customers = session.selectList("com.hxb.mapper"
                + ".CustomerMapper.findCustomerByNameOrJobs", customer);
        for (Customer customer2 : customers) {
            System.out.println(customer2);
        }
        session.close();
    }


    @Test
    public void updateCustomerTest() {
        SqlSession sqlSession = MybatisUtils.getSession();
        Customer customer = new Customer();
        customer.setId(3);
        customer.setPhone("13311111234");
        int rows = sqlSession.update("com.hxb.mapper"
                + ".CustomerMapper.updateCustomer", customer);
        if (rows > 0) {
            System.out.println("成功更新" + rows +"条数据");
        } else {
            System.out.println("更新失败");
        }
        sqlSession.commit();
        sqlSession.close();
    }


    @Test
    public void findCustomerByIdsTest() {
        SqlSession session = MybatisUtils.getSession();
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        List<Customer> customers = session.selectList("com.hxb.mapper"
                + ".CustomerMapper.findCustomerByIds", ids);
        for (Customer customer : customers) {
            System.out.println(customer);
        }
        session.close();
    }


    @Test
    public void findCustomerByNameTest() {
        SqlSession session = MybatisUtils.getSession();
        Customer customer = new Customer();
        customer.setUsername("j");
        List<Customer> customers = session.selectList("com.hxb.mapper"
                + ".CustomerMapper.findCustomerByName", customer);
        for (Customer customer2 : customers) {
            System.out.println(customer2);
        }
        session.close();
    }
}
