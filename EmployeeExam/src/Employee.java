
public class Employee {

	// 필드 
	private String name;		// 직원 이름
	private String phoneNumber;	// 직원 번호
	private int salary;			// 직원 연봉
	
	// 메소드
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void result() {
		System.out.println(name+" 직원의 연락처는 0"+phoneNumber+" 이고, 연봉은 "+salary+"만원 입니다.");
	}
}
