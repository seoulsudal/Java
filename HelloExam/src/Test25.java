import java.util.Scanner;

public class Test25 {

	public static void main(String[] args) {

		// 스캐너 생성
		Scanner input = new Scanner(System.in);

		// 변수 선언
		int score;
		
		System.out.println("점수를 받아 합격을 알려주는 프로그램");

		// 점수 입력
		System.out.println("점수를 입력하세요.");
		score = input.nextInt();

		// 제어문 입력
		if (score >= 80) {
			System.out.println("축하합니다! 합격입니다.");
		}

	}

}
