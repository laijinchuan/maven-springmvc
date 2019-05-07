<%--
  Created by IntelliJ IDEA.
  User: ThinkPad
  Date: 2019/4/29
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/jsp/login.action" method="post">
    用户名：<input type="text" name="User.username">
    密码:<input type="password" name="User.password" >
    <input type="submit">
</form>
</body>
</html>
