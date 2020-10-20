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
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
    <title>Title</title>
</head>
<body>
当前用户: ${USER_SESSION.username}
<a href=" ${pageContext.request.contextPath}/logout">退出</a>
</body>
</html>
