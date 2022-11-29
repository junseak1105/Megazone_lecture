<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@  page import="Sort.j20220819.CoupangBean" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="Sort.j20220819.CoupangDao" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<table border="1">
    <tr>
        <th>아이디</th>
        <th>비밀번호</th>
        <th>이름</th>
        <th>폰</th>
    </tr>
    <%
        ArrayList arr = CoupangDao.Coupang_list();
        for (int i = 0; i < arr.size(); i++) {
            CoupangBean bean = (CoupangBean) arr.get(i);
            out.print("<tr>");
            out.print("<td>" + bean.getId() + "</td>" + "<td>" + bean.getPwd() + "</td>" +
                    "<td>" + bean.getName() + "</td>" + "<td>" + bean.getPhone() + "</td>");
            out.print("</tr>");

        }
    %>
</table>
</body>
</html>
