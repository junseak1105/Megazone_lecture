package j20220812;

import java.util.ArrayList;
import java.util.Hashtable;

public class CoupangBean {
	String coupang[] = { "로켓배송", "로켓프레시", "쿠팡비즈", "로켓직구", "골드박스", "와우회원할인", "이벤트/쿠폰", "기획전", "여행/티켓" };
	int index =0;
	ArrayList list = new ArrayList();
	Hashtable board;
	
	public String[] getCoupang() {
		return coupang;
	}

	public ArrayList getList() {
		if(list==null) {
			list=  new ArrayList();
		}
		return list;
	}
	
	public void setList(ArrayList list) {
		this.list=list;
	}
	
	public void setList(Object input) {
		list.add(input);
	}
	
	public void setBoard(Object input, CoupangBean coupangBean) {
		this.board.put(coupangBean,input);
	}
	
	public void setcoupang() {
		for (int i = 0; i < coupang.length; i++) {
			board.put(coupang[i], coupang[i]);
		}
	}
	
	public CoupangBean(int index,String coupang1, String coupang2, String coupang3, String coupang4,
			String coupang5, String coupang6, String coupang7, String coupang8, String coupang9) {
		this.setBoard("board1",new CoupangBean(++index,coupang1,coupang2,coupang3,coupang4,coupang5,coupang6,coupang7,coupang8,coupang9));
		
	}
	
	public CoupangBean(String coupang1, String coupang2, String coupang3, String coupang4,
			String coupang5, String coupang6, String coupang7, String coupang8, String coupang9) {
		
	}

}