package console.common.servlet;

import console.common.cmd.DiabloLoginCmd;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class Diablo3Controller
 */

//life cycle : servlet : init(한번만 실행)-> doget dopost destory


public class DiabloLoginController extends BaseController {

    @Override
    public void doControlService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        map = Request_Tray(request);
        command = new DiabloLoginCmd();
        command.doExecute(map,request,response);
        if(request.getAttribute("list1")!=null){
            List loginlist=(List)request.getAttribute("list1");
            if(loginlist.size()==1){
                command.setNextPage("/diablo/diabloindex.jsp");
            }else{
                command.setNextPage("diablo/diablologin.jsp");
            }
        }

        //        String nextPage = null;
//        try {
//            Diablo3LoginCmd cmd = new Diablo3LoginCmd();
//            cmd.doExecute(map, request, response);
//
//            doControlForward(request, response, cmd.getNextPage());
//
//        } catch (Exception ex) {
//            // throw new AppException("Diablo3Controller.doService", ex);
//        } finally {
//
//        }
    }
}