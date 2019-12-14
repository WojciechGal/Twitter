<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Wojciech
  Date: 14.12.2019
  Time: 19:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${tweets}" var="tweet">
        <div>Tweet: ${tweet.text} - author: ${tweet.author.nick}, ${tweet.createdOn}</div>
    </c:forEach>
</body>
</html>
