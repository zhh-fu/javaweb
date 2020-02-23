<%--
  Created by IntelliJ IDEA.
  User: ChrisLin3
  Date: 2019/5/26
  Time: 21:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加结果</title>
</head>
<body>
<% request.setCharacterEncoding("UTF-8");%>
<jsp:useBean id="book" class="source.Book"></jsp:useBean>
<jsp:setProperty name="book" property="*"/>
<jsp:useBean id="conn" class="source.setConnection"></jsp:useBean>
<%
        String sql="insert into tb_books(name,price,bookCount,author) values(?,?,?,?)";
        PreparedStatement preparedStatement=conn.getConnection().prepareStatement(sql);
        preparedStatement.setString(1,book.getName());
        preparedStatement.setDouble(2,book.getPrice());
        preparedStatement.setInt(3,book.getBookCount());
        preparedStatement.setString(4,book.getAuthor());
        preparedStatement.executeUpdate();
        out.print("成功添加图书");
        preparedStatement.close();
        conn.getConnection().close();

%>
<br>
<a href="index.jsp">返回</a>
</body>
</html>
