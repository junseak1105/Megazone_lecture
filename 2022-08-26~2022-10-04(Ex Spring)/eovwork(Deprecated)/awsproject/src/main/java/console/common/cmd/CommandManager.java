package console.common.cmd;

import java.util.Hashtable;
import java.util.Map;

public class CommandManager {
static	Map map=new Hashtable();

	

	//cmd flag cmd move 
	public static Map getCommandMapping() {
		map.put("test","console.common.cmd.TestCmd");
	//page move 
		map.put("diablo/diabloindex2","console.common.cmd.DiabloWebPageCmd" );
		map.put("diablo/diablologin2","console.common.cmd.DiabloWebPageCmd" );
		
		
		//dao
		map.put("diablologin2","console.common.cmd.DiabloLoginCmd2" );
		map.put("diabloindex2","console.common.cmd.DiabloIndexCmd2" );
		
	return map;
	
	
	
}


}
