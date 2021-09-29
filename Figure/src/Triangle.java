
public class Triangle {

	// 필드 입력
	private Point vertex;	// 꼭지점
	private int width;	// 가로
	private int height;	// 세로

	// 메소드 입력
	// 기본 생성자
	public Triangle() {
		super();
	}
	
	// 중복 생성자
	public Triangle(Point vertex, int width, int height) {
		super();
		this.vertex = vertex;
		this.width = width;
		this.height = height;
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
	public int getHeight() {
		return height;
	}

	// 세로 변경
	public void setHeight(int height) {
		this.height = height;
	}

	// 출력
	@Override
	public String toString() {
		return "Triangle [vertex=" + vertex + ", width=" + width + ", height=" + height + "]";
	}
	
}
