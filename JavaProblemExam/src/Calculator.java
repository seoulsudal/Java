import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 생성
		int number1;	// 첫번째 수
		int number2;	// 두번째 수
		char operator;	// 연산자
		
		System.out.println("연산자와 수를 입력받아 계산하는 프로그램");
		
		// 연산자 입력
		System.out.println("연산자를 입력하세요.");
		operator = input.next().charAt(0);
		
		// 첫번째 수 입력
		System.out.println("첫번째 수를 입력하세요.");
		number1 = input.nextInt();
		
		// 두번째 수 입력
		System.out.println("두번째 수를 입력하세요.");
		number2 = input.nextInt();
		
		switch (operator) {
		case '+':
			System.out.println(number1+" + "+number2+" = "+(number1 + number2));
			break;
		case '-':
			System.out.println(number1+" - "+number2+" = "+(number1 - number2));
			break;
		case '*':
			System.out.println(number1+" * "+number2+" = "+(number1 * number2));
			break;
		case '/':
			if (number2 != 0) {
				System.out.println(number1+" / "+number2+" = "+(number1 / (double)number2));
			}
			else {
				System.out.println("분모 값이 0 입니다. 값을 다시 입력해주세요.");
			}
			break;
		default:
			System.out.println("프로그램을 다시 시작하여 사칙연산을 제대로 입력해주세요.");
			break;
		}

	}

}
