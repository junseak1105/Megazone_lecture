package console.common.cmd;

import java.sql.SQLException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import console.common.dao.DiabloIndexDao;

public class DiabloIndexCmd  extends  BaseCommand{

	
	public DiabloIndexCmd() {
		setNextPage("/diablo/diabloindex.jsp");
	}
	
	@Override
	public void doExecute(HttpServletRequest request, HttpServletResponse response, Map map) {
		DiabloIndexDao dao=new DiabloIndexDao();
		
		try {
			list1 =dao.DiabloIndexList(getOracleConnection(), map);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			request.setAttribute("list1", list1);
		}
		
	
		
	}
	
	
}
