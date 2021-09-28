import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double usingTotal;			// 1년 동안의 총 카드 사용 금액
		double usingAverageMonth;	// 월별 평균 사용 금액
		int monthMax;				// 최고 사용 월
		int monthMin;				// 최소 사용 월
		double max;					// 월별 최대 사용 금액
		double min;					// 월별 최소 사용 금액 
		
		double[] usingPerMonth = new double[12];
		
		while(true) {
			// 1월 사용 금액 입력
			System.out.print("1월 사용 금액 입력 : ");
			usingPerMonth[0] = input.nextDouble();
			
			if(usingPerMonth[0] < 0)
			{
				System.out.println("음수를 넣으실 수 없습니다.");
			}
			
			if(usingPerMonth[0] >= 0)
			{
				break;
			}
		}
		
		// 총 금액, 최대, 최소 초기화
		max = usingPerMonth[0];
		min = usingPerMonth[0];
		monthMax = 1;
		monthMin = 1;
		
		usingTotal = usingPerMonth[0];
		
		// 평균 및 최대, 최소 판단
		for(int i=1; i<usingPerMonth.length; i++)
		{
			// 2월~ 12월 입력
			System.out.print((i+1) + "월 사용 금액 입력 : ");
			usingPerMonth[i] = input.nextDouble();
			
			// 음수 체크
			if(usingPerMonth[i] < 0)
			{
				System.out.println("음수를 넣으실 수 없습니다.");
				i -= 1;
			}
			
			if(usingPerMonth[i] >= 0)
			{
				// 총 금액 계산
				usingTotal += usingPerMonth[i];
				
				// 최대, 최소 계산
				if(usingPerMonth[i] > max)
				{
					max = usingPerMonth[i];
					monthMax = i+1;
				}
				if(usingPerMonth[i] < min)
				{
					min = usingPerMonth[i];
					monthMin = i+1;
				}
			}
		}
		
		// 평균 계산
		usingAverageMonth = usingTotal / 12;
		
		// 평균 금액 소수점 둘째로 정리
		usingAverageMonth = ((int)(usingAverageMonth * 100)) / 100.0;
		
		// 출력
		System.out.println("\n    1년 카드 명세서");
		System.out.println("1년 전체 사용금액 : " + (int)usingTotal + "원");
		System.out.println("월 평균 사용 금액 : " + usingAverageMonth + "원");
		System.out.println("가장 지출이 많았던 월 : " + monthMax + "월");
		System.out.println("가장 지출이 적었던 월 : " + monthMin + "월");
	}

}
