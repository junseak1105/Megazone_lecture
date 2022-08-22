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
<form action="request2.jsp" method="post">
	<input type = "text" name = "userid" placeholder="id">
	<input type = "text" name = "userpw" placeholder="pw">
	<input type = "text" name = "email" placeholder="email">
	<input type = "submit" value="submit">
</form>
<body>
<%=userid %>
<%=userpw %>
<%=email %>
</body>
</body>
</html>


