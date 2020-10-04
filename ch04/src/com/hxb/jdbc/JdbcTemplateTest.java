package com.hxb.jdbc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class JdbcTemplateTest {
    //返回配置文件
    public AccountDao Read() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/hxb/applicationContext.xml");
        //获取accountDao实例
        AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");
        return accountDao;
    }

    //插入
    @Test
    public void addAccount() {
        //设置对象
        Account account = new Account();
        account.setId(2);
        account.setUsername("赵跃凯");
        account.setBalance(1.0);
        int num = Read().addAccount(account);
        if (num > 0) {
            System.out.println("插入数据" + num + "数据");
        } else {
            System.out.println("更新失败");
        }
    }

    @Test
    public void updateAccountTest() {
        // 创建Account对象，并向Account对象中添加数据
        Account account = new Account();
        account.setId(1);
        account.setUsername("tom");
        account.setBalance(2000.00);
        // 执行updateAccount()方法，并获取返回结果
        int num = Read().updateAccount(account);
        if (num > 0) {
            System.out.println("成功修改了" + num + "条数据！");
        } else {
            System.out.println("修改操作执行失败！");
        }
    }

    @Test
    public void deleteAccountTest() {
        // 执行deleteAccount()方法，并获取返回结果
        int num = Read().deleteAccount(1);
        if (num > 0) {
            System.out.println("成功删除了" + num + "条数据！");
        } else {
            System.out.println("删除操作执行失败！");
        }
    }

    @Test
    public void findAccountByIdTest() {
        // 执行findAccountById()方法
        Account account = Read().findAccountByID(1);
        System.out.println(account);
    }

    @Test
    public void findAllAccountTest() {
        // 执行findAllAccount()方法,获取Account对象的集合
        List<Account> account = Read().findAllAccount();
        // 循环输出集合中的对象
        for (Account act : account) {
            System.out.println(act);
        }
    }
}
