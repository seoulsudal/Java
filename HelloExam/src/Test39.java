import java.util.Scanner;

public class Test39 {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 선언
		int currentDay;	// 오늘 날짜
		int carNumber;	// 차량 번호
		
		System.out.println("차량 운행 가능 불가능을 판단하는 프로그램");
		
		// 날짜 및 차량번호 입력
		System.out.println("오늘 날짜를 입력하세요");
		currentDay = input.nextInt();
		
		System.out.println("차량번호 끝자리를 입력하세요.");
		carNumber = input.nextInt();
		
		// 결과 출력
		if ( currentDay % 2 == 0 && carNumber % 2 == 0 ) {
			System.out.println("운행 가능");
		}
		else if ( currentDay % 2 == 1 && carNumber % 2 == 1 ) {
			System.out.println("운행 가능");
		}
		else {
			System.out.println("운행 불가능");
		}

	}

}
