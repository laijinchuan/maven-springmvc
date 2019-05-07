<%--
  Created by IntelliJ IDEA.
  User: l_computer
  Date: 2019/5/7
  Time: 22:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>json测试</title>
    <script type="text/javascript" src="jquery/jquery-3.1.1.js"></script>
    <script type="text/javascript">
        function requestJson() {
            $.ajax({
                    type:'post',
                    url:'${pageContext.request.contextPath}/requestJson.action',
                    contentType:'application/json;charset=utf-8',
                    data:'{"username":"赖金川","password":"123","order":123}',
                    success:function (data) {
                        alert(data.username);
                    }
                }
            );
        }
        function responseJSon() {
            $.ajax({
                    type:'post',
                    url:'${pageContext.request.contextPath}/responseJson.action',
                    // contentType:'application/json;charset=utf-8',
                    data:'username=赖金川&password=3321&order=222',
                    success:function (data) {
                        alert(data.username);
                    }
                }
            );
        }

    </script>
</head>

<body>
<input type="button" onclick="requestJson();" value="json请求JSON串"/>
<input type="button" onclick="responseJSon();" value="json请求KEY/VALUE"/>
</body>

</html>
