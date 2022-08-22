<%--
  Created by IntelliJ IDEA.
  User: junse
  Date: 2022-08-22
  Time: 오후 12:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="j20220822.bean.CoupangBean"%>
<%
    String userid = request.getParameter("userid");
    String passwd = request.getParameter("passwd");
    String name = request.getParameter("name");
    String phone = request.getParameter("phone");
    String jumin1 = request.getParameter("jumin1");
    String jumin2 = request.getParameter("jumin2");


    CoupangBean bean = new CoupangBean(userid,passwd,name,phone,jumin1,jumin2);

%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%=bean.getUserid()%>
<%=bean.getPasswd()%>
<%=bean.getEmail()%>
<%=bean.getName()%>
<%=bean.getJumin1()%>
<%=bean.getJumin2()%>
</body>
</html>
