package daum.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import console.common.dao.BaseDao;

public class DaumDao extends BaseDao{

    public void BoardInsert(Connection conn, Map map) throws SQLException {
        // insert into board( )values(?,?,?,?);

        StringBuffer query = new StringBuffer();

        query.append("INSERT INTO BOARD(NUMBERINDEX,USERID,SUBJECT,CURRENTDATE) \n");
        query.append("VALUES(TO_CHAR(seq_board.NEXTVAL),?,?,?)");

        PreparedStatement stat = conn.prepareStatement(query.toString());
        int init = 0;
        stat.setString(++init, "TO_CHAR(seq_board.NEXTVAL)");
        stat.setString(++init, map.get("userid").toString());
        stat.setString(++init, map.get("subject").toString());
        stat.setString(++init, map.get("currentdate").toString());

        int resultvalue = stat.executeUpdate();

        if (resultvalue == 1) {
            conn.commit();
        } else {
            conn.rollback();
        }
    }

    public List DaumIndexList(Connection conn,Map key) throws SQLException {
        StringBuffer query = new StringBuffer();

        query.append("SELECT				\n");
        query.append("NUMBERINDEX			\n");
        query.append(",USERID				\n");
        query.append(",SUBJECT 			\n");
        query.append(",CURRENTDATE			\n");
        query.append("FROM DAUMBOARD		\n");

        System.out.println("sql:" + query.toString());

        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery(query.toString());
        LinkedList list = new LinkedList();
        int init=0;
        while(rs.next()) {
            DaumBean bean = new DaumBean(rs.getString(++init),rs.getString(++init),rs.getString(++init),rs.getString(++init));
            list.add(bean);

            init=0;
        }
        return list;
    }

}