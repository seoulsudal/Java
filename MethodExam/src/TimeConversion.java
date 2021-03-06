import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 선언
		int totalSecond;	// 총 초
		int hour;			// 시
		int minute;			// 분
		int second;			// 초
		
		System.out.println("입력 받은 시간을 초로 변환하는 프로그램");
		
		// 시 입력
		while(true) {
			System.out.println("시를 입력하세요.");
			hour = input.nextInt();
			if(hour < 0) {
				System.err.println("시를 0이상 입력해주세요.");
			}
			else {
				break;
			}
		}
		
		// 분 입력
		while(true) {
			System.out.println("분을 입력하세요.");
			minute = input.nextInt();
			if(minute < 0 || minute > 60) {
				System.out.println("분을 0이상 60이하로 입력해주세요.");
			}
			else {
				break;
			}
		}
		
		// 초 입력
		while(true) {
			System.out.println("초를 입력하세요.");
			second = input.nextInt();
			if(second < 0 || second > 60) {
				System.out.println("초를 0이상 60이하로 입력해주세요.");
			}
			else {
				break;
			}
		}
		
		// 총 시간을 초로 바꾸는 메소드 호출
		totalSecond = totalSecond(hour, minute, second);
		
		// 결과 출력
		System.out.println(hour+"시간 "+minute+"분 "+second+"초는 총 "+totalSecond+"초 이다.");
		
	}
	
	// 총 시간을 초로 바꾸는 메소드
	public static int totalSecond(int hour, int minute, int second) {
		int totalSecond;
		totalSecond = (hour * 3600) + (minute * 60) + second;	// 총 초시간 = (시간 * 3600) + (분 * 60) + 초
		return totalSecond;
	}
	
}
