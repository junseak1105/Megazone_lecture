<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
String id = request.getParameter("id");
String pw = request.getParameter("pw");

out.println("ID:"+id);
out.println("PW:"+pw);

%>
