package console.common.cmd;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class CommandManager {
    static Map map = new Hashtable();

    //cmd flag : 해당하는 cmd로 이동.
    public static Map getMapping(){
        map.put("test","console.common.cmd.TestCmd");
        map.put("/diabloindex2","console.common.cmd.DiabloWebPageCmd");
        map.put("/diablologin2","console.common.cmd.DiabloWebPageCmd");

        map.put("diabloindex2","console.common.cmd.DiabloLoginCmd2");
        map.put("diablologin2","console.common.cmd.DiabloIndexCmd2");
        return map;
    }
}
