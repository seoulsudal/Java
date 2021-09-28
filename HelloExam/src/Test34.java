import java.util.Scanner;

public class Test34 {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 선언
		int currentDay;	// 오늘 날짜
		int carNumver;	// 차량 번호 끝자리
		
		System.out.println("날짜와 차량 번호로 운행 여부 판단하는 프로그램");
		
		// 날짜 및 차량번호 입력
		System.out.println("오늘의 날짜를 입력하세요.");
		currentDay = input.nextInt();
		
		System.out.println("차량번호 끝자리를 입력하세요.");
		carNumver = input.nextInt();
		
		// 결과 출력
		if ( carNumver % 2 == 0 ) {
			if ( currentDay % 2 == 0 ) {
				System.out.println("운행 가능");
			}
			else {
				System.out.println("운행 불가능");
			}
		}
		else {
			if ( currentDay % 2 == 1 ) {
				System.out.println("운행 가능");
			}
			else {
				System.out.println("운행 불가능");
			}
		}
		
	}
}
