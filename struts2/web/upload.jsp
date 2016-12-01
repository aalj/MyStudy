<%--
  Created by IntelliJ IDEA.
  User: stone
  Date: 16-12-1
  Time: 下午8:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传文件</title>
</head>
<body>
    <form name="upload" method="post" action="upload.action" enctype="multipart/form-data">
        文件介绍：<input type="text" name="name"/><br/>
        选择文件：<input type="file" name="file2"/><br/>
        <input type="submit" name="上传文件"/>
    </form>
</body>
</html>
