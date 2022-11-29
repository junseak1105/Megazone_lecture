<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.SQLException" %><%--
  Created by IntelliJ IDEA.
  User: junse
  Date: 2022-08-22
  Time: 오전 9:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%!
    String user = "gwang_1";
    String passwd = "gwang_1";

    Connection mysqlconnection;

    public Connection getMysqlconnection() throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("드라이버 로딩");
            String url = "jdbc:mysql://localhost:3306/gwang_1";
            mysqlconnection = DriverManager.getConnection(url, user, passwd);

            mysqlconnection.setAutoCommit(false);
            System.out.println("성공!!!!!!!!");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return mysqlconnection;
    }
%>
<%!

    Connection oracleconnection;


    public Connection getOracleconnection() throws ClassNotFoundException, SQLException {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("오라클 드라이버 로딩");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            oracleconnection = DriverManager.getConnection(url, user, passwd);

            oracleconnection.setAutoCommit(false);
            System.out.println("성공!!!!!!!!");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return oracleconnection;
    }
%>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
