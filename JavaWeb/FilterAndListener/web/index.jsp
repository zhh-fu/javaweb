<%--
  Created by IntelliJ IDEA.
  User: ChrisLin3
  Date: 2019/5/16
  Time: 21:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>图书信息添加</title>
  </head>
  <body>
    <form action="show.jsp" method="post">
      <table align="center" border="2" width="400">
        <tr>
          <td align="center" colspan="2">
            <h2>添加图书信息</h2>
          </td>
        </tr>
        <tr>
          <td align="right" > 图书编号: </td>
          <td>
            <input name="id" type="text">
          </td>
        </tr>
        <tr>
          <td align="right" > 图书名字: </td>
          <td>
            <input name="name" type="text">
          </td>
        </tr>
        <tr>
          <td align="right" > 作    者: </td>
          <td>
            <input name="author" type="text">
          </td>
        </tr>
        <tr>
          <td align="right" > 价    格: </td>
          <td>
            <input name="price" type="text">
          </td>
        </tr>
          <tr>
              <td colspan="2" align="center">
                  <input name="Submit" type="submit" value="提交">
              </td>
          </tr>
      </table>
    </form>
  </body>
</html>
