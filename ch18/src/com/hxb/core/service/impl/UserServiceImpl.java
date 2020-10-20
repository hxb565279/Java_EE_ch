package com.hxb.core.service.impl;

import com.hxb.core.dao.UserDao;
import com.hxb.core.po.User;
import com.hxb.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 注入用户查询接口实现类
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    //通过账号密码查询
    @Override
    public User findUser(String usercode, String password) {
        User user = this.userDao.findUser(usercode, password);
        return user;
    }
}
