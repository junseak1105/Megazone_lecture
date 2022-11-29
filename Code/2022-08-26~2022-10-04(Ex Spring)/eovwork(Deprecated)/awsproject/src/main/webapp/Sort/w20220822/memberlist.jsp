<%@ page import="java.sql.*" %><%--
  Created by IntelliJ IDEA.
  User: junse
  Date: 2022-08-22
  Time: 오전 9:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/Sort/common/connectioncommon.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
java.sql.Statement stat = getMysqlconnection().createStatement();
ResultSet rs = stat.executeQuery("select * from memberlist");

while(rs.next()){
    out.println(rs.getString("userid"));
    out.println(rs.getString("passwd"));
}

%>

<%
    java.sql.Statement stat2 = getOracleconnection().createStatement();
    ResultSet rs2 = stat.executeQuery("select * from memberlist");

    while(rs2.next()){
        out.println(rs2.getString("userid"));
        out.println(rs2.getString("passwd"));
    }

%>
</body>
</html>
