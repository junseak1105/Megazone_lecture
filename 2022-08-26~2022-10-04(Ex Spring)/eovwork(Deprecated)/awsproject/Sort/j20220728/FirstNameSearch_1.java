package Sort.j20220728;

import java.util.*;

public class FirstNameSearch_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<String> arrayList = new ArrayList<>();
		String input = "";
		boolean torf = true;
		int temp = 0;

		while (true) {
			System.out.println("카테고리 선택: 1.이름 추가 2.이름 삭제 3.성 변경 4.이름 목록 보기");
			int num = in.nextInt();
			switch (num) {
			case 1:
				while (true) {
					System.out.println("이름을 입력하세요, 멈추시려면 0을 입력하세요.");
					input = in.next();
					if (input.equals("0")) {
						break;
					} else {
						for (int i = 0; i < arrayList.size(); i++) {
							if (arrayList.get(i).equals(input)) {
								System.out.println("이미 존재하는 이름입니다");
								torf = false;
								break;
							} else {
								torf = true;
							}
						}
						if (torf) {
							arrayList.add(input);
							System.out.println("이름이 추가되었습니다");
						}
					}
				}
				break;
			case 2:
				while (true) {

					System.out.println("삭제하려는 이름을 입력하세요, 멈추시려면 0을 입력하세요.");
					input = in.next();
					if (input.equals("0")) {
						break;
					} else {
						for (int i = 0; i < arrayList.size(); i++) {
							if (arrayList.get(i).equals(input)) {
								temp = i;
								torf = true;
							} else {
								torf = false;
							}
						}
						if (torf) {
							arrayList.remove(temp);
							System.out.println("삭제되었습니다");
						} else {
							System.out.println("해당하는 이름이 없습니다");
						}
					}
				}
				break;
			case 3:
				while (true) {
					System.out.println("성을 변경하려는 이름을 입력하세요, 멈추시려면 0을 입력하세요.");
					input = in.next();
					if (input.equals("0")) {
						break;
					} else {
						for (int i = 0; i < arrayList.size(); i++) {
							if (arrayList.get(i).equals(input)) {
								System.out.println("변경할 성을 입력하세요");
								input = in.next();
								for (int j = 0; j < arrayList.get(i).length(); j++) {
									char[] chars = arrayList.get(i).toCharArray();
									chars[0] = input.charAt(0);
									arrayList.set(i, String.valueOf(chars));
								}
								System.out.println("성이 변경되었습니다.");
								torf= true;
								break;
							} else {
								torf = false;
							}
						}
						if (!torf) {
							System.out.println("해당하는 이름이 없습니다");
						}
					}
				}
				break;
			case 4:
				for (int i = 0; i < arrayList.size(); i++) {
					System.out.println(arrayList.get(i));
				}
				break;
			default:
				System.out.println("잘못된 입력입니다. 숫자를 입력하세요!");
				break;
			}
		}

//		String name[] = {"일재훈","이재훈","삼재훈"};
//		char first[] = {'오','이','김'};
//		
//		for (int i = 0; i < name.length; i++) {
//			char[] chars = name[i].toCharArray();
//			chars[0] = first[i];
//			name[i]=String.valueOf(chars);
//		}
//		
//		for (int i = 0; i < name.length; i++) {
//			System.out.println(name[i]);
//		}
	}

}
