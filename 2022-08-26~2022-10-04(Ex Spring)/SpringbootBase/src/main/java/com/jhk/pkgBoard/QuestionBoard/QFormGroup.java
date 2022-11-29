package com.jhk.pkgBoard.QuestionBoard;

import lombok.Data;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
@Setter
public class QFormGroup {

    private final String idx; //글 번호 &질문 답변 구분용
    private final String list;
    private final String group;
    private final String level;
    private final String step;

}
