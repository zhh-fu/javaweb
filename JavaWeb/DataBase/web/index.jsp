<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Driver" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.SQLException" %><%--
  Created by IntelliJ IDEA.
  User: ChrisLin3
  Date: 2019/5/22
  Time: 22:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>图书库界面</title>
  </head>
  <body>
    <form action="AddBook.jsp" method="post" onsubmit="return check(this)">
        <table align="center" width="450">
            <tr>
                <td align="center" colspan="2">
                     <h3>添加图书信息</h3>
                </td>
            </tr>
            <tr>
                <td align="center">图书名称：</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td align="center">价    格：</td>
                <td><input type="text" name="price"></td>
            </tr>
            <tr>
                <td align="center">图书数量：</td>
                <td><input type="text" name="bookCount"></td>
            </tr>
            <tr>
                <td align="center">图书作者：</td>
                <td><input type="text" name="author"></td>
            </tr>
            <tr>
                <td align="center" colspan="2">
                    <input type="submit" name="Submit" value="添加">
                </td>
            </tr>
        </table>
    </form>
    <hr>
    <center>
    <div style="margin:0 auto;">
        <center><a href="FindServlet?page=1"><h3>查看所有图书</h3></a></center>
        <form action="FindBookServlet" method="post" onsubmit="return check(this)">
              <table align="center" border="1">
                  <tr align="right">
                      <td align="center">
                          请输入查询对象:
                          <input type="text" name="selectBook">
                          <input type="submit" name="Submit" value="查询">
                      </td>
                  </tr>
              </table>
          </form>
    </div>
    </center>
  </body>
</html>
