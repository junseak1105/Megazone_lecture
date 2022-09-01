<%@page import="common.GwangBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/common/Common.jsp"%>
<%

GwangBean gb = new GwangBean(name,passwd,email);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
아이디:<%=userid %>
비밀번호:<%=passwd %>
이메일:<%=email %>
</body>
</html>