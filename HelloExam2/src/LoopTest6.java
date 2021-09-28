import java.util.Scanner;

public class LoopTest6 {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 생성
		int num1;	// 첫번째 수
		int num2;	// 두번째 수
		int sum;	// 합
		
		// 합 초기화
		sum = 0;
		
		System.out.println("두 수를 입력받아 곱셈을 하는 프로그램");
		
		// 첫번째 수 입력
		System.out.println("첫번째 수를 입력하세요.");
		num1 = input.nextInt();
		
		// 두번째 수 입력
		System.out.println("두번째 수를 입력하세요.");
		num2 = input.nextInt();
		
		// 반복 실행
		for(int i = 1; i <= num2; ++i) {
			sum = sum + num1;
			
		}
		// 결과 출력
		System.out.println("곱 : "+sum);

	}

}
