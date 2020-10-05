package com.hxb.test;

import com.hxb.po.Orders;
import com.hxb.po.Person;
import com.hxb.po.User;
import com.hxb.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * Mybatis关联查询映射测试类
 */
public class MybatisAssociatedTest {
    /**
     * 嵌套查询
     */
    @Test
    public void findPersonByIdTest() {
        // 1、通过工具类生成SqlSession对象
        SqlSession session = MybatisUtils.getSession();
        // 2.使用MyBatis嵌套查询的方式查询id为1的人的信息
        Person person = session.selectOne("com.hxb.mapper."
                + "PersonMapper.findPersonById", 1);
        // 3、输出查询结果信息
        System.out.println(person);
        // 4、关闭SqlSession
        session.close();
    }

    /**
     * 嵌套结果
     */
    @Test
    public void findPersonByIdTest2() {
        // 1、通过工具类生成SqlSession对象
        SqlSession session = MybatisUtils.getSession();
        // 2.使用MyBatis嵌套结果的方法查询id为1的人的信息
        Person person = session.selectOne("com.hxb.mapper."
                + "PersonMapper.findPersonById2", 1);
        // 3、输出查询结果信息
        System.out.println(person);
        // 4、关闭SqlSession
        session.close();
    }

    /**
     * 一对多
     */
    @Test
    public void findUserTest() {
        // 1、通过工具类生成SqlSession对象
        SqlSession session = MybatisUtils.getSession();
        // 2、查询id为1的用户信息
        User user = session.selectOne("com.hxb.mapper."
                + "UserMapper.findUserWithOrders", 1);
        // 3、输出查询结果信息
        System.out.println(user);
        // 4、关闭SqlSession
        session.close();
    }

    /**
     * 多对多
     */
    @Test
    public void findOrdersTest() {
        // 1、通过工具类生成SqlSession对象
        SqlSession session = MybatisUtils.getSession();
        // 2、查询id为1的订单中的商品信息
        Orders orders = session.selectOne("com.hxb.mapper."
                + "OrdersMapper.findOrdersWithProduct", 1);
        // 3、输出查询结果信息
        System.out.println(orders);
        // 4、关闭SqlSession
        session.close();
    }


}
