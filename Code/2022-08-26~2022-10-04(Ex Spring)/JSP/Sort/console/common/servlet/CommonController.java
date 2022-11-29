package console.common.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class CommonController extends BaseController{
    @Override
    protected void doControlService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map map = Request_Tray(request);
        cmd = JspCmd(map.get("cmd").toString());
        doControlForward(request,response,cmd);
    }
}
