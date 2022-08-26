package console.common.servlet;

import console.common.cmd.Diablo3BoardCmd;
import console.common.cmd.Diablo3LoginCmd;
import console.common.util.CommonUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * Servlet implementation class Diablo3Controller
 */

//life cycle : servlet : init(한번만 실행)-> doget dopost destory
public class Diablo3LoginController extends BaseServlet {

    @Override
    public final void doService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nextPage = null;
        try {
            Map map = CommonUtil.CommonPNames(request);
            Diablo3LoginCmd cmd = new Diablo3LoginCmd();
            cmd.doExecute(map, request, response);

			doForward(request, response, cmd.getNextPage());

        } catch (Exception ex) {
            // throw new AppException("Diablo3Controller.doService", ex);
        } finally {

        }

    }


}