
public class Circle extends GeometricObject {

	// 필드 생성
	private double radius;	// 반지름

	// 메소드 생성
	// 기본 생성자
	public Circle() {
		super();
	}

	// 중복 생성자
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	// 반지름 반환
	public double getRadius() {
		return radius;
	}

	// 반지름 설정
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// 면적 반환
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	// 둘레 반환
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
	// 지름 반환
	public double getDiameter() {
		return 2 * radius;
	}
	
	// 결과 출력
	public void printCircle() {
		System.out.println("원 도형의 생성일 : "+getDataCreated()+"\n원의 반지름 : "+radius);
	}
	
}
