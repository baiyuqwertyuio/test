package com.qf.dao;

import com.qf.pojo.User;

import java.util.List;

public interface UserDao {

    List<User> selectAll();

    User selectById(int id);

    int update(User user);

}
