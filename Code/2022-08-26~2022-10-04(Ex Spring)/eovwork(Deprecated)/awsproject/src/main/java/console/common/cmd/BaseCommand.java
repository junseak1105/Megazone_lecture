package console.common.cmd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

public abstract class BaseCommand  implements Command{
	public String mysqlurl="jdbc:mysql://localhost:3306/gwang_1";
	public String oracleurl="jdbc:oracle:thin:@localhost:1521:xe";
	public String userid="gwang_1";
	public String passwd="gwang_1";
	public Connection mysqlconn;
	public Connection oracleconn;
	public String page;
	public List list1;
	
	public Connection getMysqlConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			mysqlconn=DriverManager.getConnection(mysqlurl, userid, passwd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mysqlconn;
	}
	
	
	public Connection getOracleConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			oracleconn=DriverManager.getConnection(oracleurl, userid, passwd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return oracleconn;
	}
	
	
	
	public void setNextPage(String page) {
		this.page=page;
	}

	
	public String getPage() {
		System.out.println("pagenext:"+page);
		return page;
	}
	
	
	
}
