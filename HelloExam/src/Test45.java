import java.util.Scanner;

public class Test45 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.println("정수 1~5까지 수를 입력해 주세요.:");
		num = input.nextInt();
		
		switch(num) {
		case 1: case 3: case 5:
			System.out.println("홀수 입니다.");
			break;
		case 2: case 4:
			System.out.println("짝수 입니다.");
			break;
		default:
			System.out.println("1~5까지만 입력하시오.");
		}
		
		

	}

}
