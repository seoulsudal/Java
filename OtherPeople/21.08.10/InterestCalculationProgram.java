import java.util.Scanner;

public class InterestCalculationProgram {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		
		int credit;						//예금액
		double annualInterestRate;		//연이율
		double interestOne;				//첫번째 해 이자
		double interestTwo;				//두번째 해 이자
		double sumOne;					//첫해 예금액+이자
		double sumTwo;					//두번째 해 예금액+이자
		
		
		
		// 2년간 이자를 계산하는 프로그램 작성
		System.out.print("예금액을 입력하세요 : ");
		credit = input.nextInt();
		System.out.print("연이율을 입력하세요(단위 퍼센트) : ");
		annualInterestRate = input.nextDouble();
		
		
		// 연이율, 이자 계산
		annualInterestRate = annualInterestRate / 100.0;	//첫해 연이율 계산
		interestOne = credit * annualInterestRate;			//첫해 이자 계산
		sumOne = credit + interestOne;						//첫해 예금액+이자
		
		interestTwo = sumOne * annualInterestRate;			//두번째 해 이자 계산
		sumTwo = sumOne + interestTwo;						//두번째 해 예금액+이자
		
		
		
		//연이율과 두번째 해 이자+예금액 출력
		System.out.println("2년 후의 예금액 : " + sumTwo);
		
	}

}
