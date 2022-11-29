<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="j20220817.bean.Gwang1Bean" %>
<%@include file = "/common/gwang_1.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Gwang1Bean bean = new Gwang1Bean(userid,passwd);
bean.getList().add(bean);
%>
<%
for(int i=0;i<bean.getList().size()
%>

</body>
</html>