package com.hxb.instance.annotation.dao.Impl;

import com.hxb.instance.annotation.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("user dao....save");
    }
}
