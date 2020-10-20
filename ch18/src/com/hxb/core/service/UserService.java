package com.hxb.core.service;

import com.hxb.core.po.User;

/**
 * 用户Service接口
 */
public interface UserService {
    public User findUser(String usercode, String password);
}
