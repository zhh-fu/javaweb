<%--
  Created by IntelliJ IDEA.
  User: ChrisLin3
  Date: 2019/5/7
  Time: 21:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <meta http-equiv="Cache-Control" content="max-age=60">
    <title>博客!</title>
  </head>
  <style>
    #PWD14{color: blue}
    #PWD25{color: chartreuse}
    #username4{color:red}
    .btn_gry{color: gray}
    .news{color: coral;font-size: 16px}
      a{color: firebrick}
  </style>
  <body background="三体%20智子.jpg" style="background-repeat:no-repeat" onload="show()">
  <center><div id="clock"></div></center>
  <div>
    <form action="index.jsp" method="post" name="myform">
      用 户 名:<input name="username" type="text" id="username4" size="20" maxlength="20"><br>
      密    码:<input name="pwd1" type="password" id="PWD14" size="20" maxlength="20"><br>
      确认密码：<input name="pwd2" type="password" id="PWD25" size="20" maxlength="20"><br>
      性    别：<input name="sex" type="radio" class="noborder" value="男" checked>
                  男&nbsp;
                <input name="sex" type="radio" class="noborder" value="女" >
                  女<br>
      爱    好：<input name="like" type="checkbox" id="like1" value="体育"> 体育
                <input name="like" type="checkbox" id="like2" value="旅游"> 旅游
                <input name="like" type="checkbox" id="like3" value="听音乐"> 听音乐
                <input name="like" type="checkbox" id="like4" value="看书"> 看书<br>
       E-mail:<input name="email" type="text" id="PWD224" size="50"><br>
      <input name="Submit" type="submit" id="submit" class="btn_gry" value="确定保存" onclick="check()"/>
      <input name="Reset" type="reset" id="reset" class="btn_gry" value="重新填写"/>
      <input type="button" name="button" id="close" class="btn_gry" value="关闭" onclick="close()"/><br>

        <script language="JavaScript">
            function realSysTime(clock)
            {
                var now=new Date();
                var year=now.getFullYear();
                var month=now.getMonth();
                var day=now.getDate();
                var week=now.getDay();
                var hour=now.getHours();
                var minute=now.getMinutes();
                var sec=now.getSeconds();
                month=month+1;
                var week_arr=new Array("星期日", "星期一","星期二","星期三","星期四","星期五","星期六");
                var week=week_arr[week];
                var time="当前时间： "+year+"年"+month+"月"+day+"日 "+week+" "+hour+":"+minute+":"+sec;
                clock.innerHTML=time;
            }
            function show() {
                window.setInterval("realSysTime(clock)",1000);

            }
            function check()
            {
                if(myform.username.value=="")
                {
                    alert("请输入用户名！");
                    myform.username.focus();
                    return false;
                }
                else if(myform.pwd1.value=="")
                {
                    alert("请输入密码！");
                    myform.pwd1.focus();
                    return false;
                }
                else if(myform.pwd2.value=="")
                {
                    alert("请再次输入密码！");
                    myform.pwd2.focus();
                    return false;
                }
                else if(myform.pwd1.value!=myform.pwd2.value)
                {
                    alert("请输入相同的密码！");
                    myform.pwd2.focus();
                    return false;
                }
                else window.open("jumpWeb.jsp")
            }
            function close() {
                window.close();
            }
            var data=new Date().getDate();
            document.write("今天的日子是：" + data);
        </script>
      <!--<input name="imageFiel" type="image" src="三体%20智子.jpg">-->
        <br><a href="jumpWeb.jsp"> 点击此处跳转至药水哥  </a>
      <br><textarea name="content" cols="25" rows="7" wrap="soft"></textarea><br>
      <input name="Submit" type="submit" id="submit1" class="btn_gry" value="确定保存" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <input name="Reset" type="reset" id="reset1" class="btn_gry" value="重新填写">
    </form>
  </div>
    下拉课程选项
    <select name="select" id="PWD14">
      <option >数学</option>
      <option >语文</option>
      <option >英语</option>
      <option >体育</option>
    </select>
    &nbsp;多选框不可用
    <select name="select" size="8" >
      <option >数学</option>
      <option >语文</option>
      <option >英语</option>
      <option >体育</option>
    </select>
    <center>
        <div class="news">
      <h2>News headline 1</h2>
      <p>some text. some text. some text...</p>
      ...
        </div>

    <div class="news">
      <h2>News headline 2</h2>
      <p>some text. some text. some text...</p>   //sd  sdad
      ...
    </div></center>
  <%--<script language="JavaScript">--%>

      <%--var price=12.5;--%>
      <%--var number=10;--%>
      <%--var totalNumber=price*number;--%>
      <%--alert("总共的花费是："+ totalNumber);--%>
  <%--</script>--%>


  </body>
</html>
