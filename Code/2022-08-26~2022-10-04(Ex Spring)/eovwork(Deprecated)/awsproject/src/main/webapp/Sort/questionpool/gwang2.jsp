<%@page import="j20220811.gwangbean"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%!
	ArrayList list;
	public ArrayList getNew() {
		if (list == null) {
			list = new ArrayList();
		}
		return list;
	}
%>

<%
String userid = request.getParameter("userid");
String subject = request.getParameter("subject");
String date = request.getParameter("date");
int like =0;
int count=0;
if(request.getParameter("like")!=null){
	like = Integer.parseInt(request.getParameter("like"));	
}
if(request.getParameter("count")!=null){
	count = Integer.parseInt(request.getParameter("count"));	
}
gwangbean gb = new gwangbean(userid,subject,date,like,count);
getNew().add(gb);
%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="gwang2.jsp" method="post">
		<table border="1" width="500" height="500">
			<tr>
				<td>아이디</td>
				<td><input type="text" name="userid" id="" required="true" /></td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="subject" id="" required="true" /></td>
			</tr>
			<tr>
				<td>날짜</td>
				<td><input type="date" name="date" id="" required="true" /></td>
			</tr>
			<tr>
				<td>좋아요</td>
				<td><input type="number" name="like" id="" required="true" /></td>
			</tr>
			<tr>
				<td>조회수</td>
				<td><input type="number" name="count" id="" required="true" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="입력" name="" id="" /></td>
			</tr>
		</table>
		<br>
	</form>
	<%
	out.print("목록<br>");
	for (int i = 0; i < list.size(); i++) {
		gwangbean temp = (gwangbean)list.get(i);
		if(temp.getUserid()!=null){
			out.print(" 아이디:"+temp.getUserid()+" 제목:"+temp.getSubject()+" 날짜:"+temp.getDate()+" 좋아요:"+temp.getLike()+" 조회수:"+temp.getCount()+"<br>");
		}
	}
	%>
</body>
</html>