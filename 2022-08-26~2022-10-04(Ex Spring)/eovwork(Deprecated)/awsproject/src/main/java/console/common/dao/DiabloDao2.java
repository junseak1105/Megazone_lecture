package console.common.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import console.common.bean.DiabloLoginBean2;

import console.common.cmd.BaseDao;

public class DiabloDao2  extends BaseDao{
		
	public List  IsLogin(Connection conn,Map map) throws SQLException {
		
		StringBuffer query=new StringBuffer();
		query.append("SELECT USERID,PASSWD FROM DIABLOLOGIN");
		
		Statement stat=conn.createStatement();
		ResultSet rs=	stat.executeQuery(query.toString());
			list1=new ArrayList();
		while(rs.next()) {
			DiabloLoginBean2 bean=new DiabloLoginBean2(rs.getString(++init),rs.getString(++init));
			list1.add(bean);
		init=0;
		}
		return list1;
	}
	
	
	
}
