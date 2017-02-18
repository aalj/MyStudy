<%--
  Created by IntelliJ IDEA.
  User: liangjun
  Date: 2016/12/30
  Time: 13:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登陆</title>
</head>
    <body>

        <form method="post" action="/login">
            用户名：<input type="text" name="userName"/>
            <br/>
            密码：<input type="password" name="userPwd"/><br/>
            <input type="submit" name="登陆">
        </form>


    </body>
</html>
