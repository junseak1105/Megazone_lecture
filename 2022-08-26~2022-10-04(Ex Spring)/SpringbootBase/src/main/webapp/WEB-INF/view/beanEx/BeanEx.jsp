<%@ page import="java.util.Enumeration" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%!
    HashMap sessionmap = new HashMap();
%>
<%
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
<form action="/beanEx/login" method="post">
    아이디:<input type="text" name="userId" value="">
    이름:<input type="text" name="userName" value="">
    비밀번호: <input type="password" name="userPw" id="">
    <input type="submit" value="전송">
</form>
</body>
</html>
<%
    if (sessionmap.isEmpty()) {
        out.println("세션에 값이 없습니다.");
    }else{
        out.println("세션에 값이 있습니다.");
    }
%>