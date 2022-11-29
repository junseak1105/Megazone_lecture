package Sort.j20220819;

import Sort.common.BaseCommand;

import java.sql.*;
import java.util.ArrayList;

public class CoupangDao {
    static Connection conn;
    public static ArrayList Coupang_list() throws ClassNotFoundException {
        StringBuffer query = new StringBuffer();
        query.append("SELECT * FROM gwang_1.COUPANG");

        conn = BaseCommand.getOracleConnection();


        ArrayList arr = new ArrayList();
        try {
            //PreparedStatement stat = conn.prepareStatement("insert into coupang values('testid2','1111','name2','phone2')");
            PreparedStatement stat = conn.prepareStatement(query.toString());
            ResultSet rs = stat.executeQuery();
            if (!rs.next() ) {
                System.out.println("no data");
            }
            while (rs.next()){
                System.out.println("test");
                CoupangBean bean = new CoupangBean(rs.getString("userid"),rs.getString("userpasswd")
                        ,rs.getString("username"),rs.getString("userphone"));
                arr.add(bean);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return arr;
    }
}