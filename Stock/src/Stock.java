
public class Stock {
	
	// 필드 생성
	private String name; 					// 회사명
	private double proviousClosingPrice; 	// 어제의 종가
	private double currentPrice; 			// 현재가
	
	// 메소드 생성
	// 기본 생성자
	public Stock(){
		this("", 0, 0);
	}
	
	// 종목명 주어진 생성자
	public Stock(String name) {
		this(name, 0, 0);
	}
	
	// 모든 것 주어진 생성자
	public Stock(String name, double proviousClosingPrice, double currentPrice) {
		this.name = name;
		this.proviousClosingPrice = proviousClosingPrice;
		this.currentPrice = currentPrice;
	}
	
	// 주가 변동률 계산 후 반환
	public double getChangePercent() {
		double result;
		// 변동률 = (현재가 - 어제 종가) * 100 / 어제 종가
		result = (currentPrice - proviousClosingPrice) * 100 / proviousClosingPrice;
		return result;
	}
	
	// 회사명 반환
	public String getName() {
		return name;
	}
	
	// 회사명 변경
	public void setName(String name) {
		this.name = name;
	}
	
	// 어제의 종가 반환
	public double getProviousClosingPrice() {
		return proviousClosingPrice;
	}
	
	// 어제의 종가 변경
	public void setProviousClosingPrice(double proviousClosingPrice) {
		this.proviousClosingPrice = proviousClosingPrice;
	}
	
	// 현재가 반환
	public double getCurrentPrice() {
		return currentPrice;
	}
	
	// 현재가 변경
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	@Override
	public String toString() {
		return "Stock [name=" + name + ", proviousClosingPrice=" + proviousClosingPrice + ", currentPrice="
				+ currentPrice + "]";
	}
}
