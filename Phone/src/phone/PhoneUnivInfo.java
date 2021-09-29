package phone;

public class PhoneUnivInfo extends PhoneInfo {

	private String major;
	private int year;
	
	public PhoneUnivInfo() {
		super();
	}
	
	public PhoneUnivInfo(String name, String num) {
		super(name, num);
	}
	
	public PhoneUnivInfo(String name, String num, String major, int year) {
		super(name, num);
		this.major = major;
		this.year = year;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("major : " + major);
		System.out.println("year : " + year);
	}
	
}
