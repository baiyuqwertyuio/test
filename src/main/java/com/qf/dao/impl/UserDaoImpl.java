package com.qf.dao.impl;

import com.qf.dao.UserDao;
import com.qf.pojo.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserDaoImpl implements UserDao {
    private ResultSet rs;
    private Connection conn;
    private Statement statement;
    private PreparedStatement ps;

    @Override
    public List<User> selectAll() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my2007?characterEncoding=utf8", "root", "root");
            statement = conn.createStatement();
            String sql = "select * from users where 1=1";
            List<User> list = new ArrayList<>();
            rs = statement.executeQuery(sql);
            while (rs.next()){
                User user = new User();
                user.setId(Integer.valueOf(rs.getString("id")));
                user.setBalance(rs.getString("balance"));
                user.setBirth(rs.getString("birth"));
                user.setIdCard(rs.getString("idCard"));
                user.setName(rs.getString("name"));
                user.setPassword(rs.getString("password"));
                user.setTel(rs.getString("tel"));
                user.setUsername(rs.getString("username"));
                list.add(user);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                statement.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public User selectById(int id) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my2007?characterEncoding=utf8", "root", "root");
            String sql = "select * from users where id = ?";
            ps = conn.prepareStatement(sql);
            ps.setObject(1,id);
            rs = ps.executeQuery();
            User user = new User();
            if (rs.next()) {
                user.setId(Integer.valueOf(rs.getString("id")));
                user.setBalance(rs.getString("balance"));
                user.setBirth(rs.getString("birth"));
                user.setIdCard(rs.getString("idCard"));
                user.setName(rs.getString("name"));
                user.setPassword(rs.getString("password"));
                user.setTel(rs.getString("tel"));
                user.setUsername(rs.getString("username"));
            }
            return user;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int update(User user) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my2007?characterEncoding=utf8", "root", "root");
            String sql = "update users set name = ?,password=?,birth=?,idCard=?,tel=?,balance=?,username=? where id=?";
            ps = conn.prepareStatement(sql);
            ps.setObject(1,user.getName());
            ps.setObject(2,user.getPassword());
            ps.setObject(3,user.getBirth());
            ps.setObject(4,user.getIdCard());
            ps.setObject(5,user.getTel());
            ps.setObject(6,user.getBalance());
            ps.setObject(7,user.getUsername());
            ps.setObject(8,user.getId());
            int i = ps.executeUpdate();
            return i;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
