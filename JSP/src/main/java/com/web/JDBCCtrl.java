package com.web;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "JDBCCtrl", value = "/JDBCCtrl")
public class JDBCCtrl extends HttpServlet {

    public static Connection conn; // DB 커넥션 연결 객체
    private static final String USERNAME = "june1105";// DBMS접속 시 아이디
    private static final String PASSWORD = "(rla)wogns0249";// DBMS접속 시 비밀번호
    private static final String URL = "jdbc:mysql://61.98.217.46:3306/study";// DBMS접속할 db명


    public JDBCCtrl() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=utf-8");
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");

        JSONObject json = new JSONObject();

        String email = request.getParameter("email");
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");
        String hobby = request.getParameter("hobby");
        String addr = request.getParameter("addr");

        String query = "";
        query = "insert into tmember(femail, fname, fpass, fhobby, faddr,fdate) values('" + email + "', '" + name + "', '" + pwd + "', '" + hobby + "', '" + addr + "',SYSDATE())";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("드라이버 로딩 성공");
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.executeUpdate();

            json.put("email", email);
            json.put("name", name);
            json.put("pwd", pwd);
            json.put("hobby", hobby);
            json.put("addr", addr);

            PrintWriter out = response.getWriter();
            System.out.println(json.toJSONString());
            out.print(json.toJSONString());

        } catch (ClassNotFoundException e) {
            System.out.println("드라이버 로딩 실패");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("DBMS 접속 실패");
            e.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");

        PrintWriter out = response.getWriter();

        String query = "";
        query = "select * from tmember;";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("드라이버 로딩 성공");

            PreparedStatement pstmt = conn.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();

            JSONArray json = new JSONArray();
            while (rs.next()) {
                JSONObject obj = new JSONObject();
                obj.put("email", rs.getString("femail"));
                obj.put("name", rs.getString("fname"));
                obj.put("hobby", rs.getString("fhobby"));
                obj.put("addr", rs.getString("faddr"));
                obj.put("date", rs.getString("fdate"));
                json.add(obj);
            }
            out.print(json.toString());
        } catch (ClassNotFoundException e) {
            System.out.println("드라이버 로딩 실패");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("DBMS 접속 실패");
            e.printStackTrace();
        }
    }
}
