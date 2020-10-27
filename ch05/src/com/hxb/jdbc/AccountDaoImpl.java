package com.hxb.jdbc;

import com.hxb.jdbc.Account;
import com.hxb.jdbc.AccountDao;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * The type Account dao.
 */
public class AccountDaoImpl implements AccountDao {
    private JdbcTemplate jdbcTemplate;

    /**
     * 和学博
     * Sets jdbc template.
     *
     * @param jdbcTemplate the jdbc template
     */
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //添加用户
    @Override
    public int addAccount(Account account) {
        //定义sql语句
        String SQL = "insert into spring.account(username,balance) values(?,?)";
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
        String sql = "update spring.account  set username=? ,balance =? where id=?";
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
        String sql = "delete from spring.account where id =?";
        //执行
        int num3 = this.jdbcTemplate.update(sql, id);
        return num3;
    }

    //根据id查询
    @Override
    public Account findAccountByID(int id) {
        //定义sql语句
        String SQL = "select * from spring.account where id = ?";
        //创建一个BeanPropertyRomMapper对象
        RowMapper<Account> rowMapper = new BeanPropertyRowMapper<>(Account.class);
        return this.jdbcTemplate.queryForObject(SQL, rowMapper, id);
    }

    //查询所有信息
    @Override
    public List<Account> findAllAccount() {
        //定义sql语句
        String sql = "select * from spring.account";
        //创建一个BeanProperRomMapper对象
        RowMapper<Account> rowMapper = new BeanPropertyRowMapper<>(Account.class);
        //执行,返回RomMapper结果
        return this.jdbcTemplate.query(sql, rowMapper);
    }
    /**
     * 转账 2
     *
     * @param outUser 汇款人
     * @param inUser  收款人
     * @param money   收款金额
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,readOnly = false)
    public void transfer(String outUser, String inUser, Double money) {
        //收款,收款用户的金额=现有金额+所汇金额
        this.jdbcTemplate.update("update spring.account set balance = balance + ?" + "where username = ?", money, inUser);
        //模拟运行时突发问题a
//        int i = 1/0;a
        //汇款,汇款用户的金额 = 现有金额-所汇金额
        this.jdbcTemplate.update("update spring.account set balance = balance- ?" + "where username=?", money, outUser);
    }
}
