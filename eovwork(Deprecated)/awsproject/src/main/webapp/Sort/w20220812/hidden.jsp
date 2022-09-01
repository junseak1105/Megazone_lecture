<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="Sort.common.util.CommonUtil" %>


<%
String userid = CommonUtil.IsNull(request, "userid");
String passwd = CommonUtil.IsNull(request, "passwd");
String hidden = CommonUtil.IsNull(request, "hidden");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<form name="gwang1frm" action="hidden.jsp" method="post">
		<table style="">
			<tr>
				<td>userid</td>
				<td><input type="text" name="userid" id="" required="true"></td>
			</tr>
			<tr>
				<td>passwd</td>
				<td><input type="text" name="userid" id="" required="true"></td>
			</tr>
			<tr>
				<td>hidden</td>
				<td><input type="hidden" name="hidden" value="gwang1"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="button" value="login"></td>
			</tr>
		</table>
		

	</form>
		<table>
	<tr>
				<td>userid</td>
				<td><%=userid %></td>
			</tr>
			<tr>
				<td>passwd</td>
				<td><%=passwd %></td>
			</tr>
			<tr>
				<td>hidden</td>
				<td><%=hidden %></td>
			</tr>
	</table>
</body>
</html>