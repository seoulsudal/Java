import java.util.Scanner;

public class LoopTest16 {

	public static void main(String[] args) {

		// 스캐너 생성
		Scanner input = new Scanner(System.in);

		// 변수 선언
		int op; 		// 연산자
		double number1;	// 첫번째 피연산자
		double number2; // 두번째 피연산자

		// 종료 전까지 반복
		do {
			System.out.println("메뉴 항목");
			System.out.println("1. +");
			System.out.println("2. -");
			System.out.println("3. *");
			System.out.println("4. /");
			System.out.println("5. 종료");

			// 연산자 입력
			System.out.println("연산자를 선택하시오.");
			op = input.nextInt();
			
			// 종료 입력
			if( op == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			// 1~4 메뉴 입력
			if( op >= 1 && op <= 4) {
				
				// 피연산자1 입력
				System.out.println("피연산자1을 입력하세요.");
				number1 = input.nextDouble();

				// 피연산자2 입력
				System.out.println("피연산자2를 입력하세요.");
				number2 = input.nextDouble();
				
				// 1~4번 메뉴에 따른 결과 출력
				switch (op) {
				case 1:
					System.out.println((int)number1 + " + " + (int)number2 + " = " + (int)(number1 + number2));
					System.out.println("");
					break;
				case 2:
					System.out.println((int)number1 + " - " + (int)number2 + " = " + (int)(number1 - number2));
					System.out.println("");
					break;
				case 3:
					System.out.println((int)number1 + " * " + (int)number2 + " = " + (int)(number1 * number2));
					System.out.println("");
					break;
				case 4:
					// 분모가 0이 오는지 체크
					if(number2 != 0) {
						System.out.println((int)number1 + " / " + (int)number2 + " = " + (number1 / number2));
						System.out.println("");
						break;
					}
					// 분모에 0이 올 경우
					System.out.println("분모에 0을 입력할 수 없습니다.");
					System.out.println("메뉴를 다시 선택해주세요.");
					System.out.println("");
					break;
				}
			}
			// 1~5번 제외한 항목을 눌렀을 경우
			else {
				System.out.println("메뉴를 다시 선택해주세요.");
				System.out.println("");
			}
		// 반복 종료
		}while (op != 5);
		
	}

}
