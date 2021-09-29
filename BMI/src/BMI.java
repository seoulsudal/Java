
public class BMI {

	// 필드 생성
	private String name;	// 이름
	private int age;		// 나이
	private double weight;	// 무게(Kg)
	private double height;	// 키(M)
	
	// 메소드 생성
	// 생성자
	public BMI(String name, int age, double weight, double height) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	
	// 생성자
	public BMI(String name, double weight, double height) {
		this(name, 20, weight, height);
	}
	
	public double getBMI() {
		double bmi = weight / (height * height);
		return Math.round(bmi * 100) / 100.0;
	}
	
	public String getStatus() {
		double bmi = getBMI();
		if(bmi < 16) {
			return "당신은 심각한 저체중 입니다.";
		}
		else if(bmi < 18) {
			return "당신은 저체중 입니다.";
		}
		else if(bmi < 24) {
			return "당신은 정상 체중 입니다.";
		}
		else if(bmi < 29) {
			return "당신은 과체중 입니다.";
		}
		else if(bmi < 35) {
			return "당신은 심각한 과체중(고도 비만) 입니다.";
		}
		else {
			return "당신은 위험한 과체중(초 고도 비만) 입니다.";
		}
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getWeight() {
		return weight;
	}

	public double getHeight() {
		return height;
	}
		
}
