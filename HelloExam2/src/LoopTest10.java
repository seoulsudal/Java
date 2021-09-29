import java.util.Scanner;

public class LoopTest10 {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 생성
		int start;		// 시작
		int end;		// 끝
		int oddsum;		// 홀수 합
		int evensum;	// 짝수 합
		int temp;		// 임의의 수
		
		// 변수 초기화
		oddsum = 0;
		evensum = 0;
		
		System.out.println("두 수를 받아 그 사이에 값들의 짝수 합 홀수 합을 구하는 프로그램");
		
		// 수 입력
		System.out.println("첫번째 수를 입력하세요.");
		start = input.nextInt();
		
		System.out.println("두번째 수를 입력하세요.");
		end = input.nextInt();
		
		// 첫번째 수가 두번째 수 보다 크면 두 수를 교체
		if(start > end) {
			temp = start;
			start = end;
			end = temp;
		}
		
		// 반복 입력
		for(int i = start; i <= end; ++i) {
			// 짝수 판단
			if(i % 2 == 0) {
				evensum = evensum + i;
			}
			// 홀수 판단
			if(i % 2 == 1) {
				oddsum = oddsum + i;
			}
		}
		// 결과 출력
		System.out.println(start+"에서 "+end+"까지의 홀수 짝수 합은?");
		System.out.println("홀수의 합 : "+oddsum+" 짝수의 합 : "+evensum);

	}

}
