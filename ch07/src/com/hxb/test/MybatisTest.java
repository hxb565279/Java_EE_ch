package com.hxb.test;

import com.hxb.po.User;
import com.hxb.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MybatisTest {
    @Test
    public void findAllUserTest() {
        // 获取SqlSession
        SqlSession sqlSession = MybatisUtils.getSession();
        // SqlSession执行映射文件中定义的SQL，并返回映射结果
        List<User> list = sqlSession.selectList("com.hxb.mapper.UserMapper.findAllUser");
        for (User user : list) {
            System.out.println(user);
        }
        // 关闭SqlSession
        sqlSession.close();
    }

}
