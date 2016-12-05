<%--
  Created by IntelliJ IDEA.
  User: stone
  Date: 16-12-5
  Time: 下午8:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/data_regiest.action" method="post">
        用户名：<input type="text" name="user.userName"/><br/>
        密码：<input type="text" name="user.userPwd"/><br/>
        邮箱：<input type="text" name="user.userEmail"/><br/>
        生日：<input type="text" name="user.userBirth"/><br/>
        <input type="submit" name="提交"/>
    </form>
</body>
</html>
