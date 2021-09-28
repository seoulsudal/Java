import java.util.Scanner;

public class PolynomialCalculation {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 선언
		double x;			// x
		double polynomial;	// 다항식
		
		System.out.println("다항식 3x³+7x²+6을 계산하는 프로그램");
		
		// x 입력
		System.out.println("x값을 입력하세요.(예 : 6.4)");
		x = input.nextDouble();	
		
		// 다항식을 계산하는 메소드 호출
		polynomial = calculate(x);
		
		// 결과 출력
		System.out.println("x값이 "+x+"인 다항식 3x³+7x²+6의 값은 "+polynomial+" 입니다.(소수점 2자리 표기)");
	
	}
	
	// 다항식을 계산하는 메소드
	public static double calculate(double x) {
		double result;
		result = ( 3 * x * x * x ) + ( 7 * x * x ) + ( 11 * x ) + 6;	// 3x³+7x²+6 계산식
		result = (int) (result * 100) / 100.0;							// 소수점 2자리
		return result;
	}
	
}
