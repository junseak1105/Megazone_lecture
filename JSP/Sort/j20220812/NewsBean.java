package Sort.j20220812;

public class NewsBean {
// 홈 사회 정치 경제 국제 문화 IT 연재 포토 팩트체크
	private int number;
	
	private String home;
	private String social;
	private String politics;
	private String economy;
	private String international;
	private String culturl;
	private String it;
	private String publish;
	private String photo;
	private String fact;
	
	public NewsBean(int number,String home,String social,String politics,String economy,String international,String culturl,String it,String publish,String photo,String fact) {
		this.number=number;
		this.home= home;         
		this.social=social;       
		this.politics=politics;     
		this.economy=economy;      
		this.international=international;
		this.culturl = culturl;      
		this.it=it;           
		this.publish=publish;      
		this.photo=photo;        
		this.fact=fact;         
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public String getSocial() {
		return social;
	}

	public void setSocial(String social) {
		this.social = social;
	}

	public String getPolitics() {
		return politics;
	}

	public void setPolitics(String politics) {
		this.politics = politics;
	}

	public String getEconomy() {
		return economy;
	}

	public void setEconomy(String economy) {
		this.economy = economy;
	}

	public String getInternational() {
		return international;
	}

	public void setInternational(String international) {
		this.international = international;
	}

	public String getCulturl() {
		return culturl;
	}

	public void setCulturl(String culturl) {
		this.culturl = culturl;
	}

	public String getIt() {
		return it;
	}

	public void setIt(String it) {
		this.it = it;
	}

	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getFact() {
		return fact;
	}

	public void setFact(String fact) {
		this.fact = fact;
	}
	
	
}
