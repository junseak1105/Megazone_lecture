package console.common.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import console.common.util.CommonUtil;
import console.common.cmd.DiabloCmd;

/**
 * Servlet implementation class Diablo3Controller
 */

//life cycle : servlet : init(한번만 실행)-> doget dopost destory
public class DiabloController extends BaseController {

    @Override
    public void doControlService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nextPage = null;

        try {
            DiabloCmd cmd = new DiabloCmd();
            cmd.doExecute(map, request, response);
            doControlForward(request, response, cmd.getNextPage());
        } catch (Exception ex) {
            // throw new AppException("Diablo3Controller.doService", ex);
        } finally {

        }

    }
}