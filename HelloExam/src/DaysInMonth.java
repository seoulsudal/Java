import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 생성
		int year;	// 년도
		int month;	// 월
		int days = 0;	// 일
		
		System.out.println("달의 일수를 알아보는 프로그램");
		
		// 년도 입력
		System.out.println("일수를 알고싶은 년도를 입력 : ");
		year = input.nextInt();
		
		// 월 입력
		System.out.println("일수를 알고싶은 월을 입력 : ");
		month = input.nextInt();
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
				// 윤년
				days = 29;
			}
			else {
				// 평년
				days = 28;
			}
			break;
		default:
			System.out.println("월이 잘못 입력되었습니다.");
			break;
		}
		System.out.println(year+" 년 "+month+" 월의 일수는 "+days+" 일 입니다.");

	}

}
