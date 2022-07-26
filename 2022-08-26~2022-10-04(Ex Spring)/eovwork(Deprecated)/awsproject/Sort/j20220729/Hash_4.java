package Sort.j20220729;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.StringTokenizer;

public class Hash_4 {
	static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	static Hashtable table = new Hashtable();
	
	ArrayList list;
	
	public Hash_4() {
		table.put("이름", new ArrayList());
		table.put("나이", new ArrayList());
		table.put("주소", new ArrayList());
	}

	private static void Input(String str) {
		// 나누기
		StringTokenizer token = new StringTokenizer(str, "/");
		
		// 이름 입력
		ArrayList templist = (ArrayList) table.get("이름");
		String temp = (String) token.nextElement();
		templist.add(temp);

		// 나이 입력
		templist = (ArrayList) table.get("나이");
		temp = (String) token.nextElement();
		templist.add(Integer.parseInt(temp));

		// 주소 입력
		templist = (ArrayList) table.get("주소");
		temp = (String) token.nextElement();
		templist.add(temp);
	}

	private static void Search(String str) {
		ArrayList templist = (ArrayList) table.get("이름");
		for (int i = 0; i < templist.size(); i++) {
			if (templist.get(i).equals(str)) {
				ArrayList templist_address = (ArrayList) table.get("주소");
				ArrayList templist_age = (ArrayList) table.get("나이");
				System.out
						.println("검색결과:" + templist.get(i) + "/" + templist_age.get(i) + "/" + templist_address.get(i));
				break;
			} else if (i == templist.size() - 1) {
				System.out.println("검색결과 없음");
				break;
			}
		}

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Hash_4 hs = new Hash_4();
		
		System.out.println("입력할 인원수 입력");
		int cnt = Integer.parseInt((String) buffer.readLine());

		// 갯수만큼 입력받기
		for (int i = 0; i < cnt; i++) {
			System.out.println("이름 나이 주소 입력(/로 구분)");
			String str = (String) buffer.readLine();
			Input(str);
		}

		// 검색
		System.out.println("검색하려는 이름을 입력하세요");
		String str = (String) buffer.readLine();
		Search(str);

	}
}
