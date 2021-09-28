
public class Product {
	
	// 필드 정의
	private int productNumber;	// 상품번호
	private String productName;	// 상품이름
	private int availableStock;	// 재고수량
	
	// 메소드 정의
	public int getProductNumber() {						// 출력
		return productNumber;
	}
	public void setProductNumber(int productNumber) { 	// 입력
		this.productNumber = productNumber;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getAvailableStock() {
		return availableStock;
	}
	public void setAvailableStock(int availableStock) {
		this.availableStock = availableStock;
	}

	// 재고 증가
	public void inverntoryIncrease(int count) {
		availableStock += count;
	}
	
	// 재고 감소
	public void inverntoryReduction(int count) {
		availableStock -= count;
	}
	
	
	
}
