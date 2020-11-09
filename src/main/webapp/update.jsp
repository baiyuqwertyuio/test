<%--
  Created by IntelliJ IDEA.
  User: 29796
  Date: 2020/11/9
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="update" method="post">
    <input type="text" name="id" value="${user.id}">
    <input type="text" name="name" value="${user.name}">
    <input type="password" name="password" value="${user.password}">
    <input type="birth" name="birth" value="${user.birth}">
    <input type="text" name="idCard" value="${user.idCard}">
    <input type="text" name="tel" value="${user.tel}">
    <input type="text" name="balance" value="${user.balance}">
    <input type="text" name="username" value="${user.username}">
    <input type="submit" value="修改">
</form>

</body>
</html>
