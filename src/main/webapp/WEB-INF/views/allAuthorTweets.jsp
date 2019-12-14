<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Wojciech
  Date: 03.12.2019
  Time: 21:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${messages}" var="message">
        <div>Wiadomość: ${message.text} - autor: ${message.user}</div>
    </c:forEach>
    <div>
        <form:form action="/addMessage" method="post" modelAttribute="message">
            <form:input path="user" type="hidden"/>
            <form:input path="text" type="text"/>
            <form:button type="sumbit" value="Opublikuj"/>
        </form:form>
    </div>
</body>
</html>
