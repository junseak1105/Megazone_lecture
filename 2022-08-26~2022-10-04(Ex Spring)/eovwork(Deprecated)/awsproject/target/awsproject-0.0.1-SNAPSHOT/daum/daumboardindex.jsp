<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@page import="daum.common.DaumBean"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>
<br>
<%
    List list1 = (List) request.getAttribute("list1");
    for (int i = 0; i < list1.size(); i++) {
        DaumBean bean = (DaumBean) list1.get(i);
%>
<%="<tr>"%>
<%="<td>" + bean.getNumberindex() + "</td><br>"%>
<%="<td>" + bean.getUserid() + "</td><br>"%>
<%="<td>" + bean.getSubject() + "</td><br>"%>
<%="<td>" + bean.getCurrentdate() + "</td><br>"%>
<%="</tr><br>"%>
<%
    }
%>
</body>
</html>