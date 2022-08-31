package hello.servlet.web.frontcontroller.Board;

import java.util.Map;

public interface Controller {
    /*
        v1구조: Frontcontroller->매핑정보 조회->Controller->JSP

        v2구조: Frontcontroller->매핑정보 조회->Controller->MyView->JSP

        v3구조: FrontController->매핑정보 조회->Controller(ModelView반환)->viewResolver(MyView반환)->JSP

        v4: v3와 다르게 controller에서 viewname을 반환하여 사용이 편리해졌다.
        FrontControllerServletV4에 model객체를 생성하여 controller의 반환값을 담는다.
        v4구조: FrontController->매핑정보 조회->Controller(viewname반환)->viewResolver(MyView반환)->JSP

     */
    String process(Map<String,String> paramMap, Map<String, Object> model);
}
