package book.common;


import java.util.Map;


import javax.servlet.http.HttpServletRequest;


public class BoardDetailListFormHandler extends CommandHandler{


    @Override

    public String process(HttpServletRequest request,Map map) {

        request.setAttribute("BoardDetailListFormHandler", "BoardDetailListFormHandler");

        return "/book/BoardDetailListForm.jsp";

    }




}