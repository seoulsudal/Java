import java.util.Scanner;

public class LoopTest5 {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 생성
		int start;	// 첫번째 수
		int end;	// 두번째 수
		int sum;	// 합
		
		// 합 초기화
		sum = 0;
		
		System.out.println("두 수를 입력받아 그 사이값을 더하는 프로그램");
		
		// 첫번째 수 입력
		System.out.println("첫번째 수를 입력하세요.");
		start = input.nextInt();
		
		// 두번째 수 입력
		System.out.println("두번째 수를 입력하세요.");
		end = input.nextInt();
		
		// 반복 실행
		for(int i = start; i <= end; ++i) {
			sum = sum + i;
			}
		// 결과 출력
		System.out.println(start+"에서부터 "+end+"까지 수의 합은 "+sum+" 입니다.");

	}

}
