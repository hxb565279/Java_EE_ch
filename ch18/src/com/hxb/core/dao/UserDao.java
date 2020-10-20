package com.hxb.core.dao;

import com.hxb.core.po.User;
import org.apache.ibatis.annotations.Param;

/**
 * 用户Dao层接口
 */

public interface UserDao {
    /**
     * 通过账号密码查询
     */
    public User findUser(@Param("usercode") String usercode, @Param("password") String password);
}
