import java.util.Scanner;

public class Test23 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int startTime;		//출발시간 변수 선언
		int startHour;		//출발 시 변수 선언
		int startMinute;	//출발 분 변수 선언
		int startSecond;	//출발 초 변수 선언
		int endTime;		//도착시간 변수 선언
		int endHour;		//출발 시 변수 선언
		int endMinute;		//출발 분 변수 선언
		int endSecond;		//출발 초 변수 선언
		int allTime;		//통학 총시간 변수 선언
		int goingTime;		//통학시간 변수 선언
		int goingHour;		//통신 시 변수 선언
		int goingMinute;	//통학 분 변수 선언
		int goingSecond;	//통학 초 변수 선언
		int averageTime;	//평균시간 변수 선언
		int station;		//역 변수 선언
		
		System.out.println("출발 시를 입력하세요.");
		startHour = input.nextInt();						//출발 시 입력
		startHour = startHour * 3600;
		
		System.out.println("출발 분을 입력하세요.");
		startMinute = input.nextInt();						//출발 분 입력
		startMinute = startMinute * 60;
		
		System.out.println("출발 초를 입력하세요.");
		startSecond = input.nextInt();						//출발 초 입력
		
		startTime = startHour + startMinute + startSecond; 	// 출발시간 초로 변환
		
		System.out.println("도착 시를 입력하세요.");
		endHour = input.nextInt();							//도착 시 입력
		endHour = endHour * 3600;
		
		System.out.println("도착 분을 입력하세요.");
		endMinute = input.nextInt();						//도착 분 입력
		endMinute = endMinute * 60;
		
		System.out.println("도착 초를 입력하세요.");
		endSecond = input.nextInt();						//도착 초 입력
		
		endTime = endHour + endMinute + endSecond;			// 도착시간 초로 변환
		
		allTime = endTime - startTime;						//통학 시간 계산
		
		goingHour = allTime / 3600;												//통학 시 계산
		goingMinute = ( allTime - ( goingHour * 3600 ) ) / 60;					//통학 분 계산
		goingSecond = allTime - ( goingHour * 3600 ) - ( goingMinute * 60 );	//통학 초 계산
					
		System.out.println("통학하는 역의 숫자를 입력하세요.");
		station = input.nextInt();							//역의 숫자 입력
		
		averageTime = allTime / station;					//평균시간 계산
		
		System.out.println("통학시간은 "+goingHour+"시간 "+goingMinute+"분 "+goingSecond+"초 입니다.");
		System.out.println("역 사이의 평균시간은 "+averageTime+"초 입니다.");
		
		

	}

}
