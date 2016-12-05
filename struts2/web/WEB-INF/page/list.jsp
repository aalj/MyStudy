<%--
  Created by IntelliJ IDEA.
  User: stone
  Date: 16-12-3
  Time: 下午2:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>下载文件列表</title>
</head>
<body>

<p>下载的文件列表</p>
<table align="center" border="1">
    <tr>
        <td>标号</td>
        <td>名字</td>
        <td>点击下载</td>
    </tr>
    <c:forEach items="${filename}" varStatus="vs" var="filena" >
        <tr>
            <td>${vs.count}</td>
            <td>${filena}</td>
            <td>
                <c:url var="url" value="download_downResule.action">
                    <c:param name="minghzi" value="${filena}"></c:param>
                </c:url>
                <a href="${url}">下载</a>
            </td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
