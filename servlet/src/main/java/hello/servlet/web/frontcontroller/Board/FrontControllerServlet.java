package hello.servlet.web.frontcontroller.Board;

import hello.servlet.web.frontcontroller.Board.controller.BoardListController;
import hello.servlet.web.frontcontroller.Board.controller.MemberSaveController;
import hello.servlet.web.frontcontroller.ModelView;
import hello.servlet.web.frontcontroller.MyView;
import hello.servlet.web.frontcontroller.Board.adapter.ControllerHandlerAdapter;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "ServletFrontControllerServlet", value = "/front-controller/board/*")
public class FrontControllerServlet extends HttpServlet {
    private final Map<String, Object> handlerMappingMap = new HashMap<>();
    private final List<MyHandlerAdapter> handlerAdapters = new ArrayList<>();

    public FrontControllerServlet() {
        initHandlerMappingMap(); //핸들러 매핑 초기화
        initHandlerAdapters(); //어댑터 초기화
    }

    private void initHandlerMappingMap() {
        handlerMappingMap.put("/front-controller/board/boardlist", new
                BoardListController());
        handlerMappingMap.put("/front-controller/board/boardinsert", new
                MemberSaveController());
//        handlerMappingMap.put("/front-controller/board/members", new
//                MemberListController());
    }

    private void initHandlerAdapters() {
        handlerAdapters.add(new ControllerHandlerAdapter());
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //핸들러 매핑 정보인 handlerMappingMap에서 URL에 매핑된 핸들러(컨트롤러)객체를 찾아서 반환
        Object handler = getHandler(request);
        if (handler == null) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return;
        }
        //핸들러를 처리할 수 있는 어댑터 조회
        MyHandlerAdapter adapter = getHandlerAdapter(handler);
        //어댑터 호출
        ModelView mv = adapter.handle(request, response, handler);
        MyView view = viewResolver(mv.getViewName());
        view.render(mv.getModel(), request, response);
    }


    private Object getHandler(HttpServletRequest request) {
        String requestURI = request.getRequestURI();
        return handlerMappingMap.get(requestURI);
    }

    private MyHandlerAdapter getHandlerAdapter(Object handler) {
        for (MyHandlerAdapter adapter : handlerAdapters) {
            if (adapter.supports(handler)) {
                return adapter;
            }
        }
        throw new IllegalArgumentException("handler adapter를 찾을 수 없습니다. handler = " + handler);
    }

    private MyView viewResolver(String viewName) {
        return new MyView("/WEB-INF/views/" + viewName + ".jsp");
    }
}
