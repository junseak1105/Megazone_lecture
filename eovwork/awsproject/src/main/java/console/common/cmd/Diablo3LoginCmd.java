package console.common.cmd;

import console.common.dao.Diablo3BoardDao;
import console.common.dao.Diablo3LoginDao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

public class Diablo3LoginCmd extends BaseCommand{


	public Diablo3LoginCmd() {
		//모든 페이지 관리
		setNextPage("/diablologin.jsp");
	}


	@Override
	public void doExecute(Map reqTray, HttpServletRequest request, HttpServletResponse response) {
		Diablo3LoginDao dao = new Diablo3LoginDao();


		Boolean login_chk = false;
		try {
			if(dao.Diablo3Login(getOracleConnection(), reqTray)){
				//로그인 성공 시
				System.out.println("로그인 성공");
				setNextPage("/diablo3.do");
			}else{
				System.out.println("로그인 실패");
				setNextPage("/diablologin.jsp");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}










}