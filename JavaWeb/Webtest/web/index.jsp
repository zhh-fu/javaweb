<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: ChrisLin3
  Date: 2019/5/10
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.net.*" %>
<html>
<style>
    .one{color: red}
</style>
  <head>
    <meta http-equiv="content-type" content="text/html" charset="UTF-8">
    <title>保存并读取用户登录信息</title>
  </head>
  <body>
  <%--<%!--%>
      <%--int number=0;--%>
      <%--int count()                                       //注意方法没有修饰符--%>
      <%--{--%>
          <%--number++;--%>
          <%--System.out.println("测试进行时");--%>
          <%--return number;--%>
      <%--}--%>
  <%--%>--%>
  <%--<%--%>
    <%--Cookie[] cookies=request.getCookies();--%>
    <%--String user="";--%>
    <%--String data="";--%>
    <%--if(cookies!=null)--%>
    <%--{--%>
        <%--for (int i=0;i<cookies.length;i++)--%>
        <%--{--%>
            <%--if (cookies[i].getName().equals("mrCookie"))--%>
            <%--{--%>
                <%--user=URLDecoder.decode(cookies[i].getValue().split("##")[0]);--%>
                <%--data=cookies[i].getValue().split("##")[1];--%>
            <%--}--%>
        <%--}--%>
    <%--}--%>
    <%--if ("".equals(user)&&"".equals(data))--%>
    <%--{--%>
  <%--%>--%>
        <%--游客您好，欢迎您初次光临！--%>
  <%--<%--%>
      <%--} else {--%>
  <%--%>--%>
            <%--欢迎[<%=user%>]再次光临<br>--%>
            <%--您注册的时间是：<%=data%>--%>
  <%--<%--%>
      <%--}--%>
  <%--%>--%>
  <div>
  <%
        Date date=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String today= dateFormat.format(date);
    %><br>
  </div>  <%-- 代码片段--%>

    <%
        String str="";                      //输出应该有的东西
        for(int i=1;i<10;i++)
        {
            for (int j=1;j<i;j++)
            {
                str=str+i+"*"+j+"="+i*j;
                str+="&nbsp";
            }
            str+="<br>";
        }

    %>                                   <%--kexingma--%>
    <br>
  <div>
      <table class="one">
        <tr align="center">
            当前时间：<%=today%>
        </tr>
      <tr>
        <td align="center">
            九九乘法表
        </td>
        <td style="padding: 3pt">
            <%=str%>
        </td>
      </tr>
    </table>
  </div>
  <div>
      <form name="form" action="transfer.jsp" method="post">
          请输入名字：<input name="user" type="text" value="">
          请确定你的名字：<input name="userConfirm" type="text" value="">
          请输入你最喜欢的食物：<input type="text" name="food" value="">
          <input type="submit" value="确定" onclick="check()">

          <script language="JavaScript">
              function check() {
                  if (form.user.value != form.userConfirm.value)
                  {
                  alert("请输入相同的名字");
                  form.userConfirm.focus();
                  return;
                  }
              }
          </script>
      </form>
  </div>

  </body>
</html>
