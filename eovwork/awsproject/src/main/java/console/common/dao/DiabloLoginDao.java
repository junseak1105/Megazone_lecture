package console.common.dao;

import console.common.bean.DiabloLoginBean;
import console.common.util.CommonUtil;

import java.sql.Array;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class DiabloLoginDao extends BaseDao{

    public List IsLogin(Connection conn, Map map) throws Exception{
        Statement stat = conn.createStatement();
        StringBuffer query = new StringBuffer();
        List list1;

        query.append("SELECT           \n");
        query.append("userid         \n");
        query.append(",passwd         \n");
        query.append("FROM DIABLO3login         \n");

        if(!(map.get("userid")==null || map.get("userid").equals(""))) {

            query.append("WHERE       ");
            query.append("userid =" + Qutter( 2,map.get("userid").toString()));

        }

        if(!(map.get("passwd")==null || map.get("passwd").equals(""))) {
            query.append("AND passwd =" + Qutter(2,map.get("passwd").toString()) +      " \n");
        }

        System.out.println("sql : " + query.toString());
        ResultSet rs = stat.executeQuery(query.toString());
        int init = 0;
        list1 = new ArrayList();
        while(rs.next()){
            DiabloLoginBean bean = new DiabloLoginBean(rs.getString("userid"),rs.getString("passwd"));
            init = 0;
            list1.add(bean);
        }
        return list1;


    }






}