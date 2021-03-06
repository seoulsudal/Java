import java.util.Scanner;

public class TotalTuition {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 선언
		int totalTuition;		// 총 등록금
		int firstTuition;		// 첫번째 등록금
		int secondTuition;		// 두번째 등록금
		int thirdTuition;		// 세번째 등록금
		int fourthTuition;		// 네번째 등록금
		double increaseRate;	// 인상률
		
		System.out.println("4년치 총 등록금을 알려주는 프로그램");
		
		// 등록금 입력
		System.out.println("첫 등록금을 입력하세요.(예 : 1000(만단위))");
		firstTuition = input.nextInt();
		
		// 등록금 음수, 0 체크
		if (firstTuition <= 0) {
			System.out.println("첫 등록금을 0보다 크게 입력해주세요.");
		}
		
		// 인상률 입력
		System.out.println("매년 인상률을 입력하세요.(예 : 4.5%)");
		increaseRate = input.nextDouble();
		
		// 인상률 음수 체크
		if (increaseRate < 0) {
			System.out.println("매년 인상률을 0이상 입력해주세요.");
		}
		
		// 인상률 변환
		increaseRate = increaseRate / 100;	// %로 받은값 변환
		
		// 등록금과 양수 및 인상률 양수, 0 체크
		if (firstTuition > 0 && increaseRate >= 0) {
			
			// 총 등록금 계산
			secondTuition = firstTuition + (int) ( firstTuition * increaseRate );		// 두번째 등록금 = 첫번째 등록금 * 인상률
			thirdTuition = secondTuition + (int) ( secondTuition * increaseRate );		// 세번째 등록금 = 두번째 등록금 * 인상률
			fourthTuition = thirdTuition + (int) ( thirdTuition * increaseRate );		// 네번째 등록금 = 세번째 등록금 * 인상률
			totalTuition = firstTuition + secondTuition + thirdTuition + fourthTuition;	// 총 등록금 = 첫번째 + 두번째 + 세번째 + 네번째 등록금
					
			increaseRate = increaseRate * 100; // %로 변환
			
			// 결과 출력
			System.out.println("매년 인상률이 "+increaseRate+"%인 대학의 4년치 등록금 합은 "+totalTuition+" 만원 입니다.");
		}
		else {
			System.out.println("재시작하여 값을 다시 입력해주세요.");
		}

	}

}
