package console.common.servlet;

import console.common.cmd.DiabloLoginCmd;
import console.common.dao.DiabloLoginDao;

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
                command.setNextPage("/diabloindex.do");
            }else{
                command.setNextPage("diablo/diablologin.jsp");
            }
        }
        try {
            doControlForward(request,response,command.getNextPage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}