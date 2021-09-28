
public class Rectangle extends GeometricObject {

	// 필드 생성
	private double width; // 가로
	private double height; // 세로

	// 메소드 생성
	// 기본 생성자
	public Rectangle() {
		super();
	}

	// 중복 생성자
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	// 가로 반환
	public double getWidth() {
		return width;
	}

	// 가로 설정
	public void setWidth(double width) {
		this.width = width;
	}

	// 세로 반환
	public double getHeight() {
		return height;
	}

	// 세로 설정
	public void setHeight(double height) {
		this.height = height;
	}

	// 면적 반환
	public double getArea() {
		return width * height;
	}
	
	// 둘레 반환
	public double getPerimeter() {
		return 2 * (width + height);
	}
	
}
