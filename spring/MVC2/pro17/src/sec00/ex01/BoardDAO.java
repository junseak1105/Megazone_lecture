package sec00.ex01;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

public class BoardDAO {
	private DataSource dataFactory;
	private Connection conn;
	private PreparedStatement pstmt;

	public BoardDAO() {
		try {
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<BoardVO> boardList() {
		List<BoardVO> boardList = new ArrayList();
		try {
			conn = dataFactory.getConnection();
			String query = "select * from  t_board order by writeDate desc";
			System.out.println(query);
			pstmt = conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int articleNO = rs.getInt("articleNO");
				String id = rs.getString("id");
				String title = rs.getString("title");
				String content = rs.getString("content");
				Date writeDate = rs.getDate("writeDate");
				BoardVO boardVO = new BoardVO(articleNO,id, title, content, writeDate);
				boardList.add(boardVO);
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return boardList;
	}

	public void addBoard(BoardVO m) {
		try {
			conn = dataFactory.getConnection();
			String id = m.getId();
			String title = m.getTitle();
			String content = m.getContent();
			String query = "insert into t_board(articleNo,id, title, content) " +
					"VALUES((select count(*)+1 from t_board),'"+id+"', '"+title+"' ,'"+content+"')";
			System.out.println(query);
			pstmt = conn.prepareStatement(query);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteBoard(int articleNO) {
		try {
			conn = dataFactory.getConnection();
			String query = "delete from t_board where articleNO=?";
			System.out.println(query);
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, articleNO);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateBoard(BoardVO boardVO) {
		try {
			conn = dataFactory.getConnection();
			String id = boardVO.getId();
			String title = boardVO.getTitle();
			String content = boardVO.getContent();
			int articleNo = boardVO.getArticleNo();
			String query = "update t_board set title=?, content=? where articleNO=?";
			System.out.println(query);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, title);
			pstmt.setString(2, content);
			pstmt.setInt(3, articleNo);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
