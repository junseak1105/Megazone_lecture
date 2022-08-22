<%@page import="common.util.CommonUtil"%>
<%@page import="common.GwangBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
GwangBean gb = new GwangBean(CommonUtil.IsNull(request, 1, "username"),CommonUtil.IsNull(request, 2, "userage"),CommonUtil.IsNull(request, 1, "useraddress"));
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
아이디:<%=gb.getUserid() %>
비밀번호:<%=gb.getPasswd() %>
이메일: <%=gb.getEmail() %>
</body>
</html>