import java.util.Scanner;

public class Test28 {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 선언
		int age;			// 나이
		int birthYear;		// 태어난 년도
		int currentYear;	// 현재 년도
		
		System.out.println("년도를 입력받아 좌석을 알려주는 프로그램");
		
		// 현재 년도 입력
		currentYear = 2021;
		
		// 태어난 년도 입력
		System.out.println("태어난 년도를 입력하세요.");
		birthYear = input.nextInt();
		
		age = currentYear - birthYear;
		
		if (age<=6) {
			System.out.println("유아석 입니다.");
		}
		
		if (age>=65) {
			System.out.println("경로석 입니다.");
		}
		
	}

}
