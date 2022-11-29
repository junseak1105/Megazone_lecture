<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="j20220817.bean.LoginBean,j20220817.dao.LoginDao"%>
<%!public static LoginDao dao = new LoginDao(); %>
<%
String userid = null;
String passwd = null;
String email = null;
String jumin1 = null;
String jumin2 = null;

request.setCharacterEncoding("utf-8");

dao.setLogin(userid, passwd, email, jumin1, jumin2);

if (request.getParameter("jumin1search") != null) {
	jumin2 = request.getParameter("jumin1search");
	LoginBean bean = dao.getDaoLogin(jumin1);
} else {
	if (request.getParameter("userid") != null) {
		userid = request.getParameter("userid");
	}
	if (request.getParameter("passwd") != null) {
		passwd = request.getParameter("passwd");
	}
	if (request.getParameter("email") != null) {
		passwd = request.getParameter("email");
	}
	if (request.getParameter("jumin1") != null) {
		jumin1 = request.getParameter("jumin1");
	}
	if (request.getParameter("jumin2") != null) {
		jumin2 = request.getParameter("jumin2");
	}

}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=jumin1 %>
</body>
</html>