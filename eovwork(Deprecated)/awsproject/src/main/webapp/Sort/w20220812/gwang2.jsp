<%@page import="Sort.common.util.CommonUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
int number = (int)CommonUtil.IsNull(request,2, "number");
String userid = (String)CommonUtil.IsNull(request,1, "userid");
String  subject= (String)CommonUtil.IsNull(request,1, "subject");
String currentdate= (String)CommonUtil.IsNull(request,1, "currentdate");
int  count= (int)CommonUtil.IsNull(request,2, "count");
int  like= (int)CommonUtil.IsNull(request,2, "like");

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- number(int) 제목 작성자 작성일 조회(int) 좋아요(int) -->
	<form action="gwang2.jsp" method="get">
		<table style="width: 100%">
			<tr>
				<th>number</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>조회</th>
				<th>좋아요</th>
			</tr>
			<tr>
				<td>
					<input type="text" name="number" id="" required="true"/>
				</td>
				<td>
					<input type="text" name="subject" id="" required="true"/>
				</td>
				<td>
					<input type="text" name="userid" id="" required="true"/>
				</td>
				<td>
					<input type="text" name="currentdate" id="" required="true"/>
				</td>
				<td>
					<input type="text" name="count" id="" required="true"/>
				</td>
				<td>
					<input type="text" name="like" id="" required="true"/>
				</td>
			</tr>
			<tr>
				<td colspan="6"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form>
	<br>
	<%=number %>
	<%=subject %>
	<%=userid %>
	<%=currentdate %>
	<%=count %>
	<%=like %>
</body>
</html>