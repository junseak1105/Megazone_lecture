package hello.servlet.web.frontcontroller.Board.repository;


import hello.servlet.web.frontcontroller.Board.bean.BoardBean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardRepository {
    private static Map<String, BoardBean> store = new HashMap<>(); //static 사용
    private static final BoardRepository instance = new BoardRepository();

    public static BoardRepository getInstance() {
        return instance;
    }

    private BoardRepository() {
    }

    public BoardBean save(BoardBean boardBean) {
        store.put(boardBean.getNumberindex(), boardBean);
        return boardBean;
    }

    public BoardBean findById(Long id) {
        return store.get(id);
    }

    public List<BoardBean> findAll() {
        return new ArrayList<>(store.values());
    }

    public void clearStore() {
        store.clear();
    }
}
