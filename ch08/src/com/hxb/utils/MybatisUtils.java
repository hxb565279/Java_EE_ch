package com.hxb.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory = null;

    // ��ʼ��SqlSessionFactory����
    static {
        try {
            // ʹ��MyBatis�ṩ��Resources�����mybatis�������ļ�
            Reader reader =
                    Resources.getResourceAsReader("mybatis-config.xml");
            // ����sqlSession�Ĺ���
            sqlSessionFactory =
                    new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ��ȡSqlSession����ľ�̬����
    public static SqlSession getSession() {
        return sqlSessionFactory.openSession();
    }
}
