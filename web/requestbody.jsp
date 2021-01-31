<%--
  Created by IntelliJ IDEA.
  User: acfun
  Date: 2021/1/31
  Time: 8:57 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
pageContext.setAttribute("cc",request.getContextPath());
%>
<html>
<head>
    <title>Title</title>
    <script src="scripts/jquery-1.9.1.min.js"></script>
</head>
<body>
<form action="${cc}/request" method="post">
    <input name="username" value="zhangsan">
    <input name="password" value="123456">
    <input type="submit" value="commit">
</form>
<a href="${cc}/requestjson">点击发送请求</a>
</body>
<script>
    $("a:first").click(function (){
        var user={id:"1",name:"zhangsan",age:"15",gender:"man"};
        var jsonUser = JSON.stringify(user);
        $.ajax({
            url:"${cc}/requestjson",
            type:"post",
            data:jsonUser,
            contentType:"application/json",
            success:function (data){
                console.log(data);
            }
        });
        return false;
    })
</script>
</html>
