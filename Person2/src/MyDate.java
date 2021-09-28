
public class MyDate {

	// 필드 생성
	private int year; // 년
	private int month; // 월
	private int day; // 일

	// 메소드 생성
	// 기본 생성자
	public MyDate() {
		super();
	}

	// 중복 생성자
	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	// 년 반환
	public int getYear() {
		return year;
	}

	// 년 설정
	public void setYear(int year) {
		this.year = year;
	}

	// 월 반환
	public int getMonth() {
		return month;
	}

	// 월 설정
	public void setMonth(int month) {
		this.month = month;
	}

	// 일 반환
	public int getDay() {
		return day;
	}

	// 일 설정
	public void setDay(int day) {
		this.day = day;
	}

	// 출력
	@Override
	public String toString() {
		return "MyDate [year=" + year + ", month=" + month + ", day=" + day + "]";
	}

}
