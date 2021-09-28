
public class Magazine extends Book {

	// 필드 생성
	private String releaseDate;

	// 메소드 생성
	// 기본 생성자
	public Magazine() {
		super();
		// TODO Auto-generated constructor stub
	}

	// 중복생성자
	public Magazine(String title, int numberOfPages, String author) {
		super(title, numberOfPages, author);
		// TODO Auto-generated constructor stub
	}

	// 중복생성자
	public Magazine(String releaseDate) {
		super();
		this.releaseDate = releaseDate;
	}

	// 발매일 반환
	public String getReleaseDate() {
		return releaseDate;
	}

	// 발매일 설정
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	// 출력
	@Override
	public String toString() {
		return "Magazine [getReleaseDate()=" + getReleaseDate() + ", getTitle()=" + getTitle() + ", getNumberOfPages()="
				+ getNumberOfPages() + ", getAuthor()=" + getAuthor() + "]";
	}

}
