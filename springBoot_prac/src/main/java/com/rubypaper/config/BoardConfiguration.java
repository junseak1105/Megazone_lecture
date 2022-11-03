package com.rubypaper.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rubypaper.jdbc.util.JDBCConnectionManager;

//@Configuration
public class BoardConfiguration {

//	@Bean
	public JDBCConnectionManager getJDBCConnectionManager() {
		JDBCConnectionManager manager = new JDBCConnectionManager();
		manager.setDriverClass("oracle.jdbc.driver.OracleDriver");
		manager.setUrl("jdbc:oracle:thin:@61.98.217.46:1521:xe");
		manager.setUsername("boot");
		manager.setPassword("boot");
		return manager;
	}
}
