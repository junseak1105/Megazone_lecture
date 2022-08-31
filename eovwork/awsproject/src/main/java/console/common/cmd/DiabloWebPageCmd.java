package console.common.cmd;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DiabloWebPageCmd extends BaseCommand{

	
	public DiabloWebPageCmd() {
			setNextPage("/diablo/diabloindex.jsp");
	}
	
	@Override
	public void doExecute(HttpServletRequest request, HttpServletResponse response, Map map) {
		
		//비지니스 영역 
		
		
	}
}
