<%--
  Created by IntelliJ IDEA.
  User: windows
  Date: 2020/10/8
  Time: 23:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${msg}
<form action="${pageContext.request.contextPath }/login"
      method="POST">
    <label>用户名：<input type="text" name="username"/><br/></label>
    <label> 密&nbsp;&nbsp;&nbsp;码：
        <input type="password" name="password"/><br/></label>
    <label> <input type="submit" value="登录"/></label>
</form>
</body>
</html>
