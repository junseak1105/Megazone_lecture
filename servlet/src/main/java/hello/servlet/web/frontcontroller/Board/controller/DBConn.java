package hello.servlet.web.frontcontroller.Board.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public abstract class DBConn {

    private Connection connection = null;

    protected Connection getOracleConnection() throws Exception{

        Class.forName("oracle.jdbc.OracleDriver");
        System.out.println("드라이버 로딩 성공!!");

        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String userid = "gwang_1";
        String passwd = "gwang_1";
        Statement stmt;
        connection = DriverManager.getConnection(url, userid, passwd);
        return connection;
    }
}
