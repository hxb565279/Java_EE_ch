<%--
  Created by IntelliJ IDEA.
  User: windows
  Date: 2020/10/9
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
    <title>文件上传</title>
    <script>
        // 判断是否填写上传人并已选择上传文件
        function check() {
            let name = document.getElementById("name1").value;
            let file = document.getElementById("file").value;
            if (name == "") {
                alert("填写上传人");
                return false;
            }
            if (file.length == 0 || file == "") {
                alert("请选择上传文件");
                return false;
            }
            return true;
        }
    </script>
</head>
<body>
<form action="${pageContext.request.contextPath }/fileUpload"
      method="post" enctype="multipart/form-data" onsubmit="return check()">
    <label>上传人：<input id="name1" type="text" name="name"/><br/></label>
    <label> 请选择文件：<input id="file" type="file" name="uploadfile"
                         multiple="multiple"/><br/></label>
    <label><input type="submit" value="上传"/></label>
</form>
</body>
</html>