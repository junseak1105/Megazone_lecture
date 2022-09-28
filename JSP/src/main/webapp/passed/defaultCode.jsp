<%--
  Created by IntelliJ IDEA.
  User: junse
  Date: 2022-09-26
  Time: AM 9:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>코딩 문법</title>
</head>
<body>
<%! String strName = "홍길동";%>
<%! public String cmdMethod() {
        return strName;
    }
%>
<p><%=cmdMethod() %> </p>
<%
    String part = "JSP";
    String strClass = "1강의실";
    out.println("<p>" + part +"|"+ strClass +" </p>");
%>
</body>
</html>
