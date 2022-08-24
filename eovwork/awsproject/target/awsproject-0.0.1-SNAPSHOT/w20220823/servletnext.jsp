<%@ page import="util.CommonUtil" %><%--
  Created by IntelliJ IDEA.
  User: junse
  Date: 2022-08-23
  Time: AM 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%=CommonUtil.BaseCommonPNSearch("userid")%>
<%=CommonUtil.BaseCommonPNSearch("passwd")%>
<%=CommonUtil.BaseCommonPNSearch("email")%>
</body>
</html>
