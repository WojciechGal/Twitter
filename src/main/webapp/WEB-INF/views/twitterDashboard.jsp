<%--
  Created by IntelliJ IDEA.
  User: Wojciech
  Date: 14.12.2019
  Time: 19:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2 style="text-align: center">Welcome</h2>
<button onclick="location.href='<%=request.getContextPath()%>/sendTweet'">Send tweet</button>
<button onclick="location.href='<%=request.getContextPath()%>/allAuthorTweets'">See your tweets</button>
<button onclick="location.href='<%=request.getContextPath()%>/allTweets'">See all tweets</button>
</body>
</html>
