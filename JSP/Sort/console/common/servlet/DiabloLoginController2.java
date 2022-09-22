package console.common.servlet;

import console.common.cmd.DiabloLoginCmd;
import lombok.SneakyThrows;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Servlet implementation class Diablo3Controller
 */

//life cycle : servlet : init(한번만 실행)-> doget dopost destory


public class DiabloLoginController2 extends BaseController {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doControlForward(request, response, "diablo/diablologin2.jsp");
    }

    @SneakyThrows
    @Override
    public void doControlService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        map = Request_Tray(request);
        cmd = map.get("cmd").toString();
        System.out.println("cmd:" + cmd);
        command = getCommand(cmd);
        cmd = JspCmd(cmd);
        doControlForward(request,response,cmd);
        command.doExecute(map, request, response);
        if (request.getAttribute("list1") != null) {
            List loginlist = (List) request.getAttribute("list1");
            if (loginlist.size() == 1) {
                command.setNextPage("/diabloindex2.do?cmd=diabloindex2");
            } else {
                command.setNextPage("/diablologin2.do?cmd=diablo/diablologin2");
            }
        }else{
            command.setNextPage("/diablo/diablologin2.jsp");
            doControlForward(request,response,cmd);
        }
        doControlForward(request, response, command.getNextPage());

    }
}