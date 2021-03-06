import java.util.Scanner;

public class TotalTuition {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 선언
		double totalTuition;	// 총 등록금
		double firstTuition;	// 첫번째 등록금
		double increaseRate;	// 인상률
		
		System.out.println("4년치 총 등록금을 알려주는 프로그램");
		
		// 등록금 입력
		while(true) {
			System.out.println("첫 등록금을 입력하세요.(예 : 1000(만단위))");
			firstTuition = input.nextInt();
			if(firstTuition <= 0) {
				System.out.println("첫 등록금을 0보다 크게 입력해주세요.");
			}
			else {
				break;
			}
		}

		// 인상률 입력
		while(true) {
			System.out.println("매년 인상률을 입력하세요.(예 : 4.5%)");
			increaseRate = input.nextDouble();
			if(increaseRate < 0) {
				System.out.println("매년 인상률을 0이상 입력해주세요.");
			}
			else {
				break;
			}
		}
		
		// 인상률 변환
		increaseRate = increaseRate / 100;	// %로 받은값 변환
		
		// 4년치 대학 등록금을 구하는 메소드 호출
		totalTuition = totalTuition(firstTuition, increaseRate);
			
		// 인상률 변환
		increaseRate = increaseRate * 100;	// 소수점을 %로 변환
		
		// 결과 출력
		System.out.println("매년 인상률이 "+increaseRate+"%인 대학의 4년치 등록금 합은 "+(int)totalTuition+" 만원 입니다.");

	}

	// 4년치 대학 등록금을 구하는 메소드
	public static double totalTuition(double firstTuition, double increaseRate) {
		double totalTuition;	// 총 등록금
		double secondTuition;	// 두번째 등록금
		double thirdTuition;	// 세번째 등록금
		double fourthTuition;	// 네번째 등록금
		secondTuition = firstTuition + ( firstTuition * increaseRate );				// 두번째 등록금 = 첫번째 등록금 * 인상률
		thirdTuition = secondTuition + ( secondTuition * increaseRate );			// 세번째 등록금 = 두번째 등록금 * 인상률
		fourthTuition = thirdTuition + ( thirdTuition * increaseRate );				// 네번째 등록금 = 세번째 등록금 * 인상률
		totalTuition = firstTuition + secondTuition + thirdTuition + fourthTuition;	// 총 등록금 = 첫번째 + 두번째 + 세번째 + 네번째 등록금
		return totalTuition;
	}
	
}
