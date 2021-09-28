import java.util.Scanner;

public class GuessNumberOneTime {

	public static void main(String[] args) {

		// 스캐너 생성
		Scanner input = new Scanner(System.in);

		// 변수 생성
		int count; // 횟수
		int random; // 임의의 수
		int number; // 추측의 수
		
		// 횟수 초기화
		count = 0;

		// 0~100의 랜덤 수
		random = (int) (Math.random() * 101);

		System.out.println("숫자 맞추기 게임");

		while(true) {
			System.out.println("수를 입력하세요.");
			number = input.nextInt();
			
			// 횟수 추가
			count++;
			
			if (number == random) {
				System.out.println(number + " 맞추었습니다.");
				System.out.println(count+"번에 맞추셨습니다.");
				break;
			} else if (number > random) {
				System.out.println("추측한 수가 큽니다.");
			} else {
				System.out.println("추측한 수가 작습니다.");
			}
		}
		System.out.println(count+"번 실패");

	}

}
