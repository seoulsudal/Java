
public class LoopTest {

	public static void main(String[] args) {
		
		// 변수 선언
		double dsum;
		float sum;
		
		sum = 0.0f;
		dsum = 0.0;
		
		for(float i = 0.01f; i <= 1.0f; i = i + 0.01f) {
			sum = sum + i;
		}
		System.out.println("float 합은 "+sum+" 이다.");
		
		double currentValue = 0.01;
		for(double i = 0; i < 100; i++) {
			dsum += currentValue;
			currentValue += 0.01;
		}
		System.out.println("double 합은 "+dsum+" 이다");

	}

}
