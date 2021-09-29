
public class Car {
	private int speed; 		// 속도
	private int mileage;	// 주행거리
	private String color; 	// 색상
	
	// 생성자
	public Car() {
		 speed = 10;
		 mileage = 100;
		 color = "blue";
		// 매개변수 없이 이렇게 해도 상관없음		 
	}
	//
	// 생성자
	public Car(int s , int m, String c) {
		speed = s;
		mileage = m;
		color = c;
	}
	
	// 게터 세터는 무조건 만들어야함
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
