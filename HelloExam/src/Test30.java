import java.util.Scanner;

public class Test30 {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 선언원서 점수
		int orally;		// 구두
		int takeNotes;	// 필기
		int document;	// 서류
		int toeic;		// 토익
		int average;	// 평균
		
		System.out.println("입사 시험 합격 불합격 판단하는 프로그램");
		
		// 점수 입력
		System.out.println("구두 점수를 입력하세요.");
		orally = input.nextInt();
		
		System.out.println("필기 점수를 입력하세요.");
		takeNotes = input.nextInt();
		
		System.out.println("서류 점수를 입력하세요.");
		document = input.nextInt();
		
		System.out.println("토익 점수를 입력하세요.");
		toeic = input.nextInt();
		
		average = ( orally + takeNotes + document ) / 3;	// 평균 = 구두 + 필기 + 서류
		
		// 결과 출력
		//if ( average >= 80 || toeic >= 550 ) {
		//	System.out.println("합격 입니다.");
		//} 
		//else {
		//	System.out.println("불합격 입니다.");
		//}
		if ( average >= 80 ) {
			System.out.println("합격 입니다.");
		}
		else {
			if ( toeic >= 550 ) {
			System.out.println("합격 입니다.");
			}
			else {
			System.out.println("불합격 입니다.");
		}
		
		}

	}

}
