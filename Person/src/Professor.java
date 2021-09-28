
public class Professor extends Person {

	// 필드 생성
	private String subject;

	// 메소드 생성
	// 기본 생성자
	public Professor() {
		super();
	}

	// 중복 생성자 상속
	public Professor(String name, int age) {
		super(name, age);
	}

	// 중복 생성자
	public Professor(String subject) {
		super();
		this.subject = subject;
	}

	// 과목 반환
	public String getSubject() {
		return subject;
	}

	// 과목 변경
	public void setSubject(String subject) {
		this.subject = subject;
	}

	// 출력
	@Override
	public String toString() {
		return "Professor [getSubject()=" + getSubject() + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}
