<%--
  Created by IntelliJ IDEA.
  User: 29796
  Date: 2020/11/9
  Time: 14:01
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
<table>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>password</th>
        <th>birth</th>
        <th>idCard</th>
        <th>tel</th>
        <th>balance</th>
        <th>username</th>
    </tr>
    <c:forEach var="us" items="${user}">
        <tr>
            <th>${us.id}</th>
            <th>${us.name}</th>
            <th>${us.password}</th>
            <th>${us.birth}</th>
            <th>${us.idCard}</th>
            <th>${us.tel}</th>
            <th>${us.balance}</th>
            <th>${us.username}</th>
            <th><a href="findone?id=${us.id}">修改</a></th>
            <th><a href="findone">删除</a></th>
        </tr>
    </c:forEach>
</table>
</body>
</html>
