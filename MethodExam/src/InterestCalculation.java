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
		while(true) {
			System.out.println("예금액을 입력하세요.(예 : 1000)");
			credit = input.nextInt();
			if(credit <= 0) {
				System.out.println("예금액을 0보다 높게 입력하세요.");
			}
			else {
				break;
			}
		}
		
		// 연이율 입력
		while(true) {
			System.out.println("연이율을 입력하세요.(예 : 5.0%)");
			annualInterestRate = input.nextDouble();
			if(annualInterestRate <= 0) {
				System.out.println("연이율을 0보다 높게 입력하세요.");
			}
			else {
				break;
			}
		}
		
		// 2년 뒤 총 예금액을 구하는 메소드 호출
		totalCredit = totalCredit(credit, annualInterestRate);

		// 결과 출력
		System.out.println("예금액 "+credit+" 원은 2년 뒤 "+totalCredit+" 원이 됩니다.");
		
	}
	
	// 2년 뒤 총 예금액을 구하는 메소드
	public static double totalCredit(double credit, double annualInterestRate) {
		double totalCredit;
		totalCredit = credit + (credit *  annualInterestRate / 100);			// 1년치 예금액 = 예금액 + ( 예금액 * 연이율% / 100 )
		totalCredit = totalCredit + ( totalCredit * annualInterestRate / 100);	// 2년치 예금액 = 1년치 예금액 + ( 1년치 예금액 * 연이율% / 100 )
		totalCredit = (int) ( totalCredit * 100 ) / 100.0;						// 소수점 2자리수
		return totalCredit;
	}

}
