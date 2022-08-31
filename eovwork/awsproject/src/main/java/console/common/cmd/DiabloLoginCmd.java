package console.common.cmd;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import console.common.dao.DiabloIndexDao;

//command: 업무에 관한 모든 명령 
//dao :업무수행





public class DiabloLoginCmd  extends BaseCommand{
	
	public DiabloLoginCmd() {
		setNextPage("/diablo/diabloindex.jsp");
	}
	@Override
	public void doExecute(HttpServletRequest request, HttpServletResponse response, Map map) {
		
		
		DiabloIndexDao dao=new DiabloIndexDao();
		
		try {
		list1=	dao.IsLogin(getOracleConnection(), map);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				request.setAttribute("list1", list1);
		
				
				
		}
		
	}
}
