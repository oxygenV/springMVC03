<%--
  Created by IntelliJ IDEA.
  User: acfun
  Date: 2021/1/31
  Time: 11:43 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1><fmt:message key="welcomeinfo"></fmt:message></h1>
<form action="${cc}/i18n" method="post">
    <fmt:message key="username"></fmt:message><input type="text" name="username"/>
    <fmt:message key="password"></fmt:message><input type="text" name="password"/>
    <input type="submit" value="<fmt:message key="btn"/>"/>
</form>
<a href="${cc}/i18n?locale=zh_cn">中文</a><br>
<a href="${cc}/i18n?locale=en_US">英文</a>
</body>
</html>
