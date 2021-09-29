
public class GeometricObject {

	// 필드 생성
	private String color;				// 색상
	private boolean filled;				// 색으로 채워지는지 아닌지 설정
	private java.util.Date dataCreated;	// 객체 생성 날짜

	// 메소드 생성
	// 기본 생성자
	public GeometricObject() {
		super();
		color = "white";
		filled = false;
		dataCreated = new java.util.Date();
	}

	// 색상 반환
	public String getColor() {
		return color;
	}

	// 색상 설정
	public void setColor(String color) {
		this.color = color;
	}

	// filled 반환
	public boolean isFilled() {
		return filled;
	}

	// filled 설정
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	// 날짜 반환
	public java.util.Date getDataCreated() {
		return dataCreated;
	}

	// 출력
	@Override
	public String toString() {
		return "GeometricObject [color=" + color + ", filled=" + filled + ", dataCreated=" + dataCreated + "]";
	}

}
