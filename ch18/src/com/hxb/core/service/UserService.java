package com.hxb.core.service;

import com.hxb.core.po.User;

/**
 * �û�Service�ӿ�
 */
public interface UserService {
    public User findUser(String usercode, String password);
}
