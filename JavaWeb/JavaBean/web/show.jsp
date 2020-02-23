<%@ page import="com.bean.Choose" %><%--
  Created by IntelliJ IDEA.
  User: ChrisLin3
  Date: 2019/5/13
  Time: 21:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <title>检测结果</title>
</head>
<body>

    <%--<%
        String emailAdd=new String(request.getParameter("mailAdd").getBytes("ISO-8859-1"),"UTF-8");
        Email email=new Email(emailAdd);
        if (email.isEmail())
            out.println(email.getMailAdd()+" 是一个标准的邮箱！<br>");
        else out.println(emailAdd+ " 不是一个标准的邮箱!<br>");
    %>--%>
    <div>
        <jsp:useBean id="choose" class="com.bean.Choose" scope="page"></jsp:useBean>
        <jsp:useBean id="encoding" class="com.bean.CharactorEncoding"></jsp:useBean>
        <jsp:setProperty name="choose" property="*"/>
        <div>
            <%--<li> 邮箱地址为：<jsp:getProperty name="Email" property="mailAdd"/> </li>--%>
            <%--<li> 邮箱地址为：<%= encoding.toString(Email.getMailAdd()) %>       </li>--%>
            <h2> 调查结果</h2>
                <hr/>
            <ul>
                <li>
                    你使用过哪些语言:<%=encoding.arrayToString(choose.getLanguage())%>
                </li>
                <li>
                    你目前掌握的技术:<%=encoding.arrayToString(choose.getTechlogy())%>
                </li>
                <li>
                    你觉得哪些比较难:<%=encoding.arrayToString(choose.getPart())%>
                </li>
            </ul>
        </div>
    </div>
</body>