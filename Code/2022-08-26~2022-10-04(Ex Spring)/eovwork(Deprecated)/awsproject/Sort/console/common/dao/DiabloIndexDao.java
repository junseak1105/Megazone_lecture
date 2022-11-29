package console.common.dao;

import console.common.bean.Diablo3Bean;
import console.common.bean.DiabloBean;
import console.common.bean.DiabloIndexBean;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DiabloIndexDao extends BaseDao{


    public List DiabloIndexList(Connection conn, Map key) throws Exception {

        LinkedList list = new LinkedList();

        StringBuffer query = new StringBuffer();

        query.append("SELECT        \n");
        query.append("boardname    \n");
        query.append(",boardlink    \n");
        query.append(",menuname     \n");
        query.append(",menulink     \n");
        query.append(",userid       \n");
        query.append(",homename      \n");
        query.append("FROM DIABLOINDEX         \n");

        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery(query.toString());
        System.out.println("sql : " + query.toString());

        int init = 0;
        while (rs.next()) {
            DiabloIndexBean bean = new DiabloIndexBean(
                    rs.getString("homename"),
                    rs.getString("boardname"),
                    rs.getString("boardlink"),
                    rs.getString("menuname"),
                    rs.getString("menulink"),
                    rs.getString("userid")
            );

//            DiabloIndexBean bean = new DiabloIndexBean(rs.getString("menuname"),rs.getString("menulink"));
            list.add(bean);
            init=0;
        }

        return list;

    }


}

