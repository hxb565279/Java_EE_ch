package com.hxb.dao.impl;

import com.hxb.dao.UserDao;
import com.hxb.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void say() {
        this.userDao.say();
        System.out.println("执行user service 成功");
    }
}
