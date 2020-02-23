<%--
  Created by IntelliJ IDEA.
  User: ChrisLin3
  Date: 2019/5/13
  Time: 18:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>检测是否为合法邮箱</title>
  </head>
  <body>
    <%--<form action="show.jsp" method="post" name="form1">
        <table border="2" height="90">
          <tr colspan="2" align="center">
              <h4>邮箱监测系统</h4>
          </tr>
          <tr height="15">
            <td align="right" valign="bottom" > <h5>请输入邮箱：</h5> </td>
            <td valign="top"> <input name="mailAdd" type="text" value=""> </td>
          </tr>
          <tr >
              <td align="center" colspan="2">
            <input type="submit" name="Submit" value="确认">
              </td>
          </tr>
        </table>
    </form>--%>
  <form action="show.jsp" method="post" name="myform">
      <h2> 调查问卷 </h2>
        <hr/>
      <ul>
          <li>你使用过哪些语言：</li>
          <li>
              <input name="language" type="checkbox" value="JAVA"> JAVA
              <input name="language" type="checkbox" value="C"> C
              <input name="language" type="checkbox" value="C++"> C++
              <input name="language" type="checkbox" value="PHP"> PHP
          </li>
      </ul>
      <hr/>
      <ul>
          <li>你目前掌握的技术：</li>
          <li>
              <input name="techlogy" type="checkbox" value="HTML"> HTML
              <input name="techlogy" type="checkbox" value="JAVA BEAN"> JAVA BEAN
              <input name="techlogy" type="checkbox" value="JSP"> JSP++
              <input name="techlogy" type="checkbox" value="JDBC"> JDBC
          </li>
      </ul>
      <hr/>
      <ul>
          <li>你觉得哪些比较难：</li>
          <li>
              <input name="part" type="checkbox" value="JSP"> JSP
              <input name="part" type="checkbox" value="SERVLET"> SERVLET
              <input name="part" type="checkbox" value="PATHON"> PATHON
          </li>
      </ul>
      <input type="submit" name="Submit" value="提交">
  </form>
  </body>
</html>
