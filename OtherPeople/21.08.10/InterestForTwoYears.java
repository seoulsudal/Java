import java.util.Scanner;

public class InterestForTwoYears {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int depositedAmount;			// 예금액
		double annualInterestRate;		// 연 이율
		double interest;				// 첫해의 이자
		double secondInterest;			// 두번째해의 이자
		double sum;						// 2년 후의 예금액
		
		
		System.out.println("사용자의 2년간 받을 예금액을 계산하는 프로그램입니다.\n");
		
		// 예금액, 연 이율 입력
		System.out.print("예금액을 입력하세요. : ");
		depositedAmount = input .nextInt();
		System.out.print("연 이율을 입력하세요.(단위 %) : ");
		annualInterestRate = input .nextDouble();
		
		// 이자 계산
		interest = depositedAmount * (annualInterestRate / 100);			// 첫번째 해의 이자 = 예금*연이율(%로 표기되었기 때문에 소수점으로 변환)
		secondInterest = interest + (interest * annualInterestRate / 100);  // 두번째 해의 이자 = 첫번째 해의 이자 + (첫번째 해의 이자 * 연이율)
		
		// 총 예금액 계산
		sum = depositedAmount + interest + secondInterest;					// 총액 = 예금액 + 첫해의 이자 + 두번째 해의 이자
		
		// 값 출력
		System.out.println("2년 후의 예금액은 " + sum + " 원입니다.");
		

	}

}
