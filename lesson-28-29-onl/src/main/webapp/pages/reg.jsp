<%--
  Created by IntelliJ IDEA.
  User: dimon
  Date: 23.07.2024
  Time: 2:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<jsp:include page="_bootstrap.jsp"/>
<jsp:include page="_header.jsp"/>
<form action="/reg" method="post">
    <input type="text" name="username" placeholder="Username">
    <input type="text" name="password" placeholder="Password">
    <input type="email" name="email" placeholder="Email">
    <input type="submit" value="Submit">
</form>
</body>
</html>
