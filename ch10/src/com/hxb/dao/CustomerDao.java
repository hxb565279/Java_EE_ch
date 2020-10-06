package com.hxb.dao;

import com.hxb.po.Customer;

public interface CustomerDao {
    public Customer findCustomerById(Integer id);
}
