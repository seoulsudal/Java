import java.util.Scanner;

public class CreditCardTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // 입력 인스턴스 생성
		double[] usingCard = new double[12];
		
		CreditCard kukminCard = new CreditCard();
		
		for(int i=0; i<usingCard.length; i++)
		{
			while(true) {
				System.out.print((i+1) + "월 사용금액 입력 : ");
				usingCard[i] = input.nextDouble();
				
				// 음수 체크
				if(usingCard[i] >= 0) {
					break;
				}
				System.out.println("음수가 아닌 값을 넣어주십시오.");
			}
		}
		
		// 사용금액 입력
		kukminCard.setUsingCard(usingCard);
		
		// 전체 월 금액 출력
		kukminCard.printTotalUsing();
		// 평균 사용 금액 출력
		System.out.printf("월 평균 사용 금액 : %.2f\n", kukminCard.calculateAverageMonth());
		// 최고 지출 월 출력
		kukminCard.printMaxMonth();
		// 최저 지출 월 출력
		kukminCard.printMinMonth();
		
		input.close();
	}

}
