<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/common2.jsp" %>   

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
if(dao.CheckLogin(userid, passwd,email,jumin1,jumin2)){
	out.print("로그인성공");
}else{
	out.print("로그인실패");
}
%>
</body>
</html>