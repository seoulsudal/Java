import java.util.Scanner;

public class CompanySalesPerformance {

	public static void main(String[] args) {
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		// 변수 및 배열 생성
		final int SALSES_TEAM = 5;		// 팀 숫자
		final int QUARTER = 4;			// 분기
		int sales[][] = new int[SALSES_TEAM][QUARTER];	// 매출액
		int salesTotal;				// 부서별 전체 매출액
		int quarterTotal;			// 분기별 전체 매출액
		int quarterAverage;			// 분기별 평균 매출액
		int yearTotal;				// 년간 회사 총 매출액
		// 변수 초기화
		salesTotal = 0;
		quarterTotal = 0;
		quarterAverage = 0;
		yearTotal = 0;
		
		// 매출액 입력 j = 부서, i = 분기
		for(int j = 0; j < sales.length; j++) {
			for(int i = 0; i < sales[0].length; i++) {
				System.out.println((j+1)+"영업부서의 "+(i+1)+"분기 매출액을 입력하세요.");
				sales[j][i] = input.nextInt();
				// 음수 판별
				if(sales[j][i] <= 0) {
					System.out.println("음수는 입력하실 수 없습니다.");
					System.out.println("프로그램을 종료합니다. 다시 실행해주세요.");
					break;
				}
				// 년간 회사 총 매출액
				yearTotal += sales[j][i];
				}
			if(sales[j][0] <= 0 || sales[j][1] <= 0 || sales[j][2] <= 0 ||  sales[j][3] <= 0) {
				break;
			}
		}
		if(sales[4][3] > 0) {
			// 부서별 전체 매출액 j = 부서, i = 분기
			for(int j = 0; j < sales.length; j++) {
				for(int i = 0; i < sales[0].length; i++) {
					salesTotal += sales[j][i];
				}
				// 부서별 전체 매출액 출력
				System.out.println((j+1)+"영업부서의 전체 매출액 : "+salesTotal);
				salesTotal = 0;
			}
			// 분기별 매출액 j = 부서, i = 분기
			for(int i = 0; i < sales[0].length; i++) {
				for(int j = 0; j < sales.length; j++) {
					// 분기별 전체 매출액 계산
					quarterTotal += sales[j][i];
				}
				// 분기별 전체 매출액 출력
				System.out.println((i+1)+"분기 전체 매출액 : "+quarterTotal);
				// 분기별 전체 매출액 초기화
				quarterTotal = 0;
			}
			// 분기별 평균 매출액 j = 부서, i = 분기
			for(int i = 0; i < sales[0].length; i++) {
				for(int j = 0; j < sales.length; j++) {
					// 분기별 전체 매출액 계산
					quarterTotal += sales[j][i];
					// 분기별 전체의 평균 매출액 계산
					quarterAverage = quarterTotal / SALSES_TEAM;
				}
				// 분기별 전체의 평균 매출액 출력
				System.out.println((i+1)+"분기 전체 평균 매출액 : "+quarterAverage);
				// 분기별 전체 매출액 초기화
				quarterTotal = 0;
			}
			// 년간 총 매출액 출력
			System.out.println("년간 회사 총 매출액 : "+yearTotal);
		}
	}
}
