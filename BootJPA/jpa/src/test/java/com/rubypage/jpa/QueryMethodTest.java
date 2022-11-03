package com.rubypage.jpa;


import com.rubypage.jpa.domain.Board;
import com.rubypage.jpa.persistence.BoardRepository;
import org.junit.Before;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QueryMethodTest {

    @Autowired
    private BoardRepository boardRepository;

    @Before
    public void dataPrepare() {
        for (int i = 1; i <= 200; i++) {
            Board board = new Board();
            board.setTitle("제목" + i);
            board.setWriter("테스터");
            board.setContent(i + "번째 테스트입니다.");
            board.setCreateDate(new Date());
            board.setCnt(0L);
            boardRepository.save(board);
        }
    }

    @Test
    public void testFindByTitleContaining() {
        Pageable paging = PageRequest.of(0, 5, Sort.Direction.DESC, "seq");

        List<Board> boardList = boardRepository.findByTitleContaining("17", paging);
        System.out.println("검색 결과");
        for (Board board : boardList) {
            System.out.println("---> " + board.toString());
        }
    }

    //    @Test
    public void testFindByTitleContainingOrContentContaining() {
        List<Board> boardList = boardRepository.findByTitleContainingOrContentContaining("17", "17");
        System.out.println("검색 결과");
        for (Board board : boardList) {
            System.out.println("---> " + board.toString());
        }
    }


//    @Test
//    public void testFindByTitle(){
//        List<Board> boardList = boardRepository.findByTitle("제목10");
//        System.out.println("검색 결과");
//        for(Board board : boardList){
//            System.out.println("--->"+board.toString());
//        }
//    }
}
