<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.Hashtable" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
main페이지입니다.
<%!
String name="김재훈";
int age=20;
String address="주소";
%>


<%
	out.print("출력입니다");
%>

<!-- 
jsp:servlet로 구성된 자바이다
application:java
web:servlet,jsp
javaserverpage

lifecycle:servlet life cycle:init(한번만 실행:설정) ->doservice(생략가능 get,post)->dopost(post),doget(get),dodestroy()
 -->
</body>
</html>