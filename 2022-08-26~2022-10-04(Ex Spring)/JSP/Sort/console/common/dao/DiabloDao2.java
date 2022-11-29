package console.common.dao;

import console.common.bean.DiabloLoginBean;
import console.common.bean.DiabloLoginBean2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static console.common.dao.BaseDao.Qutter;

public class DiabloDao2 {

    public List IsLogin(Connection conn, Map map) throws Exception {
        Statement stat = conn.createStatement();
        StringBuffer query = new StringBuffer();
        List list = new ArrayList();

        query.append("SELECT           \n");
        query.append("userid         \n");
        query.append(",passwd         \n");
        query.append("FROM DIABLOlogin         \n");

        if (!(map.get("userid") == null || map.get("userid").equals(""))) {

            query.append("WHERE       ");
            query.append("userid =" + Qutter(2, map.get("userid").toString()));

        }

        if (!(map.get("passwd") == null || map.get("passwd").equals(""))) {
            query.append("AND passwd =" + Qutter(2, map.get("passwd").toString()) + " \n");
        }

        System.out.println("sql : " + query.toString());
        ResultSet rs = stat.executeQuery(query.toString());
        int init = 0;
        while (rs.next()) {
            DiabloLoginBean2 bean = new DiabloLoginBean2(rs.getString("userid"), rs.getString("passwd"));
            init = 0;
            list.add(bean);
        }
        return list;
    }
}
