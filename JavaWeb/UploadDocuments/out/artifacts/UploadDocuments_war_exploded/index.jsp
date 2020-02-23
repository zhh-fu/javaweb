<%--
  Created by IntelliJ IDEA.
  User: ChrisLin3
  Date: 2019/5/21
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>文件上传页面</title>
  </head>
  <body>
  <form name="myform" action="show.jsp" method="post" enctype="multipart/form-data">
    选择文件：<input type="file" name="file" id="file"/>
    <%--<input type="button" name="overlook" value="浏览"/>--%>
    <input type="submit" name="Submit" id="submit1" value="上传"/>
  </form>
  </body>
</html>
