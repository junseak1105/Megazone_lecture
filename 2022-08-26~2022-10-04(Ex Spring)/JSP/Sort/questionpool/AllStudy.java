package Sort.questionpool;

public class AllStudy {
	String name;
	int age;
	String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static void main(String[] args) {
		int num[] = { 2, 3, 4, 5, 6, 7, 8, 9 };
		String name[] = { "일재훈", "이재훈", "삼재훈", "사재훈", "오재훈" };
		char lname[] = { '김', '이', '박', '최' };
		int num2[][] = { { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 } };

		// 2~9합
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println("2~9합:" + sum);
		System.out.println("======================================");
		// 이름 검색 출력
		for (int i = 0; i < name.length; i++) {
			if (name[i] == "사재훈" || name[i] == "삼재훈") {
				System.out.println(name[i] + "검색됨");
			}
		}
		System.out.println("======================================");
		// 성씨 검색
		for (int i = 0; i < lname.length; i++) {
			if (lname[i] == '김' || lname[i] == '최') {
				System.out.println(lname[i] + "씨 검색됨");
			}
		}
		System.out.println("======================================");
		// 2차원배열 합
		sum = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				sum += num2[i][j];
			}
		}
		System.out.println("2차원 배열 합: " + sum);
		System.out.println("======================================");
		// 이름 나이 주소 방2개 만들어서 본인 이름 방 출력, 친구 이름 나이 주소 방 출력
		System.out.println();
		AllStudy as1 = new AllStudy();
		AllStudy as2 = new AllStudy();

		as1.setName("김재훈");
		as1.setAge(26);
		as1.setAddress("해운대구");

		as2.setName("김재훈2");
		as2.setAge(26);
		as2.setAddress("해운대구2");
		System.out.println("내이름:"+as1.getName());
		System.out.println("내나이:"+as1.getAge());
		System.out.println("내주소:"+as1.getAddress());

		System.out.println("친구이름:"+as2.getName());
		System.out.println("친구나이:"+as2.getAge());
		System.out.println("친구주소:"+as2.getAddress());

	}
}
