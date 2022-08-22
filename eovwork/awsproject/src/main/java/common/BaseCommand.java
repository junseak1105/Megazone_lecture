package common;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseCommand {
    static Connection mysqlconn;
    static Connection oracleconn;

    // mysql connect
    public static Connection getMySqlConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("드라이버 로딩");
            String url = "jdbc:mysql://localhost:3306";
            String userid = "gwang_1";
            String passwd = "gwang_1";
            mysqlconn = DriverManager.getConnection(url, userid, passwd);

            mysqlconn.setAutoCommit(false);
            System.out.println("성공!!!!!!!!");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // select 데이터 read
        // insert delete,update:삽입,삭제,수정
        // false:자동으로 insert delete,update 삽입,삭제,수정 하지 않겠다.
        // conn.commit();
        return mysqlconn;
    }

    public static Connection getOracleConnection() throws ClassNotFoundException {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String userid = "gwang_1";
        String passwd = "gwang_1";

        try {
            Class.forName("oracle.jdbc.OracleDriver");

            oracleconn = DriverManager.getConnection(url, userid, passwd);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return oracleconn;
    }


    public static void main(String[] args) throws Exception {

        //getOracleConnection();
        getMySqlConnection();
    }
}