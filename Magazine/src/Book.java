
public class Book {

	// 필드 생성
	private String title;
	private int numberOfPages;
	private String author;

	// 메소드 생성
	// 기본 생성자
	public Book() {
		super();
	}

	// 중복 생성자
	public Book(String title, int numberOfPages, String author) {
		super();
		this.title = title;
		this.numberOfPages = numberOfPages;
		this.author = author;
	}

	// 제목 반환
	public String getTitle() {
		return title;
	}

	// 제목 설정
	public void setTitle(String title) {
		this.title = title;
	}

	// 페이지 반환
	public int getNumberOfPages() {
		return numberOfPages;
	}

	// 페이지 설정
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
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
		return "Book [title=" + title + ", numberOfPages=" + numberOfPages + ", author=" + author + "]";
	}

}
