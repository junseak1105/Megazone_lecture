package sec00.ex01;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class BoardController
 */
@WebServlet("/board.do")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BoardDAO boardDAO;
	BoardService boardService;

	public void init() throws ServletException {
//		boardDAO = new BoardDAO();
		boardService = new BoardService();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doHandle(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doHandle(request, response);
	}

	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		int articleNo = 0;
		switch (request.getParameter("type")) {
			case "add":
				//http://localhost/pro17/board.do?type=add&id=kim&title=title&content=content
				String id = request.getParameter("id");
				String title = request.getParameter("title");
				String content = request.getParameter("content");
				BoardVO boardVO = new BoardVO(id,title,content);
				boardService.addBoard(boardVO);
				break;
			case "delete":
				articleNo = Integer.parseInt(request.getParameter("articleNo"));
				boardService.deleteBoard(articleNo);
				break;
			case "update":
				//http://localhost/pro17/board.do?type=update&title=titlefix&content=contentfix&articleNo=5
				articleNo = Integer.parseInt(request.getParameter("articleNo"));
				title = request.getParameter("title");
				content = request.getParameter("content");
				boardVO = new BoardVO(articleNo,title,content);
				boardService.updateBoard(boardVO);


		}

		List<BoardVO> boardList = boardService.boardList();
		request.setAttribute("boardList", boardList);
		System.out.println("boardList:" + boardList.get(0).getArticleNo());
		RequestDispatcher dispatch = request.getRequestDispatcher("/sec00/ex01/t_board.jsp");
		dispatch.forward(request, response);
	}

}
