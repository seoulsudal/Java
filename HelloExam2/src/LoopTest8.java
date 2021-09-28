import java.util.Scanner;

public class LoopTest8 {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 선언
		int num;		// 수
		int sum;		// 합
		double average;	// 평균
		int count;		// 개수
		
		// 합 초기화
		sum = 0;
		count = 0;
		
		System.out.println("10개의 숫자를 받아 0보다 큰 숫자의 평균과 개수를 출력하는 프로그램");
		
		// 반복 입력
		for(int i = 1; i <= 10; ++i) {
			// 수 입력
			System.out.println(i+"수를 입력해주세요.");
			num = input.nextInt();
			if(num > 0) {
				sum = sum + num;
				count = count + 1;
			}
		}
		// 평균 계산
		average = (double)sum / count;				// 평균 = 합 / 개수
		average = (int) (average * 100) / 100.0;	// 소수 2자리
		
		// 결과 출력
		System.out.println("평균 : "+average+"(소수 2자리 표기) 개수 : "+count);

	}

}
