package console.common.cmd;

import console.common.dao.DiabloIndexDao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class DiabloIndexCmd2 extends BaseCommand{


	public DiabloIndexCmd2() {
		//모든 페이지 관리
		setNextPage("/diabloindex2.do");
	}


	@Override
	public void doExecute(Map map, HttpServletRequest request, HttpServletResponse response) {

		DiabloIndexDao dao = new DiabloIndexDao();
		try {
			list1=dao.DiabloIndexList(getOracleConnection(),map);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			request.setAttribute("list1",list1);
		}


	}
}