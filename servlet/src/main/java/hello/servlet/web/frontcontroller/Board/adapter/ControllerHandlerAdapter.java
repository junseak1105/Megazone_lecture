package hello.servlet.web.frontcontroller.Board.adapter;

import hello.servlet.web.frontcontroller.Board.Controller;
import hello.servlet.web.frontcontroller.ModelView;
import hello.servlet.web.frontcontroller.Board.MyHandlerAdapter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ControllerHandlerAdapter implements MyHandlerAdapter {

    @Override
    public boolean supports(Object handler) {
        //handler가 ControllerV4인 경우에만 처리
        return (handler instanceof Controller);
    }

    @Override
    public ModelView handle(HttpServletRequest request, HttpServletResponse response, Object handler) throws ServletException, IOException {
        //handler을 ControllerV4로 케스팅, paramMap,model을 만들어서 해당 컨트롤러를 호출
        // viewName을 반환
        Controller controller = (Controller) handler;
        Map<String, String> paramMap = createParamMap(request);
        Map<String, Object> model = new HashMap<>();
        String viewName = controller.process(paramMap, model);
        /*
        ControllerV4는 뷰의 이름을 반환함
        어댑터는 ModelView형식이 필요하기 때문에 viewname을 통해 ModelView로 만들어서 반환
         */
        ModelView mv = new ModelView(viewName);
        mv.setModel(model);
        return mv;
    }

    private Map<String, String> createParamMap(HttpServletRequest request) {
        Map<String, String> paramMap = new HashMap<>();
        request.getParameterNames().asIterator()
                .forEachRemaining(paramName -> paramMap.put(paramName,
                        request.getParameter(paramName)));
        return paramMap;
    }
}
