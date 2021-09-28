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
		
		// 다항식 계산 공식
		polynomial = ( 3 * x * x * x ) + ( 7 * x * x ) + ( 11 * x ) + 6;	// 3x³+7x²+6 계산식
		
		// 결과 출력
		System.out.println("x값이 "+x+"인 다항식 3x³+7x²+6의 값은 "+polynomial+" 입니다.");


	}

}
