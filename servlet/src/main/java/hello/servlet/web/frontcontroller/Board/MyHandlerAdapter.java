package hello.servlet.web.frontcontroller.Board;

import hello.servlet.web.frontcontroller.ModelView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface MyHandlerAdapter {
    //어댑터가 해당 컨트롤러로 처리할 수 있는지 판단
    boolean supports(Object handler);
    ModelView handle(HttpServletRequest request, HttpServletResponse response,
                     Object handler) throws ServletException, IOException;
}
