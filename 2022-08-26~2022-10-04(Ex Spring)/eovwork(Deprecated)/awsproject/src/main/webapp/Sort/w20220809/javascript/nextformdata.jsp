<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%
String userid="";
String userpw="";
String currentuserid="testid";
String currentpasswd="testpw";
String printout="";

if ((request.getParameter("userid") != null)&&(request.getParameter("userpw") != null)) {
	userid=request.getParameter("userid");
	userpw = request.getParameter("userpw");
	
	if(userid.equals(currentuserid)&&userpw.equals(currentpasswd)){
		printout=userid+" 로그인 되었습니다";
	}else{
		printout="로그인 실패";
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
<%=printout %>
</body>
</html>