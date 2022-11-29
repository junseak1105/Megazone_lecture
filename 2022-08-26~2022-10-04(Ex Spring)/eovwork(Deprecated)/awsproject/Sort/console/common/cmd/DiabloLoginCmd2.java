package console.common.cmd;

import console.common.dao.DiabloDao2;
import console.common.dao.DiabloLoginDao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

public class DiabloLoginCmd2 extends BaseCommand{


	public DiabloLoginCmd2() {
		//모든 페이지 관리
		setNextPage("/diablo/diabloindex2.jsp");
	}


	@Override
	public void doExecute(Map map, HttpServletRequest request, HttpServletResponse response) {
		DiabloDao2 dao = new DiabloDao2();
		Boolean login_chk = false;
		try {
			list1=dao.IsLogin(getOracleConnection(),map);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			request.setAttribute("userid",map.get("userid"));
			request.setAttribute("list1",list1);
		}

	}










}