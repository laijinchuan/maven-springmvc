<%--
  Created by IntelliJ IDEA.
  User: ThinkPad
  Date: 2019/4/29
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>上传图片</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/jsp/upload.action"  enctype="multipart/form-data" method="post">
   图片：<input type="file" name="userHead">
    <input type="submit">
</form>
<c:if test="${userHead!=null}">
    <img src="/image/${userHead}" alt="无法显示">
</c:if>
</body>
</html>
