<%@page import="java.util.Hashtable"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%!
int sum =0;
Hashtable hash;
%>
<%
hash = new Hashtable();
for(int i = 0;i<10;i++){
	hash.put(i,(i+1));
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
for(int i = 0;i<hash.size();i++){
	sum += (int)(Integer)hash.get(i);
}
%>테스트
<%=sum %>
</body>
</html>

