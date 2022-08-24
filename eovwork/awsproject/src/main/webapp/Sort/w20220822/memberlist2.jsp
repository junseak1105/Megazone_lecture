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
    <title>AWS</title>
</head>
<body>
<%

    try {
        Statement stat = getOracleconnection().createStatement();
//        stat.executeQuery("insert into memberlist values ('testid', 'testpw','testemail@naver.com','111111','222222')");
        ResultSet rs = stat.executeQuery("select * from memberlist");
        while(rs.next()){
            out.println(rs.getString("userid"));
            out.println(rs.getString("passwd"));
            out.println(rs.getString("email"));
            out.println(rs.getString("jumin1")+"-"+rs.getString("jumin2"));
        }
    } catch (SQLException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
    }



%>
</body>
</html>
