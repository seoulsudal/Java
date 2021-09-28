import java.util.Scanner;

public class GreatestCommonDivisorMethod {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 생성
		int firstNumber;	// 첫번째 정수
		int secondNumber;	// 두번째 정수
		
		System.out.println("두개의 정수에서 최대공약수를 찾는 프로그램");
		
		// 정수 입력
		System.out.println("첫번째 정수를 입력하세요.");
		firstNumber = input.nextInt();
		System.out.println("두번째 정수를 입력하세요.");
		secondNumber = input.nextInt();
		
		// 최대공약수를 구하는 메소드 호출 및 결과 출력
		System.out.println(firstNumber+"와 "+secondNumber+"의 최대공약수 : "+gcd(firstNumber, secondNumber));

	}
	
	// 최대공약수를 구하는 메소드
	private static int gcd(int firstNumber, int secondNumber) {
		// 변수 생성
		int gcd;	// 최대공약수
		int d;		// 약수
		// 변수 초기화
		gcd = 1;
		d = 2;
		// 소수 구하기
		while((d <= firstNumber) && (d <= secondNumber)) {
			if((firstNumber % d == 0) && (secondNumber % d == 0)) {
				gcd = d;
			}
			d++;
		}
		return gcd;
	}

}
