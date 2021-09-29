import java.util.Scanner;

public class Test36 {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 생성
		int year;	// 연도
		
		System.out.println("윤년인지 판단하는 프로그램");
		
		// 연도 입력
		System.out.println("연도를 입력하세요.");
		year = input.nextInt();
		
		// 결과 출력
		if ( year % 4 == 0 ) {
			if ( year % 100 != 0 || year % 400 == 0 ) {
				System.out.println("윤년 입니다.");
				}
			else {
				System.out.println("평년 입니다.");
			}
		}
		else {
			System.out.println("평년 입니다.");
		}

	}

}
