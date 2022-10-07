<%--
  Created by IntelliJ IDEA.
  User: junse
  Date: 2022-08-25
  Time: PM 3:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/diablo3login.do" method="post">
    <table>
        <tr>
            <td>userid</td>
            <td><input type="text" name="userid" required="required"></td>
        </tr>
        <tr>
            <td>password</td>
            <td><input type="password" name="passwd" required="required"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="login"></td>
        </tr>
    </table>
</form>
</body>
</html>
