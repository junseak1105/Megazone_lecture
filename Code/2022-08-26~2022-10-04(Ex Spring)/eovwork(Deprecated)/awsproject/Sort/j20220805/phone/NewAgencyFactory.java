package Sort.j20220805.phone;

public abstract class NewAgencyFactory implements Skt,Lg,Kt{
	
	public String newagency = "skt";
	
	@Override
	public void NewsAgency(String newsagency) {
		System.out.println(newsagency);
		
	}
	@Override
	public void PersonPhoneInfo() {
		// TODO Auto-generated method stub
		
	}
	
	public NewAgencyFactory() {
		// TODO Auto-generated constructor stub
	}
}
