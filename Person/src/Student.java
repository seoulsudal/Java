
public class Student extends Person {

	// 필드 생성
	private String major;

	// 메소드 생성
	// 기본 생성자
	public Student() {
		super();
	}
	
	// 중복 생성자 상속
	public Student(String name, int age) {
		super(name, age);
	}

	// 중복 생성자 
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}

	// 과목 변환
	public String getMajor() {
		return major;
	}

	// 과목 변경
	public void setMajor(String major) {
		this.major = major;
	}

	// 출력
	@Override
	public String toString() {
		return "Student [getMajor()=" + getMajor() + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}

	
}
