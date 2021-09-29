
public class DiscountProduct extends Product {

	// 필드 생성
	private int discountProduct; // 할인율

	// 메소드 생성
	// 기본 생성자
	public DiscountProduct() {
		super();
	}

	// 중복 생성자
	public DiscountProduct(String name, int price, int discountProduct) {
		super(name, price);
		this.discountProduct = discountProduct;
	}

	// 할인 금액 반환
	@Override
	public int getPrice() {
		discountProduct = super.getPrice() - (int) (super.getPrice() * ((double)this.discountProduct / 100.0));
		return discountProduct;
	}

	// 할인율 설정
	public void setDiscountProduct(int discountProduct) {
		this.discountProduct = discountProduct;
	}

	// 출력
	@Override
	public String toString() {
		return "제품의 이름 : " + getName() + ", 제품의 원래 가격 : " + super.getPrice() + " 원, 제품의 할인률 : " + discountProduct + " %, 제품의 할인 금액 : "+getPrice();
	}

}
