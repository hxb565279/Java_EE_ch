<%--
  Created by IntelliJ IDEA.
  User: windows
  Date: 2020/10/7
  Time: 20:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/registerUser"
      method="post">
    用户名：<input type="text" name="username"/><br/>
    密&nbsp;&nbsp;&nbsp;码：<input type="text" name="password"/><br/>
    <input type="submit" value="注册"/>
</form>
</body>
</html>
