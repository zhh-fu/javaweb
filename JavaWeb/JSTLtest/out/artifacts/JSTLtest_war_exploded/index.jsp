<%--
  Created by IntelliJ IDEA.
  User: ChrisLin3
  Date: 2019/5/31
  Time: 9:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>利用jstl测试操作</title>
  </head>
  <body>
  eacapeXml 属性为true时：<c:out value="水平线标记<hr>" escapeXml="true"></c:out>
    <br>
    eacapeXml 属性为false时：<c:out value="水平线标记<hr>" escapeXml="false"></c:out>
    <c:set var="username" value="花花世界" scope="request"></c:set><br>
    <c:out value="username"/><br>
    <c:out value="${username}"/><br>
  <jsp:useBean id="mystr" class="com.jstl.UseString"></jsp:useBean>
  <c:set value="天下兴亡匹夫有责" target="${mystr}" property="str"></c:set>
  <c:out value="${mystr['str']}"/>
  <c:out value="${mystr.str}"/><br>
  <%--<c:choose>
      <c:when test="${empty param.username}">
          <form name="myform" method="post" action="">
              用户名：
              <input name="username" type="text"><br>
              <br>
              <input type="submit" name="Submit" VALUE="提   交">
          </form>
      </c:when>
      <c:otherwise>
          ${param.username}欢迎来到公司!
      </c:otherwise>
  </c:choose>--%>
  <c:forEach begin="1" end="13" step="3" varStatus="num" var="number">
      <%--${num.index}&nbsp;&nbsp;--%>${number}
      ${num.count} <br>
  </c:forEach>
  <c:set var="sourvrStr" value="Java Web：c程序开发、模块大全；Java：瑟吉欧自己按摩时间评测、电信"></c:set>
    <c:forTokens items="${sourvrStr}" delims="：、；" var="name">
        ${name}<br>
    </c:forTokens>
  </body>
</html>
