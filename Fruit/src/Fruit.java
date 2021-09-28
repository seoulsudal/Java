
public class Fruit {

	// 필드 생성
	private double calorie;
	private int price;
	private double weight;

	// 메소드 생성
	// 기본 생성자
	public Fruit() {
		super();
	}

	// 중복 생성자
	public Fruit(double calorie, int price, double weight) {
		super();
		this.calorie = calorie;
		this.price = price;
		this.weight = weight;
	}

	// 칼로리 반환
	public double getCalorie() {
		return calorie;
	}

	// 칼로리 설정
	public void setCalorie(double calorie) {
		this.calorie = calorie;
	}

	// 가격 반환
	public int getPrice() {
		return price;
	}

	// 가격 설정
	public void setPrice(int price) {
		this.price = price;
	}

	// 무게 반환
	public double getWeight() {
		return weight;
	}

	// 무게 설정
	public void setWeight(double weight) {
		this.weight = weight;
	}

	// 출력
	@Override
	public String toString() {
		return "Fruit [calorie=" + calorie + ", price=" + price + ", weight=" + weight + "]";
	}

}
