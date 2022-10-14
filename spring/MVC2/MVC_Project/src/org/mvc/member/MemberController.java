package org.mvc.member;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class MemberController
 */
@WebServlet("/member/*")
public class MemberController extends HttpServlet {
//	MemberDAO memberDAO;
	MemberService memberService;

	public void init() throws ServletException {
//		memberDAO = new MemberDAO();
		memberService = new MemberService();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
		doHandle(request, response);
	}

	private void doHandle(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
		String nextPage = "";
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		String action = request.getPathInfo();
		System.out.println("action:" + action);
		if (action == null || action.equals("/listMembers.do")) {
			List<MemberVO> membersList = memberService.listMembers();
			request.setAttribute("membersList", membersList);
			nextPage = "/memberView/listMembers.jsp";

		} else if (action.equals("/memberForm.do")) {
			nextPage = "/memberView/memberForm.jsp";

		} else if (action.equals("/addMember.do")) {
			String id = request.getParameter("id");
			String pwd = request.getParameter("pwd");
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			MemberVO memberVO = new MemberVO(id, pwd, name, email);
			memberService.addMember(memberVO);
			nextPage = "/member/listMembers.do";

		} else if (action.equals("/modMemberForm.do")) {
			String id = request.getParameter("id");
			MemberVO memberVO = memberService.findMember(id);
			request.setAttribute("memInfo", memberVO);
			nextPage = "/memberView/modMemberForm.jsp";

		} else if (action.equals("/modMember.do")) {
			String id = request.getParameter("id");
			String pwd = request.getParameter("pwd");
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			MemberVO memberVO = new MemberVO(id, pwd, name, email);
			memberService.modMember(memberVO);
			nextPage = "/member/listMembers.do";

		} else if (action.equals("/delMember.do")) {
			String id = request.getParameter("id");
			memberService.delMember(id);
			nextPage = "/member/listMembers.do";

		}else{
			List<MemberVO> membersList = memberService.listMembers();
			request.setAttribute("membersList", membersList);
			nextPage = "/memberView/listMembers.jsp";
		}
		RequestDispatcher dispatch = request.getRequestDispatcher(nextPage);
		dispatch.forward(request, response);
	}
}