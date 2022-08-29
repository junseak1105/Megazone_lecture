package console.common.cmd;

import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Command {
	public void doExecute(Map reqTray, HttpServletRequest request, HttpServletResponse response);
}