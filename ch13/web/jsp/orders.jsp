<%--
  Created by IntelliJ IDEA.
  User: windows
  Date: 2020/10/7
  Time: 20:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/findOrdersWithUser"
      method="post">
    订单编号：<input type="text" name="ordersId"/><br/>
    所属用户：<input type="text" name="user.username"/><br/>
    <input type="submit" value="查询"/>
</form>
</body>
</html>
