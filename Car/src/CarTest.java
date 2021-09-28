
public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car(); 
		Car c2 = new Car(1, 10, "red");
		
		//c1.setSpeed(1);
		//c1.setMileage(20);
		//c1.setColor("black");	
		System.out.println(c1.getColor());	// 설정한 값이 아무것도 없을땐 null로 출력됨
		
		System.out.println(c2.getColor()); // 매개변수에 red값을 출력할수있음
		// 둘다 맞는 방법이지만 개발자가 설계한 생성자의 모양을 따라야한다.
		// 디폴트 생성자는 꼭 넣어야함
	}

}