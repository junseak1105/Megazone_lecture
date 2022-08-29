package console.common.dao;

import console.common.bean.Diablo3Bean;
import console.common.bean.DiabloBean;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DiabloIndexDao {

    public List list1 = new ArrayList();


    public List Diablo3BoardList(Connection conn, Map key) throws Exception {

        Statement stat = conn.createStatement();


        StringBuffer query = new StringBuffer();

        query.append("SELECT        \n");
        query.append("homename      \n");
        query.append(",boardname    \n");
        query.append(",boardlink    \n");
        query.append(",menuname     \n");
        query.append(",menulink     \n");
        query.append(",userid       \n");
        query.append("FROM DIABLOINDEX         \n");


        ResultSet rs = stat.executeQuery(query.toString());
        int init = 0;

        System.out.println("sql : " + query.toString());
        boolean login_chk = false;
        while (rs.next()) {
//            DiabloBean freebean = new DiabloBean(
//                    rs.getString("homename"),
//                    rs.getString("boardname"),
//                    rs.getString("boardlink"),
//                    rs.getString("menuname"),
//                    rs.getString("menulink"),
//                    rs.getString("userid")
//            );
//            list1.add(freebean);
            init = 0;
        }

        return list1;

    }


}

