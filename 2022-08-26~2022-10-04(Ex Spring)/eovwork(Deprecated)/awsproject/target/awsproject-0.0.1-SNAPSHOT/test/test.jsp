<%--
  Created by IntelliJ IDEA.
  User: junse
  Date: 2022-08-29
  Time: PM 2:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script>
    function CommonLogin(form){
        // userid = form[userid].value;
        // alert(form.name.value+ form.passwd.value + form.age.value + form.address.value  + form.email.value + form.jumin1.value + form.jumin2.value);
        if(form.userid.value==""){
            alert("아이디입력");
            return;
        }
        if(form.passwd.value==""){
            alert("비밀번호입력");
            return;
        }
        form.method="post";
        form.action="/test.do";
        form.submit();
    }
</script>
<html>
<head>
    <title>Title</title>
<%--    <script src="/common/js/common.js"></script>--%>
</head>
<body>
<%@include file="/common/commonlogin.html"%>
</body>
</html>
