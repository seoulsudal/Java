
public class Point {

	// 필드 생성
	private int x;	// x좌표
	private int y;	// y좌표
	
	// 메소드 생성
	// 기본 생성자
	public Point() {
		super();
	}

	// 중복 생성자
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	// x좌표 반환
	public int getX() {
		return x;
	}

	// x좌표 변경
	public void setX(int x) {
		this.x = x;
	}

	// y좌표 반환
	public int getY() {
		return y;
	}

	// y좌표 변경
	public void setY(int y) {
		this.y = y;
	}

	//출력
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}	
	
}
