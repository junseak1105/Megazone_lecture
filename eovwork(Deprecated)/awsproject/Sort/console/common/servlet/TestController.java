package console.common.servlet;

import console.common.cmd.TestCmd;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Map;


public class TestController extends BaseController {

    @Override
    protected void doControlService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map map = Request_Tray(request);
        String cmd = map.get("cmd").toString();
        System.out.println("cmd:"+cmd);

        try {
            command= getCommand(cmd);
            command.doExecute(map,request,response);
            doControlForward(request,response,command.getNextPage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
