import java.util.Scanner;

public class Test26 {

	public static void main(String[] args) {
		
		// 스캐너 생성
		Scanner input = new Scanner(System.in);
		
		// 변수 생성
		int number1;	// 첫번째 수
		int number2;	// 두번째 수
		int temp;		// 변경 수
		
		System.out.println("첫번째 수가 두번째 수보다 크면 두 수를 바꾸는 프로그램");
		
		// 첫번째 수 입력
		System.out.println("첫번째 수를 입력하세요.");
		number1 = input.nextInt();
		
		// 두번째 수 입력
		System.out.println("두번째 수를 입력하세요.");
		number2 = input.nextInt();
		
		if ( number1 > number2 ) {
			
			// 수 변환
			temp = number1;		
			number1 = number2;
			number2 = temp;
			
		}
		
		//결과 출력
		System.out.println(number1+" "+number2);

	}

}
