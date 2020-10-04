package com.hxb.dao.impl;

import com.hxb.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void say() {
        System.out.println("执行  user dao  成功");
    }
}
