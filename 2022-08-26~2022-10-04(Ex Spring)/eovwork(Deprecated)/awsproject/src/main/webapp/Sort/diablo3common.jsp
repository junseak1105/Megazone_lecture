<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@page import="java.util.*, console.common.bean.Diablo3Bean"%>


<%

    List list = (List)request.getAttribute("list1");
    System.out.println(((Diablo3Bean)list.get(0)).getUserid());

%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>

</body>
</html>