package j20220804.mega;

public abstract class MegaFactory implements BaseMega{
	
	public String choiceroom;
	public String name;
	public int age;
	public String address;
	
	@Override
	public void setInfo(String name,int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}


	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return age;
	}


	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return address;
	}


	public String getChoicroom() {
		return choiceroom;
		
	}
	public void setChoiceroom(String choiceroom) {
		this.choiceroom = choiceroom;
	}
	@Override
	public void Room() {
		System.out.println(getChoicroom());
	}
	@Override
	public String getChoiceroom() {
		// TODO Auto-generated method stub
		return choiceroom;
	}
	
	
}
