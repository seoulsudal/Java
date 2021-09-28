// 4년동안 매년 임의의 %로 인상하는 대학교의 등록금 구하기
import java.util.Scanner;

public class CollegeTuition {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int yearlyTuition;			// 연간 등록금
		double priceAdvenceRate;	// 인상율
		double firstPriceAdvence;	// 첫 인상금액
		double secondPriceAdvence;	// 두번째 인상금액
		double thirdPriceAdvence;	// 세번째 인상금액
		double totalAmount;			// 전체 등록금
		
		System.out.println("매년 임의의 %로 인상하는 4년간의 총 등록금을 구하는 프로그램입니다.");
		
		// 초기 등록금, 매년 인상율 입력
		System.out.print("연간 내는 등록금을 입력하세요.(단위 만원) : ");
		yearlyTuition = input .nextInt();
		System.out.print("매년 몇 %씩 인상 됩니까? : ");
		priceAdvenceRate = input .nextDouble();
		
		// 매 해 인상금액 계산
		firstPriceAdvence = yearlyTuition * (priceAdvenceRate / 100);						// 첫해의 인상금액 = 초기 등록금 * 인상률(소수점으로 변환)
		secondPriceAdvence = (yearlyTuition + firstPriceAdvence) * (priceAdvenceRate / 100);// 두번째해의 인상금액 = (초기등록금+첫해의 인상금액) * 인상율(소수점으로 변환)
		thirdPriceAdvence = (yearlyTuition + secondPriceAdvence) * (priceAdvenceRate /100); // 세번째해의 인상금액 = (초기등록금+두번째해의 인상금액) * 인상율(소수점으로 변환)
		
		// 전체 등록금 계산
		totalAmount = 4 * yearlyTuition + firstPriceAdvence + secondPriceAdvence + thirdPriceAdvence;
		
		// 소수점 둘째자리까지 유지
		totalAmount = (int)(totalAmount * 100) / 100.0;	
		
		// 전체 등록금 출력
		System.out.println("4년동안 납부할 등록금 : " + totalAmount);

	}

}
