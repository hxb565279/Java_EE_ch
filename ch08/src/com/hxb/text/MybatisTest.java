package com.hxb.text;

import com.hxb.po.Customer;
import com.hxb.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MybatisTest {
//    /**
//     * ���ݿͻ�������ְҵ���������ѯ�ͻ���Ϣ�б�
//     */
//    @Test
//    public void findCustomerByNameAndJobsTest(){
//        // ͨ������������SqlSession����
//        SqlSession session = MybatisUtils.getSession();
//        // ����Customer���󣬷�װ��Ҫ��ϲ�ѯ������
//        Customer customer = new Customer();
//        customer.setUsername("jack");
////		customer.setJobs("teacher");
//        // ִ��SqlSession�Ĳ�ѯ���������ؽ����
//        List<Customer> customers = session.selectList("com.hxb.mapper"
//                + ".CustomerMapper.findCustomerByNameAndJobs",customer);
//        // �����ѯ�����Ϣ
//        for (Customer customer2 : customers) {
//            // ��ӡ������
//            System.out.println(customer2);
//        }
//        // �ر�SqlSession
//        session.close();
//    }

    /**
     * ���ݿͻ�������ְҵ��ѯ�ͻ���Ϣ�б�
     */
    @Test
    public void findCustomerByNameOrJobsTest() {
        // ͨ������������SqlSession����
        SqlSession session = MybatisUtils.getSession();
        // ����Customer���󣬷�װ��Ҫ��ϲ�ѯ������
        Customer customer = new Customer();
//	    customer.setUsername("jack");
//	    customer.setJobs("teacher");
        // ִ��SqlSession�Ĳ�ѯ���������ؽ����
        List<Customer> customers = session.selectList("com.hxb.mapper"
                + ".CustomerMapper.findCustomerByNameOrJobs", customer);
        // �����ѯ�����Ϣ
        for (Customer customer2 : customers) {
            // ��ӡ������
            System.out.println(customer2);
        }
        // �ر�SqlSession
        session.close();
    }

    /**
     * ���¿ͻ�
     */
    @Test
    public void updateCustomerTest() {
        // ��ȡSqlSession
        SqlSession sqlSession = MybatisUtils.getSession();
        // ����Customer���󣬲���������������
        Customer customer = new Customer();
        customer.setId(3);
        customer.setPhone("13311111234");
        // ִ��SqlSession�ĸ��·��������ص���SQL���Ӱ�������
        int rows = sqlSession.update("com.hxb.mapper"
                + ".CustomerMapper.updateCustomer", customer);
        // ͨ�����ؽ���жϸ��²����Ƿ�ִ�гɹ�
        if (rows > 0) {
            System.out.println("���ɹ��޸���" + rows + "�����ݣ�");
        } else {
            System.out.println("ִ���޸Ĳ���ʧ�ܣ�����");
        }
        // �ύ����
        sqlSession.commit();
        // �ر�SqlSession
        sqlSession.close();
    }

    /**
     * ���ݿͻ����������ѯ�ͻ���Ϣ
     */
    @Test
    public void findCustomerByIdsTest() {
        // ��ȡSqlSession
        SqlSession session = MybatisUtils.getSession();
        // ����List���ϣ���װ��ѯid
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        // ִ��SqlSession�Ĳ�ѯ���������ؽ����
        List<Customer> customers = session.selectList("com.hxb.mapper"
                + ".CustomerMapper.findCustomerByIds", ids);
        // �����ѯ�����Ϣ
        for (Customer customer : customers) {
            // ��ӡ������
            System.out.println(customer);
        }
        // �ر�SqlSession
        session.close();
    }

    /**
     * bindԪ�ص�ʹ�ã����ݿͻ���ģ����ѯ�ͻ���Ϣ
     */
    @Test
    public void findCustomerByNameTest() {
        // ͨ������������SqlSession����
        SqlSession session = MybatisUtils.getSession();
        // ����Customer���󣬷�װ��ѯ������
        Customer customer = new Customer();
        customer.setUsername("j");
        // ִ��sqlSession�Ĳ�ѯ���������ؽ����
        List<Customer> customers = session.selectList("com.hxb.mapper"
                + ".CustomerMapper.findCustomerByName", customer);
        // �����ѯ�����Ϣ
        for (Customer customer2 : customers) {
            // ��ӡ������
            System.out.println(customer2);
        }
        // �ر�SqlSession
        session.close();
    }
}
