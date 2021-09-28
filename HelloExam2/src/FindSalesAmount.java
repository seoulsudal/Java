import java.util.Scanner;

public class FindSalesAmount {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 생성
		long commission_target;	// 목표 커미션
		long year_salay;		// 기본 연봉
		long salay_target;		// 목표 연봉
		long commission;
		long salesAmount;
		
		commission = 0;
		salesAmount = 1;
		
		System.out.println("직원의 급여에서 커미션 계산 프로그램");
		
		System.out.println("기본 연봉 입력");
		year_salay = input.nextLong();
		
		System.out.println("목표 연봉 입력");
		salay_target = input.nextLong();
		
		// 목표 커미션 계산
		commission_target = salay_target - year_salay;	// 목표 커미션 = 목표 연봉 - 기본 연봉
		
		do {
			// 1원씩 판매금액을 늘리십시오.
			salesAmount += 1;
			
			// 현재 판매금액에 커미션 계산
			if(salesAmount >= 100000001) {
				commission = (long) (50000000 * 0.08 + 50000000 + (salesAmount - 100000000) * 0.12);
			}
			else if(salesAmount >= 50000001) {
				commission = (long) (50000000 * 0.08 + (salesAmount - 50000000));
			}
			else {
				commission = (long) (salesAmount * 0.08);
			}		
		}while(commission < commission_target);
		
		System.out.println("필요한 커미션 금액 :"+commission_target+"원");
		System.out.println("추가 판매 금액 : "+(salesAmount * 100) / 100+"원");

	}

}
