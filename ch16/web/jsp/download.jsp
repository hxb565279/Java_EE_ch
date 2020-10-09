<%@ page import="java.net.URLEncoder" %><%--
  Created by IntelliJ IDEA.
  User: windows
  Date: 2020/10/9
  Time: 18:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/download?filename=<%=URLEncoder.encode("","utf-8")%>">
    文件下载
</a>
</body>
</html>
