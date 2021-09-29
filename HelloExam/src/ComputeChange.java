import java.util.Scanner;

public class ComputeChange {

	public static void main(String[] args) {
				
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 선언
		double amount;			// 전체 금액(달러)
		int remainingAmount;	// 센트로 변환
		int numberOfOneDollars;	// 달러(100센트)
		int numberOfQuarters;	// 쿼터(25센트)
		int numberOfDimes;		// 다임(10센트)
		int numberOfNickels;	// 니켈(5센트)
		int numberOfPennies;	// 페니(1센트)
		String output;			// 출력문자열
		
		// 금액 입력
		System.out.println("달러 금액을 입력하세요.(예 : 16.48)");
		amount = input.nextDouble();
		
		remainingAmount = (int)(amount * 100);
		
		// 달러 개수를 계산
		numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		
		// 쿼터의 개수를 계산
		numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		
		// 다임의 개수를 계산
		numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		// 니켈의 개수를 계산
		numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		// 페니의 개수를 계산
		numberOfPennies = remainingAmount;
		
		// 결과 출력
		
		output = "전체 : \t"+amount+" 달러\n"+"구성 : \t"+numberOfOneDollars+" dollars\n"+"\t"+numberOfQuarters+" quarters\n"+"\t"+numberOfDimes+" dimes\n"+"\t"+numberOfNickels+" nickels\n"+"\t"+numberOfPennies+" pennies";
		
		System.out.println(output);

	}

}
