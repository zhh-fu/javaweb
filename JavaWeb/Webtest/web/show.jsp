<%--
  Created by IntelliJ IDEA.
  User: ChrisLin3
  Date: 2019/5/11
  Time: 19:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.net.URLEncoder" %>
<%@page import="java.util.Date" %>
<html>
<head>
    <title>页面</title>
</head>
<body>
    <%--<%--%>
        <%--request.setCharacterEncoding("GB18030");--%>
        <%--String user=URLEncoder.encode(request.getParameter("user"),"UTF-8");--%>
        <%--Date date=new Date();--%>
        <%--Cookie cookie=new Cookie("mrCookie",user+"##"+"2019/5/11");--%>
        <%--response.addCookie(cookie);--%>
    <%--%>--%>
    <%
        String name=(String) session.getAttribute("name");
        String name1=(String) session.getAttribute("name1");
        String food=(String) session.getAttribute("food");
    %>
    用户名是：<%=name%>
    用户名确认为：<%=name1%>
    用户最喜欢的水果：<%=food%>

</body>
</html>
