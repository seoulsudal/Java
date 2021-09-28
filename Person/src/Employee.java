
public class Employee extends Person {

	// 필드 생성
	private int dept;

	// 메소드 생성
	// 기본 생성자
	public Employee() {
		super();
	}

	// 중복 생성자 상속
	public Employee(String name, int age) {
		super(name, age);
	}

	// 중복 생성자 
	public Employee(int dept) {
		super();
		this.dept = dept;
	}

	// 부서 반환
	public int getDept() {
		return dept;
	}

	// 부서 변경
	public void setDept(int dept) {
		this.dept = dept;
	}

	// 출력
	@Override
	public String toString() {
		return "Employee [getDept()=" + getDept() + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}

}
