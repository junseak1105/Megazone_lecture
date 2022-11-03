package com.rubypage.jpa.persistence;

import com.rubypage.jpa.domain.Board;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BoardRepository extends CrudRepository<Board, Long> {
    List<Board> findByTitle(String searchKeyword);

    List<Board> findByTitleContainingOrContentContaining(String title, String content);

    List<Board> findByTitleContaining(String searchKeyword, Pageable paging);
}
