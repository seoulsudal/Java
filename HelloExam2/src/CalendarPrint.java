import java.util.Scanner;

public class CalendarPrint {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		int year;		// 년도
		int startDay;	// 해당년도의 1월 1일의 요일
		
		System.out.println("달력 출력 프로그램");
		
		System.out.println("년도를 입력 : ");
		year = input.nextInt();
		
		System.out.print("해당 년도의 1월 1일의 요일{1(월요일),2,3,4,5,6,7(일요일)}의 숫자 입력 : ");
		startDay = input.nextInt();
		
		int numberOfDaysInMonth = 0;	// 달의 날수
		
		for(int month = 1; month <= 12; month++) {
			// 달력 타이틀 표시
			System.out.print("      ");
			switch(month) {
			case 1:
				System.out.println(year+"   January(1월)");
				numberOfDaysInMonth = 31;
				break;
			case 2:
				System.out.println(year+"   Feburary(2월)");
				if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
					numberOfDaysInMonth = 29;
				}
				else {
					numberOfDaysInMonth = 28;
				}
				break;
			case 3:
				System.out.println(year+"   March(3월)");
				numberOfDaysInMonth = 31;
				break;
			case 4:
				System.out.println(year+"   April(4월)");
				numberOfDaysInMonth = 30;
				break;
			case 5:
				System.out.println(year+"   May(5월)");
				numberOfDaysInMonth = 31;
				break;
			case 6:
				System.out.println(year+"   June(6월)");
				numberOfDaysInMonth = 30;
				break;
			case 7:
				System.out.println(year+"   July(7월)");
				numberOfDaysInMonth = 31;
				break;
			case 8:
				System.out.println(year+"   August(8월)");
				numberOfDaysInMonth = 31;
				break;
			case 9:
				System.out.println(year+"   September(9월)");
				numberOfDaysInMonth = 30;
				break;
			case 10:
				System.out.println(year+"   October(10월)");
				numberOfDaysInMonth = 31;
				break;
			case 11:
				System.out.println(year+"   November(11월)");
				numberOfDaysInMonth = 30;
				break;
			case 12:
				System.out.println(year+"   December(12월)");
				numberOfDaysInMonth = 31;
				break;
			}
			
			System.out.println("-----------------------------");
			System.out.println("   일  월   화   수  목   금   토");
			
			// 매월 1일의 화이트 공간
			int i = 0;
			for(i = 0; i < startDay; i++) {
				if(startDay == 7) {
					System.out.println();
					break;
				}
				System.out.print("    ");
			}
			for(i = 1; i <= numberOfDaysInMonth; i++) {
				if(i < 10) {
					System.out.print("   "+i);
				}
				else {
					System.out.print("  "+i);
				}
				if((i + startDay) % 7 == 0) {
					System.out.println();
				}
			}
			System.out.println();
			System.out.println();
			startDay = (startDay + numberOfDaysInMonth ) % 7;
		}

	}

}
