<%@ page import="java.util.List" %>
<%@ page import="source.Book" %><%--
  Created by IntelliJ IDEA.
  User: ChrisLin3
  Date: 2019/5/28
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>搜索结果显示</title>
</head>
<body>
    <table align="center" width="700" border="1">
        <tr>
            <td colspan="7" align="center">
                <h3>检索结果</h3> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <a href="index.jsp"> 返回首页</a>
            </td>
        </tr>
        <tr align="center">
            <td>ID</td>
            <td>图书名称</td>
            <td>价格</td>
            <td>作者</td>
            <td>数量</td>
            <td>修改数量</td>
            <td>删除书籍</td>
        </tr>
        <%
            List<Book> list=(List<Book>)request.getAttribute("consultBook");
            if (list==null||list.size()<0)
                out.print("没有查询到相关内容");
            else
            {
                for (Book book:list)
                {
        %>
            <tr align="center">
                <td><%=book.getId()%></td>
                <td><%=book.getName()%></td>
                <td><%=book.getPrice()%></td>
                <td><%=book.getAuthor()%></td>
                <td><%=book.getBookCount()%></td>
                <td valign="bottom">
                    <form action="UpdataServlet" method="post" onsubmit="return check(this)">
                        <input type="hidden" name="id" value="<%=book.getId()%>">
                        <input type="text" name="bookCount" size="5">
                        <input type="submit" name="Submit" value="修  改">
                    </form>
                </td>
                <td><a href="DeleteServlet?id=<%=book.getId()%>"> 删   除 </a></td>
            </tr>
        <%
                }
            }
        %>
        <tr>
            <td align="center" colspan="7">
                <%=request.getAttribute("bar")%>
            </td>
        </tr>
    </table>
</body>
</html>
