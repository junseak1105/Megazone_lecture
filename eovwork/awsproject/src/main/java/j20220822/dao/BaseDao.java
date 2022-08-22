package j20220822.dao;

import j20220822.bean.CoupangBean;
import j20220822.bean.Gwang_1Bean;
import servlet.Coupang;

import java.sql.*;
import java.util.ArrayList;

public class BaseDao {

    static Connection mysqlconn;
    static Connection oracleconn;
    static String userid = "gwang_1";
    static String passwd = "gwang_1";

    // mysql connect
    public static Connection getMySqlConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver load");
            String url = "jdbc:mysql://localhost:3306/gwang_1";

            mysqlconn = DriverManager.getConnection(url, userid, passwd);

            mysqlconn.setAutoCommit(false);
            System.out.println("mysql connect success");
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


        try {
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("Driver load");
            oracleconn = DriverManager.getConnection(url, userid, passwd);
            System.out.println("oracle connect success");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return oracleconn;
    }

    public ArrayList CoupangLogin(){
        ArrayList list = new ArrayList();
        try {
            Statement stat = getMySqlConnection().createStatement();
            ResultSet rs = stat.executeQuery("select * from coupanglogin");
            while(rs.next()){
                CoupangBean bean = new CoupangBean(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
                list.add(bean);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }


}
