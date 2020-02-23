<%--
  Created by IntelliJ IDEA.
  User: ChrisLin3
  Date: 2019/6/3
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>测试页面</title>
  </head>
  <body>
    <form action="" method="post" name="myform" id="myform">
        用&nbsp;户&nbsp;名：<input type="text" name="username" id="username">
        <input type="button" id="checkName" value="检查用户名" onclick="userCheck(myform.username)">
        密&nbsp;&nbsp;&nbsp;&nbsp;码:<input type="text" id="password1" name="password1">
        确认密码:<input type="text" name="password2" id="password2">
        E-mail:<<input type="text" name="email" id="email">
        <input type="submit" name="Submit" id="Submit" value="注  册">
    </form>
    <div id="CommitTip"></div>
    <script language="JavaScript">
        function creatXMLH(url)
        {
            http_request = false;
            if(window.XMLHttpRequest)
            {
                http_request =new XMLHttpRequest();
            }
            else if (window.ActiveXObject)
            {
                try {
                    http_request = new ActiveXObject("Msxml2.XMLHTTP");
                }
                catch (e)
                {
                    try
                    {
                        http_request =new ActiveXObject("Microsoft.XMLHTTP");
                    }
                    catch (e) {}
                }
            }
            if (!http_request)
            {
                alert("创建XMLHTTP实例失败！");
                return false;
            }
            http_request.onreadystatechange=getResult;
            http_request.open('get',url,true);
            http_request.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
            http_request.send(null);
        }
        function getResult()
        {
            if(http_request.readyState==4)
            {
                if (http_request.status==200)
                {
                    document.getElementById("CommitTip").innerHTML = http_request.responseText;
                    document.getElementById("CommitTip").style.display="block";
                }
                else
                {
                    alert("请求页面出错！");
                }
            }
        }
        function userCheck(username)
        {
            if (username.value==null||username.value=="")
            {
                alert("请输入用户名!")
                username.focus();
                return;
            }
            else
            {
                //String url="checkUser.jsp?user=" + username.value + "&nocache=" + new Date().getTime();
                creatXMLH("checkUser.jsp?user=" + username.value);
            }
        }
    </script>
  </body>
</html>
