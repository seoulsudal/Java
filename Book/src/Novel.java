
public class Novel extends Book implements LateFees {

	// 필드 선언
	private String specificField; // 특정분야

	// 메소드 선언
	// 기본 생성자
	public Novel() {
		super();
	}

	// 중복 생성자
	public Novel(int number, String title, String author, String specificField) {
		super(number, title, author);
		this.specificField = specificField;
	}

	// 특정분야 반환
	public String getSpecificField() {
		return specificField;
	}

	// 특정분야 설정
	public void setSpecificField(String specificField) {
		this.specificField = specificField;
	}

	// 출력
	@Override
	public String toString() {
		return "Novel [getSpecificField()=" + getSpecificField() + ", getNumber()=" + getNumber() + ", getTitle()="
				+ getTitle() + ", getAuthor()=" + getAuthor() + "]";
	}

	// 연체료 계산하는 메소드
	@Override
	public int getLateFees(int overdueDays) {
		int latefees;
		latefees = 300 * overdueDays;
		return latefees;
	}

}
