package org.mvc.member;

import java.util.List;

public class MemberService {
	private MemberDAO dao;

	public MemberService() {
		dao = new MemberDAO();
	}

	public List<MemberVO> listMembers() {
		List<MemberVO> membersList = null;
		membersList = dao.listMembers();
		return membersList;
	}

	public void addMember(MemberVO m) {
		dao.addMember(m);
	}

	public MemberVO findMember(String id) {
		MemberVO memberVO = null;
		memberVO = dao.findMember(id);
		return memberVO;
	}

	public void modMember(MemberVO m) {
		dao.modMember(m);
	}

	public void delMember(String id) {
		dao.delMember(id);
	}
}
