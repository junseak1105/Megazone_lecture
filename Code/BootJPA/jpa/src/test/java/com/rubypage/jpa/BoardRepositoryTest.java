package com.rubypage.jpa;

import com.rubypage.jpa.domain.Board;
import com.rubypage.jpa.persistence.BoardRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardRepositoryTest {
    @Autowired
    private BoardRepository boardRepository;


    @Test
    public void testDeleteBoard(){
        boardRepository.deleteById(1L);
    }

    @Test
    public void testUpdateBoard(){
        Board board = boardRepository.findById(1L).get();
        System.out.println("board = " + board);
        board.setTitle("제목을 수정합니다.");
        boardRepository.save(board);
    }

    @Test
    public void testGetBoard() {
        Board board = boardRepository.findById(1L).get();
        System.out.println(board.toString());
    }


    @Test
    public void testInsertBoard(){
        Board board = new Board();
        board.setTitle("첫 번째 게시글");
        board.setWriter("테스터");
        board.setContent("테스트 중입니다.");
        board.setCreateDate(new Date());
        board.setCnt(0L);

        boardRepository.save(board);
    }
}
