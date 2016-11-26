<%--
  Created by IntelliJ IDEA.
  User: stone
  Date: 16-11-22
  Time: 下午9:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <form action="${pageContext.request.contextPath}/userLogin" method="post">
      用户名：<input type="text" name="userName"/>
      <br/>
      密码：<input type="password" name="pwd"/><br/>
      <input type="submit" name="登录">
      <input type="reset" name="重置">
  </form>
</body>
</html>
