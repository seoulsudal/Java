import java.util.Scanner;

public class TheaterReserve {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		int[] seat = new int[10];	// 10자리 좌석 배열 선언
		int number;		// 메뉴 번호

		// 좌석 예약 무한루프
		while(true) {
			// 좌석 배치도
			System.out.println("---------------------");
			for(int i=1; i<(seat.length+1); i++) {
				System.out.print(i + " ");
			}
			System.out.println("\n---------------------");
			
			for(int i : seat) {
				System.out.print(i + " ");
			}
			System.out.println("\n---------------------");
			
			// 좌석 번호 입력
			System.out.print("원하시는 좌석번호를 입력하세요(종료는 -1): ");
			number = input.nextInt();
			
			// 좌석 번호에 따라 실행
			if(number == -1) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			if(number > 0 && number < seat.length+1)
			{
				if(seat[(number-1)] == 0) {
					System.out.println("예약되었습니다.");
					seat[(number-1)] = 1;
				}
				else if(seat[(number-1)] == 1) {
					System.out.println("이미 예약된 자리입니다.");
				}
			}
			if(number <= 0 || number >= seat.length+1) {
				System.out.println("좌석 번호 선택이 잘못되었습니다.");
			}
		}
	}

}
