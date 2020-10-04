package com.hxb.instance.annotation.dao.Impl;

import com.hxb.instance.annotation.dao.UserDao;
import com.hxb.instance.annotation.dao.UserService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
   @Resource(name = "userDao")
   private UserDao userDao;
//    @Override
    public void save() {
        this.userDao.save();
        System.out.println("user Service .... save ");
    }
}
