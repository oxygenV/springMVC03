<%--
  Created by IntelliJ IDEA.
  User: acfun
  Date: 2021/1/31
  Time: 10:22 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    pageContext.setAttribute("cc",request.getContextPath());
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${cc}/upload" method="post" enctype="multipart/form-data">
描述：<input type="file" name="desc"><br>
文件上传：<input type="file" name="file"><br>
<input type="submit" value="commit">
</form>
</body>
</html>
