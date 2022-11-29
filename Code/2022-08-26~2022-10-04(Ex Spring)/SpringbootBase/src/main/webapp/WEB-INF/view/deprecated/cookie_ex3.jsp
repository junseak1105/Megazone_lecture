<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Cookie[] cookies = request.getCookies();
    String visible = null;
    if (cookies != null) {
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("chkBox")) {
                visible = cookie.getValue();
            }
        }
    }
    if (visible == null) {
        visible = "visible";
    }else{
        visible = "hidden";
    }
%>
<html>
<head><title>Title</title>
    <style>
        body{background: green; margin: 0px; padding:0px;position: relative;width: 100%;height: 100%;}
        #container{
            margin:0px; padding:0px;width:500px;height:400px;
            background-color: #fff; background-color: rgba(255,255,255,0.5);
            position: absolute;left:100px;top:100px; visibility: visible; border:1px solid #666;
        }
        #windowBox{visibility: hidden;}
    </style>
    <script src = "https://code.jquery.com/jquery-3.6.1.js"></script>

</head>
<body>
<div id="container">
    <div id="windowBox">
        <form action="">
            <input type="checkbox" name="chkBox" id="chkBox" value="1"/>
            <span>2분동안 창열지 않기</span> | <span id="close">창닫기</span>
        </form>
    </div>
</div>
</body>
</html>
<script>
$(document).ready(function(){
    $("#windowBox").css("visibility", "<%=visible%>");
    //onclick 창닫기
    $("#close").click(function(){
        $("#windowBox").css("visibility","hidden");
        if ($("#chkBox").is(":checked")) {
            $.ajax({
                url: "/cookie_window",
                type: "get",
                data: {chkBox: $("#chkBox").val()},
                success: function (data) {
                    console.log(data);
                }
            });
        }
    });
});
</script>
