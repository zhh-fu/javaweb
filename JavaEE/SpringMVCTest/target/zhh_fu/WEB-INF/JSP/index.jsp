<%@ page language="java" contentType="text/html; charset = UTF_8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transactional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="content-type" content="text/html;charset=UTF-8">
    <title>参数</title>
    <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.0.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            var max = 30000;
            for (var i=1;i<=max;i++){
                $.post({
                    url:"./userRedPacket/grapRedPacket.do?redPacketId=1&userId = "+i,
                    success:function (result) {
                    }
                });
            }
        });
    </script>
</head>
<body>
</body>
</html>
