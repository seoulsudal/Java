
public class Circle {

	// 필드 생성
	private Point centerPoint;	// 중심점
	private int radius;			// 반지름

	// 메소드 생성
	// 기본 생성자
	public Circle() {
		super();
	}

	// 중복 생성자
	public Circle(Point centerPoint, int radius) {
		super();
		this.centerPoint = centerPoint;
		this.radius = radius;
	}

	// 중심점 반환
	public Point getCenterPoint() {
		return centerPoint;
	}

	// 중심점 변경
	public void setCenterPoint(Point centerPoint) {
		this.centerPoint = centerPoint;
	}

	// 반지름 반환
	public int getRadius() {
		return radius;
	}

	// 반지름 변경
	public void setRadius(int radius) {
		this.radius = radius;
	}

	// 출력
	@Override
	public String toString() {
		return "Circle [centerPoint=" + centerPoint + ", radius=" + radius + "]";
	}
	
}
