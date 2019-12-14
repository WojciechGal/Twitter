<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Wojciech
  Date: 14.12.2019
  Time: 18:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form:form action="/sendTweet" method="post" modelAttribute="tweet">
        <form:input path="id" type="hidden"/>
        <form:input path="author" type="hidden"/>
        <form:input path="text" type="text"/>
        <form:button type="sumbit">Submit</form:button>
    </form:form>
</body>
</html>
