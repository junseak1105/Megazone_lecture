<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>

<% 
	String userid = null;
String passwd = null;
	if(request.getParameter("userid")!=null){
		userid=request.getParameter("userid");
	}
	if(request.getParameter("passwd")!=null){
		passwd=request.getParameter("passwd");
	}

%>


<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Document</title>
</head>

<body>
	<form action="gwang1.jsp" method="post">
		<table border="1" width="500" height="500">
			<tr>
				<td>userid</td>
				<td><input type="text" name="userid" id="" required="true" /></td>
			</tr>
			<tr>
				<td>passwd</td>
				<td><input type="password" name="passwd" id="" required="true" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="로그인" name="" id="" />
				</td>

			</tr>
		</table>
		<br>
		userid:<%=userid %>
		passwd:<%=passwd %>
	</form>
</body>

</html>
