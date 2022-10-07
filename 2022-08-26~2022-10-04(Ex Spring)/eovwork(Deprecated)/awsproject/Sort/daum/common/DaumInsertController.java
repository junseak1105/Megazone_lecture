package daum.common;

import java.sql.SQLException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import book.common.CommandHandler;

public class DaumInsertController extends CommandHandler {

    public String process(HttpServletRequest request, Map map) {

        DaumDao dao = new DaumDao();
        try {
            dao.BoardInsert(getOracleConnection(), map);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //request.setAttribute(" BoardWriteFormHandler", " BoardWriteFormHandler");

        return "/daum/daumBoardindex.jsp";
    }

}