<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Wojciech
  Date: 05.12.2019
  Time: 19:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <form method="post">
        Nick:
        <input type="text" name="username"/>
        Password:
        <input type="password" name="password"/>
        <input type="submit" value="Login" class="btn btn-primary"/>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    </form>
    <c:if test="${not empty param.error}">
        Nick or password invalid
    </c:if>
</div>
</body>
</html>
