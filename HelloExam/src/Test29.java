import java.util.Scanner;

public class Test29 {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 선언
		int score;	// 점수
		
		System.out.println("점수를 받아 합격 불합격 판단하는 프로그램");
		
		// 점수 입력
		System.out.println("점수를 입력하세요.");
		score = input.nextInt();
		
		// 결과 출력
		if (score>=60) {
			System.out.println("합격");
		}
		
		else {
			System.out.println("불합격");
		}

	}

}
