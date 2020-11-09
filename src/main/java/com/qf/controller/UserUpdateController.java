package com.qf.controller;

import com.qf.pojo.User;
import com.qf.service.UserService;
import com.qf.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/update")
public class UserUpdateController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        String birth = req.getParameter("birth");
        String idCard = req.getParameter("idCard");
        String tel = req.getParameter("tel");
        String balance = req.getParameter("balance");
        String username = req.getParameter("username");
        Integer ids = Integer.valueOf(id);
        User user = new User(ids, name, password, birth, idCard, tel, balance, username);
        UserService us = new UserServiceImpl();
        us.update(user);
        resp.sendRedirect("/user");
    }
}
