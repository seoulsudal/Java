import java.util.Scanner;

public class ComputerLoan {

	public static void main(String[] args) {

		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 선언
		double annualInterestRate;	// 연간 이자율
		double monthlyInterestRate;	// 매월 금리
		int numberOfYears;			// 대출 연수
		double loanAmount;			// 대출 금액
		double monthlyPayment;		// 매월 지불금
		double totalPayment;		// 전체 대출액
		
		// 연간 이자율 입력
		System.out.println("연간 이자율을 입력하세요.(예 : 6.25)");
		annualInterestRate = input.nextDouble();
		
		// 매월 금리 계산
		monthlyInterestRate = annualInterestRate / 1200;
		
		// 연수 입력
		System.out.println("연수를 입력하세요.(예 : 3년)");
		numberOfYears = input.nextInt();
		
		// 대부금 입력
		System.out.println("대출 금액을 입력하세요.(예 : 5000000)");
		loanAmount = input.nextDouble();
		
		// 지불금 계산
		monthlyPayment = loanAmount * monthlyInterestRate / ( 1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));	// 매월 지불금 = ( 대출금액 * 매월 금리 ) / ( 1 - ( 1 / (1 + 매달 금리 ) * 연수 * 12))
		totalPayment = monthlyPayment * numberOfYears * 12;
		
		// 소수점 뒤 2자리 유지
		monthlyPayment = (int)(monthlyPayment * 100) / 100.0;
		totalPayment = (int)(totalPayment * 100) / 100.0;
		
		// 결과 출력
		System.out.println("매달 지불금 : "+(int)+monthlyPayment+"원");
		System.out.println("전체 지불금 : "+(int)+totalPayment+"원");
		
	}

}
