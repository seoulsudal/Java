
public class Employee extends Person {

	// 필드 생성
	private String dept;

	// 메소드 생성
	// 기본 생성자
	public Employee() {
		super();
		System.out.println("Employee 생성자 실행!");
	}

	// 중복 생성자
	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
		System.out.println("Employee(name, age, dept) 생성자 실행!");
	}

	// 부서 반환
	public String getDept() {
		return dept;
	}

	// 부서 설정
	public void setDept(String dept) {
		this.dept = dept;
	}

	// 출력
	@Override
	public String toString() {
		return super.toString() + ":" + dept;
	}

}
