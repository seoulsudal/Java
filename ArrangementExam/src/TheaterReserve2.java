import java.util.Scanner;

public class TheaterReserve2 {

	public static void main(String[] args) {

		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		// 변수 생성
		int number; // 좌석 번호
		int[] seat = new int[10]; // 좌석
		System.out.println("극장 예약 프로그램");
		// 전체 반복
		do {
			// 좌석 배치도
			System.out.println("--------------------");
			System.out.println("1 2 3 4 5 6 7 8 9 10");
			System.out.println("--------------------");
			for (int i : seat) {
				System.out.print(i + " ");
			}
			System.out.println("\n--------------------");
			// 좌석 입력
			System.out.println("원하시는 좌석번호를 입력하세요(종료는 -1)");
			number = input.nextInt();
			// 프로그램 종료
			if (number == -1) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
				// 좌석 선택
			if (number > 0 && number < seat.length + 1) {
				if (seat[(number - 1)] == 0) {
					System.out.println("예약 되었습니다.");
					seat[(number - 1)] = 1;
				} else if (seat[(number - 1)] == 1) {
					System.out.println("이미 예약된 좌석 입니다.");
				}
			}
			if (number < 0 || number > seat.length + 1) {
				System.out.println("좌석 번호를 잘못 입력하셨습니다.");
			}
		}while (true);
		 
	}
}
