package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_mysql_conn {
	public static Connection conn_mysql; // DB 커넥션 연결 객체
	private static final String USERNAME = "gwang_1";// DBMS접속 시 아이디
	private static final String PASSWORD = "gwang_1";// DBMS접속 시 비밀번호
	private static final String URL = "jdbc:mysql://localhost:3306/gwang_1";// DBMS접속할 db명

	public JDBC_mysql_conn() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn_mysql = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("드라이버 로딩 성공");
		} catch (Exception e) {
			System.out.println("드라이버 로딩 실패 ");
			try {
				conn_mysql.close();
			} catch (SQLException e1) {
			}
		}
	}
}
