<%@ page import="java.util.Enumeration" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: junse
  Date: 2022-10-04
  Time: AM 10:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
    HashMap sessionmap = new HashMap();
    Enumeration attr = session.getAttributeNames();
    while (attr.hasMoreElements()) {
        String name = (String) attr.nextElement();
        String value = (String) session.getAttribute(name);
        sessionmap.put(name, value);
//        System.out.println("name : " + name + " value : " + value);
    }
%>
<html>
<head><title>Title</title>
</head>
<body>
<%=sessionmap%>
<a href="/MVC/logout.do">로그아웃</a>
</body>
</html>
