package com.hxb.core.dao;

import com.hxb.core.po.User;
import org.apache.ibatis.annotations.Param;

/**
 * �û�Dao��ӿ�
 */

public interface UserDao {
    /**
     * ͨ���˺������ѯ
     */
    public User findUser(@Param("usercode") String usercode, @Param("password") String password);
}
