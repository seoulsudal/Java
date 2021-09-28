
public class StockTest {

	public static void main(String[] args) {
		Stock gasan = new Stock("가산전자");
		
		gasan.setCurrentPrice(900000);
		gasan.setProviousClosingPrice(1000000);
		
		System.out.printf("주가 변동률 : %.1f%%", gasan.getChangePercent());
	}

}
