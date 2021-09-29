import java.util.Scanner;

public class Test32 {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 생성
		int score;			// 점수
		int scholasticYear;	// 학년
		
		System.out.println("학년 및 점수로 합격 및 불합격을 판단하는 프로그램");
		
		// 학년 및 점수 입력
		System.out.println("학년을 입력하세요.(1~4)");
		scholasticYear = input.nextInt();
		
		System.out.println("점수를 입력하세요.(0~100)");
		score = input.nextInt();
		
		// 결과 출력
		if ( scholasticYear == 4 ) {
			if ( score >= 70 ) {
				System.out.println("합격 입니다.");
			}
			else {
				System.out.println("불합격 입니다.");
			}
		}
		
		else {
			if ( score >= 60 ) {
				System.out.println("합격 입니다.");
			}
			else {
				System.out.println("불합격 입니다.");
			}
		}

	}

}
