import java.util.Scanner;

public class Test40 {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 생성
		int score;	// 점수
		
		System.out.println("학점을 구하는 프로그램");
		
		// 점수 입력
		System.out.println("점수를 입력하세요.");
		score = input.nextInt();
		
		// 결과 출력
		if ( score >= 90 ) {
			System.out.println("A학점 입니다.");
		}
		else if ( score >= 80 && score <= 89 ) {
			System.out.println("B학점 입니다.");
		}
		else if ( score >= 70 && score <= 79 ) {
			System.out.println("C학점 입니다.");
		}
		else if ( score >= 60 && score <= 69 ) {
			System.out.println("D학점 입니다.");
		}
		else {
			System.out.println("F학점 입니다.");
		}

	}

}
