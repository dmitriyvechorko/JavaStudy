<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>Calculator</title>
</head>
<body>

<jsp:include page="_bootstrap.jsp"/>
<jsp:include page="_header.jsp"/>
<form action="/calculator" method="post">
    <input type="number" name="num1" placeholder="Enter first number">
    <input type="number" name="num2" placeholder="Enter second number">
    <input type="text" name="type" placeholder="Enter type of operation">
    <input type="submit" value="Calculate">
</form>
<p>The result is: ${result}</p>
<p>History of operations: </p>
<ul>
    <c:forEach var="item" items="${history}">
        <li>${item}</li>
    </c:forEach>
</ul>
</body>
</html>
