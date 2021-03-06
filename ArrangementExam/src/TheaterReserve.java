import java.util.Scanner;

public class TheaterReserve {

	public static void main(String[] args) {

		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		// 변수 생성
		int number;					// 좌석 번호
		int[] seat = new int[10];	// 좌석
		System.out.println("극장 예약 프로그램");
		// 전체 반복
		do {
			System.out.println("--------------------");
			System.out.println("1 2 3 4 5 6 7 8 9 10");
			System.out.println("--------------------");
			for (int a : seat) {
				System.out.print(a + " ");
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
			// 좌석 입력 판단
			switch (number) {
			case 1:
				if (seat[0] != 1) {
					seat[0] = 1;
					System.out.println("예약 되었습니다.");
					break;
				} else {
					System.out.println("이미 예약된 자리입니다.");
					break;
				}
			case 2:
				if (seat[1] != 1) {
					seat[1] = 1;
					System.out.println("예약 되었습니다.");
					break;
				} else {
					System.out.println("이미 예약된 자리입니다.");
					break;
				}
			case 3:
				if (seat[2] != 1) {
					seat[2] = 1;
					System.out.println("예약 되었습니다.");
					break;
				} else {
					System.out.println("이미 예약된 자리입니다.");
					break;
				}
			case 4:
				if (seat[3] != 1) {
					seat[3] = 1;
					System.out.println("예약 되었습니다.");
					break;
				} else {
					System.out.println("이미 예약된 자리입니다.");
					break;
				}
			case 5:
				if (seat[4] != 1) {
					seat[4] = 1;
					System.out.println("예약 되었습니다.");
					break;
				} else {
					System.out.println("이미 예약된 자리입니다.");
					break;
				}
			case 6:
				if (seat[5] != 1) {
					seat[5] = 1;
					System.out.println("예약 되었습니다.");
					break;
				} else {
					System.out.println("이미 예약된 자리입니다.");
					break;
				}
			case 7:
				if (seat[6] != 1) {
					seat[6] = 1;
					System.out.println("예약 되었습니다.");
					break;
				} else {
					System.out.println("이미 예약된 자리입니다.");
					break;
				}
			case 8:
				if (seat[7] != 1) {
					seat[7] = 1;
					System.out.println("예약 되었습니다.");
					break;
				} else {
					System.out.println("이미 예약된 자리입니다.");
					break;
				}
			case 9:
				if (seat[8] != 1) {
					seat[8] = 1;
					System.out.println("예약 되었습니다.");
					break;
				} else {
					System.out.println("이미 예약된 자리입니다.");
					break;
				}
			case 10:
				if (seat[9] != 1) {
					seat[9] = 1;
					System.out.println("예약 되었습니다.");
					break;
				} else {
					System.out.println("이미 예약된 자리입니다.");
					break;
				}
			default: {
				System.out.println("좌석 번호 선택이 잘못되었습니다.");
				}
			}
		} while (true);
	}

}
