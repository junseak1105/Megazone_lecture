<%--
  Created by IntelliJ IDEA.
  User: junse
  Date: 2022-08-22
  Time: 오후 12:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form name="coupangfrm">
    <table style="width: 100%">
        <tr>
            <td style="width: 30%">id</td>
            <td style="width: 70%"><input type="text" name="userid" id="" required="required"></td>
        </tr>
        <tr>
            <td style="width: 30%">pw</td>
            <td style="width: 70%"><input type="password" name="passwd" id="" required="required"></td>
        </tr>
        <tr>
            <td style="width: 30%">pw_chk</td>
            <td style="width: 70%"><input type="password" name="passwd_chk" id="" required="required"></td>
        </tr>
        <tr>
            <td style="width: 30%">name</td>
            <td style="width: 70%"><input type="text" name="name" id="" required="required"></td>
        </tr>
        <tr>
            <td style="width: 30%">phone</td>
            <td style="width: 70%"><input type="text" name="phone" id="" required="required"></td>
        </tr>
        <tr>
            <td style="width: 30%">jumin1</td>
            <td style="width: 70%"><input type="text" name="jumin1" id="" required="required"></td>
        </tr>
        <tr>
            <td style="width: 30%">jumin2</td>
            <td style="width: 70%"><input type="text" name="jumin2" id="" required="required"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="button" value="로그인" onclick="Login()"></td>
        </tr>
    </table>
</form>
</body>
</html>
<script>
    function Login(){
        var frm = document.coupangfrm;

        if(frm.passwd.value ==frm.passwd_chk.value){
            frm.action="coupang_next2.jsp";
            frm.method="post";
            frm.submit();
        }else{
            alert("비밀번호 미일치")
        }
    return;
    }
</script>