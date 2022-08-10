<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String userid= request.getParameter("userid");
String passwd= request.getParameter("passwd");

if(userid.equals("testid")&&passwd.equals("testpw")){
    response.sendRedirect("commonmain.html");
}else{
    response.sendRedirect("commonlogin.html");
}

%>