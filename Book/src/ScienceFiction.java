
public class ScienceFiction extends Book implements LateFees {

	// 필드 생성
	private String subject; // 과목

	// 메소드 생성
	// 기본 생성자
	public ScienceFiction() {
		super();
	}

	// 중복 생성자
	public ScienceFiction(int number, String title, String author, String subject) {
		super(number, title, author);
		this.subject = subject;
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
		return "ScienceFiction [getSubject()=" + getSubject() + ", getNumber()=" + getNumber() + ", getTitle()="
				+ getTitle() + ", getAuthor()=" + getAuthor() + "]";
	}

	// 연체료 계산하는 메소드
	@Override
	public int getLateFees(int overdueDays) {
		int latefees;
		latefees = 600 * overdueDays;
		return latefees;
	}

}
