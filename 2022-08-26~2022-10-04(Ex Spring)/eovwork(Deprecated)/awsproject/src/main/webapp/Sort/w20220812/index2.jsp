<%@page import="j20220812.NewsBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%!ArrayList list;

	public ArrayList GetList() {
		if (list == null) {
			list = new ArrayList();
		}
		return list;
	}%>

<%
for (int i = 1; i < 5; i++) {
	NewsBean bean = new NewsBean(i,"홈"+i,"사회"+i,"정치"+i,"경제"+i,"국제"+i,"문화"+i,"IT"+i,"연재"+i,"포토"+i,"팩트체크"+i);
	
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
	<!-- 홈 사회 정치 경제 국제 문화 IT 연재 포토 팩트체크 -->
	<table style="width: 100%">
		<tr>
			<th>number</th>
			<th>홈</th>
			<th>사회</th>
			<th>정치</th>
			<th>경제</th>
			<th>국제</th>
			<th>문화</th>
			<th>IT</th>
			<th>연재</th>
			<th>포토</th>
			<th>팩트체크</th>
		</tr>
		<%
		for (int i = 0; i < list.size(); i++) {
			NewsBean temp = (NewsBean) list.get(i);
		%>
		<tr>
			<td><%=temp.getNumber()%></td>
			<td><%=temp.getHome()%></td>
			<td><%=temp.getSocial()%></td>
			<td><%=temp.getPolitics()%></td>
			<td><%=temp.getEconomy()%></td>
			<td><%=temp.getInternational()%></td>
			<td><%=temp.getCulturl()%></td>
			<td><%=temp.getIt()%></td>
			<td><%=temp.getPublish()%></td>
			<td><%=temp.getPhoto()%></td>
			<td><%=temp.getFact()%></td>
		</tr>
		<%
		}
		%>
	</table>

</body>
</html>