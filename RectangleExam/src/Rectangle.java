
public class Rectangle {

	// 필드
	private double width;
	private double length;
	
	// 메소드
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	// 넓이 계산
	public double calcArea() {
		double area;
		area = width * length;
		area = (int) (area * 100) / 100.0;	// 소수점 2자리
		return area;
	}
}
