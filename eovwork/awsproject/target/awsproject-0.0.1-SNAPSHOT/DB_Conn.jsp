<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.sql.*" %>      <!-- import : java.sql.* -->
 
<%
    String ID = "root";                         // MySQL ���̵�
    String PWD= "(rla)wogns0249";                         // MySQL ��й�ȣ
    String PORTNO = "3306";                     // MySQL ��Ʈ ��ȣ
    String DBNAME = "dbtest";                     // ������ MySQL DB �̸�
    String TIMEZONE = "serverTimezone=UTC";     // MySQL 8.0 ���� �̻� ���� �� ���
 
    String Query = "jdbc:mysql://localhost:" + PORTNO + "/" + DBNAME + "?" + TIMEZONE;                                             
 
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection(Query, ID, PWD);  
    
    /* 
    include file="DB_Conn.jsp" <<�̰ɷ� �ʿ��� �������� import�ϱ�
    if (conn != null) {
        out.println("WebDB �����ͺ��̽��� �����߽��ϴ�. <br>");
        conn.close();
        out.println("WebDB �����ͺ��̽����� ������ �������ϴ�.<br>");
    }
    else {
        out.println("WebDB �����ͺ��̽��� ������ �� �����ϴ�.<br>");
    } */
%>
