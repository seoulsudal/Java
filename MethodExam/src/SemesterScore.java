import java.util.Scanner;

public class SemesterScore {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 선언
		int computerIntroduction;	// 컴퓨터 개론
		int javaPrograming;			// 자바 프로그래밍
		int english;				// 영어
		int generalMathematics;		// 일반수학
		double total;				// 총점
		double average;				// 평균
		
		System.out.println("학기 과목 점수를 받아 총점과 평균을 계산하는 프로그램");
		
		// 컴퓨터 개론 입력
		while(true){
			System.out.println("컴퓨터 개론 점수를 입력하세요.");
			computerIntroduction = input.nextInt();
			if((computerIntroduction < 0) || (computerIntroduction >= 101)) {
				System.out.println("컴퓨터 개론 점수를 점수를 0~100으로 입력해주세요.");
			}
			else {
				break;
			}
		}
		
		// 자바 프로그래밍 입력
		while(true) {
			System.out.println("자바 프로그래밍 점수를 입력하세요.");
			javaPrograming = input.nextInt();
			if((javaPrograming < 0) || (javaPrograming >= 101)) {
				System.out.println("자바 프로그래밍 점수를 0~100으로 입력해주세요.");
			}
			else {
				break;
			}
		}
		
		// 영어 입력
		while(true) {
			System.out.println("영어 점수를 입력하세요.");
			english = input.nextInt();
			if((english < 0) || (english >= 101)) {
			System.out.println("영어 점수를 점수를 0~100으로 입력해주세요.");
			}
			else {
				break;
			}
		}
		
		// 일반수학 입력
		while(true) {
			System.out.println("일반수학 점수를 입력하세요.");
			generalMathematics = input.nextInt();
			if((generalMathematics < 0) || (generalMathematics >= 101)) {
				System.out.println("일반수학 점수를 0~100으로 입력해주세요.");
			}
			else {
				break;
			}
		}

		// 메소드 호출
		total = total(computerIntroduction, javaPrograming, english, generalMathematics);		// 총점
		average = average(computerIntroduction, javaPrograming, english, generalMathematics);	// 평균
			
		// 결과 출력
		System.out.println("= 결과 =");
		System.out.println("총점 : "+(int)total+"점, 평균 : "+average+"점 입니다.");
		
	}
	
	// 총점을 구하는 메소드
	public static double total(double computerIntroduction, double javaPrograming, double english, double generalMathematics) {
		double total;
		total = computerIntroduction + javaPrograming + english + generalMathematics;	// 총점 = 컴퓨터 개론 + 자바 프로그래밍 + 영어 + 일반수학
		return total;
	}
	
	// 평균을 구하는 메소드
	public static double average(double computerIntroduction, double javaPrograming, double english, double generalMathematics) {
		double average;
		average = total(computerIntroduction, javaPrograming, english, generalMathematics) / 4;
		return average;
	}

}
