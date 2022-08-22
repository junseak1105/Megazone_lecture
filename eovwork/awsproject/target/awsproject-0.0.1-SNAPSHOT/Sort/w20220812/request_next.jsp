<%@page import="common.util.CommonUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%
 	String userid = CommonUtil.IsNull(request, "userid");
 	String userpw = CommonUtil.IsNull(request, "userpw");
 	String email = CommonUtil.IsNull(request, "email");
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=userid %>
<%=userpw %>
<%=email %>
</body>
</html>