import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		
		System.out.println("예금액, 연이율, 연수를 입력 받아 복리이자로 계산하는 프로그램");
		
		int credit;//예금액
		double annualInterestRate;//연이율
		double yearinterest;//연이자
		double interestMoney;//증가총액
		double totalAmount;//최종 예금액
		double money;
		//int year; //연수
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("예금액을 입력하시오. : ");
		credit = input.nextInt();
		System.out.print("연이율(%단위)을 입력하시오. : ");
		annualInterestRate = input.nextDouble();
		//System.out.print("연수를 입력하시오. : ");
		//year = input.nextInt();
		
		//interestMoney = credit; // 증가총액값 초기화
		// 복리 계산하는 공식
		//yearinterest = interestMoney*(annualInterestRate/100); // 연이자 = 예금액*(연이율%/100)
		interestMoney = credit*Math.pow((1+annualInterestRate/100),2); //2년후 예금액 = 예금액 *(1+연이율)제곱
		
		totalAmount = interestMoney; // 최종 예금액 = 증가총액*연수
		
		System.out.println("입력한 예금액 : " + credit + "원");
		System.out.println("입력한 연이율(%단위) : " + annualInterestRate + "%");
		//System.out.println("입력한 연수 : " + year + "년");
		System.out.printf("2년 후 예금액 : %.1f" , totalAmount);
		System.out.print("원");
	}

}
