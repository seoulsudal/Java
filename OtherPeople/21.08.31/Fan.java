
public class Fan {
	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;
	
	private int speed; // 속도
	private boolean on; // 동작 중
	private double radius; // 선풍기의 지름
	private String color; // 색상
	
	// 기본 생성자
	public Fan() {
		this(SLOW, false, 5, "red");
	}
	// 속도, 동작중, 지름, 색상 받는 생성자
	public Fan(int speed, boolean on, double radius, String color) {
		this.speed = speed;
		this.on = on;
		this.radius = radius;
		this.color = color;
	}
	// 속도 반환
	public int getSpeed() {
		return speed;
	}
	// 속도 변경
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	// 동작중 상태 반환
	public boolean isOn() {
		return on;
	}
	// 동작중 상태 변경
	public void setOn(boolean on) {
		this.on = on;
	}
	// 선풍기의 지름 반환
	public double getRadius() {
		return radius;
	}
	// 선풍기의 지름 변경
	public void setRadius(double radius) {
		this.radius = radius;
	}
	// 색상 반환
	public String getColor() {
		return color;
	}
	// 색상 변경
	public void setColor(String color) {
		this.color = color;
	}
	// 선풍기 상태 출력
	public void printFanStatus() {
		System.out.print("지름이 " + radius);
		System.out.print(", 색상은 " + color);
		switch(speed) {
		case SLOW:
			System.out.print(", 최저 속도");
			break;
		case MEDIUM:
			System.out.print(", 중간 속도");
			break;
		case FAST:
			System.out.print(", 최고 속도");
			break;
		default:
			System.out.print(", 정의할 수 없는 속도");
		}
		if(on) {
			System.out.println(", 동작중이다.");
		}else {
			System.out.println(", 정지상태이다.");
		}
	}
	@Override
	public String toString() {
		return "Fan [speed=" + speed + ", on=" + on + ", radius=" + radius + ", color=" + color + "]";
	}
}
