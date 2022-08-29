package console.common.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import console.common.bean.DiabloBean;
import console.common.util.CommonUtil;
import console.common.bean.Diablo3Bean;


public class Diablo3BoardDao {

    public List list = new ArrayList();


    public List Diablo3BoardList(Connection conn, Map key) throws Exception{

        Statement stat = conn.createStatement();


        StringBuffer query = new StringBuffer();

        query.append("SELECT           \n");
        query.append("idx           \n");
        query.append(",boardsubject      \n");
        query.append(",userid           \n");
        query.append(",boardcurrentdate  \n");
        query.append(",email         \n");
        query.append(",boardcount        \n");
        query.append(",boardlike         \n");
        query.append("FROM DIABLO3BOARD         \n");



//        if(!(key.get("userid")==null || key.get("userid").equals(""))) {
//
//            query.append("WHERE       ");
//            query.append("userid =" + CommonUtil.Qutter(key.get("userid").toString(), 2));
//
//        }

//         if(!(key.get("passwd")==null || key.get("passwd").equals(""))) {
//            query.append("AND passwd =" + CommonUtil3.Qutter(key.get("passwd").toString(), 2) +      " \n");
//         }

        ResultSet rs = stat.executeQuery(query.toString());
        int init = 0;

        System.out.println("sql : " + query.toString());
        boolean login_chk = false;
        while(rs.next()) {
//            DiabloBean freebean = new DiabloBean(rs.getString("idx"), rs.getString("boardsubject"), rs.getString("userid"), rs.getString("boardcurrentdate"), rs.getString("email"), rs.getString("boardcount"), rs.getString("boardlike"));
//            list.add(freebean);
//            init = 0;
        }

        return list;

    }






}