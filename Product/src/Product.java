
public class Product {

	// 필드 생성
	private String name;	// 이름
	private int price;		// 가격

	// 메소드 생성
	// 기본 생성자
	public Product() {
		super();
	}

	// 중복 생성자
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	// 이름 반환
	public String getName() {
		return name;
	}

	// 이름 설정
	public void setName(String name) {
		this.name = name;
	}

	// 가격 반환
	public int getPrice() {
		return price;
	}

	// 가격 설정
	public void setPrice(int price) {
		this.price = price;
	}

	// 출력
	@Override
	public String toString() {
		return "제품의 이름 : " + name + ", 제품의 기본 가격 : " + price + " 원";
	}

}
