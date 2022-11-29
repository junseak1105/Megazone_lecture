<%@page import="j20220817.dao.LoginDao2"%>
<%@page import="j20220817.bean.LoginBean2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%

String userid = null;
String passwd = null;
String email = null;
String jumin1 = null;
String jumin2 = null;

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
if (request.getParameter("jumin1") != null) {
	jumin1 = request.getParameter("jumin1");
}
if (request.getParameter("jumin2") != null) {
	jumin2 = request.getParameter("jumin2");
}

LoginBean2 login = new LoginBean2(userid,passwd,email,jumin1,jumin2);
LoginDao2 dao = new LoginDao2();

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