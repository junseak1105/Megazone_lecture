package common;

import application.Casting_1;

public class GwangBean extends CommonHome {
	
	public GwangBean(Object name, Object age, Object address) {
		if(Casting_1.getType(name)==2) {
			this.setName((String)name);
		}
		if(Casting_1.getType(name)==1) {
			this.setAge((int)age);
		}
		if(Casting_1.getType(name)==2) {
			this.setAddress((String)address);
		}
	}

}
