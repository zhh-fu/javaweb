<%@ page import="java.util.Arrays" %><%--
  Created by IntelliJ IDEA.
  User: ChrisLin3
  Date: 2019/6/4
  Time: 9:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <% request.setCharacterEncoding("UTF-8");%>
    <%
        String[] userList={"mr","qwer","mcrsoft","豆子和豆芽菜"};
        String user= request.getParameter("user");
        int result=0;
        for (int i=0;i<userList.length;i++)
        {
            if (user.equals(userList[i]))
                result=1;
        }
        //Arrays.sort(userList);
        //
        if (result==1)
        {
            out.print("该用户名已被注册！");
            out.print(user.length());
            out.print(userList.length);
        }
        else
        {
            out.print("该用户名可以注册！");
        }
    %>
</body>
</html>
