package com.cao.service;

import com.cao.dao.UserDao;
import com.cao.dao.UserDaoImpl;
import com.cao.dao.UserDaoMysqlImpl;

/**
 * @author admin_cg
 * @date 2020/9/9 19:14
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
