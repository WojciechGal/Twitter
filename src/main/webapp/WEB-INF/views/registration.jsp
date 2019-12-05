<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <form:form method="post" modelAttribute="author">
        Nick:
        <form:input path="nick" class="form-control"/>
        <form:errors path="nick" cssClass="error"/>
        Password:
        <form:password path="password" class="form-control"/>
        <form:errors path="password" cssClass="error"/>
        <input type="submit" value="Register" class="btn btn-primary">
    </form:form>
</div>
</body>
</html>
