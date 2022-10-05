package com.jhk.pkgBoard.QuestionBoard;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
public class QForm {
    private final String top; //상단 고정
    private final String header; //머릿글(분류)
    private final String writer; //작성자
    private final String subject; //제목
    private final String content; //내용
    private final String password; //비밀번호
    private final List<MultipartFile> file; //파일 목록


}
