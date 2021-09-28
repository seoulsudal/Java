
public class Poet extends Book implements LateFees {

	// 필드 선언
	private int era; // 연대

	// 메소드 선언
	// 기본 생성자
	public Poet() {
		super();
	}

	// 중복 생성자
	public Poet(int number, String title, String author, int era) {
		super(number, title, author);
		this.era = era;
	}

	// 연대 반환
	public int getEra() {
		return era;
	}

	// 연대 설정
	public void setEra(int era) {
		this.era = era;
	}

	// 출력
	@Override
	public String toString() {
		return "Poet [getEra()=" + getEra() + ", getNumber()=" + getNumber() + ", getTitle()=" + getTitle()
				+ ", getAuthor()=" + getAuthor() + "]";
	}

	// 연체료 계산하는 메소드
	@Override
	public int getLateFees(int overdueDays) {
		int latefees;
		latefees = 200 * overdueDays;
		return latefees;
	}

}
