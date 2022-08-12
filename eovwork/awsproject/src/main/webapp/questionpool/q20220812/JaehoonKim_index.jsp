<%@page import="j20220812.BoardBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%!
ArrayList list;
public ArrayList GetList(){
	if(list==null){
		list = new ArrayList();
	}	
	return list;
}
%>
<%
for(int i = 0; i<3;i++){
	BoardBean bean = new BoardBean();
	bean.setNumber(i+1);
	bean.setTitle("제목"+(i+1));
	bean.setUserid("testid");
	bean.setCurrentdate("2022-08-12");
	bean.setCount(1);
	bean.setLike(1);
	GetList().add(bean);
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--  제목 작성자	작성일	조회	좋아요-->
	<table border ="1" style="width: 100%">
		<tr>
			<th>number</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회</th>
			<th>좋아요</th>
		</tr>
		<%
		for(int i = 0; i<list.size();i++){
			BoardBean temp = (BoardBean)list.get(i);
		%>
		<tr>
			<td><%=temp.getNumber() %></td>
			<td><%=temp.getTitle() %></td>
			<td><%=temp.getUserid() %></td>
			<td><%=temp.getCurrentdate() %></td>
			<td><%=temp.getCount() %></td>
			<td><%=temp.getLike() %></td>
		</tr>
		<%} %>
	</table>
</body>
</html>