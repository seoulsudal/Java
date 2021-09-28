
public class Student extends Person {

	// 필드 생성
	private String major;

	// 메소드 생성
	// 기본 생성자
	public Student() {
		super();
		System.out.println("Student 생성자 실행!");
	}

	// 중복 생성자
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
		System.out.println("Student(name, age, major) 생성자 실행!");
	}

	// 전공 반환
	public String getMajor() {
		return major;
	}

	// 전공 설정
	public void setMajor(String major) {
		this.major = major;
	}

	// 출력
	@Override
	public String toString() {
		return super.toString() + ":"+major;
	}

}
