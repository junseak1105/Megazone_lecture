package hello.servlet.web.frontcontroller.Board.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BoardBean {
    private String numberindex;
    private String userid;
    private String subject;
    private String currentdate;
}
