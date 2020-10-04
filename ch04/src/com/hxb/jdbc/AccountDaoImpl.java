package com.hxb.jdbc;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.hxb.jdbc.Account;

import java.util.List;

public class AccountDaoImpl implements AccountDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //添加用户
    @Override
    public int addAccount(Account account) {
        //定义sql语句
        String SQL = "insert into account(username,balance) values(?,?)";
        //定义数组存储sql语句参数
        Object[] objects = new Object[]{
                account.getUsername(), account.getBalance()
        };
        //执行
        int num1 = this.jdbcTemplate.update(SQL, objects);
        return num1;
    }

    //更新
    @Override
    public int updateAccount(Account account) {
        //定义sql语句
        String sql = "update account  set username=? ,balance =? where id=?";
        //存放sql语句参数
        Object[] objects = new Object[]{
                account.getUsername(), account.getBalance(), account.getId()
        };
        //执行
        int num2 = this.jdbcTemplate.update(sql, objects);
        return num2;
    }

    //删除账户
    @Override
    public int deleteAccount(int id) {
        //定义sql语句
        String sql = "delete from account where id =?";
        //执行
        int num3 = this.jdbcTemplate.update(sql, id);
        return num3;
    }

    //根据id查询
    @Override
    public Account findAccountByID(int id) {
        //定义sql语句
        String SQL = "select * from account where id = ?";
        //创建一个BeanPropertyRomMapper对象
        RowMapper<Account> rowMapper = new BeanPropertyRowMapper<>(Account.class);
        return this.jdbcTemplate.queryForObject(SQL, rowMapper, id);
    }

    //查询所有信息
    @Override
    public List<Account> findAllAccount() {
      //定义sql语句
        String sql = "select * from account";
        //创建一个BeanProperRomMapper对象
        RowMapper<Account> rowMapper = new BeanPropertyRowMapper<>(Account.class);
        //执行,返回RomMapper结果
        return this.jdbcTemplate.query(sql,rowMapper);
    }
}
