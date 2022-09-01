package console.common.servlet;

import console.common.cmd.DiabloIndexCmd;
import lombok.SneakyThrows;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class DiabloIndexController2 extends BaseController {
    @SneakyThrows
    @Override
    public void doControlService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        map = Request_Tray(request);
        String cmd = map.get("cmd").toString();
        System.out.println("cmd:" + cmd);

        command = getCommand(cmd);
        command.doExecute(map, request, response);
        doControlForward(request, response, command.getNextPage());


    }

}
