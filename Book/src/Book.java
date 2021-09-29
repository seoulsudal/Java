
public class Book {

	// 필드 선언
	private int number; // 관리번호
	private String title; // 제목
	private String author; // 저자

	// 메소드 선언
	// 기본 생성자
	public Book() {
		super();
	}

	// 중복 생성자
	public Book(int number, String title, String author) {
		super();
		this.number = number;
		this.title = title;
		this.author = author;
	}

	// 관리번호 반환
	public int getNumber() {
		return number;
	}

	// 관리번호 설정
	public void setNumber(int number) {
		this.number = number;
	}

	// 제목 반환
	public String getTitle() {
		return title;
	}

	// 제목 설정
	public void setTitle(String title) {
		this.title = title;
	}

	// 저자 반환
	public String getAuthor() {
		return author;
	}

	// 저자 설정
	public void setAuthor(String author) {
		this.author = author;
	}

	// 출력
	@Override
	public String toString() {
		return "Book [number=" + number + ", title=" + title + ", author=" + author + "]";
	}

}
