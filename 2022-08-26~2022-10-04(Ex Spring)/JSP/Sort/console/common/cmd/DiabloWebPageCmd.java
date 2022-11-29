package console.common.cmd;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class DiabloWebPageCmd extends BaseCommand{

    public void DiabloWebPageCmd(){
        setNextPage("/diablo/diabloindex.jsp");
    }
    @Override
    public void doExecute(Map reqTray, HttpServletRequest request, HttpServletResponse response) {

    }
}
