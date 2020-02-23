<%--
  Created by IntelliJ IDEA.
  User: ChrisLin3
  Date: 2019/5/29
  Time: 20:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>ELtest</title>
  </head>
  <body>
  <%
    String[] arr={"fdijdff","天花乱坠","15fd2df","365895"};
    request.setAttribute("arr",arr);
  %>
  <%
    String[] arr1=(String[])request.getAttribute("arr");
    for (int i=0;i<arr1.length;i++)
    {
        request.setAttribute("arr2",i);
  %>
  ${arr2}:${arr[arr2]}<br>
  <%
      }
  %>
  ${"天下之大，无奇不有"}
  ${15/0}
  <form name="myform" method="post" action="deal.jsp">
      <textarea name="content" cols="30" rows="8"></textarea>
      <br>
      <input type="submit" value="提交" name="Submit">
  </form>
  </body>
</html>
