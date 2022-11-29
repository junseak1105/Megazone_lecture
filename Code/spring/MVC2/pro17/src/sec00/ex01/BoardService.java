package sec00.ex01;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class BoardService {
    BoardDAO boardDAO;

    public BoardService() {
        boardDAO = new BoardDAO();
    }

    public List<BoardVO> boardList(){
        List<BoardVO> boardList = boardDAO.boardList();
        return boardList;
    }

    public void addBoard(BoardVO m) {
        boardDAO.addBoard(m);
    }

    public void deleteBoard(int articleNO) {
        boardDAO.deleteBoard(articleNO);
    }

    public void updateBoard(BoardVO boardVO) {
        boardDAO.updateBoard(boardVO);
    }
}
