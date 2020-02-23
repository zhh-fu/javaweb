<%--
  Created by IntelliJ IDEA.
  User: ChrisLin3
  Date: 2019/5/30
  Time: 17:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%request.setCharacterEncoding("UTF-8");%>
<%@taglib prefix="qwerdf" uri="/WEB-INF/stringChange.tld"%>
<html>
<head>
    <meta http-equiv="content-type" content="text/html" charset="UTF-8">
    <title>处理结果页面</title>
</head>
<body>
    内容为：<br>
    ${qwerdf:stringChange(param.content)}
</body>
</html>
