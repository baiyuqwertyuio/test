package com.qf.service;

import com.qf.pojo.User;

import java.util.List;

public interface UserService {

    List<User> selectAll();

    User selectById(int id);

    int update(User user);

}
