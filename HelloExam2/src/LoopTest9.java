import java.util.Scanner;

public class LoopTest9 {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 생성
		int num;	// 수
		int max;	// 최대값
		int min;	// 최소값
		
		System.out.println("10개의 수를 받아 최소값, 최대값을 출력하는 프로그램");
		
		// 첫번째 수 입력
		System.out.println("1번째수를 입력해주세요.");
		num = input.nextInt();
		
		// 최대값, 최소값 초기화
		max = num;
		min = num;
		
		// 반복 입력
		for(int i = 2; i <= 10; ++i) {
			// 수 입력
			System.out.println(i+"번째수를 입력해주세요.");
			num = input.nextInt();
			
			// 최대값 판단
			if(num >= max) {
				max = num;
			}
			// 최소값 판단
			if(num <= min) {
				min = num;
			}
		}
		// 결과 출력
		System.out.println("10개의 수중에서 최대값은 : "+max+", 최소값은 : "+min+" 입니다.");

	}

}
