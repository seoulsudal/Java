import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		// 변수 생성
		double totalAmount;		// 1년 사용금액
		double average;			// 평균 사용금액
		double amount[];		// 월 사용 금액
		int month;				// 월
		double max;				// 월 최대금액			
		int maxCount;			// 최대금액 사용 월
		double min;				// 월 최소금액
		int minCount;			// 최소금액 사용 월
		// 변수 초기화
		month = 12;
		totalAmount = 0;
		average = 0;
		maxCount = 0;
		minCount = 0;
		// 배열 초기화
		amount = new double[month];
		// 월 사용 금액 입력
		for(int i = 0; i < month; i++) {
			System.out.println((i+1)+"월 사용 금액을 입력하세요.");
			amount[i] = input.nextDouble();
			// 음수 체크
			if(amount[i] < 0) {
				System.out.println("음수를 입력 하셨습니다.");
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		
		// 전체 사용금액 및 월 평균 
		for(int i = 0; i < month; i++) {
			totalAmount += amount[i];
			average = (totalAmount / (double)month);
		}
		// 최대금액 및 최소금액 초기화
		max = amount[0];
		min = amount[0];
		// 지출 많은 달, 적은 달 계산
		for(int i = 0; i < month; i++) {
			if(max < amount[i]) {
				max = amount[i];	
				maxCount = (i+1);
			}
			if(min > amount[i]) {
				min = amount[i];
				minCount = (i+1);
			}
		}
		// 결과출력
		System.out.println("1년 동안의 전체 사용금액 : "+totalAmount);
		System.out.println("월 평균 사용 금액 : "+average);
		System.out.println("가장 지출이 많았던 월 : "+maxCount+"월");
		System.out.println("가장 지출이 적었던 월 : "+minCount+"월");
	}
}
