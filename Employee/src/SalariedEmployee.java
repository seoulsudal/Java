
public class SalariedEmployee extends Employee implements EmployeeInterface{

	// 필드 생성
	private int monthlySalary;	// 월급

	// 메소드 생성
	// 기본 생성자
	public SalariedEmployee() {
		super();
	}

	// 중복 생성자
	public SalariedEmployee(String name, int employeeNumber, int monthlySalary) {
		super(name, employeeNumber);
		this.monthlySalary = monthlySalary;
	}

	// 월급 반환
	public int getMonthlySalary() {
		return monthlySalary;
	}

	// 월급 설정
	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	// 출력
	@Override
	public String toString() {
		return "SalariedEmployee [getMonthlySalary()=" + getMonthlySalary() + ", getName()=" + getName()
				+ ", getEmployeeNumber()=" + getEmployeeNumber() + "]";
	}

	// 임금 계산 메소드
	@Override
	public void computeSalary() {
		System.out.println(super.getEmployeeNumber()+" 사원번호를 가진 "+super.getName()+" 사원의 월급은 "+monthlySalary+" 원 입니다.");		
	}
}
