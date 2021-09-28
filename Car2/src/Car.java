
public class Car {
	private int speed;
	private int mileage;
	private String color;
	
	// 생성자	초기화
	public Car() {
		this(10, 100, "white");
	}
	
	// 생성자
	public Car(int speed, int mileage, String color) {
		super(); 
		this.speed = speed;
		this.mileage = mileage;
		this.color = color;
	}

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
	
	@Override	// 오버라이드는 아직 몰라도됨
	public String toString() {
		return "Car [speed=" + speed + ", mileage=" + mileage + ", color=" + color + "]";
	}	
	
}	