import java.math.BigDecimal;
import java.util.Scanner;

public class FourYearInterestCal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);			// Scanner 인스턴스 입력
		
		double yearInterest;			// 연이율
		double firstTuition;			// 1학년 등록금
		double secondTuition;			// 2학년 등록금
		double thirdTuition;			// 3학년 등록금
		double fourthTuition;			// 4학년 등록금
		
		// E7등 지수 표현 없애기 위한 BigDecimal 선언
		BigDecimal bigDecimal1;
		BigDecimal bigDecimal2;
		BigDecimal bigDecimal3;
		BigDecimal bigDecimal4;
		
		System.out.println("4년 동안의 등록금을 출력하는 프로그램입니다.");
		
		// 입력
		System.out.print("등록금을 입력해주세요 : ");
		firstTuition = input.nextInt();
		System.out.print("연이율을 입력해주세요(%) : ");
		yearInterest = input.nextDouble();
		
		yearInterest *= 0.01;		// 연이율 = 연이율 * 0.01 (퍼센트 변환)
		
		secondTuition = firstTuition * (1+yearInterest);	// 1년 후 = 처음 등록금 * (1+ 연이율)
		thirdTuition = secondTuition * (1+yearInterest);	// 2년 후 = 1년 후 등록금 * (1+ 연이율)
		fourthTuition = thirdTuition * (1+yearInterest);	// 3년 후 = 2년 후 등록금 * (1+ 연이율)
		
		// 지수 표현 없애기 위한 출력 전 값 대입
		bigDecimal1 = new BigDecimal(firstTuition);
		bigDecimal2 = new BigDecimal(secondTuition);
		bigDecimal3 = new BigDecimal(thirdTuition);
		bigDecimal4 = new BigDecimal(fourthTuition);
		
		// 출력
		System.out.println("=등록금 출력=");
		System.out.println("1학년 등록금 : " + bigDecimal1 + "원");
		System.out.println("2학년 등록금 : " + bigDecimal2 + "원");
		System.out.println("3학년 등록금 : " + bigDecimal3 + "원");
		System.out.println("4학년 등록금 : " + bigDecimal4 + "원");
	}

}
