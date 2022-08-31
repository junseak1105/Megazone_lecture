package console.common.cmd;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestCmd extends BaseCommand {
	
	
	public TestCmd() {
		setNextPage("/test/test.jsp");
	}
	
	
	@Override
	public void doExecute(HttpServletRequest request, HttpServletResponse response, Map map) {
		System.out.println("TestCmd!!");
		
	}
	
}
