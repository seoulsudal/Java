import java.util.Scanner;

public class CreditCard2 {

	public static void main(String[] args) {
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		// 변수 생성
		double[] usingPerMonth = new double[12];	// 매월 사용 금액
		double usingTotal;							// 1년 동안의 총 카드 사용 금액
		double usingAverageMonth;					// 월별 평균 사용 금액
		int monthMax;								// 최고 사용 월
		int monthMin;								// 최소 사용 월
		double max;									// 월별 최대 사용 금액
		double min;									// 월별 최소 사용 금액
		// 1월 사용 금액 입력
		while(true) {
			System.out.println("1월 사용금액을 입력하세요.");
			usingPerMonth[0] = input.nextDouble();
			if(usingPerMonth[0] < 0) {
				System.out.println("음수는 입력하실 수 없습니다.");
			}
			if(usingPerMonth[0] > 0) {
				break;
			}
		}
		// 총 금액 및 최대 최소 초기화
		max = usingPerMonth[0];
		min = usingPerMonth[0];
		monthMax = 1;
		monthMin = 1;
		

	}

}
