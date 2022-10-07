<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="j20220811.HomeBean,java.util.ArrayList,java.lang.*"%>
<%!
	ArrayList list;
	public ArrayList getNew() {
		if (list == null) {
			list = new ArrayList();
		}
		return list;
	}%>

<%

String name =request.getParameter("name");
int age =0;
if(request.getParameter("age")!=null){
	 age = Integer.parseInt(request.getParameter("age"));	
}
String address =request.getParameter("address");
String email =request.getParameter("email");

HomeBean home = new HomeBean(name, age, address, email);

getNew().add(home);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<form action="daumlogin.jsp" method="post">
		<table border="1" width="500" height="500">
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" id="" required="true" /></td>
			</tr>
			<tr>
				<td>나이</td>
				<td><input type="number" name="age" id="" required="true" /></td>
			</tr>
			<tr>
				<td>주소</td>
				<td><input type="text" name="address" id="" required="true" /></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><input type="email" name="email" id="" required="true" /></td>
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
		HomeBean temp = (HomeBean)list.get(i);
		if(temp.getName()!=null){
			out.print(" 이름:"+temp.getName()+" 나이:"+temp.getAge()+" 주소:"+temp.getAddress()+" 이메일:"+temp.getEmail()+"<br>");
		}
	}
	%>
</body>
</html>