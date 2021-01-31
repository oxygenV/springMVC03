<%--
  Created by IntelliJ IDEA.
  User: acfun
  Date: 2021/1/31
  Time: 2:19 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%pageContext.setAttribute("cc",request.getContextPath());%>
<html>
<head>
    <title>Title</title>
    <script src="scripts/jquery-1.9.1.min.js"></script>
</head>
<body>
<a href="${cc}/json">获取用户信息</a>
<div>

</div>

</body>
<script type="text/javascript">
    $("a:first").click(function (){
        $.ajax({
            url:"${cc}/json",
            type:"get",
            success:function (data){
                $.each(data,function (){
                    var user=this.id+"--"+this.name+"--"+this.age+"--"+this.gender
                    $("div").append(user+'</br>')
                })
            }
        });
        return false;
    })
</script>
</html>
