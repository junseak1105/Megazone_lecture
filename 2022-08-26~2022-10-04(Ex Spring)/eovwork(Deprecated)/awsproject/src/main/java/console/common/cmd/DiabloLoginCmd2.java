package console.common.cmd;

import java.sql.SQLException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import console.common.dao.DiabloDao2;

public class DiabloLoginCmd2  extends BaseCommand{

	@Override
	public void doExecute(HttpServletRequest request, HttpServletResponse response, Map map) {
	
			DiabloDao2 dao=new DiabloDao2();
		
			try {
			list1=dao.IsLogin(getOracleConnection(), map);
			} catch (SQLException e) {
				
				e.printStackTrace();
			}finally {
					request.setAttribute("list1", list1);
			}
	}
	
}
