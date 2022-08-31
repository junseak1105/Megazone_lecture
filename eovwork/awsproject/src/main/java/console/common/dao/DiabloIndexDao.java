package console.common.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import console.common.bean.DiabloIndexBean;
import console.common.bean.DiabloLoginBean;
import console.common.cmd.BaseDao;

public class DiabloIndexDao extends BaseDao {
	public List list1;

	public List IsLogin(Connection conn, Map map) throws SQLException {

		StringBuffer query = new StringBuffer();
		query.append("SELECT 												\n");
		query.append("USERID,                                               \n");
		query.append("PASSWD                                          \n");
		query.append("FROM DIABLOLOGIN                           \n");

		if (!(get(map.get("userid")).equals("") || get(map.get("userid")) == null)) {
			query.append("WHERE USERID= " + Qutter(1, get(map.get("userid"))) + "   \n");
		}

		if (!(get(map.get("passwd")).equals("") || get(map.get("passwd")) == null)) {
			query.append("AND  PASSWD= " + Qutter(1, get(map.get("passwd"))) + "  \n");
		}

		System.out.println("sql:" + query.toString());
		Statement stat = conn.createStatement();

		ResultSet rs = stat.executeQuery(query.toString());
		int init = 0;
		list1 = new ArrayList();
		while (rs.next()) {

			DiabloLoginBean bean = new DiabloLoginBean(rs.getString(++init), rs.getString(++init));
			init = 0;
			list1.add(bean);
		}
		return list1;

	}

	
	
	public List  DiabloIndexList(Connection conn,Map key) throws SQLException {
		
		
		StringBuffer query=new StringBuffer();
		
		query.append("SELECT													\n");
		query.append("BOARDNAME                                           \n");
		query.append(",BOARDLINK                                             \n");
		query.append(",MENUNAME                                            \n");
		query.append(",MENULINK                                              \n");
		query.append(",USERID                                                   \n");
		query.append(",HOMENAME                                            \n");
		query.append("FROM DIABLOINDEX                                  \n");

		
		
		System.out.println("sql:"+query.toString());
		
		Statement stat=conn.createStatement();
		ResultSet rs=stat.executeQuery(query.toString());
		LinkedList list=new LinkedList();
		
		while(rs.next()) {
			
			DiabloIndexBean bean=new DiabloIndexBean(rs.getString(++init),rs.getString(++init));
			list.add(bean);
			//setInit(0);
			init=0;
		
		
		}
		
		
		
		
		return list1;
	}
	
	
	
	
	
	
	
	
}
