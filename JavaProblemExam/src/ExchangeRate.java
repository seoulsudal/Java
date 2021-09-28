import java.util.Scanner;

public class ExchangeRate {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 선언
		double dollar;			// 달러
		double wonExchangeRate;	// 원화환율
		int won;				// 원화
		
		System.out.println("원화를 달러화로 계산하는 프로그램");
		
		// 원화환율 입력
		System.out.println("환율을 입력하세요.(예 : 1003)");
		wonExchangeRate = input.nextDouble();
		
		// 원화환율 음수 체크
		if (wonExchangeRate <= 0) {
			System.out.println("환률을 0보다 크게 입력해주세요.");
		}
		
		// 원화 입력
		System.out.println("원화를 입력하세요.(예 : 60000)");
		won = input.nextInt();
		
		// 원화 음수 체크
		if (won <= 0) {
			System.out.println("원화를 0보다 크게 입력해주세요.");
		}

		// 환률 및 원 양수 체크
		if ((wonExchangeRate > 0) && (won > 0)) {
			// 달러 계산
			dollar = won / wonExchangeRate;			// 달러 = 원 / 환율
			dollar = (int) (dollar * 100) / 100.0;	// 소수점 2자리

			// 결과 출력
			System.out.println("원화 "+won+"은 "+dollar+"달러 입니다.");
		}
		else {
			System.out.println("재시작하여 값을 다시 입력해주세요.");
		}

	}

}
