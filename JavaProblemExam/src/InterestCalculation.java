import java.util.Scanner;

public class InterestCalculation {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 선언
		int credit;					// 예금액
		double annualInterestRate;	// 연이율
		double totalCredit;			// 총 예금액

		System.out.println("2년 뒤 예금액을 구하는 프로그램(복리)");

		// 예금액 입력
		System.out.println("예금액을 입력하세요.(예 : 1000)");
		credit = input.nextInt();
		
		// 예금액 음수 체크
		if (credit <= 0) {
			System.out.println("예금액을 0보다 높게 입력하세요.");
		}
		
		// 연이율 입력
		System.out.println("연이율을 입력하세요.(예 : 5.0%)");
		annualInterestRate = input.nextDouble();
		
		// 연이율 음수 체크
		if (annualInterestRate <= 0) {
			System.out.println("연이율을 0보다 높게 입력하세요.");
		}
		
		// 예금약 및 연이율 양수 체크
		if ((credit > 0) && (annualInterestRate > 0)) {
			// 총 예금액 계산
			totalCredit = credit + (credit *  annualInterestRate / 100);			// 1년치 예금액 = 예금액 + ( 예금액 * 연이율% / 100 )
			totalCredit = totalCredit + ( totalCredit * annualInterestRate / 100);	// 2년치 예금액 = 1년치 예금액 + ( 1년치 예금액 * 연이율% / 100 )
			totalCredit = (int) ( totalCredit * 100 ) / 100.0;						// 소수점 2자리수

			// 결과 출력
			System.out.println("예금액 "+credit+" 원은 2년 뒤 "+totalCredit+" 원이 됩니다.");
		}
		else {
			System.out.println("재시작하여 값을 다시 입력해주세요.");
		}
		
	}

}
