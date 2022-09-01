<%@page import="java.util.Hashtable"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
int sum =0;
Hashtable hash = new Hashtable();
for(int i = 1;i<11;i++){
	hash.put(i,i);
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
for(int i = 1;i<11;i++){
	sum += (int)(Integer)hash.get(i);
}
%>
<%=sum %>
</body>
</html>