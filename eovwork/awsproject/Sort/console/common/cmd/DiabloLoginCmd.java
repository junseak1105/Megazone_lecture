package console.common.cmd;

import console.common.dao.DiabloLoginDao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class DiabloLoginCmd extends BaseCommand{


	public DiabloLoginCmd() {
		//모든 페이지 관리
		setNextPage("/diablo/diablologin.jsp");
	}


	@Override
	public void doExecute(Map map, HttpServletRequest request, HttpServletResponse response) {
		DiabloLoginDao dao = new DiabloLoginDao();
		Boolean login_chk = false;
		try {
			list1=dao.IsLogin(getOracleConnection(),map);
			request.setAttribute("userid",map.get("userid"));
			request.setAttribute("list1",list1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}










}