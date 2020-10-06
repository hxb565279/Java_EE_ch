package com.hxb.service.Impl;

import com.hxb.mapper.CustomerMapper;
import com.hxb.po.Customer;
import com.hxb.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;


    @Override
    public void addCustomer(Customer customer) {
        this.customerMapper.addCustomer(customer);
//        int i=1/0;
    }
}
