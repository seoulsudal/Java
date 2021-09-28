import java.util.Arrays;

public class CreditCard {
	private double[] usingCard; // 카드 사용 금액
	
	// 기본 생성자
	public CreditCard() {
		
	}

	// 사용내역 받는 생성자
	public CreditCard(double[] usingCard) {
		this.usingCard = usingCard;
	}

	// 1년 동안의 전체 사용금액 출력
	public void printTotalUsing() {
		System.out.println("====1년 카드 내역====");
		for(int i=0; i<usingCard.length; i++)
		{
			System.out.println((i+1) + "월의 사용금액 : " + usingCard[i]);
		}
	}

	// 월 평균 사용금액 계산
	public double calculateAverageMonth(){
		double average; // 평균
		double total; // 총점
		total = 0;
		
		for(int i=0; i<usingCard.length; i++)
		{
			total += usingCard[i];
		}
		average = total / 12.0;
		
		return average;
	}

	// 가장 지출이 많았던 월 출력
	public void printMaxMonth() {
		double max;
		int month;
		max = usingCard[0];
		month = 1;
		
		for(int i=1; i<usingCard.length; i++)
		{
			if(max < usingCard[i])
			{
				max = usingCard[i];
				month = i+1;
			}
		}
		
		System.out.println("가장 지출이 많았던 월 : " + month + "월");
	}

	// 가장 지출이 적었던 월 출력
	public void printMinMonth() {
		double min;
		int month;
		min = usingCard[0];
		month = 1;
		
		for(int i=1; i<usingCard.length; i++)
		{
			if(min > usingCard[i])
			{
				min = usingCard[i];
				month = i+1;
			}
		}
		
		System.out.println("가장 지출이 적었던 월 : " + month + "월");
	}

	// 카드 사용 금액 반환
	public double[] getUsingCard() {
		return usingCard;
	}

	// 카드 사용 금액 변경
	public void setUsingCard(double[] usingCard) {
		this.usingCard = usingCard;
	}

	@Override
	public String toString() {
		return "CreditCard [usingCard=" + Arrays.toString(usingCard) + "]";
	}
}