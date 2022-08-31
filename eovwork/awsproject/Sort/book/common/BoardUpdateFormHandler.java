package book.common;


import java.util.Map;


import javax.servlet.http.HttpServletRequest;


public class BoardUpdateFormHandler extends CommandHandler {

    @Override

    public String process(HttpServletRequest request, Map map) {

        request.setAttribute("BoardUpdateFormHandler", "BoardUpdateFormHandler");


        return "/book/BoardUpdateForm.jsp";

    }


}