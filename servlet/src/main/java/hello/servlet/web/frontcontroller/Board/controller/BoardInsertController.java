package hello.servlet.web.frontcontroller.Board.controller;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import hello.servlet.web.frontcontroller.Board.Controller;

import java.util.List;
import java.util.Map;

public class BoardInsertController implements Controller {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {
        List<Member> members = memberRepository.findAll();
        model.put("members",members);
        return "members";
    }
}
