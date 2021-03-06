
public class Employee extends Person {

	// 필드 생성
	private String office;			// 사무실
	private int salary;				// 봉급
	private MyDate employmentDate;	// 고용날짜

	// 메소드 생성
	// 기본 생성자
	public Employee() {
		super();
	}

	// 중복 생성자
	public Employee(String name, String address, String number, String email, String office, int salary, MyDate employmentDate) {
		super(name, address, number, email);
		this.office = office;
		this.salary = salary;
		this.employmentDate = employmentDate;
	}

	// 사무실 반환
	public String getOffice() {
		return office;
	}

	// 사무실 설정
	public void setOffice(String office) {
		this.office = office;
	}

	// 봉급 반환
	public int getSalary() {
		return salary;
	}

	// 봉급 설정
	public void setSalary(int salary) {
		this.salary = salary;
	}

	// 고용날짜 반환
	public MyDate getEmploymentDate() {
		return employmentDate;
	}

	// 고용날짜 설정
	public void setEmploymentDate(MyDate employmentDate) {
		this.employmentDate = employmentDate;
	}

	// 출력
	@Override
	public String toString() {
		return "Employee [getOffice()=" + getOffice() + ", getSalary()=" + getSalary() + ", getEmploymentDate()="
				+ getEmploymentDate() + ", getName()=" + getName() + ", getAddress()=" + getAddress() + ", getNumber()="
				+ getNumber() + ", getEmail()=" + getEmail() + "]";
	}

}
