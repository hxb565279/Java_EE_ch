package com.hxb.cglib;

public class cglibText {
    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
        UserDao userDao = new UserDao();
        UserDao proxy = (UserDao) cglibProxy.createProxy(userDao);
   proxy.addUser();
   proxy.deleteUser();
    }
}
