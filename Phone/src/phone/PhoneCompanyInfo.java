package phone;

public class PhoneCompanyInfo extends PhoneInfo {

	private String company;

	public PhoneCompanyInfo() {
		super();
	}

	public PhoneCompanyInfo(String name, String num) {
		super(name, num);
	}

	public PhoneCompanyInfo(String name, String num, String company) {
		super(name, num);
		this.company = company;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("company : " + company);
	}
	
}
