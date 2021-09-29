package phone;

import java.io.Serializable;

public class PhoneInfo implements Serializable {

	private String name;
	private String phoneNumber;
	
	public PhoneInfo() {
	}

	public PhoneInfo(String name, String num) {
		this.name = name;
		this.phoneNumber = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void showPhoneInfo() {
		System.out.println("name : " + name);
		System.out.println("phone : " + phoneNumber);
	}
	
	public int hashCode() {
		return name.hashCode();
	}
	
	public boolean equals(Object obj) {
		PhoneInfo cmp = (PhoneInfo) obj;
		if(name.compareTo(cmp.name) == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
