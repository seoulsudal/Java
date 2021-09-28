import java.util.Scanner;

public class Test46 {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 선언
		int midtermExam;	// 중간
		int finalExam;		// 기말
		double exam;		// 중간+기말
		int report;			// 레포트
		int attendance;		// 출석
		double sum;			// 종합
		int temp;			// 임의 변수
		char grades;		// 학점
		String evaluation;	// 평가
		
		
		System.out.println("성적처리 프로그램");
		
		// 중간 점수 입력
		System.out.println("중간고사 점수를 입력하세요.");
		midtermExam = input.nextInt();
		
		// 기말 점수 입력
		System.out.println("기말고사 점수를 입력하세요.");
		finalExam = input.nextInt();
		
		// 레포트 점수 입력
		System.out.println("레포트 점수를 입력하세요.");
		report = input.nextInt();
		
		// 출석 점수 입력
		System.out.println("출석 점수를 입력하세요.");
		attendance = input.nextInt();
		
		// 중간 기말 평균
		exam = (midtermExam + finalExam) / 2.0;
		
		// 점수 계산
		sum = (exam * 0.6) + (report * 0.2) + (attendance * 0.2);	// 점수 = (중간기말 평균 * 0.6) + (레포트 * 0.2) + (출석 * 0.2)
		sum = (int) (sum * 100) / 100.0;
		
		temp = (int) sum / 10;
		
		// 학점 범위 체크
		switch (temp) {
		case 10:
		case 9:
			grades = 'A';
			break;
		case 8:
			grades = 'B';
			break;
		case 7:
			grades = 'C';
			break;
		case 6:
			grades = 'D';
			break;
		default:
			grades = 'F';
			break;
		}
		
		// 평가 범위 체크
		switch(grades) {
		case 'A':
		case 'B':
			evaluation = "Excellent";
			break;
		case 'C':
		case 'D':
			evaluation = "Good";
			break;
		default :
			evaluation = "Poor";
			break;
		}
		
		System.out.println("성적은 "+sum+" 점 입니다.");
		System.out.println("학점은 "+grades+" 입니다.");
		System.out.println("평가는 "+evaluation+"");
		
	}

}
