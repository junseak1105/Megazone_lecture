package console.common.cmd;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class TestCmd extends BaseCommand{

    public TestCmd(){
        setNextPage("/test/test.jsp");
    }
    @Override
    public void doExecute(Map reqTray, HttpServletRequest request, HttpServletResponse response) {

    }
}
