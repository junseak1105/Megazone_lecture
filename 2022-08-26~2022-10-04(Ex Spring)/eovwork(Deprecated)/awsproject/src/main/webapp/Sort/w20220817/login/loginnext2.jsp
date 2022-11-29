<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<%
String userid = null;
String passwd = null;
String email = null;
request.setCharacterEncoding("utf-8");

if (request.getParameter("userid") != null) {
	userid = request.getParameter("userid");
}
if (request.getParameter("passwd") != null) {
	passwd = request.getParameter("passwd");
}
if (request.getParameter("email") != null) {
	email = request.getParameter("email");
}
boolean loginsuccess = false;

if(userid.equals("testid") && passwd.equals("testpw")&& email.equals("testemail")){
	loginsuccess = true;	
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
if(loginsuccess){
	out.print(userid+"가 로그인됨");
}else{
	out.print("로그인실패");
}
%>
</body>
</html>