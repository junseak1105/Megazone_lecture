//package book.common;
//
//import java.sql.SQLException;
//
//import java.util.Map;
//
//import javax.servlet.http.HttpServletRequest;
//
//public class BoardWriteFormHandler  extends CommandHandler{
//
//
//    public String process(HttpServletRequest request,Map map) {
//
//        BoardDao dao=new BoardDao();
//
//        try {
//
//            dao.BoardInsert(getOracleConnection(), map);
//
//        } catch (SQLException e){
//
//// TODO Auto-generated catch block
//
//            e.printStackTrace();
//
//
//
//        request.setAttribute("BoardWriteFormHandler","BoardWriteFormHandler");
//
//        return "/book/BoardWriteForm.jsp";
//
//
//
//}