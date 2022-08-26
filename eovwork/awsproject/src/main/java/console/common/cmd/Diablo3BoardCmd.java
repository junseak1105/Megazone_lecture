package console.common.cmd;

import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import console.common.dao.Diablo3BoardDao;

public class Diablo3BoardCmd extends BaseCommand{


	public Diablo3BoardCmd() {
		//모든 페이지 관리
		setNextPage("/diabloindex.jsp");
	}


	@Override
	public void doExecute(Map reqTray, HttpServletRequest request, HttpServletResponse response) {
		Diablo3BoardDao dao = new Diablo3BoardDao();


		List list = null;
		try {
			list = dao.Diablo3BoardList(getOracleConnection(), reqTray);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			request.setAttribute("list1", list);
		}

	}










}