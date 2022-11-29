package console.common.cmd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class BaseCommand implements Command{

	private Connection connection = null;
	private String nextPage = null;
	public List list1;


	protected Connection getmysqlConnection() {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 로딩 성공!!!!");

			String url = "jdbc:mysql://localhost:3306/gwang_1";
			String userid = "gwang_1";
			String passwd = "gwang_1";


			connection = DriverManager.getConnection(url, userid, passwd);


			connection.setAutoCommit(false);
		}catch (Exception e){
			e.printStackTrace();
		}

		return connection;

	}


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


	public void commit() throws Exception {
		if (connection != null) {
			connection.commit();
		}
	}

	public void endCommand() throws Exception{
		if (connection != null) {
			System.out.println("-------------------Connection close--------------");
			connection.close();
		}

	}



	@Override
	public abstract void doExecute(Map reqTray, HttpServletRequest request, HttpServletResponse response);


	public void setNextPage(String nextPageObj) {
		nextPage = nextPageObj;
	}

	public String getNextPage() throws Exception{
		System.out.println("[get next page] : " + nextPage);
		if(nextPage == null) {
			System.out.println("Get next page null");
		}
		return  nextPage;
	}







}