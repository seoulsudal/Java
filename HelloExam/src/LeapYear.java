import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 선언
		int year;			// 년도
		boolean leapYear;	// 윤년
		
		System.out.println("윤년을 계산하는 프로그램");
		
		// 년도 입력
		System.out.println("년도를 입력하세요.");
		year = input.nextInt();
		
		// 윤년 계산
		leapYear = ( year % 4 == 0 && year / 100 != 0 ) || ( year % 400 == 0 ); // (4년으로 나눠떨어지거나 100년으로 나눠지면 윤년이 아니고) 400년으로 나눠지면 윤년이다. 
		
		// 결과 출력
		System.out.println(year+"년도는 윤년 입니까? "+leapYear);

	}

}
