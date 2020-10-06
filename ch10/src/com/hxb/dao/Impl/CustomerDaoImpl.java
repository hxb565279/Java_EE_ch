package com.hxb.dao.Impl;

import com.hxb.dao.CustomerDao;
import com.hxb.po.Customer;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class CustomerDaoImpl extends SqlSessionDaoSupport implements CustomerDao {
    //通过ID查询
    @Override
    public Customer findCustomerById(Integer id) {
        return this.getSqlSession().selectOne("com.hxb.po.CustomerMapper.findCustomerById", id);
    }
}
