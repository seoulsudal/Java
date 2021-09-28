
public class CarTest {

	public static void main(String[] args) {

		// 인스턴스 생성
		Car c1 = new Car();
		Car c2 = new Car(1, 10, "red");
		Car c3 = new Car();	// c1이랑 디폴트값이 같아도 다른객체이다.
			
		c1.setSpeed(1);
		c1.setMileage(20);
		c1.setColor("black");
		// 메인에서 입력 값
		System.out.println(c1);
		
		// 인스턴스 입력 값
		System.out.println(c2);
		
		// 기본값
		System.out.println(c3);
		// 이렇게 출력하면 toString으로 만들어진대로 나온다
	}

}
