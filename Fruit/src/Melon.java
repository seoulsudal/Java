
public class Melon extends Fruit {

	// 필드 생성
	private String cultivationPlantationInformation;

	// 메소드 생성
	// 기본 생성자
	public Melon() {
		super();
	}

	// 중복 생성자
	public Melon(double calorie, int price, double weight) {
		super(calorie, price, weight);
	}

	// 중복 생성자
	public Melon(String cultivationPlantationInformation) {
		super();
		this.cultivationPlantationInformation = cultivationPlantationInformation;
	}

	// 경장 농원 정보 반환
	public String getCultivationPlantationInformation() {
		return cultivationPlantationInformation;
	}

	// 경장 농원 정보 설정
	public void setCultivationPlantationInformation(String cultivationPlantationInformation) {
		this.cultivationPlantationInformation = cultivationPlantationInformation;
	}

	// 출력
	@Override
	public String toString() {
		return "Melon [getCultivationPlantationInformation()=" + getCultivationPlantationInformation()
				+ ", getCalorie()=" + getCalorie() + ", getPrice()=" + getPrice() + ", getWeight()=" + getWeight()
				+ "]";
	}

}
