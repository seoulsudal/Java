
public class HourlyEmployee extends Employee implements EmployeeInterface{

	// 필드 생성
	private int hourlySalary;
	private int workingHours;

	// 메소드 생성
	// 기본 생성자
	public HourlyEmployee() {
		super();
	}

	// 중복 생성자
	public HourlyEmployee(String name, int employeeNumber, int hourlySalary, int workingHours) {
		super(name, employeeNumber);
		this.hourlySalary = hourlySalary;
		this.workingHours = workingHours;
	}

	// 시간당 임금 반환
	public int getHourlySalary() {
		return hourlySalary;
	}

	// 시간당 임금 설정
	public void setHourlySalary(int hourlySalary) {
		this.hourlySalary = hourlySalary;
	}

	// 근무시간 반환
	public int getWorkingHours() {
		return workingHours;
	}

	// 근무시간 설정
	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}

	// 출력
	@Override
	public String toString() {
		return "HourlyEmployee [getHourlySalary()=" + getHourlySalary() + ", getWorkingHours()=" + getWorkingHours()
				+ ", getName()=" + getName() + ", getEmployeeNumber()=" + getEmployeeNumber() + "]";
	}
	
	// 임금 계산 메소드
	@Override
	public void computeSalary() {
		int computeSalary = hourlySalary * workingHours;
		System.out.println(super.getEmployeeNumber()+" 사원번호를 가진 "+super.getName()+" 사원의 임금은 "+computeSalary+" 원 입니다.");
	}

}
