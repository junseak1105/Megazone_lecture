package console.common.servlet;

import console.common.cmd.DiabloIndexCmd;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DiabloIndexController extends BaseController{
    @Override
    public void doControlService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        map = Request_Tray(request);
        command = new DiabloIndexCmd();
        command.doExecute(map,request,response);
        command.setNextPage("diablo/diabloindex.jsp");
        try {
            doControlForward(request,response,command.getNextPage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
