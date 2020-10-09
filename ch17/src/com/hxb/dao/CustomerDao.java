package com.hxb.dao;

import com.hxb.po.Customer;

public interface CustomerDao {
    /**
     * 根据ID查询
     */
    Customer findCustomerById(Integer id);
}
