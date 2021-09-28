import java.util.Scanner;

public class Test27 {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 선언
		int num;	//정수
		
		System.out.println("정수를 입력 받아 짝수인지 3이나 5의 배수인지 판단하는 프로그램");
		
		// 정수 입력
		System.out.println("정수를 입력하세요.");
		num = input.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("짝수 입니다.");
		}
		
		if (num % 3 == 0) {
			System.out.println("3의 배수 입니다.");
		}
		
		if (num % 5 == 0) {
			System.out.println("5의 배수 입니다.");
		}

	}

}
