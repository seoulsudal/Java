
public class StockTest {

	public static void main(String[] args) {
		
		// 인스턴스
		Stock gasan = new Stock("가산전자");
		
		// 입력
		gasan.setCurrentPrice(900000);
		gasan.setProviousClosingPrice(1000000);
		
		// 결과 출력
		System.out.printf("주가 변동률 : %.1f%%", gasan.getChangePercent());
	}

}
