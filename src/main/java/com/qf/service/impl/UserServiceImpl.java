package com.qf.service.impl;

import com.qf.dao.UserDao;
import com.qf.dao.impl.UserDaoImpl;
import com.qf.pojo.User;
import com.qf.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao ud = new UserDaoImpl();
    @Override
    public List<User> selectAll() {
        return ud.selectAll();
    }

    @Override
    public User selectById(int id) {
        return ud.selectById(id);
    }

    @Override
    public int update(User user) {
        return ud.update(user);
    }
}
