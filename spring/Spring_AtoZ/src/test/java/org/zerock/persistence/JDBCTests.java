package org.zerock.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class JDBCTests {
	// 1. ����Ŭ JDBC ����̹� �ε�
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 2. Oracle ���� �׽�Ʈ
	@Test
	public void testConnection() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@61.98.217.46:1521:XE","book_ex", "book_ex");
			log.info(conn);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
}
