import java.util.Scanner;

public class Test38 {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 선언
		char ch;
		
		// 변수 입력
		System.out.println("문자를 입력하세요.");
		ch = input.next().charAt(0);
		
		// 결과 출력
		if ( ch >= 48 && ch <= 57 ) {
			System.out.println("숫자 입니다.");
		}
		else if ( ch >= 65 && ch <= 90 ) {
			System.out.println("대문자 영어 입니다.");
		}
		else if ( ch>= 97 && ch <= 122 ) {
			System.out.println("소문자 영어 입니다.");
		}
		else {
			System.out.println("특수문자 입니다.");
		}

	}

}
