package DAO;

import common.JDBC_mysql_conn;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB_Executer_mysql extends JDBC_mysql_conn implements Executer {
	private static PreparedStatement pstmt;
	private static ResultSet rs = null;

	// rs 반환
	@Override
	public ResultSet DB_Ex_query(String query) {
		try {
			pstmt = conn_mysql.prepareStatement(query);
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}

	// rs미반환
	@Override
	public void DB_Ex_query_nr(String query) {
		try {
			pstmt = conn_mysql.prepareStatement(query);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
