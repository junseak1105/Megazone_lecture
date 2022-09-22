<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="Sort.common.util.CommonUtil"%>


<%
String name = CommonUtil.IsNull(request, "name");
int age=0;
if(CommonUtil.IsNull(request, "age")!=null){
	age = Integer.parseInt(CommonUtil.IsNull(request, "age"));	
}

String address = CommonUtil.IsNull(request, "address");
String email = CommonUtil.IsNull(request, "email");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<form name="loginfrm" action="index5.jsp" method="post">
		<table>
			<tr>
				<td>name</td>
				<td><input type="text" name="name" id="" required="true"></td>
			</tr>
			<tr>
				<td>age</td>
				<td><input type="number" name="age" id="" required="true"></td>
			</tr>
			<tr>
				<td>address</td>
				<td><input type="text" name="address" id="" required="true"></td>
			</tr>
			<tr>
				<td>email</td>
				<td><input type="email" name="email" id="" required="true"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="submit"></td>
			</tr>
		</table>
	</form>
	<%if(name!=null){ %>
	<table>
		<tr>
			<td>name</td>
			<td><%=name%></td>
		</tr>
		<tr>
			<td>age</td>
			<td><%=age%></td>
		</tr>
		<tr>
			<td>address</td>
			<td><%=address%></td>
		</tr>
		<tr>
			<td>email</td>
			<td><%=email%></td>
		</tr>
	</table>
	<%} %>
</body>
</html>