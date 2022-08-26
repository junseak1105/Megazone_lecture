package console.common.dao;

import console.common.bean.Diablo3Bean;
import console.common.util.CommonUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Diablo3LoginDao {

    public Boolean Diablo3Login(Connection conn, Map key) throws Exception{

        Statement stat = conn.createStatement();


        StringBuffer query = new StringBuffer();

        query.append("SELECT           \n");
        query.append("userid         \n");
        query.append(",passwd         \n");
        query.append("FROM DIABLO3login         \n");

        if(!(key.get("userid")==null || key.get("userid").equals(""))) {

            query.append("WHERE       ");
            query.append("userid =" + CommonUtil.Qutter(key.get("userid").toString(), 2));

        }

        if(!(key.get("passwd")==null || key.get("passwd").equals(""))) {
            query.append("AND passwd =" + CommonUtil.Qutter(key.get("passwd").toString(), 2) +      " \n");
        }

        System.out.println("sql : " + query.toString());
        ResultSet rs = stat.executeQuery(query.toString());
        int init = 0;

        if(!rs.next()){
            return false;
        }else{
            return true;
        }

    }






}