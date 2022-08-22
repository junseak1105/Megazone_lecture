<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>

<%!
	ArrayList arr = new ArrayList();
%>

<% 

	String userid = null;
	String passwd = null;	
	if(request.getParameter("userid")!=null){
		userid=request.getParameter("userid");
		if(request.getParameter("passwd")!=null){
			passwd=request.getParameter("passwd");
			arr.add(userid);
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
<form action="arraylist.jsp" method="post">
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
				<td>
				<input type="submit" value="로그인" name="" id="" />
				</td>
			</tr>
		</table>
		<br>
	</form>
	<%
	out.print("접속한아이디:");
	for(int i = 0; i<arr.size();i++){
		out.print(arr.get(i)+",");
	}
	%>
</body>
</html>