package hello.servlet.web.frontcontroller.Board.controller;


import hello.servlet.domain.member.Member;
import hello.servlet.web.frontcontroller.Board.Controller;
import hello.servlet.web.frontcontroller.Board.bean.BoardBean;
import hello.servlet.web.frontcontroller.Board.repository.BoardRepository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class BoardListController extends DBConn implements Controller {

    private BoardRepository boardRepository = BoardRepository.getInstance();
    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {

        try {
            BoardList(getOracleConnection());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        List<BoardBean> boardBeans = boardRepository.findAll();
        model.put("boardbean",boardBeans);
        return "board-list";
    }

    public void BoardList(Connection conn) throws Exception {

        StringBuffer query = new StringBuffer();

        query.append("SELECT * from board\n");

        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery(query.toString());
        System.out.println("sql : " + query.toString());

        while (rs.next()) {
            BoardBean bean = new BoardBean(
                    rs.getString("numberindex"),
                    rs.getString("userid"),
                    rs.getString("subject"),
                    rs.getString("currentdate")
            );
            boardRepository.save(bean);
        }


    }
}
