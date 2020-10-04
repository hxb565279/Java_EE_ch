package com.hxb.jdk;

import com.hxb.aspect.MyAspect;
import java.lang.reflect.Proxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkProxy implements InvocationHandler {
    private UserDao userDao;
    //代理方法
    public Object createProxy(UserDao userDao) {
        this.userDao = userDao;
        //类加载器
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        //所有接口
        Class[] classz = userDao.getClass().getInterfaces();
        return Proxy.newProxyInstance(classLoader, classz, this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //切面
        MyAspect myAspect = new MyAspect();
        myAspect.check_Permissions();
        Object oj = method.invoke(userDao, args);
        myAspect.log();
        myAspect.end();
        return oj;
    }
}
