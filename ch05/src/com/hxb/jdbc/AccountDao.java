package com.hxb.jdbc;

import com.hxb.jdbc.Account;

import java.util.List;

public interface AccountDao {
    //添加
    public int addAccount(Account account);
    //更新
    public int updateAccount(Account account);
    //删除账户
    public int deleteAccount(int id);
    //通过id查询
    public Account findAccountByID(int id);
    //查询所有用户
    public List<Account> findAllAccount();
     //转账
    public void transfer(String outUser,String inUser,Double money);
}
