package console.common.cmd;

import console.common.dao.DiabloLoginDao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class DiabloLoginCmd extends BaseCommand{


	public DiabloLoginCmd() {
		//모든 페이지 관리
		setNextPage("/diablo/diabloindex.jsp");
	}


	@Override
	public void doExecute(Map map, HttpServletRequest request, HttpServletResponse response) {
		DiabloLoginDao dao = new DiabloLoginDao();
		Boolean login_chk = false;
		try {
			list1=dao.IsLogin(getOracleConnection(),map);
//			if(dao.IsLogin(getOracleConnection(), reqTray)){
//				//로그인 성공 시
//				System.out.println("로그인 성공");
//				setNextPage("/diablo3.do");
//			}else{
//				System.out.println("로그인 실패");
//				setNextPage("/diablo/diablologin.jsp");
//			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}










}