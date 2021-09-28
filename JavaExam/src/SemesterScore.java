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
		System.out.println("컴퓨터 개론 점수를 입력하세요.");
		computerIntroduction = input.nextInt();
		
		// 컴퓨터 개론 점수가 음수인지, 100점이 넘어가는지 체크
		if ((computerIntroduction < 0) || (computerIntroduction >= 101)) {
			System.out.println("컴퓨터 개론 점수를 점수를 0~100으로 입력해주세요.");
		}
		
		// 자바 프로그래밍 입력
		System.out.println("자바 프로그래밍 점수를 입력하세요.");
		javaPrograming = input.nextInt();
		
		// 자바 프로그래밍 점수가 음수인지, 100점이 넘어가는지 체크
		if ((javaPrograming < 0) || (javaPrograming >= 101)) {
			System.out.println("자바 프로그래밍 점수를 0~100으로 입력해주세요.");
		}
		
		// 영어 입력
		System.out.println("영어 점수를 입력하세요.");
		english = input.nextInt();
		
		// 영어 점수가 음수인지, 100점이 넘어가는지 체크
		if ((english < 0) || (english >= 101)) {
			System.out.println("영어 점수를 점수를 0~100으로 입력해주세요.");
		}
		
		// 일반수학 입력
		System.out.println("일반수학 점수를 입력하세요.");
		generalMathematics = input.nextInt();
		
		// 일반수학 점수가 음수인지, 100점이 넘어가는지 체크
		if ((generalMathematics < 0) || (generalMathematics >= 101)) {
			System.out.println("일반수학 점수를 0~100으로 입력해주세요.");
		}
		
		// 각 과목의 점수가 0~100 사이인지 확인
		if ((((computerIntroduction >= 0) && (computerIntroduction <= 100)) && ((javaPrograming >= 0) && (javaPrograming <= 100))) && (((english >= 0) && (english <= 100)) && ((generalMathematics >= 0) && (generalMathematics <= 100)))) {
			// 총점 및 평균 계산
			total = computerIntroduction + javaPrograming + english + generalMathematics;	// 총점 = 컴퓨터 개론 + 자바 프로그래밍 + 영어 + 일반수학
			average = total / 4;
			
			// 결과 출력
			System.out.println("= 결과 =");
			System.out.println("총점 : "+(int)total+"점, 평균 : "+average+"점 입니다.");
		}
		else {
			System.out.println("재시작하여 값을 다시 입력해주세요.");
		}

	}

}
