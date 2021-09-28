import java.util.Scanner;

public class SquareMeter {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 선언
		double quareMeter;	// 평방미터
		double pyeong;		// 평
		
		System.out.println("평을 평방미터로 환산하는 프로그램");
		
		// 평 입력
		System.out.println("평을 입력하세요(예 : 18.6)");
		pyeong = input.nextDouble();
		
		// 평 0, 음수 체크
		if (pyeong <= 0) {
			System.out.println("평을 0보다 크게 입력해주세요.");
		}
		
		// 평 양수 체크
		if (pyeong > 0) {
			// 평방미터 계산
			quareMeter = pyeong * 3.305785;					//평방미터 = 평 * 3.305785(공식)
			quareMeter = (int) (quareMeter * 100) / 100.0;	//소수점 2자리
			
			// 결과 출력
			System.out.println("입력한 "+pyeong+" 평은 "+quareMeter+" 평방미터 입니다.(소수 2자리까지 표기)");
		}
		else {
			System.out.println("재시작하여 값을 다시 입력해주세요.");
		}

	}

}
