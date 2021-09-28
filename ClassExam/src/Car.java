
public class Car {
	// 필드 정의
	private int speed;		// 현재 속도
	private int gear;		// 현재 기어 단수
	private String color;	// 색상
	
	// 메소드 정의
	public void speedUp() {		// 속도 증가
		speed += 10;
		
	}
	public void speedDown() {	// 속도 감소
		speed -= 10;
	}
	public void printData() {
		System.out.println("속도: "+speed+" 기어: "+gear+" 색상: "+color);
	}
	public String toString() {
		return "속도: "+speed+" 기어: "+gear+" 색상: "+color;
	}

}
