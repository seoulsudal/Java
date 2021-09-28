
public abstract class Employee {

	// 필드 생성
	private String name;		// 이름
	private int employeeNumber;	// 사원번호

	// 메소드 생성
	// 기본 생성자
	public Employee() {
		super();
	}

	// 중복 생성자
	public Employee(String name, int employeeNumber) {
		super();
		this.name = name;
		this.employeeNumber = employeeNumber;
	}

	// 이름 반환
	public String getName() {
		return name;
	}

	// 이름 설정
	public void setName(String name) {
		this.name = name;
	}

	// 사원번호 반환
	public int getEmployeeNumber() {
		return employeeNumber;
	}

	// 사원번호 설정
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	// 출력
	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeNumber=" + employeeNumber + "]";
	}
	
}
