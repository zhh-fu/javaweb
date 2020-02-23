<%--
  Created by IntelliJ IDEA.
  User: ChrisLin3
  Date: 2019/5/13
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>中转</title>
</head>
<body>
    <%
    String requestName=request.getParameter("user");
    String requestConfirmName=request.getParameter("userConfirm");
    String food=request.getParameter("food");
    session.setAttribute("name",requestName);
    session.setAttribute("name1",requestConfirmName);
    session.setAttribute("food",food);
    %>
    <form action="show.jsp" method="post">
        <input type="submit" value="确认">
    </form>



</body>
</html>
