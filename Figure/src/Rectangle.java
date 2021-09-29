
public class Rectangle {

	// 필드 입력
	private Point vertex;	// 꼭지점
	private int width;		// 가로
	private int length;		// 세로
	
	// 메소드 입력
	// 기본 생성자
	public Rectangle() {
		super();
	}

	// 중복 생성자
	public Rectangle(Point vertex, int width, int length) {
		super();
		this.vertex = vertex;
		this.width = width;
		this.length = length;
	}

	// 꼭지점 반환
	public Point getVertex() {
		return vertex;
	}

	// 꼭지점 변경
	public void setVertex(Point vertex) {
		this.vertex = vertex;
	}

	// 가로 반환
	public int getWidth() {
		return width;
	}

	// 가로 변경
	public void setWidth(int width) {
		this.width = width;
	}

	// 세로 반환
	public int getLength() {
		return length;
	}

	// 가로 변경
	public void setLength(int length) {
		this.length = length;
	}

	// 출력
	@Override
	public String toString() {
		return "Rectangle [vertex=" + vertex + ", width=" + width + ", length=" + length + "]";
	}
	
}
