import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);		// 숫자 스케너
		Scanner input1 = new Scanner(System.in);	// 문자 스케너
		
		int intvalue;		// 정수 변수 선언
		int intvalue1;		// 첫 번째 정수 변수 선언
		int intvalue2;		// 두 번째 정수 변수 선언
		
		double doublevalue;	// 실수 변수 선언
		
		String string;		// 문자 변수 선언
		String Stringline;	// 문자 변수 선언
		
		System.out.println("정수 입력: ");
		intvalue = input.nextInt();		// 정수 입력
		System.out.println("입력한 정수는: "+intvalue+" 입니다.");
		
		System.out.println("첫 번째, 두 번째 정수 입력: ");
		intvalue1 = input.nextInt();		// 첫번째 정수 입력
		intvalue2 = input.nextInt();		// 두번째 정수 입력
		System.out.println("첫 번째 입력한 정수: "+intvalue1+" 입니다.");
		System.out.println("두 번째 입력한 정수: "+intvalue2+" 입니다.");
		
		System.out.println("실수 입력: ");
		doublevalue = input.nextDouble();	// 실수 입력
		System.out.println("입력한 실수는: "+doublevalue+" 입니다.");
		
		System.out.println("공백없는 문자열 입력: ");
		string = input.next();				// 문자 입력
		System.out.println("입력한 문자는: "+string+" 입니다.");
		
		System.out.println("공백있는 문자열 입력: ");
		Stringline = input1.nextLine();		// 문자 입력
		System.out.println("입력한 문자는: "+Stringline+" 입니다.");
		

	}

}
