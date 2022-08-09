<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.sql.*" %>      <!-- import : java.sql.* -->
 
<%
    String ID = "root";                         // MySQL 아이디
    String PWD= "(rla)wogns0249";                         // MySQL 비밀번호
    String PORTNO = "3306";                     // MySQL 포트 번호
    String DBNAME = "dbtest";                     // 연결할 MySQL DB 이름
    String TIMEZONE = "serverTimezone=UTC";     // MySQL 8.0 버전 이상 연결 시 사용
 
    String Query = "jdbc:mysql://localhost:" + PORTNO + "/" + DBNAME + "?" + TIMEZONE;                                             
 
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection(Query, ID, PWD);  
    
    /* 
    include file="DB_Conn.jsp" <<이걸로 필요한 페이지에 import하기
    if (conn != null) {
        out.println("WebDB 데이터베이스로 연결했습니다. <br>");
        conn.close();
        out.println("WebDB 데이터베이스로의 연결을 끊었습니다.<br>");
    }
    else {
        out.println("WebDB 데이터베이스로 연결할 수 없습니다.<br>");
    } */
%>
