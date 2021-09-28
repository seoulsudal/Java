import java.util.Scanner;

public class LoanTest {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		System.out.println("연 이율을 입력하세요(예 : 5.25)");
		double annuallnterestRate = input.nextDouble();
		
		System.out.println("대출기간을 년 단위로 입력하세요.");
		int numberOfYears = input.nextInt();
		
		System.out.println("대출금액을 입력하세요(예 : 12000000)");
		double loanAmount = input.nextDouble();
		
		// 인스턴스 생성
		Loan loan = new Loan(annuallnterestRate, numberOfYears, loanAmount);
		
		// 소수점 이후 두자리를 유지하는 형식
		double monthlyPayment = (int) (loan.getMonthlyPayment() * 100) / 100.0;
		double totalPayment = (int) (loan.getTotalPayment() * 100) / 100.0;
		
		// 결과 출력
		System.out.println("대출 시작 날짜 : "+loan.getLoanDate().toString() + "\n매월 상환 금액 : "+monthlyPayment+"\n총 상환 금액 : "+totalPayment);

	}

}
