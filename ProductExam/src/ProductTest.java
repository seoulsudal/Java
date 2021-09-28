
public class ProductTest {

	public static void main(String[] args) {
		
		// 인스턴스 호출
		Product stock = new Product();
		
		// 상품 번호 입력
		stock.setProductNumber(29);
		
		// 상품 이름 입력
		stock.setProductName("아이스아메리카노");
		
		// 상품 재고 입력
		stock.setAvailableStock(50);

		// 재고 출력
		System.out.println(stock.getProductName()+"의 최초 재고 현황");
		System.out.println(stock.getAvailableStock()+"\n");
		
		// 재고 증가
		stock.inverntoryIncrease(24);
		
		// 재고 출력
		System.out.println(stock.getProductName()+"의 재고 증가 후 재고 현황");
		System.out.println(stock.getAvailableStock()+"\n");
		
		// 재고 감소
		stock.inverntoryReduction(17);

		// 재고 출력
		System.out.println(stock.getProductName()+"의 재고 감소 후 재고 현황");
		System.out.println(stock.getAvailableStock()+"\n");

	}

}
