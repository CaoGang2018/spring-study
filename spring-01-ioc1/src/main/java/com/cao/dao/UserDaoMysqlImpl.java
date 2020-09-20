package com.cao.dao;

/**
 * @author admin_cg
 * @date 2020/9/9 19:24
 */
public class UserDaoMysqlImpl implements UserDao {
    private UserDao userDao;


    @Override
    public void getUser() {
        System.out.println("Mysql获取数据");
    }
}
