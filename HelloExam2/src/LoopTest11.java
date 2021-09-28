import java.util.Scanner;

public class LoopTest11 {

	public static void main(String[] args) {
		
		// 스캐너 생선
		Scanner input = new Scanner(System.in);
		
		// 변수 생성
		int sum;	// 합
		int number;	// 수
		
		// 합 초기화
		sum = 0;
		
		System.out.println("-1이 입력될 때까지 정수를 입력받아 합을 출력하는 프로그램");
		
		// 수 입력
		System.out.println("수를 입력하세요");
		number = input.nextInt();
		
		// 반복 입력
		while(number != -1) {
			sum = sum + number;
			
			// 수 입력
			System.out.println("수를 입력하세요.");
			number = input.nextInt();
		}
		
		// 결과 출력
		System.out.println("총 수의 합은 "+sum+" 이다.");

	}

}
