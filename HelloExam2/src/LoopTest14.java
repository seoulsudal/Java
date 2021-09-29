import java.util.Scanner;

public class LoopTest14 {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 생성
		int firstNumber;	// 첫번째 수
		int secondNumber;	// 두번째 수
		int d;				// 공약수
		int gcd;			// 최대 공약수
		
		// 공약수 초기화
		d = 2;
		gcd =1;
		
		
		// 수 입력
		System.out.println("첫번째 수를 입력하세요.");
		firstNumber = input.nextInt();
		
		System.out.println("두번째 수를 입력하세요.");
		secondNumber = input.nextInt();
		
		while((d <= firstNumber) && (d <= secondNumber)) {
			if((firstNumber % d == 0) && (secondNumber % d == 0)) {
				gcd = d;
			}
			d++;
		}
		System.out.println(firstNumber+"와 "+secondNumber+"의 최대 공약수는 "+gcd+" 입니다.");

	}

}
