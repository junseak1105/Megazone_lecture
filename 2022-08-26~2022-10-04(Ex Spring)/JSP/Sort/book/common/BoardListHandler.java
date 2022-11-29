package book.common;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class BoardListHandler extends CommandHandler {

    @Override

    public String process(HttpServletRequest request,Map map) {

        request.setAttribute("BoardList","BoardList");

        return "/book/BoardList.jsp";

    }


}