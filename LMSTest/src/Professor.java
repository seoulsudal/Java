
public class Professor extends Person {

	// 필드 생성
	private String subject;

	// 기본 생성자
	public Professor() {
		super();
		System.out.println("Professor 생성자 실행!");
	}

	// 중복 생성자
	public Professor(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
		System.out.println("Professor(name, age, subject) 생성자 실행!");
	}

	// 과목 반환
	public String getSubject() {
		return subject;
	}

	// 과목 설정
	public void setSubject(String subject) {
		this.subject = subject;
	}

	// 출력
	@Override
	public String toString() {
		return super.toString() + ":"+subject;
	}

}
