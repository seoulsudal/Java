import java.util.Scanner;

public class LoopTest3 {

	public static void main(String[] args) {

		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 생성
		int start;	// 시작
		int end;	// 끝
		
		System.out.println("두 수를 입력받아 두 수의 사이의 홀수를 출력하는 프로그램");
		
		// 두 수 입력
		System.out.println("첫번째 수를 입력하세요.");
		start = input.nextInt();
		
		System.out.println("두번째 수를 입력하세요.");
		end = input.nextInt();
		if(start >= end) {
			System.out.println("첫번째 수 보다 두번째 수가 커야 합니다.");
		}
		// 첫번째 수가 두번째 수보다 작은지 판단
		if(start < end) {
			// 반복 계산 및 결과 출력
			for(int i = start; i <= end; ++i) {
				if(i % 2 == 1) {
					System.out.println(i);	
				}
			
			}

		}

	}

}
