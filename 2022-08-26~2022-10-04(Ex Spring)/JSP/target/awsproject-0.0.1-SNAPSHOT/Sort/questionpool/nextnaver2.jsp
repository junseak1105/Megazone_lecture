<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
out.println("id:"+request.getParameter("id"));
out.println("pw:"+request.getParameter("pw"));
out.println("pwchk:"+request.getParameter("pwchk"));
out.println("name:"+request.getParameter("name"));
out.println("year:"+request.getParameter("year"));
out.println("month:"+request.getParameter("month"));
out.println("day:"+request.getParameter("day"));
out.println("sex:"+request.getParameter("sex"));
out.println("email:"+request.getParameter("email"));
%>