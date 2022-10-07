package console.common.cmd;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {

	
	public void doExecute(HttpServletRequest request, HttpServletResponse response,Map map);
	
	
}
