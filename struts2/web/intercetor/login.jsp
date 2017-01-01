<%--
  Created by IntelliJ IDEA.
  User: stone
  Date: 16-12-10
  Time: 下午5:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/intercetor_user_login.action" method="post">
    用户名：<input type="text" name="user._username"><br/>
    密码：<input type="password" name="user._userPwd"><br/>
    <input type="submit" name="登录">
</form>
</body>
</html>
