import java.util.Scanner;

public class Test33 {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 생성
		int number;	// 숫자
		
		System.out.println("입력받은 숫자가 2일때 출력하고 동시에 3의 배수이면 출력하는 프로그램");
		
		// 숫자 입력
		System.out.println("숫자를 입력하세요.");
		number = input.nextInt();
		
		// 결과 출력
		if ( number % 2 == 0 ) {
			System.out.println("2의 배수 입니다.");
			if ( number % 3 == 0 ) {
				System.out.println("3의 배수 입니다.");
			}
		}

	}

}
